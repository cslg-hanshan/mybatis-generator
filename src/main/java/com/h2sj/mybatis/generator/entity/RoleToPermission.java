package com.h2sj.mybatis.generator.entity;

import java.io.Serializable;

public class RoleToPermission implements Serializable {
    private Long rId;

    private Long pId;

    private static final long serialVersionUID = 1L;

    public Long getrId() {
        return rId;
    }

    public RoleToPermission withrId(Long rId) {
        this.setrId(rId);
        return this;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public Long getpId() {
        return pId;
    }

    public RoleToPermission withpId(Long pId) {
        this.setpId(pId);
        return this;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", pId=").append(pId);
        sb.append("]");
        return sb.toString();
    }
}