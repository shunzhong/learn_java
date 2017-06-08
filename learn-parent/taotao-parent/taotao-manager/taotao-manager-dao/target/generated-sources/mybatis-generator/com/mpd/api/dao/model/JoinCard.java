package com.mpd.api.dao.model;

import java.util.Date;

public class JoinCard {
    private String id;

    private String card;

    private Byte status;

    private Byte ispretty;

    private Date createDate;

    private String bankCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIspretty() {
        return ispretty;
    }

    public void setIspretty(Byte ispretty) {
        this.ispretty = ispretty;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }
}