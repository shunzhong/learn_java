package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditRecordExample() {
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

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(Integer value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(Integer value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(Integer value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(Integer value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(Integer value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<Integer> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<Integer> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(Integer value1, Integer value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
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

        public Criteria andCreditDateIsNull() {
            addCriterion("credit_date is null");
            return (Criteria) this;
        }

        public Criteria andCreditDateIsNotNull() {
            addCriterion("credit_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreditDateEqualTo(Date value) {
            addCriterion("credit_date =", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotEqualTo(Date value) {
            addCriterion("credit_date <>", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateGreaterThan(Date value) {
            addCriterion("credit_date >", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("credit_date >=", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateLessThan(Date value) {
            addCriterion("credit_date <", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateLessThanOrEqualTo(Date value) {
            addCriterion("credit_date <=", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateIn(List<Date> values) {
            addCriterion("credit_date in", values, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotIn(List<Date> values) {
            addCriterion("credit_date not in", values, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateBetween(Date value1, Date value2) {
            addCriterion("credit_date between", value1, value2, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotBetween(Date value1, Date value2) {
            addCriterion("credit_date not between", value1, value2, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyIsNull() {
            addCriterion("should_money is null");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyIsNotNull() {
            addCriterion("should_money is not null");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyEqualTo(BigDecimal value) {
            addCriterion("should_money =", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyNotEqualTo(BigDecimal value) {
            addCriterion("should_money <>", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyGreaterThan(BigDecimal value) {
            addCriterion("should_money >", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("should_money >=", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyLessThan(BigDecimal value) {
            addCriterion("should_money <", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("should_money <=", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyIn(List<BigDecimal> values) {
            addCriterion("should_money in", values, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyNotIn(List<BigDecimal> values) {
            addCriterion("should_money not in", values, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_money between", value1, value2, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_money not between", value1, value2, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyIsNull() {
            addCriterion("act_money is null");
            return (Criteria) this;
        }

        public Criteria andActMoneyIsNotNull() {
            addCriterion("act_money is not null");
            return (Criteria) this;
        }

        public Criteria andActMoneyEqualTo(BigDecimal value) {
            addCriterion("act_money =", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotEqualTo(BigDecimal value) {
            addCriterion("act_money <>", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyGreaterThan(BigDecimal value) {
            addCriterion("act_money >", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("act_money >=", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyLessThan(BigDecimal value) {
            addCriterion("act_money <", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("act_money <=", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyIn(List<BigDecimal> values) {
            addCriterion("act_money in", values, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotIn(List<BigDecimal> values) {
            addCriterion("act_money not in", values, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_money between", value1, value2, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_money not between", value1, value2, "actMoney");
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

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
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

        public Criteria andCreditProofIsNull() {
            addCriterion("credit_proof is null");
            return (Criteria) this;
        }

        public Criteria andCreditProofIsNotNull() {
            addCriterion("credit_proof is not null");
            return (Criteria) this;
        }

        public Criteria andCreditProofEqualTo(String value) {
            addCriterion("credit_proof =", value, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofNotEqualTo(String value) {
            addCriterion("credit_proof <>", value, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofGreaterThan(String value) {
            addCriterion("credit_proof >", value, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofGreaterThanOrEqualTo(String value) {
            addCriterion("credit_proof >=", value, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofLessThan(String value) {
            addCriterion("credit_proof <", value, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofLessThanOrEqualTo(String value) {
            addCriterion("credit_proof <=", value, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofLike(String value) {
            addCriterion("credit_proof like", value, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofNotLike(String value) {
            addCriterion("credit_proof not like", value, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofIn(List<String> values) {
            addCriterion("credit_proof in", values, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofNotIn(List<String> values) {
            addCriterion("credit_proof not in", values, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofBetween(String value1, String value2) {
            addCriterion("credit_proof between", value1, value2, "creditProof");
            return (Criteria) this;
        }

        public Criteria andCreditProofNotBetween(String value1, String value2) {
            addCriterion("credit_proof not between", value1, value2, "creditProof");
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