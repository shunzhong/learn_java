package com.mpd.api.dao.model;

public class HouseSurveyFile {
    private Integer id;

    private Integer houseSurveyId;

    private String identityCardFront;

    private String identityCardBack;

    private String identityHold;

    private String marriageCertificate;

    private String livingAreaGate;

    private String livingAreaAround;

    private String livingAreaInner;

    private String houseNumber;

    private String sittingRoom;

    private String bedrooom;

    private String kitchen;

    private String bathroom;

    private String balcony;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseSurveyId() {
        return houseSurveyId;
    }

    public void setHouseSurveyId(Integer houseSurveyId) {
        this.houseSurveyId = houseSurveyId;
    }

    public String getIdentityCardFront() {
        return identityCardFront;
    }

    public void setIdentityCardFront(String identityCardFront) {
        this.identityCardFront = identityCardFront == null ? null : identityCardFront.trim();
    }

    public String getIdentityCardBack() {
        return identityCardBack;
    }

    public void setIdentityCardBack(String identityCardBack) {
        this.identityCardBack = identityCardBack == null ? null : identityCardBack.trim();
    }

    public String getIdentityHold() {
        return identityHold;
    }

    public void setIdentityHold(String identityHold) {
        this.identityHold = identityHold == null ? null : identityHold.trim();
    }

    public String getMarriageCertificate() {
        return marriageCertificate;
    }

    public void setMarriageCertificate(String marriageCertificate) {
        this.marriageCertificate = marriageCertificate == null ? null : marriageCertificate.trim();
    }

    public String getLivingAreaGate() {
        return livingAreaGate;
    }

    public void setLivingAreaGate(String livingAreaGate) {
        this.livingAreaGate = livingAreaGate == null ? null : livingAreaGate.trim();
    }

    public String getLivingAreaAround() {
        return livingAreaAround;
    }

    public void setLivingAreaAround(String livingAreaAround) {
        this.livingAreaAround = livingAreaAround == null ? null : livingAreaAround.trim();
    }

    public String getLivingAreaInner() {
        return livingAreaInner;
    }

    public void setLivingAreaInner(String livingAreaInner) {
        this.livingAreaInner = livingAreaInner == null ? null : livingAreaInner.trim();
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber == null ? null : houseNumber.trim();
    }

    public String getSittingRoom() {
        return sittingRoom;
    }

    public void setSittingRoom(String sittingRoom) {
        this.sittingRoom = sittingRoom == null ? null : sittingRoom.trim();
    }

    public String getBedrooom() {
        return bedrooom;
    }

    public void setBedrooom(String bedrooom) {
        this.bedrooom = bedrooom == null ? null : bedrooom.trim();
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen == null ? null : kitchen.trim();
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom == null ? null : bathroom.trim();
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony == null ? null : balcony.trim();
    }
}