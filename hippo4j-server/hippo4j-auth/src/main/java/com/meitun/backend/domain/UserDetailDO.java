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

public class UserDetailDO extends BaseDO {

    private static final long serialVersionUID = 1521869673719334622L;
    private Long id;
    private Long userId;
    private String mobile;
    private String address;
    private String zipCode;
    private String email;
    private String fax;
    private String qq;
    private String fixedPhone;
    private Integer sex;
    private Date createTime;
    private Date modifyTime;
    private Boolean state;

    public UserDetailDO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Long getId() {
        return this.id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFax() {
        return this.fax;
    }

    public String getQq() {
        return this.qq;
    }

    public String getFixedPhone() {
        return this.fixedPhone;
    }

    public Integer getSex() {
        return this.sex;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public Boolean getState() {
        return this.state;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        return "UserDetailDO [id=" + this.id + ", userId=" + this.userId + ", mobile=" + this.mobile + ", address=" + this.address + ", zipCode=" + this.zipCode + ", email=" + this.email + ", fax="
                + this.fax + ", qq=" + this.qq + ", fixedPhone=" + this.fixedPhone + ", sex=" + this.sex + ", createTime=" + this.createTime + ", modifyTime=" + this.modifyTime + ", state="
                + this.state + "]";
    }
}