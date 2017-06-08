package com.mpd.api.dao.model;

import java.util.Date;

public class HouseSurveyInfo {
    private Integer id;

    private Integer houseId;

    private Short isOld;

    private String orientation;

    private Boolean isFamilyKnown;

    private Short houseType;

    private Short buildingType;

    private Integer totalFloor;

    private Integer houseFloor;

    private Short houseState;

    private Short obtainWay;

    private String livingAreaName;

    private Date surveyTime;

    private String surveyId;

    private Boolean isOnlyHouse;

    private Boolean isFrozen;

    private String landSource;

    private Boolean isHouseJold;

    private Boolean isAddressConsistent;

    private String houseCardCertificate;

    private String houseFindingAddress;

    private String proprietorshipName;

    private Double houseSurveyRatio;

    private Short houseAge;

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

    public Short getIsOld() {
        return isOld;
    }

    public void setIsOld(Short isOld) {
        this.isOld = isOld;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation == null ? null : orientation.trim();
    }

    public Boolean getIsFamilyKnown() {
        return isFamilyKnown;
    }

    public void setIsFamilyKnown(Boolean isFamilyKnown) {
        this.isFamilyKnown = isFamilyKnown;
    }

    public Short getHouseType() {
        return houseType;
    }

    public void setHouseType(Short houseType) {
        this.houseType = houseType;
    }

    public Short getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(Short buildingType) {
        this.buildingType = buildingType;
    }

    public Integer getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(Integer totalFloor) {
        this.totalFloor = totalFloor;
    }

    public Integer getHouseFloor() {
        return houseFloor;
    }

    public void setHouseFloor(Integer houseFloor) {
        this.houseFloor = houseFloor;
    }

    public Short getHouseState() {
        return houseState;
    }

    public void setHouseState(Short houseState) {
        this.houseState = houseState;
    }

    public Short getObtainWay() {
        return obtainWay;
    }

    public void setObtainWay(Short obtainWay) {
        this.obtainWay = obtainWay;
    }

    public String getLivingAreaName() {
        return livingAreaName;
    }

    public void setLivingAreaName(String livingAreaName) {
        this.livingAreaName = livingAreaName == null ? null : livingAreaName.trim();
    }

    public Date getSurveyTime() {
        return surveyTime;
    }

    public void setSurveyTime(Date surveyTime) {
        this.surveyTime = surveyTime;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId == null ? null : surveyId.trim();
    }

    public Boolean getIsOnlyHouse() {
        return isOnlyHouse;
    }

    public void setIsOnlyHouse(Boolean isOnlyHouse) {
        this.isOnlyHouse = isOnlyHouse;
    }

    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public String getLandSource() {
        return landSource;
    }

    public void setLandSource(String landSource) {
        this.landSource = landSource == null ? null : landSource.trim();
    }

    public Boolean getIsHouseJold() {
        return isHouseJold;
    }

    public void setIsHouseJold(Boolean isHouseJold) {
        this.isHouseJold = isHouseJold;
    }

    public Boolean getIsAddressConsistent() {
        return isAddressConsistent;
    }

    public void setIsAddressConsistent(Boolean isAddressConsistent) {
        this.isAddressConsistent = isAddressConsistent;
    }

    public String getHouseCardCertificate() {
        return houseCardCertificate;
    }

    public void setHouseCardCertificate(String houseCardCertificate) {
        this.houseCardCertificate = houseCardCertificate == null ? null : houseCardCertificate.trim();
    }

    public String getHouseFindingAddress() {
        return houseFindingAddress;
    }

    public void setHouseFindingAddress(String houseFindingAddress) {
        this.houseFindingAddress = houseFindingAddress == null ? null : houseFindingAddress.trim();
    }

    public String getProprietorshipName() {
        return proprietorshipName;
    }

    public void setProprietorshipName(String proprietorshipName) {
        this.proprietorshipName = proprietorshipName == null ? null : proprietorshipName.trim();
    }

    public Double getHouseSurveyRatio() {
        return houseSurveyRatio;
    }

    public void setHouseSurveyRatio(Double houseSurveyRatio) {
        this.houseSurveyRatio = houseSurveyRatio;
    }

    public Short getHouseAge() {
        return houseAge;
    }

    public void setHouseAge(Short houseAge) {
        this.houseAge = houseAge;
    }
}