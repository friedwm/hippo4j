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

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class SysMenuDO extends BaseDO {

    public static Integer MENU_TYPE_1 = 1;
    public static Integer MENU_TYPE_2 = 2;
    private static final long serialVersionUID = -4795844586322991717L;
    private Long id;
    private String code;
    private Long parentId;
    private String name;
    private String url;
    private String category;
    private Integer menuType;
    private Long createUserId;
    private Long modifyUserId;
    private Date createTime;
    private Date modifyTime;
    private Boolean state;
    private Integer sourceType;
    private Integer bizType;
    private Integer level;
    private Integer companyId;
    private Integer permitType;
    private Integer queryAllCompany;
    private Integer dataType;
    private Integer sysType;
    private String optWiki;
    private Integer needShow;
    private Integer isNew;
    private Long location;

    public SysMenuDO() {
    }

    public SysMenuDO(Long id, Long parentId, String name, String url, String category, Long createUserId, Long modifyUserId, Date createTime, Date modifyTime, Boolean state) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.url = url;
        this.category = category;
        this.createUserId = createUserId;
        this.modifyUserId = modifyUserId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
    }

    public SysMenuDO(Long id, Long parentId, String name, String url, String category, Long createUserId, Long modifyUserId, Date createTime, Date modifyTime, Boolean state, Long location) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.url = url;
        this.category = category;
        this.createUserId = createUserId;
        this.modifyUserId = modifyUserId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
        this.location = location;
    }

    public SysMenuDO(Long id, Long parentId, String name, String url, String category, Long createUserId, Long modifyUserId, Date createTime, Date modifyTime, Boolean state, Long location,
                     String optWiki) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.url = url;
        this.category = category;
        this.createUserId = createUserId;
        this.modifyUserId = modifyUserId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
        this.location = location;
        this.optWiki = optWiki;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public void setState(Boolean state) {
        this.state = state;
    }

    public Long getId() {
        return this.id;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
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

    public Boolean getState() {
        return this.state;
    }

    public Long getLocation() {
        return this.location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getMenuType() {
        return this.menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getBizType() {
        return this.bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getPermitType() {
        return this.permitType;
    }

    public void setPermitType(Integer permitType) {
        this.permitType = permitType;
    }

    public Integer getQueryAllCompany() {
        return this.queryAllCompany;
    }

    public void setQueryAllCompany(Integer queryAllCompany) {
        this.queryAllCompany = queryAllCompany;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Integer getSysType() {
        return this.sysType;
    }

    public void setSysType(Integer sysType) {
        this.sysType = sysType;
    }

    public String getOptWiki() {
        return this.optWiki;
    }

    public void setOptWiki(String optWiki) {
        this.optWiki = optWiki;
    }

    public Integer getNeedShow() {
        return this.needShow;
    }

    public void setNeedShow(Integer needShow) {
        this.needShow = needShow;
    }

    public Integer getIsNew() {
        return this.isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public String toString() {
        return (new ToStringBuilder(this)).append("state", this.state).append("startPage", this.getStartPage()).append("createUserId", this.createUserId).append("menuType", this.menuType)
                .append("code", this.code).append("parentId", this.parentId).append("location", this.location).append("start", this.getStart()).append("category", this.category)
                .append("url", this.url).append("modifyUserId", this.modifyUserId).append("createTime", this.createTime).append("name", this.name).append("optWiki", this.optWiki)
                .append("pageSize", this.getPageSize()).append("modifyTime", this.modifyTime).append("id", this.id).toString();
    }
}