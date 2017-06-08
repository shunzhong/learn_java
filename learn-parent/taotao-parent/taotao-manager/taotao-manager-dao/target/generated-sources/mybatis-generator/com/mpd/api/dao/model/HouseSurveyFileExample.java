package com.mpd.api.dao.model;

import java.util.ArrayList;
import java.util.List;

public class HouseSurveyFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseSurveyFileExample() {
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

        public Criteria andHouseSurveyIdIsNull() {
            addCriterion("house_survey_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdIsNotNull() {
            addCriterion("house_survey_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdEqualTo(Integer value) {
            addCriterion("house_survey_id =", value, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdNotEqualTo(Integer value) {
            addCriterion("house_survey_id <>", value, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdGreaterThan(Integer value) {
            addCriterion("house_survey_id >", value, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_survey_id >=", value, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdLessThan(Integer value) {
            addCriterion("house_survey_id <", value, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_survey_id <=", value, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdIn(List<Integer> values) {
            addCriterion("house_survey_id in", values, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdNotIn(List<Integer> values) {
            addCriterion("house_survey_id not in", values, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdBetween(Integer value1, Integer value2) {
            addCriterion("house_survey_id between", value1, value2, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andHouseSurveyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_survey_id not between", value1, value2, "houseSurveyId");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIsNull() {
            addCriterion("identity_card_front is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIsNotNull() {
            addCriterion("identity_card_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontEqualTo(String value) {
            addCriterion("identity_card_front =", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotEqualTo(String value) {
            addCriterion("identity_card_front <>", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontGreaterThan(String value) {
            addCriterion("identity_card_front >", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card_front >=", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLessThan(String value) {
            addCriterion("identity_card_front <", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLessThanOrEqualTo(String value) {
            addCriterion("identity_card_front <=", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLike(String value) {
            addCriterion("identity_card_front like", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotLike(String value) {
            addCriterion("identity_card_front not like", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIn(List<String> values) {
            addCriterion("identity_card_front in", values, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotIn(List<String> values) {
            addCriterion("identity_card_front not in", values, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontBetween(String value1, String value2) {
            addCriterion("identity_card_front between", value1, value2, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotBetween(String value1, String value2) {
            addCriterion("identity_card_front not between", value1, value2, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackIsNull() {
            addCriterion("identity_card_back is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackIsNotNull() {
            addCriterion("identity_card_back is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackEqualTo(String value) {
            addCriterion("identity_card_back =", value, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackNotEqualTo(String value) {
            addCriterion("identity_card_back <>", value, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackGreaterThan(String value) {
            addCriterion("identity_card_back >", value, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card_back >=", value, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackLessThan(String value) {
            addCriterion("identity_card_back <", value, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackLessThanOrEqualTo(String value) {
            addCriterion("identity_card_back <=", value, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackLike(String value) {
            addCriterion("identity_card_back like", value, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackNotLike(String value) {
            addCriterion("identity_card_back not like", value, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackIn(List<String> values) {
            addCriterion("identity_card_back in", values, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackNotIn(List<String> values) {
            addCriterion("identity_card_back not in", values, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackBetween(String value1, String value2) {
            addCriterion("identity_card_back between", value1, value2, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBackNotBetween(String value1, String value2) {
            addCriterion("identity_card_back not between", value1, value2, "identityCardBack");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldIsNull() {
            addCriterion("identity_hold is null");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldIsNotNull() {
            addCriterion("identity_hold is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldEqualTo(String value) {
            addCriterion("identity_hold =", value, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldNotEqualTo(String value) {
            addCriterion("identity_hold <>", value, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldGreaterThan(String value) {
            addCriterion("identity_hold >", value, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldGreaterThanOrEqualTo(String value) {
            addCriterion("identity_hold >=", value, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldLessThan(String value) {
            addCriterion("identity_hold <", value, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldLessThanOrEqualTo(String value) {
            addCriterion("identity_hold <=", value, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldLike(String value) {
            addCriterion("identity_hold like", value, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldNotLike(String value) {
            addCriterion("identity_hold not like", value, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldIn(List<String> values) {
            addCriterion("identity_hold in", values, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldNotIn(List<String> values) {
            addCriterion("identity_hold not in", values, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldBetween(String value1, String value2) {
            addCriterion("identity_hold between", value1, value2, "identityHold");
            return (Criteria) this;
        }

        public Criteria andIdentityHoldNotBetween(String value1, String value2) {
            addCriterion("identity_hold not between", value1, value2, "identityHold");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateIsNull() {
            addCriterion("marriage_certificate is null");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateIsNotNull() {
            addCriterion("marriage_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateEqualTo(String value) {
            addCriterion("marriage_certificate =", value, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateNotEqualTo(String value) {
            addCriterion("marriage_certificate <>", value, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateGreaterThan(String value) {
            addCriterion("marriage_certificate >", value, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("marriage_certificate >=", value, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateLessThan(String value) {
            addCriterion("marriage_certificate <", value, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateLessThanOrEqualTo(String value) {
            addCriterion("marriage_certificate <=", value, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateLike(String value) {
            addCriterion("marriage_certificate like", value, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateNotLike(String value) {
            addCriterion("marriage_certificate not like", value, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateIn(List<String> values) {
            addCriterion("marriage_certificate in", values, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateNotIn(List<String> values) {
            addCriterion("marriage_certificate not in", values, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateBetween(String value1, String value2) {
            addCriterion("marriage_certificate between", value1, value2, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andMarriageCertificateNotBetween(String value1, String value2) {
            addCriterion("marriage_certificate not between", value1, value2, "marriageCertificate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateIsNull() {
            addCriterion("living_area_gate is null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateIsNotNull() {
            addCriterion("living_area_gate is not null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateEqualTo(String value) {
            addCriterion("living_area_gate =", value, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateNotEqualTo(String value) {
            addCriterion("living_area_gate <>", value, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateGreaterThan(String value) {
            addCriterion("living_area_gate >", value, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateGreaterThanOrEqualTo(String value) {
            addCriterion("living_area_gate >=", value, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateLessThan(String value) {
            addCriterion("living_area_gate <", value, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateLessThanOrEqualTo(String value) {
            addCriterion("living_area_gate <=", value, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateLike(String value) {
            addCriterion("living_area_gate like", value, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateNotLike(String value) {
            addCriterion("living_area_gate not like", value, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateIn(List<String> values) {
            addCriterion("living_area_gate in", values, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateNotIn(List<String> values) {
            addCriterion("living_area_gate not in", values, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateBetween(String value1, String value2) {
            addCriterion("living_area_gate between", value1, value2, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGateNotBetween(String value1, String value2) {
            addCriterion("living_area_gate not between", value1, value2, "livingAreaGate");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundIsNull() {
            addCriterion("living_area_around is null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundIsNotNull() {
            addCriterion("living_area_around is not null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundEqualTo(String value) {
            addCriterion("living_area_around =", value, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundNotEqualTo(String value) {
            addCriterion("living_area_around <>", value, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundGreaterThan(String value) {
            addCriterion("living_area_around >", value, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundGreaterThanOrEqualTo(String value) {
            addCriterion("living_area_around >=", value, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundLessThan(String value) {
            addCriterion("living_area_around <", value, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundLessThanOrEqualTo(String value) {
            addCriterion("living_area_around <=", value, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundLike(String value) {
            addCriterion("living_area_around like", value, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundNotLike(String value) {
            addCriterion("living_area_around not like", value, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundIn(List<String> values) {
            addCriterion("living_area_around in", values, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundNotIn(List<String> values) {
            addCriterion("living_area_around not in", values, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundBetween(String value1, String value2) {
            addCriterion("living_area_around between", value1, value2, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaAroundNotBetween(String value1, String value2) {
            addCriterion("living_area_around not between", value1, value2, "livingAreaAround");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerIsNull() {
            addCriterion("living_area_inner is null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerIsNotNull() {
            addCriterion("living_area_inner is not null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerEqualTo(String value) {
            addCriterion("living_area_inner =", value, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerNotEqualTo(String value) {
            addCriterion("living_area_inner <>", value, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerGreaterThan(String value) {
            addCriterion("living_area_inner >", value, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerGreaterThanOrEqualTo(String value) {
            addCriterion("living_area_inner >=", value, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerLessThan(String value) {
            addCriterion("living_area_inner <", value, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerLessThanOrEqualTo(String value) {
            addCriterion("living_area_inner <=", value, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerLike(String value) {
            addCriterion("living_area_inner like", value, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerNotLike(String value) {
            addCriterion("living_area_inner not like", value, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerIn(List<String> values) {
            addCriterion("living_area_inner in", values, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerNotIn(List<String> values) {
            addCriterion("living_area_inner not in", values, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerBetween(String value1, String value2) {
            addCriterion("living_area_inner between", value1, value2, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andLivingAreaInnerNotBetween(String value1, String value2) {
            addCriterion("living_area_inner not between", value1, value2, "livingAreaInner");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIsNull() {
            addCriterion("house_number is null");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIsNotNull() {
            addCriterion("house_number is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNumberEqualTo(String value) {
            addCriterion("house_number =", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotEqualTo(String value) {
            addCriterion("house_number <>", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberGreaterThan(String value) {
            addCriterion("house_number >", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("house_number >=", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLessThan(String value) {
            addCriterion("house_number <", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLessThanOrEqualTo(String value) {
            addCriterion("house_number <=", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLike(String value) {
            addCriterion("house_number like", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotLike(String value) {
            addCriterion("house_number not like", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIn(List<String> values) {
            addCriterion("house_number in", values, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotIn(List<String> values) {
            addCriterion("house_number not in", values, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberBetween(String value1, String value2) {
            addCriterion("house_number between", value1, value2, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotBetween(String value1, String value2) {
            addCriterion("house_number not between", value1, value2, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andSittingRoomIsNull() {
            addCriterion("sitting_room is null");
            return (Criteria) this;
        }

        public Criteria andSittingRoomIsNotNull() {
            addCriterion("sitting_room is not null");
            return (Criteria) this;
        }

        public Criteria andSittingRoomEqualTo(String value) {
            addCriterion("sitting_room =", value, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomNotEqualTo(String value) {
            addCriterion("sitting_room <>", value, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomGreaterThan(String value) {
            addCriterion("sitting_room >", value, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomGreaterThanOrEqualTo(String value) {
            addCriterion("sitting_room >=", value, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomLessThan(String value) {
            addCriterion("sitting_room <", value, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomLessThanOrEqualTo(String value) {
            addCriterion("sitting_room <=", value, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomLike(String value) {
            addCriterion("sitting_room like", value, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomNotLike(String value) {
            addCriterion("sitting_room not like", value, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomIn(List<String> values) {
            addCriterion("sitting_room in", values, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomNotIn(List<String> values) {
            addCriterion("sitting_room not in", values, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomBetween(String value1, String value2) {
            addCriterion("sitting_room between", value1, value2, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andSittingRoomNotBetween(String value1, String value2) {
            addCriterion("sitting_room not between", value1, value2, "sittingRoom");
            return (Criteria) this;
        }

        public Criteria andBedrooomIsNull() {
            addCriterion("bedrooom is null");
            return (Criteria) this;
        }

        public Criteria andBedrooomIsNotNull() {
            addCriterion("bedrooom is not null");
            return (Criteria) this;
        }

        public Criteria andBedrooomEqualTo(String value) {
            addCriterion("bedrooom =", value, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomNotEqualTo(String value) {
            addCriterion("bedrooom <>", value, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomGreaterThan(String value) {
            addCriterion("bedrooom >", value, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomGreaterThanOrEqualTo(String value) {
            addCriterion("bedrooom >=", value, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomLessThan(String value) {
            addCriterion("bedrooom <", value, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomLessThanOrEqualTo(String value) {
            addCriterion("bedrooom <=", value, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomLike(String value) {
            addCriterion("bedrooom like", value, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomNotLike(String value) {
            addCriterion("bedrooom not like", value, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomIn(List<String> values) {
            addCriterion("bedrooom in", values, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomNotIn(List<String> values) {
            addCriterion("bedrooom not in", values, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomBetween(String value1, String value2) {
            addCriterion("bedrooom between", value1, value2, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andBedrooomNotBetween(String value1, String value2) {
            addCriterion("bedrooom not between", value1, value2, "bedrooom");
            return (Criteria) this;
        }

        public Criteria andKitchenIsNull() {
            addCriterion("kitchen is null");
            return (Criteria) this;
        }

        public Criteria andKitchenIsNotNull() {
            addCriterion("kitchen is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenEqualTo(String value) {
            addCriterion("kitchen =", value, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenNotEqualTo(String value) {
            addCriterion("kitchen <>", value, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenGreaterThan(String value) {
            addCriterion("kitchen >", value, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenGreaterThanOrEqualTo(String value) {
            addCriterion("kitchen >=", value, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenLessThan(String value) {
            addCriterion("kitchen <", value, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenLessThanOrEqualTo(String value) {
            addCriterion("kitchen <=", value, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenLike(String value) {
            addCriterion("kitchen like", value, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenNotLike(String value) {
            addCriterion("kitchen not like", value, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenIn(List<String> values) {
            addCriterion("kitchen in", values, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenNotIn(List<String> values) {
            addCriterion("kitchen not in", values, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenBetween(String value1, String value2) {
            addCriterion("kitchen between", value1, value2, "kitchen");
            return (Criteria) this;
        }

        public Criteria andKitchenNotBetween(String value1, String value2) {
            addCriterion("kitchen not between", value1, value2, "kitchen");
            return (Criteria) this;
        }

        public Criteria andBathroomIsNull() {
            addCriterion("bathroom is null");
            return (Criteria) this;
        }

        public Criteria andBathroomIsNotNull() {
            addCriterion("bathroom is not null");
            return (Criteria) this;
        }

        public Criteria andBathroomEqualTo(String value) {
            addCriterion("bathroom =", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomNotEqualTo(String value) {
            addCriterion("bathroom <>", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomGreaterThan(String value) {
            addCriterion("bathroom >", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomGreaterThanOrEqualTo(String value) {
            addCriterion("bathroom >=", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomLessThan(String value) {
            addCriterion("bathroom <", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomLessThanOrEqualTo(String value) {
            addCriterion("bathroom <=", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomLike(String value) {
            addCriterion("bathroom like", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomNotLike(String value) {
            addCriterion("bathroom not like", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomIn(List<String> values) {
            addCriterion("bathroom in", values, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomNotIn(List<String> values) {
            addCriterion("bathroom not in", values, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomBetween(String value1, String value2) {
            addCriterion("bathroom between", value1, value2, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomNotBetween(String value1, String value2) {
            addCriterion("bathroom not between", value1, value2, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBalconyIsNull() {
            addCriterion("balcony is null");
            return (Criteria) this;
        }

        public Criteria andBalconyIsNotNull() {
            addCriterion("balcony is not null");
            return (Criteria) this;
        }

        public Criteria andBalconyEqualTo(String value) {
            addCriterion("balcony =", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyNotEqualTo(String value) {
            addCriterion("balcony <>", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyGreaterThan(String value) {
            addCriterion("balcony >", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyGreaterThanOrEqualTo(String value) {
            addCriterion("balcony >=", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyLessThan(String value) {
            addCriterion("balcony <", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyLessThanOrEqualTo(String value) {
            addCriterion("balcony <=", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyLike(String value) {
            addCriterion("balcony like", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyNotLike(String value) {
            addCriterion("balcony not like", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyIn(List<String> values) {
            addCriterion("balcony in", values, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyNotIn(List<String> values) {
            addCriterion("balcony not in", values, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyBetween(String value1, String value2) {
            addCriterion("balcony between", value1, value2, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyNotBetween(String value1, String value2) {
            addCriterion("balcony not between", value1, value2, "balcony");
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