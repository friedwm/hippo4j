package cn.hippo4j.auth.service;

import cn.hippo4j.auth.model.MeitunSSOAuthenticationToken;
import cn.hippo4j.auth.model.biz.user.UserReqDTO;
import com.meitun.backend.domain.SSOAuthResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;

@Component
@Slf4j
public class MeitunSSOProvider implements AuthenticationProvider {
    @Resource
    private MeitunSSOService meitunSSOService;
    @Resource
    private UserService userService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        MeitunSSOAuthenticationToken auth = (MeitunSSOAuthenticationToken) authentication;
        String principal = (String) auth.getPrincipal();
        String credentials = (String) auth.getCredentials();
        try {
            SSOAuthResult authResult = meitunSSOService.login(principal, credentials);
            if (authResult.getCode() == SSOAuthResult.RESULT_CODE_SUCCESS) {
                UserReqDTO userReqDTO = new UserReqDTO();
                userReqDTO.setUserName(principal);
                userReqDTO.setPassword(credentials);
                userReqDTO.setRole("ROLE_USER");
                userReqDTO.setResources(Collections.emptyList());
                userService.upsertUser(userReqDTO);

                authentication.setAuthenticated(true);
                return authentication;
            }
            int errorCode = authResult.getCode();
            String errorMsg = findErrorMsg(errorCode);
            throw new BadCredentialsException(errorMsg);
        } catch (BadCredentialsException be) {
            throw be;
        } catch (Exception e) {
            log.error("SSO login fail", e);
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(MeitunSSOAuthenticationToken.class);
    }

    private String findErrorMsg(Integer code) {
        if (code == null) {
            return "登录失败";
        }

        switch (code) {
            case 50000:
                return "系统错误";
            case 50001:
                return "无效密码";
            case 50002:
                return "非法skey";
            case 50003:
                return "未授权的SSOSource";
            case 50004:
                return "无效凭证";
            case 50005:
                return "凭证过期";
            case 50006:
                return "凭证状态无效";
            case 50007:
                return "用户不存在";
            case 50008:
                return "用户已退出";
            case 50009:
                return "临时凭证失效";
            case 50010:
                return "临时凭证过期";
            case 50011:
                return "错误参数";
            case 50012:
                return "无权访问";
            default:
                return "登录态失效，请重新登录";
        }
    }
}
