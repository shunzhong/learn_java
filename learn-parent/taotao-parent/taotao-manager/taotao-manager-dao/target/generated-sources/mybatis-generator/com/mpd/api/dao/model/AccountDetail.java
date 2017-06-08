package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDetail {
    private Integer id;

    private String uesrId;

    private Short operType;

    private BigDecimal operAmount;

    private BigDecimal accountAmount;

    private Date operTime;

    private Short operStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUesrId() {
        return uesrId;
    }

    public void setUesrId(String uesrId) {
        this.uesrId = uesrId == null ? null : uesrId.trim();
    }

    public Short getOperType() {
        return operType;
    }

    public void setOperType(Short operType) {
        this.operType = operType;
    }

    public BigDecimal getOperAmount() {
        return operAmount;
    }

    public void setOperAmount(BigDecimal operAmount) {
        this.operAmount = operAmount;
    }

    public BigDecimal getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(BigDecimal accountAmount) {
        this.accountAmount = accountAmount;
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public Short getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(Short operStatus) {
        this.operStatus = operStatus;
    }
}