package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class CreditRecord {
    private Integer id;

    private Integer loanId;

    private String userId;

    private Date creditDate;

    private Date createDate;

    private BigDecimal shouldMoney;

    private BigDecimal actMoney;

    private String createBy;

    private BigDecimal fee;

    private String delFlag;

    private String creditProof;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getShouldMoney() {
        return shouldMoney;
    }

    public void setShouldMoney(BigDecimal shouldMoney) {
        this.shouldMoney = shouldMoney;
    }

    public BigDecimal getActMoney() {
        return actMoney;
    }

    public void setActMoney(BigDecimal actMoney) {
        this.actMoney = actMoney;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getCreditProof() {
        return creditProof;
    }

    public void setCreditProof(String creditProof) {
        this.creditProof = creditProof == null ? null : creditProof.trim();
    }
}