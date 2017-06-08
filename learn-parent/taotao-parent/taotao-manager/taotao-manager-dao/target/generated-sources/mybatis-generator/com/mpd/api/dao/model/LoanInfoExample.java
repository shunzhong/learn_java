package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanInfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andApplyAmountIsNull() {
            addCriterion("apply_amount is null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNotNull() {
            addCriterion("apply_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountEqualTo(BigDecimal value) {
            addCriterion("apply_amount =", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotEqualTo(BigDecimal value) {
            addCriterion("apply_amount <>", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThan(BigDecimal value) {
            addCriterion("apply_amount >", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_amount >=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThan(BigDecimal value) {
            addCriterion("apply_amount <", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_amount <=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIn(List<BigDecimal> values) {
            addCriterion("apply_amount in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotIn(List<BigDecimal> values) {
            addCriterion("apply_amount not in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_amount between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_amount not between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineIsNull() {
            addCriterion("apply_deadline is null");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineIsNotNull() {
            addCriterion("apply_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineEqualTo(Integer value) {
            addCriterion("apply_deadline =", value, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineNotEqualTo(Integer value) {
            addCriterion("apply_deadline <>", value, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineGreaterThan(Integer value) {
            addCriterion("apply_deadline >", value, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_deadline >=", value, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineLessThan(Integer value) {
            addCriterion("apply_deadline <", value, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("apply_deadline <=", value, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineIn(List<Integer> values) {
            addCriterion("apply_deadline in", values, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineNotIn(List<Integer> values) {
            addCriterion("apply_deadline not in", values, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("apply_deadline between", value1, value2, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_deadline not between", value1, value2, "applyDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
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

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIsNull() {
            addCriterion("loan_deadline is null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIsNotNull() {
            addCriterion("loan_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineEqualTo(Integer value) {
            addCriterion("loan_deadline =", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotEqualTo(Integer value) {
            addCriterion("loan_deadline <>", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineGreaterThan(Integer value) {
            addCriterion("loan_deadline >", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_deadline >=", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineLessThan(Integer value) {
            addCriterion("loan_deadline <", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("loan_deadline <=", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIn(List<Integer> values) {
            addCriterion("loan_deadline in", values, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotIn(List<Integer> values) {
            addCriterion("loan_deadline not in", values, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("loan_deadline between", value1, value2, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_deadline not between", value1, value2, "loanDeadline");
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

        public Criteria andLoanDateIsNull() {
            addCriterion("loan_date is null");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNotNull() {
            addCriterion("loan_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDateEqualTo(Date value) {
            addCriterion("loan_date =", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotEqualTo(Date value) {
            addCriterion("loan_date <>", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThan(Date value) {
            addCriterion("loan_date >", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("loan_date >=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThan(Date value) {
            addCriterion("loan_date <", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThanOrEqualTo(Date value) {
            addCriterion("loan_date <=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateIn(List<Date> values) {
            addCriterion("loan_date in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotIn(List<Date> values) {
            addCriterion("loan_date not in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateBetween(Date value1, Date value2) {
            addCriterion("loan_date between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotBetween(Date value1, Date value2) {
            addCriterion("loan_date not between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIsNull() {
            addCriterion("loan_status is null");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIsNotNull() {
            addCriterion("loan_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStatusEqualTo(Short value) {
            addCriterion("loan_status =", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotEqualTo(Short value) {
            addCriterion("loan_status <>", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusGreaterThan(Short value) {
            addCriterion("loan_status >", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("loan_status >=", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLessThan(Short value) {
            addCriterion("loan_status <", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLessThanOrEqualTo(Short value) {
            addCriterion("loan_status <=", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIn(List<Short> values) {
            addCriterion("loan_status in", values, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotIn(List<Short> values) {
            addCriterion("loan_status not in", values, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusBetween(Short value1, Short value2) {
            addCriterion("loan_status between", value1, value2, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotBetween(Short value1, Short value2) {
            addCriterion("loan_status not between", value1, value2, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeIsNull() {
            addCriterion("deadline_type is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeIsNotNull() {
            addCriterion("deadline_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeEqualTo(Short value) {
            addCriterion("deadline_type =", value, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeNotEqualTo(Short value) {
            addCriterion("deadline_type <>", value, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeGreaterThan(Short value) {
            addCriterion("deadline_type >", value, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("deadline_type >=", value, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeLessThan(Short value) {
            addCriterion("deadline_type <", value, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeLessThanOrEqualTo(Short value) {
            addCriterion("deadline_type <=", value, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeIn(List<Short> values) {
            addCriterion("deadline_type in", values, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeNotIn(List<Short> values) {
            addCriterion("deadline_type not in", values, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeBetween(Short value1, Short value2) {
            addCriterion("deadline_type between", value1, value2, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andDeadlineTypeNotBetween(Short value1, Short value2) {
            addCriterion("deadline_type not between", value1, value2, "deadlineType");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountIsNull() {
            addCriterion("final_ass_amount is null");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountIsNotNull() {
            addCriterion("final_ass_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountEqualTo(BigDecimal value) {
            addCriterion("final_ass_amount =", value, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountNotEqualTo(BigDecimal value) {
            addCriterion("final_ass_amount <>", value, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountGreaterThan(BigDecimal value) {
            addCriterion("final_ass_amount >", value, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_ass_amount >=", value, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountLessThan(BigDecimal value) {
            addCriterion("final_ass_amount <", value, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_ass_amount <=", value, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountIn(List<BigDecimal> values) {
            addCriterion("final_ass_amount in", values, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountNotIn(List<BigDecimal> values) {
            addCriterion("final_ass_amount not in", values, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_ass_amount between", value1, value2, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAssAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_ass_amount not between", value1, value2, "finalAssAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateIsNull() {
            addCriterion("loan_ass_rate is null");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateIsNotNull() {
            addCriterion("loan_ass_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateEqualTo(BigDecimal value) {
            addCriterion("loan_ass_rate =", value, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateNotEqualTo(BigDecimal value) {
            addCriterion("loan_ass_rate <>", value, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateGreaterThan(BigDecimal value) {
            addCriterion("loan_ass_rate >", value, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_ass_rate >=", value, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateLessThan(BigDecimal value) {
            addCriterion("loan_ass_rate <", value, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_ass_rate <=", value, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateIn(List<BigDecimal> values) {
            addCriterion("loan_ass_rate in", values, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateNotIn(List<BigDecimal> values) {
            addCriterion("loan_ass_rate not in", values, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_ass_rate between", value1, value2, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andLoanAssRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_ass_rate not between", value1, value2, "loanAssRate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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