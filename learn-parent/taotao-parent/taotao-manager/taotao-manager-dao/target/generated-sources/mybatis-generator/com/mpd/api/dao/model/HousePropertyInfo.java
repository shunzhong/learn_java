package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class HousePropertyInfo {
    private Integer id;

    private Integer houseCardYear;

    private Integer houseCardNumber;

    private String houseCardFull;

    private Date cardDate;

    private String landNo;

    private Float landSize;

    private Short landPurpose;

    private Date landStartDate;

    private Date landEndDate;

    private Short landSource;

    private Integer landServiceLife;

    private String estateAgent;

    private Float buildingArea;

    private Float innerBuildingArea;

    private Short housePurpose;

    private BigDecimal registerPrice;

    private Date completionDate;

    private String houseProvince;

    private String houseCity;

    private String houseArea;

    private String houseDetailAddress;

    private Date housePurchaseDate;

    private Date houseRegisterDate;

    private Short houseCardType;

    private String houseCardPhoto;

    private String delFlag;

    private Short houseType;

    private String isOnlyHave;

    private Short houseStatus;

    private Short houseSource;

    private Short actuality;

    private String createBy;

    private Short isOnlyHousing;

    private Short isHousePopulation;

    private String accountName;

    private String totalAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseCardYear() {
        return houseCardYear;
    }

    public void setHouseCardYear(Integer houseCardYear) {
        this.houseCardYear = houseCardYear;
    }

    public Integer getHouseCardNumber() {
        return houseCardNumber;
    }

    public void setHouseCardNumber(Integer houseCardNumber) {
        this.houseCardNumber = houseCardNumber;
    }

    public String getHouseCardFull() {
        return houseCardFull;
    }

    public void setHouseCardFull(String houseCardFull) {
        this.houseCardFull = houseCardFull == null ? null : houseCardFull.trim();
    }

    public Date getCardDate() {
        return cardDate;
    }

    public void setCardDate(Date cardDate) {
        this.cardDate = cardDate;
    }

    public String getLandNo() {
        return landNo;
    }

    public void setLandNo(String landNo) {
        this.landNo = landNo == null ? null : landNo.trim();
    }

    public Float getLandSize() {
        return landSize;
    }

    public void setLandSize(Float landSize) {
        this.landSize = landSize;
    }

    public Short getLandPurpose() {
        return landPurpose;
    }

    public void setLandPurpose(Short landPurpose) {
        this.landPurpose = landPurpose;
    }

    public Date getLandStartDate() {
        return landStartDate;
    }

    public void setLandStartDate(Date landStartDate) {
        this.landStartDate = landStartDate;
    }

    public Date getLandEndDate() {
        return landEndDate;
    }

    public void setLandEndDate(Date landEndDate) {
        this.landEndDate = landEndDate;
    }

    public Short getLandSource() {
        return landSource;
    }

    public void setLandSource(Short landSource) {
        this.landSource = landSource;
    }

    public Integer getLandServiceLife() {
        return landServiceLife;
    }

    public void setLandServiceLife(Integer landServiceLife) {
        this.landServiceLife = landServiceLife;
    }

    public String getEstateAgent() {
        return estateAgent;
    }

    public void setEstateAgent(String estateAgent) {
        this.estateAgent = estateAgent == null ? null : estateAgent.trim();
    }

    public Float getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(Float buildingArea) {
        this.buildingArea = buildingArea;
    }

    public Float getInnerBuildingArea() {
        return innerBuildingArea;
    }

    public void setInnerBuildingArea(Float innerBuildingArea) {
        this.innerBuildingArea = innerBuildingArea;
    }

    public Short getHousePurpose() {
        return housePurpose;
    }

    public void setHousePurpose(Short housePurpose) {
        this.housePurpose = housePurpose;
    }

    public BigDecimal getRegisterPrice() {
        return registerPrice;
    }

    public void setRegisterPrice(BigDecimal registerPrice) {
        this.registerPrice = registerPrice;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
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

    public String getHouseDetailAddress() {
        return houseDetailAddress;
    }

    public void setHouseDetailAddress(String houseDetailAddress) {
        this.houseDetailAddress = houseDetailAddress == null ? null : houseDetailAddress.trim();
    }

    public Date getHousePurchaseDate() {
        return housePurchaseDate;
    }

    public void setHousePurchaseDate(Date housePurchaseDate) {
        this.housePurchaseDate = housePurchaseDate;
    }

    public Date getHouseRegisterDate() {
        return houseRegisterDate;
    }

    public void setHouseRegisterDate(Date houseRegisterDate) {
        this.houseRegisterDate = houseRegisterDate;
    }

    public Short getHouseCardType() {
        return houseCardType;
    }

    public void setHouseCardType(Short houseCardType) {
        this.houseCardType = houseCardType;
    }

    public String getHouseCardPhoto() {
        return houseCardPhoto;
    }

    public void setHouseCardPhoto(String houseCardPhoto) {
        this.houseCardPhoto = houseCardPhoto == null ? null : houseCardPhoto.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Short getHouseType() {
        return houseType;
    }

    public void setHouseType(Short houseType) {
        this.houseType = houseType;
    }

    public String getIsOnlyHave() {
        return isOnlyHave;
    }

    public void setIsOnlyHave(String isOnlyHave) {
        this.isOnlyHave = isOnlyHave == null ? null : isOnlyHave.trim();
    }

    public Short getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(Short houseStatus) {
        this.houseStatus = houseStatus;
    }

    public Short getHouseSource() {
        return houseSource;
    }

    public void setHouseSource(Short houseSource) {
        this.houseSource = houseSource;
    }

    public Short getActuality() {
        return actuality;
    }

    public void setActuality(Short actuality) {
        this.actuality = actuality;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Short getIsOnlyHousing() {
        return isOnlyHousing;
    }

    public void setIsOnlyHousing(Short isOnlyHousing) {
        this.isOnlyHousing = isOnlyHousing;
    }

    public Short getIsHousePopulation() {
        return isHousePopulation;
    }

    public void setIsHousePopulation(Short isHousePopulation) {
        this.isHousePopulation = isHousePopulation;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount == null ? null : totalAmount.trim();
    }
}