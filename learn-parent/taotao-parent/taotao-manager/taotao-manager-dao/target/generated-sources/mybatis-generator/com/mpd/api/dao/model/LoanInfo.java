package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class LoanInfo {
    private Integer id;

    private String userId;

    private BigDecimal applyAmount;

    private Integer applyDeadline;

    private Date applyDate;

    private String houseCardFull;

    private Integer houseId;

    private BigDecimal loanAmount;

    private Integer loanDeadline;

    private BigDecimal loanRate;

    private Date loanDate;

    private Short loanStatus;

    private Short deadlineType;

    private BigDecimal finalAssAmount;

    private BigDecimal loanAssRate;

    private String createBy;

    private String delFlag;

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

    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Integer getApplyDeadline() {
        return applyDeadline;
    }

    public void setApplyDeadline(Integer applyDeadline) {
        this.applyDeadline = applyDeadline;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getHouseCardFull() {
        return houseCardFull;
    }

    public void setHouseCardFull(String houseCardFull) {
        this.houseCardFull = houseCardFull == null ? null : houseCardFull.trim();
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getLoanDeadline() {
        return loanDeadline;
    }

    public void setLoanDeadline(Integer loanDeadline) {
        this.loanDeadline = loanDeadline;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Short getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(Short loanStatus) {
        this.loanStatus = loanStatus;
    }

    public Short getDeadlineType() {
        return deadlineType;
    }

    public void setDeadlineType(Short deadlineType) {
        this.deadlineType = deadlineType;
    }

    public BigDecimal getFinalAssAmount() {
        return finalAssAmount;
    }

    public void setFinalAssAmount(BigDecimal finalAssAmount) {
        this.finalAssAmount = finalAssAmount;
    }

    public BigDecimal getLoanAssRate() {
        return loanAssRate;
    }

    public void setLoanAssRate(BigDecimal loanAssRate) {
        this.loanAssRate = loanAssRate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}