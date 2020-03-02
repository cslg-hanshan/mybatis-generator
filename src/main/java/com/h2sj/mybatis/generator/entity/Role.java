package com.h2sj.mybatis.generator.entity;

import java.io.Serializable;

public class Role implements Serializable {
    private Long rId;

    private String rName;

    private static final long serialVersionUID = 1L;

    public Long getrId() {
        return rId;
    }

    public Role withrId(Long rId) {
        this.setrId(rId);
        return this;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public Role withrName(String rName) {
        this.setrName(rName);
        return this;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", rName=").append(rName);
        sb.append("]");
        return sb.toString();
    }
}