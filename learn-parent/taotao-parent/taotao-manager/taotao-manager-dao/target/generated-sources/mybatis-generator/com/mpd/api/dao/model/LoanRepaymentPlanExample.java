package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanRepaymentPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanRepaymentPlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullIsNull() {
            addCriterion("house_card_full is null");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullIsNotNull() {
            addCriterion("house_card_full is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullEqualTo(String value) {
            addCriterion("house_card_full =", value, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullNotEqualTo(String value) {
            addCriterion("house_card_full <>", value, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullGreaterThan(String value) {
            addCriterion("house_card_full >", value, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullGreaterThanOrEqualTo(String value) {
            addCriterion("house_card_full >=", value, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullLessThan(String value) {
            addCriterion("house_card_full <", value, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullLessThanOrEqualTo(String value) {
            addCriterion("house_card_full <=", value, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullLike(String value) {
            addCriterion("house_card_full like", value, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullNotLike(String value) {
            addCriterion("house_card_full not like", value, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullIn(List<String> values) {
            addCriterion("house_card_full in", values, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullNotIn(List<String> values) {
            addCriterion("house_card_full not in", values, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullBetween(String value1, String value2) {
            addCriterion("house_card_full between", value1, value2, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andHouseCardFullNotBetween(String value1, String value2) {
            addCriterion("house_card_full not between", value1, value2, "houseCardFull");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNull() {
            addCriterion("loan_rate is null");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNotNull() {
            addCriterion("loan_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanRateEqualTo(BigDecimal value) {
            addCriterion("loan_rate =", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotEqualTo(BigDecimal value) {
            addCriterion("loan_rate <>", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThan(BigDecimal value) {
            addCriterion("loan_rate >", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_rate >=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThan(BigDecimal value) {
            addCriterion("loan_rate <", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_rate <=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateIn(List<BigDecimal> values) {
            addCriterion("loan_rate in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotIn(List<BigDecimal> values) {
            addCriterion("loan_rate not in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_rate between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_rate not between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(Long value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(Long value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(Long value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(Long value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(Long value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<Long> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<Long> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(Long value1, Long value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(Long value1, Long value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIsNull() {
            addCriterion("total_period is null");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIsNotNull() {
            addCriterion("total_period is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodEqualTo(Short value) {
            addCriterion("total_period =", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotEqualTo(Short value) {
            addCriterion("total_period <>", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodGreaterThan(Short value) {
            addCriterion("total_period >", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodGreaterThanOrEqualTo(Short value) {
            addCriterion("total_period >=", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLessThan(Short value) {
            addCriterion("total_period <", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLessThanOrEqualTo(Short value) {
            addCriterion("total_period <=", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIn(List<Short> values) {
            addCriterion("total_period in", values, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotIn(List<Short> values) {
            addCriterion("total_period not in", values, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodBetween(Short value1, Short value2) {
            addCriterion("total_period between", value1, value2, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotBetween(Short value1, Short value2) {
            addCriterion("total_period not between", value1, value2, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodIsNull() {
            addCriterion("current_period is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodIsNotNull() {
            addCriterion("current_period is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodEqualTo(Short value) {
            addCriterion("current_period =", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodNotEqualTo(Short value) {
            addCriterion("current_period <>", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodGreaterThan(Short value) {
            addCriterion("current_period >", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodGreaterThanOrEqualTo(Short value) {
            addCriterion("current_period >=", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodLessThan(Short value) {
            addCriterion("current_period <", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodLessThanOrEqualTo(Short value) {
            addCriterion("current_period <=", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodIn(List<Short> values) {
            addCriterion("current_period in", values, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodNotIn(List<Short> values) {
            addCriterion("current_period not in", values, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodBetween(Short value1, Short value2) {
            addCriterion("current_period between", value1, value2, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodNotBetween(Short value1, Short value2) {
            addCriterion("current_period not between", value1, value2, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestIsNull() {
            addCriterion("current_interest is null");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestIsNotNull() {
            addCriterion("current_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestEqualTo(BigDecimal value) {
            addCriterion("current_interest =", value, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestNotEqualTo(BigDecimal value) {
            addCriterion("current_interest <>", value, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestGreaterThan(BigDecimal value) {
            addCriterion("current_interest >", value, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_interest >=", value, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestLessThan(BigDecimal value) {
            addCriterion("current_interest <", value, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_interest <=", value, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestIn(List<BigDecimal> values) {
            addCriterion("current_interest in", values, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestNotIn(List<BigDecimal> values) {
            addCriterion("current_interest not in", values, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_interest between", value1, value2, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_interest not between", value1, value2, "currentInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalIsNull() {
            addCriterion("current_principal is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalIsNotNull() {
            addCriterion("current_principal is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalEqualTo(BigDecimal value) {
            addCriterion("current_principal =", value, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("current_principal <>", value, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalGreaterThan(BigDecimal value) {
            addCriterion("current_principal >", value, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_principal >=", value, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalLessThan(BigDecimal value) {
            addCriterion("current_principal <", value, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_principal <=", value, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalIn(List<BigDecimal> values) {
            addCriterion("current_principal in", values, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("current_principal not in", values, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_principal between", value1, value2, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_principal not between", value1, value2, "currentPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalIsNull() {
            addCriterion("had_repaid_principal is null");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalIsNotNull() {
            addCriterion("had_repaid_principal is not null");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalEqualTo(BigDecimal value) {
            addCriterion("had_repaid_principal =", value, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("had_repaid_principal <>", value, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalGreaterThan(BigDecimal value) {
            addCriterion("had_repaid_principal >", value, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("had_repaid_principal >=", value, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalLessThan(BigDecimal value) {
            addCriterion("had_repaid_principal <", value, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("had_repaid_principal <=", value, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalIn(List<BigDecimal> values) {
            addCriterion("had_repaid_principal in", values, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("had_repaid_principal not in", values, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("had_repaid_principal between", value1, value2, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("had_repaid_principal not between", value1, value2, "hadRepaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestIsNull() {
            addCriterion("had_repaid_interest is null");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestIsNotNull() {
            addCriterion("had_repaid_interest is not null");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestEqualTo(BigDecimal value) {
            addCriterion("had_repaid_interest =", value, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestNotEqualTo(BigDecimal value) {
            addCriterion("had_repaid_interest <>", value, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestGreaterThan(BigDecimal value) {
            addCriterion("had_repaid_interest >", value, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("had_repaid_interest >=", value, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestLessThan(BigDecimal value) {
            addCriterion("had_repaid_interest <", value, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("had_repaid_interest <=", value, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestIn(List<BigDecimal> values) {
            addCriterion("had_repaid_interest in", values, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestNotIn(List<BigDecimal> values) {
            addCriterion("had_repaid_interest not in", values, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("had_repaid_interest between", value1, value2, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andHadRepaidInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("had_repaid_interest not between", value1, value2, "hadRepaidInterest");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateIsNull() {
            addCriterion("estimated_repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateIsNotNull() {
            addCriterion("estimated_repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateEqualTo(Date value) {
            addCriterion("estimated_repayment_date =", value, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateNotEqualTo(Date value) {
            addCriterion("estimated_repayment_date <>", value, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateGreaterThan(Date value) {
            addCriterion("estimated_repayment_date >", value, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("estimated_repayment_date >=", value, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateLessThan(Date value) {
            addCriterion("estimated_repayment_date <", value, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("estimated_repayment_date <=", value, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateIn(List<Date> values) {
            addCriterion("estimated_repayment_date in", values, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateNotIn(List<Date> values) {
            addCriterion("estimated_repayment_date not in", values, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateBetween(Date value1, Date value2) {
            addCriterion("estimated_repayment_date between", value1, value2, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andEstimatedRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("estimated_repayment_date not between", value1, value2, "estimatedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIsNull() {
            addCriterion("real_repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIsNotNull() {
            addCriterion("real_repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateEqualTo(Date value) {
            addCriterion("real_repayment_date =", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotEqualTo(Date value) {
            addCriterion("real_repayment_date <>", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateGreaterThan(Date value) {
            addCriterion("real_repayment_date >", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("real_repayment_date >=", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateLessThan(Date value) {
            addCriterion("real_repayment_date <", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("real_repayment_date <=", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIn(List<Date> values) {
            addCriterion("real_repayment_date in", values, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotIn(List<Date> values) {
            addCriterion("real_repayment_date not in", values, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateBetween(Date value1, Date value2) {
            addCriterion("real_repayment_date between", value1, value2, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("real_repayment_date not between", value1, value2, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyIsNull() {
            addCriterion("overdue_penalty is null");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyIsNotNull() {
            addCriterion("overdue_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyEqualTo(BigDecimal value) {
            addCriterion("overdue_penalty =", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyNotEqualTo(BigDecimal value) {
            addCriterion("overdue_penalty <>", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyGreaterThan(BigDecimal value) {
            addCriterion("overdue_penalty >", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_penalty >=", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyLessThan(BigDecimal value) {
            addCriterion("overdue_penalty <", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_penalty <=", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyIn(List<BigDecimal> values) {
            addCriterion("overdue_penalty in", values, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyNotIn(List<BigDecimal> values) {
            addCriterion("overdue_penalty not in", values, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_penalty between", value1, value2, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_penalty not between", value1, value2, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIsNull() {
            addCriterion("repayment_status is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIsNotNull() {
            addCriterion("repayment_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusEqualTo(Short value) {
            addCriterion("repayment_status =", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotEqualTo(Short value) {
            addCriterion("repayment_status <>", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusGreaterThan(Short value) {
            addCriterion("repayment_status >", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("repayment_status >=", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLessThan(Short value) {
            addCriterion("repayment_status <", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLessThanOrEqualTo(Short value) {
            addCriterion("repayment_status <=", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIn(List<Short> values) {
            addCriterion("repayment_status in", values, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotIn(List<Short> values) {
            addCriterion("repayment_status not in", values, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusBetween(Short value1, Short value2) {
            addCriterion("repayment_status between", value1, value2, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotBetween(Short value1, Short value2) {
            addCriterion("repayment_status not between", value1, value2, "repaymentStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}