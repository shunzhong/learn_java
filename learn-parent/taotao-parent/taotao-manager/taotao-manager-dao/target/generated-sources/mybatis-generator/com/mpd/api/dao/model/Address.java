package com.mpd.api.dao.model;

import java.math.BigDecimal;

public class Address {
    private Long id;

    private String userId;

    private String recipients;

    private BigDecimal telphone;

    private String location;

    private String detail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients == null ? null : recipients.trim();
    }

    public BigDecimal getTelphone() {
        return telphone;
    }

    public void setTelphone(BigDecimal telphone) {
        this.telphone = telphone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}