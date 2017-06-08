package com.mpd.api.dao.model;

public class HouseCoparcenaryRatio {
    private Integer id;

    private Integer houseId;

    private String realName;

    private Short cardType;

    private String telphone;

    private String cardNumber;

    private Double houseRatio;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Short getCardType() {
        return cardType;
    }

    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public Double getHouseRatio() {
        return houseRatio;
    }

    public void setHouseRatio(Double houseRatio) {
        this.houseRatio = houseRatio;
    }
}