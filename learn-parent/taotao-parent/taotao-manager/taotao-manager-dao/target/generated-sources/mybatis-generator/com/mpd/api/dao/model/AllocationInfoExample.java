package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AllocationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllocationInfoExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andAllocationBegindateIsNull() {
            addCriterion("allocation_beginDate is null");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateIsNotNull() {
            addCriterion("allocation_beginDate is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateEqualTo(Date value) {
            addCriterion("allocation_beginDate =", value, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateNotEqualTo(Date value) {
            addCriterion("allocation_beginDate <>", value, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateGreaterThan(Date value) {
            addCriterion("allocation_beginDate >", value, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("allocation_beginDate >=", value, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateLessThan(Date value) {
            addCriterion("allocation_beginDate <", value, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateLessThanOrEqualTo(Date value) {
            addCriterion("allocation_beginDate <=", value, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateIn(List<Date> values) {
            addCriterion("allocation_beginDate in", values, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateNotIn(List<Date> values) {
            addCriterion("allocation_beginDate not in", values, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateBetween(Date value1, Date value2) {
            addCriterion("allocation_beginDate between", value1, value2, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationBegindateNotBetween(Date value1, Date value2) {
            addCriterion("allocation_beginDate not between", value1, value2, "allocationBegindate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateIsNull() {
            addCriterion("allocation_endDate is null");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateIsNotNull() {
            addCriterion("allocation_endDate is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateEqualTo(Date value) {
            addCriterion("allocation_endDate =", value, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateNotEqualTo(Date value) {
            addCriterion("allocation_endDate <>", value, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateGreaterThan(Date value) {
            addCriterion("allocation_endDate >", value, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("allocation_endDate >=", value, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateLessThan(Date value) {
            addCriterion("allocation_endDate <", value, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateLessThanOrEqualTo(Date value) {
            addCriterion("allocation_endDate <=", value, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateIn(List<Date> values) {
            addCriterion("allocation_endDate in", values, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateNotIn(List<Date> values) {
            addCriterion("allocation_endDate not in", values, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateBetween(Date value1, Date value2) {
            addCriterion("allocation_endDate between", value1, value2, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationEnddateNotBetween(Date value1, Date value2) {
            addCriterion("allocation_endDate not between", value1, value2, "allocationEnddate");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageIsNull() {
            addCriterion("allocation_rate_percentage is null");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageIsNotNull() {
            addCriterion("allocation_rate_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageEqualTo(BigDecimal value) {
            addCriterion("allocation_rate_percentage =", value, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageNotEqualTo(BigDecimal value) {
            addCriterion("allocation_rate_percentage <>", value, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageGreaterThan(BigDecimal value) {
            addCriterion("allocation_rate_percentage >", value, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allocation_rate_percentage >=", value, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageLessThan(BigDecimal value) {
            addCriterion("allocation_rate_percentage <", value, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allocation_rate_percentage <=", value, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageIn(List<BigDecimal> values) {
            addCriterion("allocation_rate_percentage in", values, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageNotIn(List<BigDecimal> values) {
            addCriterion("allocation_rate_percentage not in", values, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allocation_rate_percentage between", value1, value2, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationRatePercentageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allocation_rate_percentage not between", value1, value2, "allocationRatePercentage");
            return (Criteria) this;
        }

        public Criteria andAllocationStateIsNull() {
            addCriterion("allocation_state is null");
            return (Criteria) this;
        }

        public Criteria andAllocationStateIsNotNull() {
            addCriterion("allocation_state is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationStateEqualTo(Short value) {
            addCriterion("allocation_state =", value, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateNotEqualTo(Short value) {
            addCriterion("allocation_state <>", value, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateGreaterThan(Short value) {
            addCriterion("allocation_state >", value, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateGreaterThanOrEqualTo(Short value) {
            addCriterion("allocation_state >=", value, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateLessThan(Short value) {
            addCriterion("allocation_state <", value, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateLessThanOrEqualTo(Short value) {
            addCriterion("allocation_state <=", value, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateIn(List<Short> values) {
            addCriterion("allocation_state in", values, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateNotIn(List<Short> values) {
            addCriterion("allocation_state not in", values, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateBetween(Short value1, Short value2) {
            addCriterion("allocation_state between", value1, value2, "allocationState");
            return (Criteria) this;
        }

        public Criteria andAllocationStateNotBetween(Short value1, Short value2) {
            addCriterion("allocation_state not between", value1, value2, "allocationState");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
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