package com.mpd.api.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseSurveyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseSurveyInfoExample() {
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

        public Criteria andIsOldIsNull() {
            addCriterion("is_old is null");
            return (Criteria) this;
        }

        public Criteria andIsOldIsNotNull() {
            addCriterion("is_old is not null");
            return (Criteria) this;
        }

        public Criteria andIsOldEqualTo(Short value) {
            addCriterion("is_old =", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldNotEqualTo(Short value) {
            addCriterion("is_old <>", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldGreaterThan(Short value) {
            addCriterion("is_old >", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldGreaterThanOrEqualTo(Short value) {
            addCriterion("is_old >=", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldLessThan(Short value) {
            addCriterion("is_old <", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldLessThanOrEqualTo(Short value) {
            addCriterion("is_old <=", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldIn(List<Short> values) {
            addCriterion("is_old in", values, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldNotIn(List<Short> values) {
            addCriterion("is_old not in", values, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldBetween(Short value1, Short value2) {
            addCriterion("is_old between", value1, value2, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldNotBetween(Short value1, Short value2) {
            addCriterion("is_old not between", value1, value2, "isOld");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNull() {
            addCriterion("orientation is null");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNotNull() {
            addCriterion("orientation is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationEqualTo(String value) {
            addCriterion("orientation =", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotEqualTo(String value) {
            addCriterion("orientation <>", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThan(String value) {
            addCriterion("orientation >", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("orientation >=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThan(String value) {
            addCriterion("orientation <", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThanOrEqualTo(String value) {
            addCriterion("orientation <=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLike(String value) {
            addCriterion("orientation like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotLike(String value) {
            addCriterion("orientation not like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationIn(List<String> values) {
            addCriterion("orientation in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotIn(List<String> values) {
            addCriterion("orientation not in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationBetween(String value1, String value2) {
            addCriterion("orientation between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotBetween(String value1, String value2) {
            addCriterion("orientation not between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownIsNull() {
            addCriterion("is_family_known is null");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownIsNotNull() {
            addCriterion("is_family_known is not null");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownEqualTo(Boolean value) {
            addCriterion("is_family_known =", value, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownNotEqualTo(Boolean value) {
            addCriterion("is_family_known <>", value, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownGreaterThan(Boolean value) {
            addCriterion("is_family_known >", value, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_family_known >=", value, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownLessThan(Boolean value) {
            addCriterion("is_family_known <", value, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownLessThanOrEqualTo(Boolean value) {
            addCriterion("is_family_known <=", value, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownIn(List<Boolean> values) {
            addCriterion("is_family_known in", values, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownNotIn(List<Boolean> values) {
            addCriterion("is_family_known not in", values, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownBetween(Boolean value1, Boolean value2) {
            addCriterion("is_family_known between", value1, value2, "isFamilyKnown");
            return (Criteria) this;
        }

        public Criteria andIsFamilyKnownNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_family_known not between", value1, value2, "isFamilyKnown");
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

        public Criteria andBuildingTypeIsNull() {
            addCriterion("building_type is null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNotNull() {
            addCriterion("building_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeEqualTo(Short value) {
            addCriterion("building_type =", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotEqualTo(Short value) {
            addCriterion("building_type <>", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThan(Short value) {
            addCriterion("building_type >", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("building_type >=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThan(Short value) {
            addCriterion("building_type <", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThanOrEqualTo(Short value) {
            addCriterion("building_type <=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIn(List<Short> values) {
            addCriterion("building_type in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotIn(List<Short> values) {
            addCriterion("building_type not in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeBetween(Short value1, Short value2) {
            addCriterion("building_type between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotBetween(Short value1, Short value2) {
            addCriterion("building_type not between", value1, value2, "buildingType");
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

        public Criteria andTotalFloorEqualTo(Integer value) {
            addCriterion("total_floor =", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotEqualTo(Integer value) {
            addCriterion("total_floor <>", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThan(Integer value) {
            addCriterion("total_floor >", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_floor >=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThan(Integer value) {
            addCriterion("total_floor <", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThanOrEqualTo(Integer value) {
            addCriterion("total_floor <=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIn(List<Integer> values) {
            addCriterion("total_floor in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotIn(List<Integer> values) {
            addCriterion("total_floor not in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorBetween(Integer value1, Integer value2) {
            addCriterion("total_floor between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("total_floor not between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorIsNull() {
            addCriterion("house_floor is null");
            return (Criteria) this;
        }

        public Criteria andHouseFloorIsNotNull() {
            addCriterion("house_floor is not null");
            return (Criteria) this;
        }

        public Criteria andHouseFloorEqualTo(Integer value) {
            addCriterion("house_floor =", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorNotEqualTo(Integer value) {
            addCriterion("house_floor <>", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorGreaterThan(Integer value) {
            addCriterion("house_floor >", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_floor >=", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorLessThan(Integer value) {
            addCriterion("house_floor <", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorLessThanOrEqualTo(Integer value) {
            addCriterion("house_floor <=", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorIn(List<Integer> values) {
            addCriterion("house_floor in", values, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorNotIn(List<Integer> values) {
            addCriterion("house_floor not in", values, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorBetween(Integer value1, Integer value2) {
            addCriterion("house_floor between", value1, value2, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("house_floor not between", value1, value2, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseStateIsNull() {
            addCriterion("house_state is null");
            return (Criteria) this;
        }

        public Criteria andHouseStateIsNotNull() {
            addCriterion("house_state is not null");
            return (Criteria) this;
        }

        public Criteria andHouseStateEqualTo(Short value) {
            addCriterion("house_state =", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotEqualTo(Short value) {
            addCriterion("house_state <>", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateGreaterThan(Short value) {
            addCriterion("house_state >", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateGreaterThanOrEqualTo(Short value) {
            addCriterion("house_state >=", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLessThan(Short value) {
            addCriterion("house_state <", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLessThanOrEqualTo(Short value) {
            addCriterion("house_state <=", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateIn(List<Short> values) {
            addCriterion("house_state in", values, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotIn(List<Short> values) {
            addCriterion("house_state not in", values, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateBetween(Short value1, Short value2) {
            addCriterion("house_state between", value1, value2, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotBetween(Short value1, Short value2) {
            addCriterion("house_state not between", value1, value2, "houseState");
            return (Criteria) this;
        }

        public Criteria andObtainWayIsNull() {
            addCriterion("obtain_way is null");
            return (Criteria) this;
        }

        public Criteria andObtainWayIsNotNull() {
            addCriterion("obtain_way is not null");
            return (Criteria) this;
        }

        public Criteria andObtainWayEqualTo(Short value) {
            addCriterion("obtain_way =", value, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayNotEqualTo(Short value) {
            addCriterion("obtain_way <>", value, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayGreaterThan(Short value) {
            addCriterion("obtain_way >", value, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayGreaterThanOrEqualTo(Short value) {
            addCriterion("obtain_way >=", value, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayLessThan(Short value) {
            addCriterion("obtain_way <", value, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayLessThanOrEqualTo(Short value) {
            addCriterion("obtain_way <=", value, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayIn(List<Short> values) {
            addCriterion("obtain_way in", values, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayNotIn(List<Short> values) {
            addCriterion("obtain_way not in", values, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayBetween(Short value1, Short value2) {
            addCriterion("obtain_way between", value1, value2, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andObtainWayNotBetween(Short value1, Short value2) {
            addCriterion("obtain_way not between", value1, value2, "obtainWay");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameIsNull() {
            addCriterion("living_area_name is null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameIsNotNull() {
            addCriterion("living_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameEqualTo(String value) {
            addCriterion("living_area_name =", value, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameNotEqualTo(String value) {
            addCriterion("living_area_name <>", value, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameGreaterThan(String value) {
            addCriterion("living_area_name >", value, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("living_area_name >=", value, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameLessThan(String value) {
            addCriterion("living_area_name <", value, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameLessThanOrEqualTo(String value) {
            addCriterion("living_area_name <=", value, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameLike(String value) {
            addCriterion("living_area_name like", value, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameNotLike(String value) {
            addCriterion("living_area_name not like", value, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameIn(List<String> values) {
            addCriterion("living_area_name in", values, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameNotIn(List<String> values) {
            addCriterion("living_area_name not in", values, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameBetween(String value1, String value2) {
            addCriterion("living_area_name between", value1, value2, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNameNotBetween(String value1, String value2) {
            addCriterion("living_area_name not between", value1, value2, "livingAreaName");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIsNull() {
            addCriterion("survey_time is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIsNotNull() {
            addCriterion("survey_time is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeEqualTo(Date value) {
            addCriterion("survey_time =", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotEqualTo(Date value) {
            addCriterion("survey_time <>", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeGreaterThan(Date value) {
            addCriterion("survey_time >", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("survey_time >=", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLessThan(Date value) {
            addCriterion("survey_time <", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLessThanOrEqualTo(Date value) {
            addCriterion("survey_time <=", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIn(List<Date> values) {
            addCriterion("survey_time in", values, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotIn(List<Date> values) {
            addCriterion("survey_time not in", values, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeBetween(Date value1, Date value2) {
            addCriterion("survey_time between", value1, value2, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotBetween(Date value1, Date value2) {
            addCriterion("survey_time not between", value1, value2, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIsNull() {
            addCriterion("survey_id is null");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIsNotNull() {
            addCriterion("survey_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyIdEqualTo(String value) {
            addCriterion("survey_id =", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotEqualTo(String value) {
            addCriterion("survey_id <>", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdGreaterThan(String value) {
            addCriterion("survey_id >", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdGreaterThanOrEqualTo(String value) {
            addCriterion("survey_id >=", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLessThan(String value) {
            addCriterion("survey_id <", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLessThanOrEqualTo(String value) {
            addCriterion("survey_id <=", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLike(String value) {
            addCriterion("survey_id like", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotLike(String value) {
            addCriterion("survey_id not like", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIn(List<String> values) {
            addCriterion("survey_id in", values, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotIn(List<String> values) {
            addCriterion("survey_id not in", values, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdBetween(String value1, String value2) {
            addCriterion("survey_id between", value1, value2, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotBetween(String value1, String value2) {
            addCriterion("survey_id not between", value1, value2, "surveyId");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseIsNull() {
            addCriterion("is_only_house is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseIsNotNull() {
            addCriterion("is_only_house is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseEqualTo(Boolean value) {
            addCriterion("is_only_house =", value, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseNotEqualTo(Boolean value) {
            addCriterion("is_only_house <>", value, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseGreaterThan(Boolean value) {
            addCriterion("is_only_house >", value, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_only_house >=", value, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseLessThan(Boolean value) {
            addCriterion("is_only_house <", value, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseLessThanOrEqualTo(Boolean value) {
            addCriterion("is_only_house <=", value, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseIn(List<Boolean> values) {
            addCriterion("is_only_house in", values, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseNotIn(List<Boolean> values) {
            addCriterion("is_only_house not in", values, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseBetween(Boolean value1, Boolean value2) {
            addCriterion("is_only_house between", value1, value2, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsOnlyHouseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_only_house not between", value1, value2, "isOnlyHouse");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNull() {
            addCriterion("is_frozen is null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNotNull() {
            addCriterion("is_frozen is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenEqualTo(Boolean value) {
            addCriterion("is_frozen =", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotEqualTo(Boolean value) {
            addCriterion("is_frozen <>", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThan(Boolean value) {
            addCriterion("is_frozen >", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_frozen >=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThan(Boolean value) {
            addCriterion("is_frozen <", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThanOrEqualTo(Boolean value) {
            addCriterion("is_frozen <=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIn(List<Boolean> values) {
            addCriterion("is_frozen in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotIn(List<Boolean> values) {
            addCriterion("is_frozen not in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenBetween(Boolean value1, Boolean value2) {
            addCriterion("is_frozen between", value1, value2, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_frozen not between", value1, value2, "isFrozen");
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

        public Criteria andLandSourceEqualTo(String value) {
            addCriterion("land_source =", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceNotEqualTo(String value) {
            addCriterion("land_source <>", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceGreaterThan(String value) {
            addCriterion("land_source >", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceGreaterThanOrEqualTo(String value) {
            addCriterion("land_source >=", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceLessThan(String value) {
            addCriterion("land_source <", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceLessThanOrEqualTo(String value) {
            addCriterion("land_source <=", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceLike(String value) {
            addCriterion("land_source like", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceNotLike(String value) {
            addCriterion("land_source not like", value, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceIn(List<String> values) {
            addCriterion("land_source in", values, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceNotIn(List<String> values) {
            addCriterion("land_source not in", values, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceBetween(String value1, String value2) {
            addCriterion("land_source between", value1, value2, "landSource");
            return (Criteria) this;
        }

        public Criteria andLandSourceNotBetween(String value1, String value2) {
            addCriterion("land_source not between", value1, value2, "landSource");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldIsNull() {
            addCriterion("Is_house_jold is null");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldIsNotNull() {
            addCriterion("Is_house_jold is not null");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldEqualTo(Boolean value) {
            addCriterion("Is_house_jold =", value, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldNotEqualTo(Boolean value) {
            addCriterion("Is_house_jold <>", value, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldGreaterThan(Boolean value) {
            addCriterion("Is_house_jold >", value, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is_house_jold >=", value, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldLessThan(Boolean value) {
            addCriterion("Is_house_jold <", value, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldLessThanOrEqualTo(Boolean value) {
            addCriterion("Is_house_jold <=", value, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldIn(List<Boolean> values) {
            addCriterion("Is_house_jold in", values, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldNotIn(List<Boolean> values) {
            addCriterion("Is_house_jold not in", values, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_house_jold between", value1, value2, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsHouseJoldNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_house_jold not between", value1, value2, "isHouseJold");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentIsNull() {
            addCriterion("is_address_consistent is null");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentIsNotNull() {
            addCriterion("is_address_consistent is not null");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentEqualTo(Boolean value) {
            addCriterion("is_address_consistent =", value, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentNotEqualTo(Boolean value) {
            addCriterion("is_address_consistent <>", value, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentGreaterThan(Boolean value) {
            addCriterion("is_address_consistent >", value, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_address_consistent >=", value, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentLessThan(Boolean value) {
            addCriterion("is_address_consistent <", value, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_address_consistent <=", value, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentIn(List<Boolean> values) {
            addCriterion("is_address_consistent in", values, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentNotIn(List<Boolean> values) {
            addCriterion("is_address_consistent not in", values, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_address_consistent between", value1, value2, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andIsAddressConsistentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_address_consistent not between", value1, value2, "isAddressConsistent");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateIsNull() {
            addCriterion("house_card_certificate is null");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateIsNotNull() {
            addCriterion("house_card_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateEqualTo(String value) {
            addCriterion("house_card_certificate =", value, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateNotEqualTo(String value) {
            addCriterion("house_card_certificate <>", value, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateGreaterThan(String value) {
            addCriterion("house_card_certificate >", value, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("house_card_certificate >=", value, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateLessThan(String value) {
            addCriterion("house_card_certificate <", value, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateLessThanOrEqualTo(String value) {
            addCriterion("house_card_certificate <=", value, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateLike(String value) {
            addCriterion("house_card_certificate like", value, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateNotLike(String value) {
            addCriterion("house_card_certificate not like", value, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateIn(List<String> values) {
            addCriterion("house_card_certificate in", values, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateNotIn(List<String> values) {
            addCriterion("house_card_certificate not in", values, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateBetween(String value1, String value2) {
            addCriterion("house_card_certificate between", value1, value2, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseCardCertificateNotBetween(String value1, String value2) {
            addCriterion("house_card_certificate not between", value1, value2, "houseCardCertificate");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressIsNull() {
            addCriterion("house_finding_address is null");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressIsNotNull() {
            addCriterion("house_finding_address is not null");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressEqualTo(String value) {
            addCriterion("house_finding_address =", value, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressNotEqualTo(String value) {
            addCriterion("house_finding_address <>", value, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressGreaterThan(String value) {
            addCriterion("house_finding_address >", value, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("house_finding_address >=", value, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressLessThan(String value) {
            addCriterion("house_finding_address <", value, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressLessThanOrEqualTo(String value) {
            addCriterion("house_finding_address <=", value, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressLike(String value) {
            addCriterion("house_finding_address like", value, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressNotLike(String value) {
            addCriterion("house_finding_address not like", value, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressIn(List<String> values) {
            addCriterion("house_finding_address in", values, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressNotIn(List<String> values) {
            addCriterion("house_finding_address not in", values, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressBetween(String value1, String value2) {
            addCriterion("house_finding_address between", value1, value2, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andHouseFindingAddressNotBetween(String value1, String value2) {
            addCriterion("house_finding_address not between", value1, value2, "houseFindingAddress");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameIsNull() {
            addCriterion("proprietorship_name is null");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameIsNotNull() {
            addCriterion("proprietorship_name is not null");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameEqualTo(String value) {
            addCriterion("proprietorship_name =", value, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameNotEqualTo(String value) {
            addCriterion("proprietorship_name <>", value, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameGreaterThan(String value) {
            addCriterion("proprietorship_name >", value, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameGreaterThanOrEqualTo(String value) {
            addCriterion("proprietorship_name >=", value, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameLessThan(String value) {
            addCriterion("proprietorship_name <", value, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameLessThanOrEqualTo(String value) {
            addCriterion("proprietorship_name <=", value, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameLike(String value) {
            addCriterion("proprietorship_name like", value, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameNotLike(String value) {
            addCriterion("proprietorship_name not like", value, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameIn(List<String> values) {
            addCriterion("proprietorship_name in", values, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameNotIn(List<String> values) {
            addCriterion("proprietorship_name not in", values, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameBetween(String value1, String value2) {
            addCriterion("proprietorship_name between", value1, value2, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andProprietorshipNameNotBetween(String value1, String value2) {
            addCriterion("proprietorship_name not between", value1, value2, "proprietorshipName");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioIsNull() {
            addCriterion("house_survey_ratio is null");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioIsNotNull() {
            addCriterion("house_survey_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioEqualTo(Double value) {
            addCriterion("house_survey_ratio =", value, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioNotEqualTo(Double value) {
            addCriterion("house_survey_ratio <>", value, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioGreaterThan(Double value) {
            addCriterion("house_survey_ratio >", value, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("house_survey_ratio >=", value, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioLessThan(Double value) {
            addCriterion("house_survey_ratio <", value, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioLessThanOrEqualTo(Double value) {
            addCriterion("house_survey_ratio <=", value, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioIn(List<Double> values) {
            addCriterion("house_survey_ratio in", values, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioNotIn(List<Double> values) {
            addCriterion("house_survey_ratio not in", values, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioBetween(Double value1, Double value2) {
            addCriterion("house_survey_ratio between", value1, value2, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyRatioNotBetween(Double value1, Double value2) {
            addCriterion("house_survey_ratio not between", value1, value2, "houseSurveyRatio");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIsNull() {
            addCriterion("house_age is null");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIsNotNull() {
            addCriterion("house_age is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAgeEqualTo(Short value) {
            addCriterion("house_age =", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotEqualTo(Short value) {
            addCriterion("house_age <>", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeGreaterThan(Short value) {
            addCriterion("house_age >", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("house_age >=", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeLessThan(Short value) {
            addCriterion("house_age <", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeLessThanOrEqualTo(Short value) {
            addCriterion("house_age <=", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIn(List<Short> values) {
            addCriterion("house_age in", values, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotIn(List<Short> values) {
            addCriterion("house_age not in", values, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeBetween(Short value1, Short value2) {
            addCriterion("house_age between", value1, value2, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotBetween(Short value1, Short value2) {
            addCriterion("house_age not between", value1, value2, "houseAge");
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