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

package com.meitun.backend.domain;

import java.io.Serializable;
import java.util.Map;

public class SSOAuthResult implements Serializable {

    private static final long serialVersionUID = -5431452410605202918L;
    public static final int RESULT_CODE_SUCCESS = 1;
    public static final int RESULT_CODE_ERROR_SYSERR = 50000;
    public static final int RESULT_CODE_ERROR_WRONG_PASSWD = 50001;
    public static final int RESULT_CODE_ERROR_WRONG_SKEY = 50002;
    public static final int RESULT_CODE_ERROR_WRONG_BID = 50003;
    public static final int RESULT_CODE_ERROR_WRONG_SID = 50004;
    public static final int RESULT_CODE_ERROR_EXPIRED_SID = 50005;
    public static final int RESULT_CODE_ERROR_TOKEN_STATUS = 50006;
    public static final int RESULT_CODE_ERROR_NOT_EXIST = 50007;
    public static final int RESULT_CODE_ERROR_LOGOUT = 50008;
    public static final int RESULT_CODE_ERROR_TEMP_ERROR_SID = 50009;
    public static final int RESULT_CODE_ERROR_TEMP_EXPIRED_SID = 50010;
    public static final int RESULT_CODE_ERROR_PARAM = 50011;
    public static final int RESULT_CODE_ERROR_ACCESS = 50012;
    public static final int RESULT_CODE_ERROR_LONIGNAME_BEEN_EXIST = 50013;
    public static final int RESULT_CODE_ERROR_NOT_GET_LOCK = 50014;
    private int code;
    private long uid;
    private String babytreeId;
    private Long supplierUserId;
    private short source;
    private boolean overWriteflag;
    private String sid;
    private Map<String, String> data;
    private String msg;

    public SSOAuthResult() {
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getUid() {
        return this.uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getBabytreeId() {
        return this.babytreeId;
    }

    public void setBabytreeId(String babytreeId) {
        this.babytreeId = babytreeId;
    }

    public Long getSupplierUserId() {
        return this.supplierUserId;
    }

    public void setSupplierUserId(Long supplierUserId) {
        this.supplierUserId = supplierUserId;
    }

    public short getSource() {
        return this.source;
    }

    public void setSource(short source) {
        this.source = source;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public boolean isOverWriteflag() {
        return this.overWriteflag;
    }

    public void setOverWriteflag(boolean overWriteflag) {
        this.overWriteflag = overWriteflag;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static SSOAuthResult make(Long uid, Short source, Integer code) {
        SSOAuthResult self = new SSOAuthResult();
        self.setUid(uid);
        self.setSource(source);
        self.setCode(code);
        return self;
    }

    public static SSOAuthResult make(Long uid, Short source, Integer code, String sid) {
        SSOAuthResult self = new SSOAuthResult();
        self.setUid(uid);
        self.setSource(source);
        self.setCode(code);
        self.setSid(sid);
        return self;
    }

    public static SSOAuthResult make(Long uid, Short source, Integer code, boolean flag, String sid) {
        SSOAuthResult self = new SSOAuthResult();
        self.setUid(uid);
        self.setSource(source);
        self.setCode(code);
        self.setOverWriteflag(flag);
        self.setSid(sid);
        return self;
    }

    public static SSOAuthResult make(Long uid, Integer code) {
        SSOAuthResult self = new SSOAuthResult();
        self.setUid(uid);
        self.setCode(code);
        return self;
    }

    public static SSOAuthResult make(Long uid, Integer code, String sid, String babytreeId, Long supplierUserId) {
        SSOAuthResult self = new SSOAuthResult();
        self.setUid(uid);
        self.setCode(code);
        self.setSid(sid);
        self.setBabytreeId(babytreeId);
        self.setSupplierUserId(supplierUserId);
        return self;
    }

    public static SSOAuthResult make(Long uid, Integer code, String sid) {
        SSOAuthResult self = new SSOAuthResult();
        self.setUid(uid);
        self.setCode(code);
        self.setSid(sid);
        return self;
    }

    public static SSOAuthResult make(Integer companyId, Long uid, Integer code, String sid) {
        SSOAuthResult self = new SSOAuthResult();
        self.setUid(uid);
        self.setCode(code);
        self.setSid(sid);
        return self;
    }

    public static SSOAuthResult make(Long uid, Integer code, boolean flag, String sid) {
        SSOAuthResult self = new SSOAuthResult();
        self.setUid(uid);
        self.setCode(code);
        self.setOverWriteflag(flag);
        self.setSid(sid);
        return self;
    }

    public String getErrorMsg() {
        if (this.code == 50000) {
            return "系统错误";
        } else if (this.code == 50001) {
            return "无效密码";
        } else if (this.code == 50002) {
            return "非法skey错误码";
        } else if (this.code == 50004) {
            return "无效凭证";
        } else if (this.code == 50005) {
            return "凭证过期";
        } else if (this.code == 50006) {
            return "凭证状态无效";
        } else if (this.code == 50007) {
            return "用户不存在";
        } else if (this.code == 50008) {
            return "用户已退出";
        } else if (this.code == 50011) {
            return "错误参数";
        } else {
            return this.code == 50012 ? "无权访问" : "";
        }
    }
}