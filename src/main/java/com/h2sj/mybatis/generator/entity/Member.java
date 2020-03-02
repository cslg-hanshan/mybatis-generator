package com.h2sj.mybatis.generator.entity;

import java.io.Serializable;

public class Member implements Serializable {
    private Long mId;

    private String uPassword;

    private String mUsername;

    private Long rId;

    private static final long serialVersionUID = 1L;

    public Long getmId() {
        return mId;
    }

    public Member withmId(Long mId) {
        this.setmId(mId);
        return this;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getuPassword() {
        return uPassword;
    }

    public Member withuPassword(String uPassword) {
        this.setuPassword(uPassword);
        return this;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getmUsername() {
        return mUsername;
    }

    public Member withmUsername(String mUsername) {
        this.setmUsername(mUsername);
        return this;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername == null ? null : mUsername.trim();
    }

    public Long getrId() {
        return rId;
    }

    public Member withrId(Long rId) {
        this.setrId(rId);
        return this;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", uPassword=").append(uPassword);
        sb.append(", mUsername=").append(mUsername);
        sb.append(", rId=").append(rId);
        sb.append("]");
        return sb.toString();
    }
}