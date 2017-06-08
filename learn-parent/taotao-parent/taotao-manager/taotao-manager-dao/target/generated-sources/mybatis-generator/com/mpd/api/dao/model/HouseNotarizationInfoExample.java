package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseNotarizationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseNotarizationInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNotarizationDateIsNull() {
            addCriterion("notarization_date is null");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateIsNotNull() {
            addCriterion("notarization_date is not null");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateEqualTo(Date value) {
            addCriterionForJDBCDate("notarization_date =", value, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("notarization_date <>", value, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("notarization_date >", value, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("notarization_date >=", value, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateLessThan(Date value) {
            addCriterionForJDBCDate("notarization_date <", value, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("notarization_date <=", value, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateIn(List<Date> values) {
            addCriterionForJDBCDate("notarization_date in", values, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("notarization_date not in", values, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("notarization_date between", value1, value2, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("notarization_date not between", value1, value2, "notarizationDate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateIsNull() {
            addCriterion("notarization_rate is null");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateIsNotNull() {
            addCriterion("notarization_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateEqualTo(Float value) {
            addCriterion("notarization_rate =", value, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateNotEqualTo(Float value) {
            addCriterion("notarization_rate <>", value, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateGreaterThan(Float value) {
            addCriterion("notarization_rate >", value, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateGreaterThanOrEqualTo(Float value) {
            addCriterion("notarization_rate >=", value, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateLessThan(Float value) {
            addCriterion("notarization_rate <", value, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateLessThanOrEqualTo(Float value) {
            addCriterion("notarization_rate <=", value, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateIn(List<Float> values) {
            addCriterion("notarization_rate in", values, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateNotIn(List<Float> values) {
            addCriterion("notarization_rate not in", values, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateBetween(Float value1, Float value2) {
            addCriterion("notarization_rate between", value1, value2, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationRateNotBetween(Float value1, Float value2) {
            addCriterion("notarization_rate not between", value1, value2, "notarizationRate");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeIsNull() {
            addCriterion("notarization_fee is null");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeIsNotNull() {
            addCriterion("notarization_fee is not null");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeEqualTo(Float value) {
            addCriterion("notarization_fee =", value, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeNotEqualTo(Float value) {
            addCriterion("notarization_fee <>", value, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeGreaterThan(Float value) {
            addCriterion("notarization_fee >", value, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("notarization_fee >=", value, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeLessThan(Float value) {
            addCriterion("notarization_fee <", value, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeLessThanOrEqualTo(Float value) {
            addCriterion("notarization_fee <=", value, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeIn(List<Float> values) {
            addCriterion("notarization_fee in", values, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeNotIn(List<Float> values) {
            addCriterion("notarization_fee not in", values, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeBetween(Float value1, Float value2) {
            addCriterion("notarization_fee between", value1, value2, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationFeeNotBetween(Float value1, Float value2) {
            addCriterion("notarization_fee not between", value1, value2, "notarizationFee");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameIsNull() {
            addCriterion("notarization_user_name is null");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameIsNotNull() {
            addCriterion("notarization_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameEqualTo(String value) {
            addCriterion("notarization_user_name =", value, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameNotEqualTo(String value) {
            addCriterion("notarization_user_name <>", value, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameGreaterThan(String value) {
            addCriterion("notarization_user_name >", value, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("notarization_user_name >=", value, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameLessThan(String value) {
            addCriterion("notarization_user_name <", value, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameLessThanOrEqualTo(String value) {
            addCriterion("notarization_user_name <=", value, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameLike(String value) {
            addCriterion("notarization_user_name like", value, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameNotLike(String value) {
            addCriterion("notarization_user_name not like", value, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameIn(List<String> values) {
            addCriterion("notarization_user_name in", values, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameNotIn(List<String> values) {
            addCriterion("notarization_user_name not in", values, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameBetween(String value1, String value2) {
            addCriterion("notarization_user_name between", value1, value2, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationUserNameNotBetween(String value1, String value2) {
            addCriterion("notarization_user_name not between", value1, value2, "notarizationUserName");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneIsNull() {
            addCriterion("notarization_telphone is null");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneIsNotNull() {
            addCriterion("notarization_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneEqualTo(BigDecimal value) {
            addCriterion("notarization_telphone =", value, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneNotEqualTo(BigDecimal value) {
            addCriterion("notarization_telphone <>", value, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneGreaterThan(BigDecimal value) {
            addCriterion("notarization_telphone >", value, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("notarization_telphone >=", value, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneLessThan(BigDecimal value) {
            addCriterion("notarization_telphone <", value, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("notarization_telphone <=", value, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneIn(List<BigDecimal> values) {
            addCriterion("notarization_telphone in", values, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneNotIn(List<BigDecimal> values) {
            addCriterion("notarization_telphone not in", values, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("notarization_telphone between", value1, value2, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationTelphoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("notarization_telphone not between", value1, value2, "notarizationTelphone");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileIsNull() {
            addCriterion("notarization_file is null");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileIsNotNull() {
            addCriterion("notarization_file is not null");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileEqualTo(String value) {
            addCriterion("notarization_file =", value, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileNotEqualTo(String value) {
            addCriterion("notarization_file <>", value, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileGreaterThan(String value) {
            addCriterion("notarization_file >", value, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileGreaterThanOrEqualTo(String value) {
            addCriterion("notarization_file >=", value, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileLessThan(String value) {
            addCriterion("notarization_file <", value, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileLessThanOrEqualTo(String value) {
            addCriterion("notarization_file <=", value, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileLike(String value) {
            addCriterion("notarization_file like", value, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileNotLike(String value) {
            addCriterion("notarization_file not like", value, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileIn(List<String> values) {
            addCriterion("notarization_file in", values, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileNotIn(List<String> values) {
            addCriterion("notarization_file not in", values, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileBetween(String value1, String value2) {
            addCriterion("notarization_file between", value1, value2, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andNotarizationFileNotBetween(String value1, String value2) {
            addCriterion("notarization_file not between", value1, value2, "notarizationFile");
            return (Criteria) this;
        }

        public Criteria andLoanContractIsNull() {
            addCriterion("loan_contract is null");
            return (Criteria) this;
        }

        public Criteria andLoanContractIsNotNull() {
            addCriterion("loan_contract is not null");
            return (Criteria) this;
        }

        public Criteria andLoanContractEqualTo(String value) {
            addCriterion("loan_contract =", value, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractNotEqualTo(String value) {
            addCriterion("loan_contract <>", value, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractGreaterThan(String value) {
            addCriterion("loan_contract >", value, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractGreaterThanOrEqualTo(String value) {
            addCriterion("loan_contract >=", value, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractLessThan(String value) {
            addCriterion("loan_contract <", value, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractLessThanOrEqualTo(String value) {
            addCriterion("loan_contract <=", value, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractLike(String value) {
            addCriterion("loan_contract like", value, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractNotLike(String value) {
            addCriterion("loan_contract not like", value, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractIn(List<String> values) {
            addCriterion("loan_contract in", values, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractNotIn(List<String> values) {
            addCriterion("loan_contract not in", values, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractBetween(String value1, String value2) {
            addCriterion("loan_contract between", value1, value2, "loanContract");
            return (Criteria) this;
        }

        public Criteria andLoanContractNotBetween(String value1, String value2) {
            addCriterion("loan_contract not between", value1, value2, "loanContract");
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