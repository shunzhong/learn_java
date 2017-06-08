package com.mpd.api.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseOnlineAssessmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseOnlineAssessmentInfoExample() {
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

        public Criteria andLivingAreaIsNull() {
            addCriterion("living_area is null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaIsNotNull() {
            addCriterion("living_area is not null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaEqualTo(String value) {
            addCriterion("living_area =", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNotEqualTo(String value) {
            addCriterion("living_area <>", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGreaterThan(String value) {
            addCriterion("living_area >", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGreaterThanOrEqualTo(String value) {
            addCriterion("living_area >=", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaLessThan(String value) {
            addCriterion("living_area <", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaLessThanOrEqualTo(String value) {
            addCriterion("living_area <=", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaLike(String value) {
            addCriterion("living_area like", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNotLike(String value) {
            addCriterion("living_area not like", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaIn(List<String> values) {
            addCriterion("living_area in", values, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNotIn(List<String> values) {
            addCriterion("living_area not in", values, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaBetween(String value1, String value2) {
            addCriterion("living_area between", value1, value2, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNotBetween(String value1, String value2) {
            addCriterion("living_area not between", value1, value2, "livingArea");
            return (Criteria) this;
        }

        public Criteria andOrientateIsNull() {
            addCriterion("orientate is null");
            return (Criteria) this;
        }

        public Criteria andOrientateIsNotNull() {
            addCriterion("orientate is not null");
            return (Criteria) this;
        }

        public Criteria andOrientateEqualTo(String value) {
            addCriterion("orientate =", value, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateNotEqualTo(String value) {
            addCriterion("orientate <>", value, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateGreaterThan(String value) {
            addCriterion("orientate >", value, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateGreaterThanOrEqualTo(String value) {
            addCriterion("orientate >=", value, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateLessThan(String value) {
            addCriterion("orientate <", value, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateLessThanOrEqualTo(String value) {
            addCriterion("orientate <=", value, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateLike(String value) {
            addCriterion("orientate like", value, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateNotLike(String value) {
            addCriterion("orientate not like", value, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateIn(List<String> values) {
            addCriterion("orientate in", values, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateNotIn(List<String> values) {
            addCriterion("orientate not in", values, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateBetween(String value1, String value2) {
            addCriterion("orientate between", value1, value2, "orientate");
            return (Criteria) this;
        }

        public Criteria andOrientateNotBetween(String value1, String value2) {
            addCriterion("orientate not between", value1, value2, "orientate");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andInFloorIsNull() {
            addCriterion("in_floor is null");
            return (Criteria) this;
        }

        public Criteria andInFloorIsNotNull() {
            addCriterion("in_floor is not null");
            return (Criteria) this;
        }

        public Criteria andInFloorEqualTo(String value) {
            addCriterion("in_floor =", value, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorNotEqualTo(String value) {
            addCriterion("in_floor <>", value, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorGreaterThan(String value) {
            addCriterion("in_floor >", value, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorGreaterThanOrEqualTo(String value) {
            addCriterion("in_floor >=", value, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorLessThan(String value) {
            addCriterion("in_floor <", value, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorLessThanOrEqualTo(String value) {
            addCriterion("in_floor <=", value, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorLike(String value) {
            addCriterion("in_floor like", value, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorNotLike(String value) {
            addCriterion("in_floor not like", value, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorIn(List<String> values) {
            addCriterion("in_floor in", values, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorNotIn(List<String> values) {
            addCriterion("in_floor not in", values, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorBetween(String value1, String value2) {
            addCriterion("in_floor between", value1, value2, "inFloor");
            return (Criteria) this;
        }

        public Criteria andInFloorNotBetween(String value1, String value2) {
            addCriterion("in_floor not between", value1, value2, "inFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIsNull() {
            addCriterion("total_floor is null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIsNotNull() {
            addCriterion("total_floor is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorEqualTo(String value) {
            addCriterion("total_floor =", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotEqualTo(String value) {
            addCriterion("total_floor <>", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThan(String value) {
            addCriterion("total_floor >", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThanOrEqualTo(String value) {
            addCriterion("total_floor >=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThan(String value) {
            addCriterion("total_floor <", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThanOrEqualTo(String value) {
            addCriterion("total_floor <=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLike(String value) {
            addCriterion("total_floor like", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotLike(String value) {
            addCriterion("total_floor not like", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIn(List<String> values) {
            addCriterion("total_floor in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotIn(List<String> values) {
            addCriterion("total_floor not in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorBetween(String value1, String value2) {
            addCriterion("total_floor between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotBetween(String value1, String value2) {
            addCriterion("total_floor not between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountIsNull() {
            addCriterion("asse_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountIsNotNull() {
            addCriterion("asse_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountEqualTo(Float value) {
            addCriterion("asse_total_amount =", value, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountNotEqualTo(Float value) {
            addCriterion("asse_total_amount <>", value, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountGreaterThan(Float value) {
            addCriterion("asse_total_amount >", value, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("asse_total_amount >=", value, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountLessThan(Float value) {
            addCriterion("asse_total_amount <", value, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountLessThanOrEqualTo(Float value) {
            addCriterion("asse_total_amount <=", value, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountIn(List<Float> values) {
            addCriterion("asse_total_amount in", values, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountNotIn(List<Float> values) {
            addCriterion("asse_total_amount not in", values, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountBetween(Float value1, Float value2) {
            addCriterion("asse_total_amount between", value1, value2, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAsseTotalAmountNotBetween(Float value1, Float value2) {
            addCriterion("asse_total_amount not between", value1, value2, "asseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountIsNull() {
            addCriterion("asse_per_amount is null");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountIsNotNull() {
            addCriterion("asse_per_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountEqualTo(Float value) {
            addCriterion("asse_per_amount =", value, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountNotEqualTo(Float value) {
            addCriterion("asse_per_amount <>", value, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountGreaterThan(Float value) {
            addCriterion("asse_per_amount >", value, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("asse_per_amount >=", value, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountLessThan(Float value) {
            addCriterion("asse_per_amount <", value, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountLessThanOrEqualTo(Float value) {
            addCriterion("asse_per_amount <=", value, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountIn(List<Float> values) {
            addCriterion("asse_per_amount in", values, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountNotIn(List<Float> values) {
            addCriterion("asse_per_amount not in", values, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountBetween(Float value1, Float value2) {
            addCriterion("asse_per_amount between", value1, value2, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andAssePerAmountNotBetween(Float value1, Float value2) {
            addCriterion("asse_per_amount not between", value1, value2, "assePerAmount");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("rent is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("rent is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(Float value) {
            addCriterion("rent =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(Float value) {
            addCriterion("rent <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(Float value) {
            addCriterion("rent >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(Float value) {
            addCriterion("rent >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(Float value) {
            addCriterion("rent <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(Float value) {
            addCriterion("rent <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<Float> values) {
            addCriterion("rent in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<Float> values) {
            addCriterion("rent not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(Float value1, Float value2) {
            addCriterion("rent between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(Float value1, Float value2) {
            addCriterion("rent not between", value1, value2, "rent");
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