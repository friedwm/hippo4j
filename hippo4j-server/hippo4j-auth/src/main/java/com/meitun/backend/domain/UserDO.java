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

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDO extends BaseDO {

    private static final long serialVersionUID = -485650604307346368L;
    private Long id;
    private Integer companyId;
    private String loginName;
    private String userName;
    private String password;
    private String salt;
    private Long departmentId;
    private Long roleId;
    private String email;
    private String mobile;
    private Long createUserId;
    private Long modifyUserId;
    private Date createTime;
    private Date modifyTime;
    private Date lastLoginTime;
    private String lastLoginIp;
    private Boolean state;
    private UserDetailDO userDetail;
    private List<Long> roleIdList;
    private List<Integer> bizTypes;
    private com.meitun.backend.domain.global.UserDO newUser;
    private String roleName;
    private String departmentName;
    public List<SysMenuDO> sysMenuList;
    private Map<String, Set<String>> pageBtnMap;

    public UserDO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Long getId() {
        return this.id;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getSalt() {
        return this.salt;
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public Long getCreateUserId() {
        return this.createUserId;
    }

    public Long getModifyUserId() {
        return this.modifyUserId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public Boolean getState() {
        return this.state;
    }

    public String getCredentialsSalt() {
        return this.loginName + this.salt;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<SysMenuDO> getSysMenuList() {
        return this.sysMenuList;
    }

    public void setSysMenuList(List<SysMenuDO> sysMenuList) {
        this.sysMenuList = sysMenuList;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public UserDetailDO getUserDetail() {
        return this.userDetail;
    }

    public void setUserDetail(UserDetailDO userDetail) {
        this.userDetail = userDetail;
    }

    public Map<String, Set<String>> getPageBtnMap() {
        return this.pageBtnMap;
    }

    public void setPageBtnMap(Map<String, Set<String>> pageBtnMap) {
        this.pageBtnMap = pageBtnMap;
    }

    public List<Long> getRoleIdList() {
        return this.roleIdList;
    }

    public void setRoleIdList(List<Long> roleIdList) {
        this.roleIdList = roleIdList;
    }

    public com.meitun.backend.domain.global.UserDO getNewUser() {
        return this.newUser;
    }

    public void setNewUser(com.meitun.backend.domain.global.UserDO newUser) {
        this.newUser = newUser;
    }

    public List<Integer> getBizTypes() {
        return this.bizTypes;
    }

    public void setBizTypes(List<Integer> bizTypes) {
        this.bizTypes = bizTypes;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String toString() {
        return "UserDO [id=" + this.id + ", loginName=" + this.loginName + ", userName=" + this.userName + ", password=" + this.password + ", salt=" + this.salt + ", departmentId=" + this.departmentId
                + ", roleId=" + this.roleId + ", email=" + this.email + ", mobile=" + this.mobile + ", createUserId=" + this.createUserId + ", modifyUserId=" + this.modifyUserId + ", createTime="
                + this.createTime + ", modifyTime=" + this.modifyTime + ", lastLoginTime=" + this.lastLoginTime + ", lastLoginIp=" + this.lastLoginIp + ", state=" + this.state + ", userDetail="
                + (null != this.userDetail ? this.userDetail.toString() : null) + ", roleName=" + this.roleName + ", departmentName=" + this.departmentName + ", sysMenuList=" + this.sysMenuList + "]";
    }
}