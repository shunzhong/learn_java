package com.mpd.api.dao.model;

import java.util.Date;

public class UserMortgageHouseInfo {
    private Integer id;

    private String userId;

    private Integer houseId;

    private Byte mortgageStatus;

    private Date mortgageDate;

    private String handler;

    private String mortgageFile;

    private String approveRemark;

    private Byte mortgageType;

    private Byte mortgageObjType;

    private String mortgageRemark;

    private Date cancellationDate;

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

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Byte getMortgageStatus() {
        return mortgageStatus;
    }

    public void setMortgageStatus(Byte mortgageStatus) {
        this.mortgageStatus = mortgageStatus;
    }

    public Date getMortgageDate() {
        return mortgageDate;
    }

    public void setMortgageDate(Date mortgageDate) {
        this.mortgageDate = mortgageDate;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getMortgageFile() {
        return mortgageFile;
    }

    public void setMortgageFile(String mortgageFile) {
        this.mortgageFile = mortgageFile == null ? null : mortgageFile.trim();
    }

    public String getApproveRemark() {
        return approveRemark;
    }

    public void setApproveRemark(String approveRemark) {
        this.approveRemark = approveRemark == null ? null : approveRemark.trim();
    }

    public Byte getMortgageType() {
        return mortgageType;
    }

    public void setMortgageType(Byte mortgageType) {
        this.mortgageType = mortgageType;
    }

    public Byte getMortgageObjType() {
        return mortgageObjType;
    }

    public void setMortgageObjType(Byte mortgageObjType) {
        this.mortgageObjType = mortgageObjType;
    }

    public String getMortgageRemark() {
        return mortgageRemark;
    }

    public void setMortgageRemark(String mortgageRemark) {
        this.mortgageRemark = mortgageRemark == null ? null : mortgageRemark.trim();
    }

    public Date getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }
}