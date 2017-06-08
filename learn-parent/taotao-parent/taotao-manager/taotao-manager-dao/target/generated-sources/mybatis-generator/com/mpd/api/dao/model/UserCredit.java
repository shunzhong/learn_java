package com.mpd.api.dao.model;

public class UserCredit {
    private String creditId;

    private String userId;

    private Integer loanStrokeCount;

    private Float loanMoney;

    private Integer overdueStrokeCount;

    private Integer creditRatings;

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId == null ? null : creditId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getLoanStrokeCount() {
        return loanStrokeCount;
    }

    public void setLoanStrokeCount(Integer loanStrokeCount) {
        this.loanStrokeCount = loanStrokeCount;
    }

    public Float getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(Float loanMoney) {
        this.loanMoney = loanMoney;
    }

    public Integer getOverdueStrokeCount() {
        return overdueStrokeCount;
    }

    public void setOverdueStrokeCount(Integer overdueStrokeCount) {
        this.overdueStrokeCount = overdueStrokeCount;
    }

    public Integer getCreditRatings() {
        return creditRatings;
    }

    public void setCreditRatings(Integer creditRatings) {
        this.creditRatings = creditRatings;
    }
}