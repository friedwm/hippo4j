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

package com.meitun.backend.domain.global;

import com.meitun.backend.domain.BaseDO;

import java.util.Date;
import java.util.List;

public class UserDO extends BaseDO {

    private static final long serialVersionUID = -485650604307346368L;
    private Long id;
    private Integer companyId;
    private String companyName;
    private Integer isAdmin;
    private Integer accountType;
    private String adCode;
    private String babytreeId;
    private String loginName;
    private String userName;
    private Integer userType;
    private String password;
    private String fuzzyLoginName;
    private String fuzzyUserName;
    private String departmentName;
    private String departmentCode;
    private String roleInfo;
    private String prefixCode;
    private Long departmentId;
    private String description;
    private String emailAddress;
    private String phoneNumber;
    private Long createUserId;
    private Long modifyUserId;
    private Date createTime;
    private Date modifyTime;
    private Integer status;
    private List<Long> roleIdList;
    private Date lastLoginTime;
    private String lastLoginIp;
    private List<Integer> bizTypes;
    private Integer queryAllCompany;
    private Long supplierId;
    private Integer sysType;

    public UserDO() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getAdCode() {
        return this.adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Long> getRoleIdList() {
        return this.roleIdList;
    }

    public void setRoleIdList(List<Long> roleIdList) {
        this.roleIdList = roleIdList;
    }

    public Long getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getModifyUserId() {
        return this.modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFuzzyLoginName() {
        return this.fuzzyLoginName;
    }

    public void setFuzzyLoginName(String fuzzyLoginName) {
        this.fuzzyLoginName = fuzzyLoginName;
    }

    public String getFuzzyUserName() {
        return this.fuzzyUserName;
    }

    public void setFuzzyUserName(String fuzzyUserName) {
        this.fuzzyUserName = fuzzyUserName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleInfo() {
        return this.roleInfo;
    }

    public void setRoleInfo(String roleInfo) {
        this.roleInfo = roleInfo;
    }

    public String getPrefixCode() {
        return this.prefixCode;
    }

    public void setPrefixCode(String prefixCode) {
        this.prefixCode = prefixCode;
    }

    public String getDepartmentCode() {
        return this.departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public List<Integer> getBizTypes() {
        return this.bizTypes;
    }

    public void setBizTypes(List<Integer> bizTypes) {
        this.bizTypes = bizTypes;
    }

    public String getBabytreeId() {
        return this.babytreeId;
    }

    public void setBabytreeId(String babytreeId) {
        this.babytreeId = babytreeId;
    }

    public Integer getQueryAllCompany() {
        return this.queryAllCompany;
    }

    public void setQueryAllCompany(Integer queryAllCompany) {
        this.queryAllCompany = queryAllCompany;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getSysType() {
        return this.sysType;
    }

    public void setSysType(Integer sysType) {
        this.sysType = sysType;
    }

    public Integer getAccountType() {
        return this.accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }
}