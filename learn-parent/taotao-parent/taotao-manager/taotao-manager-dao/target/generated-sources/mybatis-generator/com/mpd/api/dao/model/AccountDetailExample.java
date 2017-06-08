package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountDetailExample() {
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

        public Criteria andUesrIdIsNull() {
            addCriterion("uesr_id is null");
            return (Criteria) this;
        }

        public Criteria andUesrIdIsNotNull() {
            addCriterion("uesr_id is not null");
            return (Criteria) this;
        }

        public Criteria andUesrIdEqualTo(String value) {
            addCriterion("uesr_id =", value, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdNotEqualTo(String value) {
            addCriterion("uesr_id <>", value, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdGreaterThan(String value) {
            addCriterion("uesr_id >", value, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdGreaterThanOrEqualTo(String value) {
            addCriterion("uesr_id >=", value, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdLessThan(String value) {
            addCriterion("uesr_id <", value, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdLessThanOrEqualTo(String value) {
            addCriterion("uesr_id <=", value, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdLike(String value) {
            addCriterion("uesr_id like", value, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdNotLike(String value) {
            addCriterion("uesr_id not like", value, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdIn(List<String> values) {
            addCriterion("uesr_id in", values, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdNotIn(List<String> values) {
            addCriterion("uesr_id not in", values, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdBetween(String value1, String value2) {
            addCriterion("uesr_id between", value1, value2, "uesrId");
            return (Criteria) this;
        }

        public Criteria andUesrIdNotBetween(String value1, String value2) {
            addCriterion("uesr_id not between", value1, value2, "uesrId");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNull() {
            addCriterion("oper_type is null");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNotNull() {
            addCriterion("oper_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperTypeEqualTo(Short value) {
            addCriterion("oper_type =", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotEqualTo(Short value) {
            addCriterion("oper_type <>", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThan(Short value) {
            addCriterion("oper_type >", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("oper_type >=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThan(Short value) {
            addCriterion("oper_type <", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThanOrEqualTo(Short value) {
            addCriterion("oper_type <=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIn(List<Short> values) {
            addCriterion("oper_type in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotIn(List<Short> values) {
            addCriterion("oper_type not in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeBetween(Short value1, Short value2) {
            addCriterion("oper_type between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotBetween(Short value1, Short value2) {
            addCriterion("oper_type not between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperAmountIsNull() {
            addCriterion("oper_amount is null");
            return (Criteria) this;
        }

        public Criteria andOperAmountIsNotNull() {
            addCriterion("oper_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOperAmountEqualTo(BigDecimal value) {
            addCriterion("oper_amount =", value, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountNotEqualTo(BigDecimal value) {
            addCriterion("oper_amount <>", value, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountGreaterThan(BigDecimal value) {
            addCriterion("oper_amount >", value, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oper_amount >=", value, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountLessThan(BigDecimal value) {
            addCriterion("oper_amount <", value, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oper_amount <=", value, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountIn(List<BigDecimal> values) {
            addCriterion("oper_amount in", values, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountNotIn(List<BigDecimal> values) {
            addCriterion("oper_amount not in", values, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oper_amount between", value1, value2, "operAmount");
            return (Criteria) this;
        }

        public Criteria andOperAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oper_amount not between", value1, value2, "operAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountIsNull() {
            addCriterion("account_amount is null");
            return (Criteria) this;
        }

        public Criteria andAccountAmountIsNotNull() {
            addCriterion("account_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAmountEqualTo(BigDecimal value) {
            addCriterion("account_amount =", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountNotEqualTo(BigDecimal value) {
            addCriterion("account_amount <>", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountGreaterThan(BigDecimal value) {
            addCriterion("account_amount >", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_amount >=", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountLessThan(BigDecimal value) {
            addCriterion("account_amount <", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_amount <=", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountIn(List<BigDecimal> values) {
            addCriterion("account_amount in", values, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountNotIn(List<BigDecimal> values) {
            addCriterion("account_amount not in", values, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_amount between", value1, value2, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_amount not between", value1, value2, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNull() {
            addCriterion("oper_time is null");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNotNull() {
            addCriterion("oper_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperTimeEqualTo(Date value) {
            addCriterion("oper_time =", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotEqualTo(Date value) {
            addCriterion("oper_time <>", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThan(Date value) {
            addCriterion("oper_time >", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oper_time >=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThan(Date value) {
            addCriterion("oper_time <", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThanOrEqualTo(Date value) {
            addCriterion("oper_time <=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeIn(List<Date> values) {
            addCriterion("oper_time in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotIn(List<Date> values) {
            addCriterion("oper_time not in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeBetween(Date value1, Date value2) {
            addCriterion("oper_time between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotBetween(Date value1, Date value2) {
            addCriterion("oper_time not between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperStatusIsNull() {
            addCriterion("oper_status is null");
            return (Criteria) this;
        }

        public Criteria andOperStatusIsNotNull() {
            addCriterion("oper_status is not null");
            return (Criteria) this;
        }

        public Criteria andOperStatusEqualTo(Short value) {
            addCriterion("oper_status =", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusNotEqualTo(Short value) {
            addCriterion("oper_status <>", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusGreaterThan(Short value) {
            addCriterion("oper_status >", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("oper_status >=", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusLessThan(Short value) {
            addCriterion("oper_status <", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusLessThanOrEqualTo(Short value) {
            addCriterion("oper_status <=", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusIn(List<Short> values) {
            addCriterion("oper_status in", values, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusNotIn(List<Short> values) {
            addCriterion("oper_status not in", values, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusBetween(Short value1, Short value2) {
            addCriterion("oper_status between", value1, value2, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusNotBetween(Short value1, Short value2) {
            addCriterion("oper_status not between", value1, value2, "operStatus");
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