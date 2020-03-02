package com.h2sj.mybatis.generator.entity;

import java.io.Serializable;

public class Permission implements Serializable {
    private Long pId;

    private String pDescription;

    private String pName;

    private String pUrl;

    private static final long serialVersionUID = 1L;

    public Long getpId() {
        return pId;
    }

    public Permission withpId(Long pId) {
        this.setpId(pId);
        return this;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getpDescription() {
        return pDescription;
    }

    public Permission withpDescription(String pDescription) {
        this.setpDescription(pDescription);
        return this;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription == null ? null : pDescription.trim();
    }

    public String getpName() {
        return pName;
    }

    public Permission withpName(String pName) {
        this.setpName(pName);
        return this;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpUrl() {
        return pUrl;
    }

    public Permission withpUrl(String pUrl) {
        this.setpUrl(pUrl);
        return this;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl == null ? null : pUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pDescription=").append(pDescription);
        sb.append(", pName=").append(pName);
        sb.append(", pUrl=").append(pUrl);
        sb.append("]");
        return sb.toString();
    }
}