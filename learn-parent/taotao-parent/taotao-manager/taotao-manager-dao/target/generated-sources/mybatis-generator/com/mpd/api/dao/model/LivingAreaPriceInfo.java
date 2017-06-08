package com.mpd.api.dao.model;

import java.math.BigDecimal;

public class LivingAreaPriceInfo {
    private Integer id;

    private String areaName;

    private String houseNumber;

    private BigDecimal housePerPrice;

    private String latitude;

    private String longitude;

    private Integer parentCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber == null ? null : houseNumber.trim();
    }

    public BigDecimal getHousePerPrice() {
        return housePerPrice;
    }

    public void setHousePerPrice(BigDecimal housePerPrice) {
        this.housePerPrice = housePerPrice;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public Integer getParentCode() {
        return parentCode;
    }

    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }
}