/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
    SSOAuthResult verifyTokenSid(SSOSource source, String token);
    com.meitun.backend.domain.UserDO getUser(SSOSource source, Long uid);
}