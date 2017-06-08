package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class HouseNotarizationInfo {
    private Integer id;

    private Date notarizationDate;

    private Float notarizationRate;

    private Float notarizationFee;

    private String notarizationUserName;

    private BigDecimal notarizationTelphone;

    private String notarizationFile;

    private String loanContract;

    private Integer houseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getNotarizationDate() {
        return notarizationDate;
    }

    public void setNotarizationDate(Date notarizationDate) {
        this.notarizationDate = notarizationDate;
    }

    public Float getNotarizationRate() {
        return notarizationRate;
    }

    public void setNotarizationRate(Float notarizationRate) {
        this.notarizationRate = notarizationRate;
    }

    public Float getNotarizationFee() {
        return notarizationFee;
    }

    public void setNotarizationFee(Float notarizationFee) {
        this.notarizationFee = notarizationFee;
    }

    public String getNotarizationUserName() {
        return notarizationUserName;
    }

    public void setNotarizationUserName(String notarizationUserName) {
        this.notarizationUserName = notarizationUserName == null ? null : notarizationUserName.trim();
    }

    public BigDecimal getNotarizationTelphone() {
        return notarizationTelphone;
    }

    public void setNotarizationTelphone(BigDecimal notarizationTelphone) {
        this.notarizationTelphone = notarizationTelphone;
    }

    public String getNotarizationFile() {
        return notarizationFile;
    }

    public void setNotarizationFile(String notarizationFile) {
        this.notarizationFile = notarizationFile == null ? null : notarizationFile.trim();
    }

    public String getLoanContract() {
        return loanContract;
    }

    public void setLoanContract(String loanContract) {
        this.loanContract = loanContract == null ? null : loanContract.trim();
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }
}