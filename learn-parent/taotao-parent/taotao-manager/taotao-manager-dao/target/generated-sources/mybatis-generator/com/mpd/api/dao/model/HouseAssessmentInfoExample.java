package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseAssessmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseAssessmentInfoExample() {
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

        public Criteria andPerAmountIsNull() {
            addCriterion("per_amount is null");
            return (Criteria) this;
        }

        public Criteria andPerAmountIsNotNull() {
            addCriterion("per_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPerAmountEqualTo(BigDecimal value) {
            addCriterion("per_amount =", value, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountNotEqualTo(BigDecimal value) {
            addCriterion("per_amount <>", value, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountGreaterThan(BigDecimal value) {
            addCriterion("per_amount >", value, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("per_amount >=", value, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountLessThan(BigDecimal value) {
            addCriterion("per_amount <", value, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("per_amount <=", value, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountIn(List<BigDecimal> values) {
            addCriterion("per_amount in", values, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountNotIn(List<BigDecimal> values) {
            addCriterion("per_amount not in", values, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("per_amount between", value1, value2, "perAmount");
            return (Criteria) this;
        }

        public Criteria andPerAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("per_amount not between", value1, value2, "perAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseSourceIsNull() {
            addCriterion("asse_source is null");
            return (Criteria) this;
        }

        public Criteria andAsseSourceIsNotNull() {
            addCriterion("asse_source is not null");
            return (Criteria) this;
        }

        public Criteria andAsseSourceEqualTo(String value) {
            addCriterion("asse_source =", value, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceNotEqualTo(String value) {
            addCriterion("asse_source <>", value, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceGreaterThan(String value) {
            addCriterion("asse_source >", value, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceGreaterThanOrEqualTo(String value) {
            addCriterion("asse_source >=", value, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceLessThan(String value) {
            addCriterion("asse_source <", value, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceLessThanOrEqualTo(String value) {
            addCriterion("asse_source <=", value, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceLike(String value) {
            addCriterion("asse_source like", value, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceNotLike(String value) {
            addCriterion("asse_source not like", value, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceIn(List<String> values) {
            addCriterion("asse_source in", values, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceNotIn(List<String> values) {
            addCriterion("asse_source not in", values, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceBetween(String value1, String value2) {
            addCriterion("asse_source between", value1, value2, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseSourceNotBetween(String value1, String value2) {
            addCriterion("asse_source not between", value1, value2, "asseSource");
            return (Criteria) this;
        }

        public Criteria andAsseTypeIsNull() {
            addCriterion("asse_type is null");
            return (Criteria) this;
        }

        public Criteria andAsseTypeIsNotNull() {
            addCriterion("asse_type is not null");
            return (Criteria) this;
        }

        public Criteria andAsseTypeEqualTo(Short value) {
            addCriterion("asse_type =", value, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeNotEqualTo(Short value) {
            addCriterion("asse_type <>", value, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeGreaterThan(Short value) {
            addCriterion("asse_type >", value, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("asse_type >=", value, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeLessThan(Short value) {
            addCriterion("asse_type <", value, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeLessThanOrEqualTo(Short value) {
            addCriterion("asse_type <=", value, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeIn(List<Short> values) {
            addCriterion("asse_type in", values, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeNotIn(List<Short> values) {
            addCriterion("asse_type not in", values, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeBetween(Short value1, Short value2) {
            addCriterion("asse_type between", value1, value2, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTypeNotBetween(Short value1, Short value2) {
            addCriterion("asse_type not between", value1, value2, "asseType");
            return (Criteria) this;
        }

        public Criteria andAsseTimeIsNull() {
            addCriterion("asse_time is null");
            return (Criteria) this;
        }

        public Criteria andAsseTimeIsNotNull() {
            addCriterion("asse_time is not null");
            return (Criteria) this;
        }

        public Criteria andAsseTimeEqualTo(Date value) {
            addCriterion("asse_time =", value, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeNotEqualTo(Date value) {
            addCriterion("asse_time <>", value, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeGreaterThan(Date value) {
            addCriterion("asse_time >", value, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("asse_time >=", value, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeLessThan(Date value) {
            addCriterion("asse_time <", value, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeLessThanOrEqualTo(Date value) {
            addCriterion("asse_time <=", value, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeIn(List<Date> values) {
            addCriterion("asse_time in", values, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeNotIn(List<Date> values) {
            addCriterion("asse_time not in", values, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeBetween(Date value1, Date value2) {
            addCriterion("asse_time between", value1, value2, "asseTime");
            return (Criteria) this;
        }

        public Criteria andAsseTimeNotBetween(Date value1, Date value2) {
            addCriterion("asse_time not between", value1, value2, "asseTime");
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