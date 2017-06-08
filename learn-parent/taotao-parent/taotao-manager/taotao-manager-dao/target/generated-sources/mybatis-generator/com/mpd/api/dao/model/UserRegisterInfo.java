package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserRegisterInfo {
    private String id;

    private BigDecimal telphone;

    private Date registerTime;

    private String password;

    private Date loginTime;

    private String email;

    private String loginName;

    private Short userSource;

    private String loginIp;

    private Short loginFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getTelphone() {
        return telphone;
    }

    public void setTelphone(BigDecimal telphone) {
        this.telphone = telphone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public Short getUserSource() {
        return userSource;
    }

    public void setUserSource(Short userSource) {
        this.userSource = userSource;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Short getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(Short loginFlag) {
        this.loginFlag = loginFlag;
    }
}