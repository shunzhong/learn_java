package com.mpd.api.dao.model;

import java.util.ArrayList;
import java.util.List;

public class UserCreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCreditExample() {
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

        public Criteria andCreditIdIsNull() {
            addCriterion("credit_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditIdIsNotNull() {
            addCriterion("credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditIdEqualTo(String value) {
            addCriterion("credit_id =", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotEqualTo(String value) {
            addCriterion("credit_id <>", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThan(String value) {
            addCriterion("credit_id >", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThanOrEqualTo(String value) {
            addCriterion("credit_id >=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThan(String value) {
            addCriterion("credit_id <", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThanOrEqualTo(String value) {
            addCriterion("credit_id <=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLike(String value) {
            addCriterion("credit_id like", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotLike(String value) {
            addCriterion("credit_id not like", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdIn(List<String> values) {
            addCriterion("credit_id in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotIn(List<String> values) {
            addCriterion("credit_id not in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdBetween(String value1, String value2) {
            addCriterion("credit_id between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotBetween(String value1, String value2) {
            addCriterion("credit_id not between", value1, value2, "creditId");
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

        public Criteria andLoanStrokeCountIsNull() {
            addCriterion("loan_stroke_count is null");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountIsNotNull() {
            addCriterion("loan_stroke_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountEqualTo(Integer value) {
            addCriterion("loan_stroke_count =", value, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountNotEqualTo(Integer value) {
            addCriterion("loan_stroke_count <>", value, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountGreaterThan(Integer value) {
            addCriterion("loan_stroke_count >", value, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_stroke_count >=", value, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountLessThan(Integer value) {
            addCriterion("loan_stroke_count <", value, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountLessThanOrEqualTo(Integer value) {
            addCriterion("loan_stroke_count <=", value, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountIn(List<Integer> values) {
            addCriterion("loan_stroke_count in", values, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountNotIn(List<Integer> values) {
            addCriterion("loan_stroke_count not in", values, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountBetween(Integer value1, Integer value2) {
            addCriterion("loan_stroke_count between", value1, value2, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanStrokeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_stroke_count not between", value1, value2, "loanStrokeCount");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyIsNull() {
            addCriterion("loan_money is null");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyIsNotNull() {
            addCriterion("loan_money is not null");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyEqualTo(Float value) {
            addCriterion("loan_money =", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyNotEqualTo(Float value) {
            addCriterion("loan_money <>", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyGreaterThan(Float value) {
            addCriterion("loan_money >", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("loan_money >=", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyLessThan(Float value) {
            addCriterion("loan_money <", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyLessThanOrEqualTo(Float value) {
            addCriterion("loan_money <=", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyIn(List<Float> values) {
            addCriterion("loan_money in", values, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyNotIn(List<Float> values) {
            addCriterion("loan_money not in", values, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyBetween(Float value1, Float value2) {
            addCriterion("loan_money between", value1, value2, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyNotBetween(Float value1, Float value2) {
            addCriterion("loan_money not between", value1, value2, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountIsNull() {
            addCriterion("overdue_stroke_count is null");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountIsNotNull() {
            addCriterion("overdue_stroke_count is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountEqualTo(Integer value) {
            addCriterion("overdue_stroke_count =", value, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountNotEqualTo(Integer value) {
            addCriterion("overdue_stroke_count <>", value, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountGreaterThan(Integer value) {
            addCriterion("overdue_stroke_count >", value, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_stroke_count >=", value, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountLessThan(Integer value) {
            addCriterion("overdue_stroke_count <", value, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_stroke_count <=", value, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountIn(List<Integer> values) {
            addCriterion("overdue_stroke_count in", values, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountNotIn(List<Integer> values) {
            addCriterion("overdue_stroke_count not in", values, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountBetween(Integer value1, Integer value2) {
            addCriterion("overdue_stroke_count between", value1, value2, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andOverdueStrokeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_stroke_count not between", value1, value2, "overdueStrokeCount");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsIsNull() {
            addCriterion("credit_ratings is null");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsIsNotNull() {
            addCriterion("credit_ratings is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsEqualTo(Integer value) {
            addCriterion("credit_ratings =", value, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsNotEqualTo(Integer value) {
            addCriterion("credit_ratings <>", value, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsGreaterThan(Integer value) {
            addCriterion("credit_ratings >", value, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_ratings >=", value, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsLessThan(Integer value) {
            addCriterion("credit_ratings <", value, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsLessThanOrEqualTo(Integer value) {
            addCriterion("credit_ratings <=", value, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsIn(List<Integer> values) {
            addCriterion("credit_ratings in", values, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsNotIn(List<Integer> values) {
            addCriterion("credit_ratings not in", values, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsBetween(Integer value1, Integer value2) {
            addCriterion("credit_ratings between", value1, value2, "creditRatings");
            return (Criteria) this;
        }

        public Criteria andCreditRatingsNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_ratings not between", value1, value2, "creditRatings");
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