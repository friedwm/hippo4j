package cn.hippo4j.auth.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.meitun.backend.constants.SSOSource;
import com.meitun.backend.domain.SSOAuthResult;
import com.meitun.backend.domain.UserDO;
import com.meitun.backend.service.GlobalSSOService;
import org.springframework.stereotype.Service;

@Service
public class MeitunSSOService {

    @Reference(group = "backend-web")
    private GlobalSSOService globalSSOService;

    public SSOAuthResult login(String name, String pwd) {
        return globalSSOService.login(SSOSource.BJ_Backend, name, pwd);
    }
}
