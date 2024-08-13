package com.meitun.backend.service;

import com.meitun.backend.constants.SSOSource;
import com.meitun.backend.domain.SSOAuthResult;

public interface GlobalSSOService {

    /**
     * 登录 用密码换凭证
     *
     * @param loginName
     * @param pwd
     * @return
     * @return
     */

    SSOAuthResult login(SSOSource source, String loginName, String pwd);
}