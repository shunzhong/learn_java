package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class HouseAssessmentInfo {
    private Integer id;

    private Integer houseId;

    private BigDecimal perAmount;

    private BigDecimal totalAmount;

    private String asseSource;

    private Short asseType;

    private Date asseTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public BigDecimal getPerAmount() {
        return perAmount;
    }

    public void setPerAmount(BigDecimal perAmount) {
        this.perAmount = perAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getAsseSource() {
        return asseSource;
    }

    public void setAsseSource(String asseSource) {
        this.asseSource = asseSource == null ? null : asseSource.trim();
    }

    public Short getAsseType() {
        return asseType;
    }

    public void setAsseType(Short asseType) {
        this.asseType = asseType;
    }

    public Date getAsseTime() {
        return asseTime;
    }

    public void setAsseTime(Date asseTime) {
        this.asseTime = asseTime;
    }
}