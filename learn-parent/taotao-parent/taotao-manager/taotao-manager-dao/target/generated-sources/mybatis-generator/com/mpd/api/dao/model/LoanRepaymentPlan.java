package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class LoanRepaymentPlan {
    private Long id;

    private String houseCardFull;

    private BigDecimal loanRate;

    private String userId;

    private Long loanId;

    private Short totalPeriod;

    private Short currentPeriod;

    private BigDecimal currentInterest;

    private BigDecimal currentPrincipal;

    private BigDecimal hadRepaidPrincipal;

    private BigDecimal hadRepaidInterest;

    private Date estimatedRepaymentDate;

    private Date realRepaymentDate;

    private BigDecimal overduePenalty;

    private Short repaymentStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHouseCardFull() {
        return houseCardFull;
    }

    public void setHouseCardFull(String houseCardFull) {
        this.houseCardFull = houseCardFull == null ? null : houseCardFull.trim();
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Short getTotalPeriod() {
        return totalPeriod;
    }

    public void setTotalPeriod(Short totalPeriod) {
        this.totalPeriod = totalPeriod;
    }

    public Short getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(Short currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public BigDecimal getCurrentInterest() {
        return currentInterest;
    }

    public void setCurrentInterest(BigDecimal currentInterest) {
        this.currentInterest = currentInterest;
    }

    public BigDecimal getCurrentPrincipal() {
        return currentPrincipal;
    }

    public void setCurrentPrincipal(BigDecimal currentPrincipal) {
        this.currentPrincipal = currentPrincipal;
    }

    public BigDecimal getHadRepaidPrincipal() {
        return hadRepaidPrincipal;
    }

    public void setHadRepaidPrincipal(BigDecimal hadRepaidPrincipal) {
        this.hadRepaidPrincipal = hadRepaidPrincipal;
    }

    public BigDecimal getHadRepaidInterest() {
        return hadRepaidInterest;
    }

    public void setHadRepaidInterest(BigDecimal hadRepaidInterest) {
        this.hadRepaidInterest = hadRepaidInterest;
    }

    public Date getEstimatedRepaymentDate() {
        return estimatedRepaymentDate;
    }

    public void setEstimatedRepaymentDate(Date estimatedRepaymentDate) {
        this.estimatedRepaymentDate = estimatedRepaymentDate;
    }

    public Date getRealRepaymentDate() {
        return realRepaymentDate;
    }

    public void setRealRepaymentDate(Date realRepaymentDate) {
        this.realRepaymentDate = realRepaymentDate;
    }

    public BigDecimal getOverduePenalty() {
        return overduePenalty;
    }

    public void setOverduePenalty(BigDecimal overduePenalty) {
        this.overduePenalty = overduePenalty;
    }

    public Short getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(Short repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }
}