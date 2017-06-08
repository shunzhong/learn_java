package com.mpd.api.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanInfoOprInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanInfoOprInfoExample() {
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

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(String value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(String value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(String value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(String value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLike(String value) {
            addCriterion("loan_id like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotLike(String value) {
            addCriterion("loan_id not like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<String> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<String> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(String value1, String value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(String value1, String value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andOprTypeIsNull() {
            addCriterion("opr_type is null");
            return (Criteria) this;
        }

        public Criteria andOprTypeIsNotNull() {
            addCriterion("opr_type is not null");
            return (Criteria) this;
        }

        public Criteria andOprTypeEqualTo(String value) {
            addCriterion("opr_type =", value, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeNotEqualTo(String value) {
            addCriterion("opr_type <>", value, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeGreaterThan(String value) {
            addCriterion("opr_type >", value, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeGreaterThanOrEqualTo(String value) {
            addCriterion("opr_type >=", value, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeLessThan(String value) {
            addCriterion("opr_type <", value, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeLessThanOrEqualTo(String value) {
            addCriterion("opr_type <=", value, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeLike(String value) {
            addCriterion("opr_type like", value, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeNotLike(String value) {
            addCriterion("opr_type not like", value, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeIn(List<String> values) {
            addCriterion("opr_type in", values, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeNotIn(List<String> values) {
            addCriterion("opr_type not in", values, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeBetween(String value1, String value2) {
            addCriterion("opr_type between", value1, value2, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprTypeNotBetween(String value1, String value2) {
            addCriterion("opr_type not between", value1, value2, "oprType");
            return (Criteria) this;
        }

        public Criteria andOprDateIsNull() {
            addCriterion("opr_date is null");
            return (Criteria) this;
        }

        public Criteria andOprDateIsNotNull() {
            addCriterion("opr_date is not null");
            return (Criteria) this;
        }

        public Criteria andOprDateEqualTo(Date value) {
            addCriterion("opr_date =", value, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateNotEqualTo(Date value) {
            addCriterion("opr_date <>", value, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateGreaterThan(Date value) {
            addCriterion("opr_date >", value, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateGreaterThanOrEqualTo(Date value) {
            addCriterion("opr_date >=", value, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateLessThan(Date value) {
            addCriterion("opr_date <", value, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateLessThanOrEqualTo(Date value) {
            addCriterion("opr_date <=", value, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateIn(List<Date> values) {
            addCriterion("opr_date in", values, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateNotIn(List<Date> values) {
            addCriterion("opr_date not in", values, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateBetween(Date value1, Date value2) {
            addCriterion("opr_date between", value1, value2, "oprDate");
            return (Criteria) this;
        }

        public Criteria andOprDateNotBetween(Date value1, Date value2) {
            addCriterion("opr_date not between", value1, value2, "oprDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCurStatusIsNull() {
            addCriterion("cur_status is null");
            return (Criteria) this;
        }

        public Criteria andCurStatusIsNotNull() {
            addCriterion("cur_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurStatusEqualTo(String value) {
            addCriterion("cur_status =", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusNotEqualTo(String value) {
            addCriterion("cur_status <>", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusGreaterThan(String value) {
            addCriterion("cur_status >", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cur_status >=", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusLessThan(String value) {
            addCriterion("cur_status <", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusLessThanOrEqualTo(String value) {
            addCriterion("cur_status <=", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusLike(String value) {
            addCriterion("cur_status like", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusNotLike(String value) {
            addCriterion("cur_status not like", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusIn(List<String> values) {
            addCriterion("cur_status in", values, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusNotIn(List<String> values) {
            addCriterion("cur_status not in", values, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusBetween(String value1, String value2) {
            addCriterion("cur_status between", value1, value2, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusNotBetween(String value1, String value2) {
            addCriterion("cur_status not between", value1, value2, "curStatus");
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