package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HousePropertyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HousePropertyInfoExample() {
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

        public Criteria andHouseCardYearIsNull() {
            addCriterion("house_card_year is null");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearIsNotNull() {
            addCriterion("house_card_year is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearEqualTo(Integer value) {
            addCriterion("house_card_year =", value, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearNotEqualTo(Integer value) {
            addCriterion("house_card_year <>", value, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearGreaterThan(Integer value) {
            addCriterion("house_card_year >", value, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_card_year >=", value, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearLessThan(Integer value) {
            addCriterion("house_card_year <", value, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearLessThanOrEqualTo(Integer value) {
            addCriterion("house_card_year <=", value, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearIn(List<Integer> values) {
            addCriterion("house_card_year in", values, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearNotIn(List<Integer> values) {
            addCriterion("house_card_year not in", values, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearBetween(Integer value1, Integer value2) {
            addCriterion("house_card_year between", value1, value2, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardYearNotBetween(Integer value1, Integer value2) {
            addCriterion("house_card_year not between", value1, value2, "houseCardYear");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberIsNull() {
            addCriterion("house_card_number is null");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberIsNotNull() {
            addCriterion("house_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberEqualTo(Integer value) {
            addCriterion("house_card_number =", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberNotEqualTo(Integer value) {
            addCriterion("house_card_number <>", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberGreaterThan(Integer value) {
            addCriterion("house_card_number >", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_card_number >=", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberLessThan(Integer value) {
            addCriterion("house_card_number <", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberLessThanOrEqualTo(Integer value) {
            addCriterion("house_card_number <=", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberIn(List<Integer> values) {
            addCriterion("house_card_number in", values, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberNotIn(List<Integer> values) {
            addCriterion("house_card_number not in", values, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberBetween(Integer value1, Integer value2) {
            addCriterion("house_card_number between", value1, value2, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("house_card_number not between", value1, value2, "houseCardNumber");
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

        public Criteria andCardDateIsNull() {
            addCriterion("card_date is null");
            return (Criteria) this;
        }

        public Criteria andCardDateIsNotNull() {
            addCriterion("card_date is not null");
            return (Criteria) this;
        }

        public Criteria andCardDateEqualTo(Date value) {
            addCriterionForJDBCDate("card_date =", value, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("card_date <>", value, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateGreaterThan(Date value) {
            addCriterionForJDBCDate("card_date >", value, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("card_date >=", value, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateLessThan(Date value) {
            addCriterionForJDBCDate("card_date <", value, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("card_date <=", value, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateIn(List<Date> values) {
            addCriterionForJDBCDate("card_date in", values, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("card_date not in", values, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("card_date between", value1, value2, "cardDate");
            return (Criteria) this;
        }

        public Criteria andCardDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("card_date not between", value1, value2, "cardDate");
            return (Criteria) this;
        }

        public Criteria andLandNoIsNull() {
            addCriterion("land_no is null");
            return (Criteria) this;
        }

        public Criteria andLandNoIsNotNull() {
            addCriterion("land_no is not null");
            return (Criteria) this;
        }

        public Criteria andLandNoEqualTo(String value) {
            addCriterion("land_no =", value, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoNotEqualTo(String value) {
            addCriterion("land_no <>", value, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoGreaterThan(String value) {
            addCriterion("land_no >", value, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoGreaterThanOrEqualTo(String value) {
            addCriterion("land_no >=", value, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoLessThan(String value) {
            addCriterion("land_no <", value, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoLessThanOrEqualTo(String value) {
            addCriterion("land_no <=", value, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoLike(String value) {
            addCriterion("land_no like", value, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoNotLike(String value) {
            addCriterion("land_no not like", value, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoIn(List<String> values) {
            addCriterion("land_no in", values, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoNotIn(List<String> values) {
            addCriterion("land_no not in", values, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoBetween(String value1, String value2) {
            addCriterion("land_no between", value1, value2, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandNoNotBetween(String value1, String value2) {
            addCriterion("land_no not between", value1, value2, "landNo");
            return (Criteria) this;
        }

        public Criteria andLandSizeIsNull() {
            addCriterion("land_size is null");
            return (Criteria) this;
        }

        public Criteria andLandSizeIsNotNull() {
            addCriterion("land_size is not null");
            return (Criteria) this;
        }

        public Criteria andLandSizeEqualTo(Float value) {
            addCriterion("land_size =", value, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeNotEqualTo(Float value) {
            addCriterion("land_size <>", value, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeGreaterThan(Float value) {
            addCriterion("land_size >", value, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeGreaterThanOrEqualTo(Float value) {
            addCriterion("land_size >=", value, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeLessThan(Float value) {
            addCriterion("land_size <", value, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeLessThanOrEqualTo(Float value) {
            addCriterion("land_size <=", value, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeIn(List<Float> values) {
            addCriterion("land_size in", values, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeNotIn(List<Float> values) {
            addCriterion("land_size not in", values, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeBetween(Float value1, Float value2) {
            addCriterion("land_size between", value1, value2, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandSizeNotBetween(Float value1, Float value2) {
            addCriterion("land_size not between", value1, value2, "landSize");
            return (Criteria) this;
        }

        public Criteria andLandPurposeIsNull() {
            addCriterion("land_purpose is null");
            return (Criteria) this;
        }

        public Criteria andLandPurposeIsNotNull() {
            addCriterion("land_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andLandPurposeEqualTo(Short value) {
            addCriterion("land_purpose =", value, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeNotEqualTo(Short value) {
            addCriterion("land_purpose <>", value, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeGreaterThan(Short value) {
            addCriterion("land_purpose >", value, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeGreaterThanOrEqualTo(Short value) {
            addCriterion("land_purpose >=", value, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeLessThan(Short value) {
            addCriterion("land_purpose <", value, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeLessThanOrEqualTo(Short value) {
            addCriterion("land_purpose <=", value, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeIn(List<Short> values) {
            addCriterion("land_purpose in", values, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeNotIn(List<Short> values) {
            addCriterion("land_purpose not in", values, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeBetween(Short value1, Short value2) {
            addCriterion("land_purpose between", value1, value2, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandPurposeNotBetween(Short value1, Short value2) {
            addCriterion("land_purpose not between", value1, value2, "landPurpose");
            return (Criteria) this;
        }

        public Criteria andLandStartDateIsNull() {
            addCriterion("land_start_date is null");
            return (Criteria) this;
        }

        public Criteria andLandStartDateIsNotNull() {
            addCriterion("land_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andLandStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("land_start_date =", value, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("land_start_date <>", value, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("land_start_date >", value, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("land_start_date >=", value, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateLessThan(Date value) {
            addCriterionForJDBCDate("land_start_date <", value, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("land_start_date <=", value, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("land_start_date in", values, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("land_start_date not in", values, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("land_start_date between", value1, value2, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("land_start_date not between", value1, value2, "landStartDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateIsNull() {
            addCriterion("land_end_date is null");
            return (Criteria) this;
        }

        public Criteria andLandEndDateIsNotNull() {
            addCriterion("land_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andLandEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("land_end_date =", value, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("land_end_date <>", value, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("land_end_date >", value, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("land_end_date >=", value, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateLessThan(Date value) {
            addCriterionForJDBCDate("land_end_date <", value, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("land_end_date <=", value, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("land_end_date in", values, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("land_end_date not in", values, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("land_end_date between", value1, value2, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("land_end_date not between", value1, value2, "landEndDate");
            return (Criteria) this;
        }

        public Criteria andLandSourceIsNull() {
            addCriterion("land_source is null");
            return (Criteria) this;
        }

        public Criteria andLandSourceIsNotNull() {
            addCriterion("land_source is not null");
            return (Criteria) this;
        }

        public Criteria andLandSourceEqualTo(Short value) {
            addCriterion("land_source =", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceNotEqualTo(Short value) {
            addCriterion("land_source <>", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceGreaterThan(Short value) {
            addCriterion("land_source >", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("land_source >=", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceLessThan(Short value) {
            addCriterion("land_source <", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceLessThanOrEqualTo(Short value) {
            addCriterion("land_source <=", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceIn(List<Short> values) {
            addCriterion("land_source in", values, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceNotIn(List<Short> values) {
            addCriterion("land_source not in", values, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceBetween(Short value1, Short value2) {
            addCriterion("land_source between", value1, value2, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceNotBetween(Short value1, Short value2) {
            addCriterion("land_source not between", value1, value2, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeIsNull() {
            addCriterion("land_service_life is null");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeIsNotNull() {
            addCriterion("land_service_life is not null");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeEqualTo(Integer value) {
            addCriterion("land_service_life =", value, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeNotEqualTo(Integer value) {
            addCriterion("land_service_life <>", value, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeGreaterThan(Integer value) {
            addCriterion("land_service_life >", value, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeGreaterThanOrEqualTo(Integer value) {
            addCriterion("land_service_life >=", value, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeLessThan(Integer value) {
            addCriterion("land_service_life <", value, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeLessThanOrEqualTo(Integer value) {
            addCriterion("land_service_life <=", value, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeIn(List<Integer> values) {
            addCriterion("land_service_life in", values, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeNotIn(List<Integer> values) {
            addCriterion("land_service_life not in", values, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeBetween(Integer value1, Integer value2) {
            addCriterion("land_service_life between", value1, value2, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andLandServiceLifeNotBetween(Integer value1, Integer value2) {
            addCriterion("land_service_life not between", value1, value2, "landServiceLife");
            return (Criteria) this;
        }

        public Criteria andEstateAgentIsNull() {
            addCriterion("estate_agent is null");
            return (Criteria) this;
        }

        public Criteria andEstateAgentIsNotNull() {
            addCriterion("estate_agent is not null");
            return (Criteria) this;
        }

        public Criteria andEstateAgentEqualTo(String value) {
            addCriterion("estate_agent =", value, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentNotEqualTo(String value) {
            addCriterion("estate_agent <>", value, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentGreaterThan(String value) {
            addCriterion("estate_agent >", value, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentGreaterThanOrEqualTo(String value) {
            addCriterion("estate_agent >=", value, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentLessThan(String value) {
            addCriterion("estate_agent <", value, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentLessThanOrEqualTo(String value) {
            addCriterion("estate_agent <=", value, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentLike(String value) {
            addCriterion("estate_agent like", value, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentNotLike(String value) {
            addCriterion("estate_agent not like", value, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentIn(List<String> values) {
            addCriterion("estate_agent in", values, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentNotIn(List<String> values) {
            addCriterion("estate_agent not in", values, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentBetween(String value1, String value2) {
            addCriterion("estate_agent between", value1, value2, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andEstateAgentNotBetween(String value1, String value2) {
            addCriterion("estate_agent not between", value1, value2, "estateAgent");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIsNull() {
            addCriterion("building_area is null");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIsNotNull() {
            addCriterion("building_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaEqualTo(Float value) {
            addCriterion("building_area =", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotEqualTo(Float value) {
            addCriterion("building_area <>", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaGreaterThan(Float value) {
            addCriterion("building_area >", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("building_area >=", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLessThan(Float value) {
            addCriterion("building_area <", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLessThanOrEqualTo(Float value) {
            addCriterion("building_area <=", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIn(List<Float> values) {
            addCriterion("building_area in", values, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotIn(List<Float> values) {
            addCriterion("building_area not in", values, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaBetween(Float value1, Float value2) {
            addCriterion("building_area between", value1, value2, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotBetween(Float value1, Float value2) {
            addCriterion("building_area not between", value1, value2, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaIsNull() {
            addCriterion("inner_building_area is null");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaIsNotNull() {
            addCriterion("inner_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaEqualTo(Float value) {
            addCriterion("inner_building_area =", value, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaNotEqualTo(Float value) {
            addCriterion("inner_building_area <>", value, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaGreaterThan(Float value) {
            addCriterion("inner_building_area >", value, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("inner_building_area >=", value, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaLessThan(Float value) {
            addCriterion("inner_building_area <", value, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaLessThanOrEqualTo(Float value) {
            addCriterion("inner_building_area <=", value, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaIn(List<Float> values) {
            addCriterion("inner_building_area in", values, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaNotIn(List<Float> values) {
            addCriterion("inner_building_area not in", values, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaBetween(Float value1, Float value2) {
            addCriterion("inner_building_area between", value1, value2, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andInnerBuildingAreaNotBetween(Float value1, Float value2) {
            addCriterion("inner_building_area not between", value1, value2, "innerBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHousePurposeIsNull() {
            addCriterion("house_purpose is null");
            return (Criteria) this;
        }

        public Criteria andHousePurposeIsNotNull() {
            addCriterion("house_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andHousePurposeEqualTo(Short value) {
            addCriterion("house_purpose =", value, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeNotEqualTo(Short value) {
            addCriterion("house_purpose <>", value, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeGreaterThan(Short value) {
            addCriterion("house_purpose >", value, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeGreaterThanOrEqualTo(Short value) {
            addCriterion("house_purpose >=", value, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeLessThan(Short value) {
            addCriterion("house_purpose <", value, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeLessThanOrEqualTo(Short value) {
            addCriterion("house_purpose <=", value, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeIn(List<Short> values) {
            addCriterion("house_purpose in", values, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeNotIn(List<Short> values) {
            addCriterion("house_purpose not in", values, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeBetween(Short value1, Short value2) {
            addCriterion("house_purpose between", value1, value2, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andHousePurposeNotBetween(Short value1, Short value2) {
            addCriterion("house_purpose not between", value1, value2, "housePurpose");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceIsNull() {
            addCriterion("register_price is null");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceIsNotNull() {
            addCriterion("register_price is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceEqualTo(BigDecimal value) {
            addCriterion("register_price =", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceNotEqualTo(BigDecimal value) {
            addCriterion("register_price <>", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceGreaterThan(BigDecimal value) {
            addCriterion("register_price >", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("register_price >=", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceLessThan(BigDecimal value) {
            addCriterion("register_price <", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("register_price <=", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceIn(List<BigDecimal> values) {
            addCriterion("register_price in", values, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceNotIn(List<BigDecimal> values) {
            addCriterion("register_price not in", values, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("register_price between", value1, value2, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("register_price not between", value1, value2, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andCompletionDateIsNull() {
            addCriterion("completion_date is null");
            return (Criteria) this;
        }

        public Criteria andCompletionDateIsNotNull() {
            addCriterion("completion_date is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionDateEqualTo(Date value) {
            addCriterionForJDBCDate("completion_date =", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("completion_date <>", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("completion_date >", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("completion_date >=", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateLessThan(Date value) {
            addCriterionForJDBCDate("completion_date <", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("completion_date <=", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateIn(List<Date> values) {
            addCriterionForJDBCDate("completion_date in", values, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("completion_date not in", values, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("completion_date between", value1, value2, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("completion_date not between", value1, value2, "completionDate");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceIsNull() {
            addCriterion("house_province is null");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceIsNotNull() {
            addCriterion("house_province is not null");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceEqualTo(String value) {
            addCriterion("house_province =", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceNotEqualTo(String value) {
            addCriterion("house_province <>", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceGreaterThan(String value) {
            addCriterion("house_province >", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("house_province >=", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceLessThan(String value) {
            addCriterion("house_province <", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceLessThanOrEqualTo(String value) {
            addCriterion("house_province <=", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceLike(String value) {
            addCriterion("house_province like", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceNotLike(String value) {
            addCriterion("house_province not like", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceIn(List<String> values) {
            addCriterion("house_province in", values, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceNotIn(List<String> values) {
            addCriterion("house_province not in", values, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceBetween(String value1, String value2) {
            addCriterion("house_province between", value1, value2, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceNotBetween(String value1, String value2) {
            addCriterion("house_province not between", value1, value2, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseCityIsNull() {
            addCriterion("house_city is null");
            return (Criteria) this;
        }

        public Criteria andHouseCityIsNotNull() {
            addCriterion("house_city is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCityEqualTo(String value) {
            addCriterion("house_city =", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityNotEqualTo(String value) {
            addCriterion("house_city <>", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityGreaterThan(String value) {
            addCriterion("house_city >", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityGreaterThanOrEqualTo(String value) {
            addCriterion("house_city >=", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityLessThan(String value) {
            addCriterion("house_city <", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityLessThanOrEqualTo(String value) {
            addCriterion("house_city <=", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityLike(String value) {
            addCriterion("house_city like", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityNotLike(String value) {
            addCriterion("house_city not like", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityIn(List<String> values) {
            addCriterion("house_city in", values, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityNotIn(List<String> values) {
            addCriterion("house_city not in", values, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityBetween(String value1, String value2) {
            addCriterion("house_city between", value1, value2, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityNotBetween(String value1, String value2) {
            addCriterion("house_city not between", value1, value2, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNull() {
            addCriterion("house_area is null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNotNull() {
            addCriterion("house_area is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaEqualTo(String value) {
            addCriterion("house_area =", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotEqualTo(String value) {
            addCriterion("house_area <>", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThan(String value) {
            addCriterion("house_area >", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("house_area >=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThan(String value) {
            addCriterion("house_area <", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThanOrEqualTo(String value) {
            addCriterion("house_area <=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLike(String value) {
            addCriterion("house_area like", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotLike(String value) {
            addCriterion("house_area not like", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIn(List<String> values) {
            addCriterion("house_area in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotIn(List<String> values) {
            addCriterion("house_area not in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaBetween(String value1, String value2) {
            addCriterion("house_area between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotBetween(String value1, String value2) {
            addCriterion("house_area not between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressIsNull() {
            addCriterion("house_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressIsNotNull() {
            addCriterion("house_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressEqualTo(String value) {
            addCriterion("house_detail_address =", value, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressNotEqualTo(String value) {
            addCriterion("house_detail_address <>", value, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressGreaterThan(String value) {
            addCriterion("house_detail_address >", value, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("house_detail_address >=", value, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressLessThan(String value) {
            addCriterion("house_detail_address <", value, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("house_detail_address <=", value, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressLike(String value) {
            addCriterion("house_detail_address like", value, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressNotLike(String value) {
            addCriterion("house_detail_address not like", value, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressIn(List<String> values) {
            addCriterion("house_detail_address in", values, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressNotIn(List<String> values) {
            addCriterion("house_detail_address not in", values, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressBetween(String value1, String value2) {
            addCriterion("house_detail_address between", value1, value2, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHouseDetailAddressNotBetween(String value1, String value2) {
            addCriterion("house_detail_address not between", value1, value2, "houseDetailAddress");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateIsNull() {
            addCriterion("house_purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateIsNotNull() {
            addCriterion("house_purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("house_purchase_date =", value, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("house_purchase_date <>", value, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("house_purchase_date >", value, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("house_purchase_date >=", value, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateLessThan(Date value) {
            addCriterionForJDBCDate("house_purchase_date <", value, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("house_purchase_date <=", value, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("house_purchase_date in", values, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("house_purchase_date not in", values, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("house_purchase_date between", value1, value2, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHousePurchaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("house_purchase_date not between", value1, value2, "housePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateIsNull() {
            addCriterion("house_register_date is null");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateIsNotNull() {
            addCriterion("house_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("house_register_date =", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("house_register_date <>", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("house_register_date >", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("house_register_date >=", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("house_register_date <", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("house_register_date <=", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("house_register_date in", values, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("house_register_date not in", values, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("house_register_date between", value1, value2, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("house_register_date not between", value1, value2, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeIsNull() {
            addCriterion("house_card_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeIsNotNull() {
            addCriterion("house_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeEqualTo(Short value) {
            addCriterion("house_card_type =", value, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeNotEqualTo(Short value) {
            addCriterion("house_card_type <>", value, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeGreaterThan(Short value) {
            addCriterion("house_card_type >", value, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("house_card_type >=", value, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeLessThan(Short value) {
            addCriterion("house_card_type <", value, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeLessThanOrEqualTo(Short value) {
            addCriterion("house_card_type <=", value, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeIn(List<Short> values) {
            addCriterion("house_card_type in", values, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeNotIn(List<Short> values) {
            addCriterion("house_card_type not in", values, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeBetween(Short value1, Short value2) {
            addCriterion("house_card_type between", value1, value2, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardTypeNotBetween(Short value1, Short value2) {
            addCriterion("house_card_type not between", value1, value2, "houseCardType");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoIsNull() {
            addCriterion("house_card_photo is null");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoIsNotNull() {
            addCriterion("house_card_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoEqualTo(String value) {
            addCriterion("house_card_photo =", value, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoNotEqualTo(String value) {
            addCriterion("house_card_photo <>", value, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoGreaterThan(String value) {
            addCriterion("house_card_photo >", value, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("house_card_photo >=", value, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoLessThan(String value) {
            addCriterion("house_card_photo <", value, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoLessThanOrEqualTo(String value) {
            addCriterion("house_card_photo <=", value, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoLike(String value) {
            addCriterion("house_card_photo like", value, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoNotLike(String value) {
            addCriterion("house_card_photo not like", value, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoIn(List<String> values) {
            addCriterion("house_card_photo in", values, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoNotIn(List<String> values) {
            addCriterion("house_card_photo not in", values, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoBetween(String value1, String value2) {
            addCriterion("house_card_photo between", value1, value2, "houseCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHouseCardPhotoNotBetween(String value1, String value2) {
            addCriterion("house_card_photo not between", value1, value2, "houseCardPhoto");
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

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(Short value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(Short value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(Short value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(Short value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(Short value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<Short> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<Short> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(Short value1, Short value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(Short value1, Short value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveIsNull() {
            addCriterion("is_only_have is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveIsNotNull() {
            addCriterion("is_only_have is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveEqualTo(String value) {
            addCriterion("is_only_have =", value, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveNotEqualTo(String value) {
            addCriterion("is_only_have <>", value, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveGreaterThan(String value) {
            addCriterion("is_only_have >", value, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveGreaterThanOrEqualTo(String value) {
            addCriterion("is_only_have >=", value, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveLessThan(String value) {
            addCriterion("is_only_have <", value, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveLessThanOrEqualTo(String value) {
            addCriterion("is_only_have <=", value, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveLike(String value) {
            addCriterion("is_only_have like", value, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveNotLike(String value) {
            addCriterion("is_only_have not like", value, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveIn(List<String> values) {
            addCriterion("is_only_have in", values, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveNotIn(List<String> values) {
            addCriterion("is_only_have not in", values, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveBetween(String value1, String value2) {
            addCriterion("is_only_have between", value1, value2, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHaveNotBetween(String value1, String value2) {
            addCriterion("is_only_have not between", value1, value2, "isOnlyHave");
            return (Criteria) this;
        }

        public Criteria andHouseStatusIsNull() {
            addCriterion("house_status is null");
            return (Criteria) this;
        }

        public Criteria andHouseStatusIsNotNull() {
            addCriterion("house_status is not null");
            return (Criteria) this;
        }

        public Criteria andHouseStatusEqualTo(Short value) {
            addCriterion("house_status =", value, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusNotEqualTo(Short value) {
            addCriterion("house_status <>", value, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusGreaterThan(Short value) {
            addCriterion("house_status >", value, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("house_status >=", value, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusLessThan(Short value) {
            addCriterion("house_status <", value, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusLessThanOrEqualTo(Short value) {
            addCriterion("house_status <=", value, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusIn(List<Short> values) {
            addCriterion("house_status in", values, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusNotIn(List<Short> values) {
            addCriterion("house_status not in", values, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusBetween(Short value1, Short value2) {
            addCriterion("house_status between", value1, value2, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseStatusNotBetween(Short value1, Short value2) {
            addCriterion("house_status not between", value1, value2, "houseStatus");
            return (Criteria) this;
        }

        public Criteria andHouseSourceIsNull() {
            addCriterion("house_source is null");
            return (Criteria) this;
        }

        public Criteria andHouseSourceIsNotNull() {
            addCriterion("house_source is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSourceEqualTo(Short value) {
            addCriterion("house_source =", value, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceNotEqualTo(Short value) {
            addCriterion("house_source <>", value, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceGreaterThan(Short value) {
            addCriterion("house_source >", value, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("house_source >=", value, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceLessThan(Short value) {
            addCriterion("house_source <", value, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceLessThanOrEqualTo(Short value) {
            addCriterion("house_source <=", value, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceIn(List<Short> values) {
            addCriterion("house_source in", values, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceNotIn(List<Short> values) {
            addCriterion("house_source not in", values, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceBetween(Short value1, Short value2) {
            addCriterion("house_source between", value1, value2, "houseSource");
            return (Criteria) this;
        }

        public Criteria andHouseSourceNotBetween(Short value1, Short value2) {
            addCriterion("house_source not between", value1, value2, "houseSource");
            return (Criteria) this;
        }

        public Criteria andActualityIsNull() {
            addCriterion("actuality is null");
            return (Criteria) this;
        }

        public Criteria andActualityIsNotNull() {
            addCriterion("actuality is not null");
            return (Criteria) this;
        }

        public Criteria andActualityEqualTo(Short value) {
            addCriterion("actuality =", value, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityNotEqualTo(Short value) {
            addCriterion("actuality <>", value, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityGreaterThan(Short value) {
            addCriterion("actuality >", value, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityGreaterThanOrEqualTo(Short value) {
            addCriterion("actuality >=", value, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityLessThan(Short value) {
            addCriterion("actuality <", value, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityLessThanOrEqualTo(Short value) {
            addCriterion("actuality <=", value, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityIn(List<Short> values) {
            addCriterion("actuality in", values, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityNotIn(List<Short> values) {
            addCriterion("actuality not in", values, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityBetween(Short value1, Short value2) {
            addCriterion("actuality between", value1, value2, "actuality");
            return (Criteria) this;
        }

        public Criteria andActualityNotBetween(Short value1, Short value2) {
            addCriterion("actuality not between", value1, value2, "actuality");
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

        public Criteria andIsOnlyHousingIsNull() {
            addCriterion("is_only_housing is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingIsNotNull() {
            addCriterion("is_only_housing is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingEqualTo(Short value) {
            addCriterion("is_only_housing =", value, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingNotEqualTo(Short value) {
            addCriterion("is_only_housing <>", value, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingGreaterThan(Short value) {
            addCriterion("is_only_housing >", value, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingGreaterThanOrEqualTo(Short value) {
            addCriterion("is_only_housing >=", value, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingLessThan(Short value) {
            addCriterion("is_only_housing <", value, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingLessThanOrEqualTo(Short value) {
            addCriterion("is_only_housing <=", value, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingIn(List<Short> values) {
            addCriterion("is_only_housing in", values, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingNotIn(List<Short> values) {
            addCriterion("is_only_housing not in", values, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingBetween(Short value1, Short value2) {
            addCriterion("is_only_housing between", value1, value2, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHousingNotBetween(Short value1, Short value2) {
            addCriterion("is_only_housing not between", value1, value2, "isOnlyHousing");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationIsNull() {
            addCriterion("is_house_population is null");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationIsNotNull() {
            addCriterion("is_house_population is not null");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationEqualTo(Short value) {
            addCriterion("is_house_population =", value, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationNotEqualTo(Short value) {
            addCriterion("is_house_population <>", value, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationGreaterThan(Short value) {
            addCriterion("is_house_population >", value, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationGreaterThanOrEqualTo(Short value) {
            addCriterion("is_house_population >=", value, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationLessThan(Short value) {
            addCriterion("is_house_population <", value, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationLessThanOrEqualTo(Short value) {
            addCriterion("is_house_population <=", value, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationIn(List<Short> values) {
            addCriterion("is_house_population in", values, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationNotIn(List<Short> values) {
            addCriterion("is_house_population not in", values, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationBetween(Short value1, Short value2) {
            addCriterion("is_house_population between", value1, value2, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andIsHousePopulationNotBetween(Short value1, Short value2) {
            addCriterion("is_house_population not between", value1, value2, "isHousePopulation");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
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

        public Criteria andTotalAmountEqualTo(String value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(String value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(String value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(String value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(String value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLike(String value) {
            addCriterion("total_amount like", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotLike(String value) {
            addCriterion("total_amount not like", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<String> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<String> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(String value1, String value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(String value1, String value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
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