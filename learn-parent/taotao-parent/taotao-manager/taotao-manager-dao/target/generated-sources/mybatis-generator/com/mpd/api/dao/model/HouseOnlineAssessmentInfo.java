package com.mpd.api.dao.model;

import java.util.Date;

public class HouseOnlineAssessmentInfo {
    private Integer id;

    private String userId;

    private String houseProvince;

    private String houseCity;

    private String houseArea;

    private String livingArea;

    private String orientate;

    private String area;

    private String inFloor;

    private String totalFloor;

    private Float asseTotalAmount;

    private Float assePerAmount;

    private Float rent;

    private String asseSource;

    private Date asseTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getHouseProvince() {
        return houseProvince;
    }

    public void setHouseProvince(String houseProvince) {
        this.houseProvince = houseProvince == null ? null : houseProvince.trim();
    }

    public String getHouseCity() {
        return houseCity;
    }

    public void setHouseCity(String houseCity) {
        this.houseCity = houseCity == null ? null : houseCity.trim();
    }

    public String getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea == null ? null : houseArea.trim();
    }

    public String getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea == null ? null : livingArea.trim();
    }

    public String getOrientate() {
        return orientate;
    }

    public void setOrientate(String orientate) {
        this.orientate = orientate == null ? null : orientate.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getInFloor() {
        return inFloor;
    }

    public void setInFloor(String inFloor) {
        this.inFloor = inFloor == null ? null : inFloor.trim();
    }

    public String getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(String totalFloor) {
        this.totalFloor = totalFloor == null ? null : totalFloor.trim();
    }

    public Float getAsseTotalAmount() {
        return asseTotalAmount;
    }

    public void setAsseTotalAmount(Float asseTotalAmount) {
        this.asseTotalAmount = asseTotalAmount;
    }

    public Float getAssePerAmount() {
        return assePerAmount;
    }

    public void setAssePerAmount(Float assePerAmount) {
        this.assePerAmount = assePerAmount;
    }

    public Float getRent() {
        return rent;
    }

    public void setRent(Float rent) {
        this.rent = rent;
    }

    public String getAsseSource() {
        return asseSource;
    }

    public void setAsseSource(String asseSource) {
        this.asseSource = asseSource == null ? null : asseSource.trim();
    }

    public Date getAsseTime() {
        return asseTime;
    }

    public void setAsseTime(Date asseTime) {
        this.asseTime = asseTime;
    }
}