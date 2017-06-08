package com.mpd.api.dao.model;

import java.math.BigDecimal;

public class UserBankInfo {
    private String id;

    private String bankName;

    private String subbranch;

    private String userId;

    private BigDecimal bankNumber;

    private Short cardStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getSubbranch() {
        return subbranch;
    }

    public void setSubbranch(String subbranch) {
        this.subbranch = subbranch == null ? null : subbranch.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(BigDecimal bankNumber) {
        this.bankNumber = bankNumber;
    }

    public Short getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Short cardStatus) {
        this.cardStatus = cardStatus;
    }
}