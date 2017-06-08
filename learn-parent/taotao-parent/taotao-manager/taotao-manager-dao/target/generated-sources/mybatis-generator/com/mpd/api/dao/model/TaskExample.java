package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNull() {
            addCriterion("task_code is null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("task_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeEqualTo(String value) {
            addCriterion("task_code =", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotEqualTo(String value) {
            addCriterion("task_code <>", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThan(String value) {
            addCriterion("task_code >", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("task_code >=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThan(String value) {
            addCriterion("task_code <", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("task_code <=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLike(String value) {
            addCriterion("task_code like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotLike(String value) {
            addCriterion("task_code not like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIn(List<String> values) {
            addCriterion("task_code in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotIn(List<String> values) {
            addCriterion("task_code not in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeBetween(String value1, String value2) {
            addCriterion("task_code between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotBetween(String value1, String value2) {
            addCriterion("task_code not between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeIsNull() {
            addCriterion("next_task_code is null");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeIsNotNull() {
            addCriterion("next_task_code is not null");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeEqualTo(String value) {
            addCriterion("next_task_code =", value, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeNotEqualTo(String value) {
            addCriterion("next_task_code <>", value, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeGreaterThan(String value) {
            addCriterion("next_task_code >", value, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("next_task_code >=", value, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeLessThan(String value) {
            addCriterion("next_task_code <", value, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("next_task_code <=", value, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeLike(String value) {
            addCriterion("next_task_code like", value, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeNotLike(String value) {
            addCriterion("next_task_code not like", value, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeIn(List<String> values) {
            addCriterion("next_task_code in", values, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeNotIn(List<String> values) {
            addCriterion("next_task_code not in", values, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeBetween(String value1, String value2) {
            addCriterion("next_task_code between", value1, value2, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andNextTaskCodeNotBetween(String value1, String value2) {
            addCriterion("next_task_code not between", value1, value2, "nextTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeIsNull() {
            addCriterion("last_task_code is null");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeIsNotNull() {
            addCriterion("last_task_code is not null");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeEqualTo(String value) {
            addCriterion("last_task_code =", value, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeNotEqualTo(String value) {
            addCriterion("last_task_code <>", value, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeGreaterThan(String value) {
            addCriterion("last_task_code >", value, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("last_task_code >=", value, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeLessThan(String value) {
            addCriterion("last_task_code <", value, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("last_task_code <=", value, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeLike(String value) {
            addCriterion("last_task_code like", value, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeNotLike(String value) {
            addCriterion("last_task_code not like", value, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeIn(List<String> values) {
            addCriterion("last_task_code in", values, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeNotIn(List<String> values) {
            addCriterion("last_task_code not in", values, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeBetween(String value1, String value2) {
            addCriterion("last_task_code between", value1, value2, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andLastTaskCodeNotBetween(String value1, String value2) {
            addCriterion("last_task_code not between", value1, value2, "lastTaskCode");
            return (Criteria) this;
        }

        public Criteria andXPositionIsNull() {
            addCriterion("x_position is null");
            return (Criteria) this;
        }

        public Criteria andXPositionIsNotNull() {
            addCriterion("x_position is not null");
            return (Criteria) this;
        }

        public Criteria andXPositionEqualTo(BigDecimal value) {
            addCriterion("x_position =", value, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionNotEqualTo(BigDecimal value) {
            addCriterion("x_position <>", value, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionGreaterThan(BigDecimal value) {
            addCriterion("x_position >", value, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("x_position >=", value, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionLessThan(BigDecimal value) {
            addCriterion("x_position <", value, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("x_position <=", value, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionIn(List<BigDecimal> values) {
            addCriterion("x_position in", values, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionNotIn(List<BigDecimal> values) {
            addCriterion("x_position not in", values, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("x_position between", value1, value2, "xPosition");
            return (Criteria) this;
        }

        public Criteria andXPositionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("x_position not between", value1, value2, "xPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionIsNull() {
            addCriterion("y_position is null");
            return (Criteria) this;
        }

        public Criteria andYPositionIsNotNull() {
            addCriterion("y_position is not null");
            return (Criteria) this;
        }

        public Criteria andYPositionEqualTo(BigDecimal value) {
            addCriterion("y_position =", value, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionNotEqualTo(BigDecimal value) {
            addCriterion("y_position <>", value, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionGreaterThan(BigDecimal value) {
            addCriterion("y_position >", value, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("y_position >=", value, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionLessThan(BigDecimal value) {
            addCriterion("y_position <", value, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("y_position <=", value, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionIn(List<BigDecimal> values) {
            addCriterion("y_position in", values, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionNotIn(List<BigDecimal> values) {
            addCriterion("y_position not in", values, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("y_position between", value1, value2, "yPosition");
            return (Criteria) this;
        }

        public Criteria andYPositionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("y_position not between", value1, value2, "yPosition");
            return (Criteria) this;
        }

        public Criteria andLasterCodeIsNull() {
            addCriterion("laster_code is null");
            return (Criteria) this;
        }

        public Criteria andLasterCodeIsNotNull() {
            addCriterion("laster_code is not null");
            return (Criteria) this;
        }

        public Criteria andLasterCodeEqualTo(String value) {
            addCriterion("laster_code =", value, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeNotEqualTo(String value) {
            addCriterion("laster_code <>", value, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeGreaterThan(String value) {
            addCriterion("laster_code >", value, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("laster_code >=", value, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeLessThan(String value) {
            addCriterion("laster_code <", value, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeLessThanOrEqualTo(String value) {
            addCriterion("laster_code <=", value, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeLike(String value) {
            addCriterion("laster_code like", value, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeNotLike(String value) {
            addCriterion("laster_code not like", value, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeIn(List<String> values) {
            addCriterion("laster_code in", values, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeNotIn(List<String> values) {
            addCriterion("laster_code not in", values, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeBetween(String value1, String value2) {
            addCriterion("laster_code between", value1, value2, "lasterCode");
            return (Criteria) this;
        }

        public Criteria andLasterCodeNotBetween(String value1, String value2) {
            addCriterion("laster_code not between", value1, value2, "lasterCode");
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