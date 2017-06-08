package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserJobInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserJobInfoExample() {
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

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDepartementIsNull() {
            addCriterion("departement is null");
            return (Criteria) this;
        }

        public Criteria andDepartementIsNotNull() {
            addCriterion("departement is not null");
            return (Criteria) this;
        }

        public Criteria andDepartementEqualTo(String value) {
            addCriterion("departement =", value, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementNotEqualTo(String value) {
            addCriterion("departement <>", value, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementGreaterThan(String value) {
            addCriterion("departement >", value, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementGreaterThanOrEqualTo(String value) {
            addCriterion("departement >=", value, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementLessThan(String value) {
            addCriterion("departement <", value, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementLessThanOrEqualTo(String value) {
            addCriterion("departement <=", value, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementLike(String value) {
            addCriterion("departement like", value, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementNotLike(String value) {
            addCriterion("departement not like", value, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementIn(List<String> values) {
            addCriterion("departement in", values, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementNotIn(List<String> values) {
            addCriterion("departement not in", values, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementBetween(String value1, String value2) {
            addCriterion("departement between", value1, value2, "departement");
            return (Criteria) this;
        }

        public Criteria andDepartementNotBetween(String value1, String value2) {
            addCriterion("departement not between", value1, value2, "departement");
            return (Criteria) this;
        }

        public Criteria andInductionDateIsNull() {
            addCriterion("induction_date is null");
            return (Criteria) this;
        }

        public Criteria andInductionDateIsNotNull() {
            addCriterion("induction_date is not null");
            return (Criteria) this;
        }

        public Criteria andInductionDateEqualTo(Date value) {
            addCriterionForJDBCDate("induction_date =", value, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("induction_date <>", value, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("induction_date >", value, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("induction_date >=", value, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateLessThan(Date value) {
            addCriterionForJDBCDate("induction_date <", value, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("induction_date <=", value, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateIn(List<Date> values) {
            addCriterionForJDBCDate("induction_date in", values, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("induction_date not in", values, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("induction_date between", value1, value2, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andInductionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("induction_date not between", value1, value2, "inductionDate");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceIsNull() {
            addCriterion("is_social_insurance is null");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceIsNotNull() {
            addCriterion("is_social_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceEqualTo(Boolean value) {
            addCriterion("is_social_insurance =", value, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceNotEqualTo(Boolean value) {
            addCriterion("is_social_insurance <>", value, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceGreaterThan(Boolean value) {
            addCriterion("is_social_insurance >", value, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_social_insurance >=", value, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceLessThan(Boolean value) {
            addCriterion("is_social_insurance <", value, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceLessThanOrEqualTo(Boolean value) {
            addCriterion("is_social_insurance <=", value, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceIn(List<Boolean> values) {
            addCriterion("is_social_insurance in", values, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceNotIn(List<Boolean> values) {
            addCriterion("is_social_insurance not in", values, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceBetween(Boolean value1, Boolean value2) {
            addCriterion("is_social_insurance between", value1, value2, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andIsSocialInsuranceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_social_insurance not between", value1, value2, "isSocialInsurance");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeIsNull() {
            addCriterion("annual_income is null");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeIsNotNull() {
            addCriterion("annual_income is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeEqualTo(Float value) {
            addCriterion("annual_income =", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeNotEqualTo(Float value) {
            addCriterion("annual_income <>", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeGreaterThan(Float value) {
            addCriterion("annual_income >", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("annual_income >=", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeLessThan(Float value) {
            addCriterion("annual_income <", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeLessThanOrEqualTo(Float value) {
            addCriterion("annual_income <=", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeIn(List<Float> values) {
            addCriterion("annual_income in", values, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeNotIn(List<Float> values) {
            addCriterion("annual_income not in", values, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeBetween(Float value1, Float value2) {
            addCriterion("annual_income between", value1, value2, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeNotBetween(Float value1, Float value2) {
            addCriterion("annual_income not between", value1, value2, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeIsNull() {
            addCriterion("family_income is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeIsNotNull() {
            addCriterion("family_income is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeEqualTo(Float value) {
            addCriterion("family_income =", value, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeNotEqualTo(Float value) {
            addCriterion("family_income <>", value, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeGreaterThan(Float value) {
            addCriterion("family_income >", value, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("family_income >=", value, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeLessThan(Float value) {
            addCriterion("family_income <", value, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeLessThanOrEqualTo(Float value) {
            addCriterion("family_income <=", value, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeIn(List<Float> values) {
            addCriterion("family_income in", values, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeNotIn(List<Float> values) {
            addCriterion("family_income not in", values, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeBetween(Float value1, Float value2) {
            addCriterion("family_income between", value1, value2, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andFamilyIncomeNotBetween(Float value1, Float value2) {
            addCriterion("family_income not between", value1, value2, "familyIncome");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsIsNull() {
            addCriterion("social_insurance_years is null");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsIsNotNull() {
            addCriterion("social_insurance_years is not null");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsEqualTo(Short value) {
            addCriterion("social_insurance_years =", value, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsNotEqualTo(Short value) {
            addCriterion("social_insurance_years <>", value, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsGreaterThan(Short value) {
            addCriterion("social_insurance_years >", value, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsGreaterThanOrEqualTo(Short value) {
            addCriterion("social_insurance_years >=", value, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsLessThan(Short value) {
            addCriterion("social_insurance_years <", value, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsLessThanOrEqualTo(Short value) {
            addCriterion("social_insurance_years <=", value, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsIn(List<Short> values) {
            addCriterion("social_insurance_years in", values, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsNotIn(List<Short> values) {
            addCriterion("social_insurance_years not in", values, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsBetween(Short value1, Short value2) {
            addCriterion("social_insurance_years between", value1, value2, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceYearsNotBetween(Short value1, Short value2) {
            addCriterion("social_insurance_years not between", value1, value2, "socialInsuranceYears");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andOndustryIsNull() {
            addCriterion("ondustry is null");
            return (Criteria) this;
        }

        public Criteria andOndustryIsNotNull() {
            addCriterion("ondustry is not null");
            return (Criteria) this;
        }

        public Criteria andOndustryEqualTo(String value) {
            addCriterion("ondustry =", value, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryNotEqualTo(String value) {
            addCriterion("ondustry <>", value, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryGreaterThan(String value) {
            addCriterion("ondustry >", value, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryGreaterThanOrEqualTo(String value) {
            addCriterion("ondustry >=", value, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryLessThan(String value) {
            addCriterion("ondustry <", value, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryLessThanOrEqualTo(String value) {
            addCriterion("ondustry <=", value, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryLike(String value) {
            addCriterion("ondustry like", value, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryNotLike(String value) {
            addCriterion("ondustry not like", value, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryIn(List<String> values) {
            addCriterion("ondustry in", values, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryNotIn(List<String> values) {
            addCriterion("ondustry not in", values, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryBetween(String value1, String value2) {
            addCriterion("ondustry between", value1, value2, "ondustry");
            return (Criteria) this;
        }

        public Criteria andOndustryNotBetween(String value1, String value2) {
            addCriterion("ondustry not between", value1, value2, "ondustry");
            return (Criteria) this;
        }

        public Criteria andColleagueNameIsNull() {
            addCriterion("colleague_name is null");
            return (Criteria) this;
        }

        public Criteria andColleagueNameIsNotNull() {
            addCriterion("colleague_name is not null");
            return (Criteria) this;
        }

        public Criteria andColleagueNameEqualTo(String value) {
            addCriterion("colleague_name =", value, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameNotEqualTo(String value) {
            addCriterion("colleague_name <>", value, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameGreaterThan(String value) {
            addCriterion("colleague_name >", value, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameGreaterThanOrEqualTo(String value) {
            addCriterion("colleague_name >=", value, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameLessThan(String value) {
            addCriterion("colleague_name <", value, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameLessThanOrEqualTo(String value) {
            addCriterion("colleague_name <=", value, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameLike(String value) {
            addCriterion("colleague_name like", value, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameNotLike(String value) {
            addCriterion("colleague_name not like", value, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameIn(List<String> values) {
            addCriterion("colleague_name in", values, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameNotIn(List<String> values) {
            addCriterion("colleague_name not in", values, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameBetween(String value1, String value2) {
            addCriterion("colleague_name between", value1, value2, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNameNotBetween(String value1, String value2) {
            addCriterion("colleague_name not between", value1, value2, "colleagueName");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberIsNull() {
            addCriterion("colleague_number is null");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberIsNotNull() {
            addCriterion("colleague_number is not null");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberEqualTo(BigDecimal value) {
            addCriterion("colleague_number =", value, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberNotEqualTo(BigDecimal value) {
            addCriterion("colleague_number <>", value, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberGreaterThan(BigDecimal value) {
            addCriterion("colleague_number >", value, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("colleague_number >=", value, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberLessThan(BigDecimal value) {
            addCriterion("colleague_number <", value, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("colleague_number <=", value, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberIn(List<BigDecimal> values) {
            addCriterion("colleague_number in", values, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberNotIn(List<BigDecimal> values) {
            addCriterion("colleague_number not in", values, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("colleague_number between", value1, value2, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andColleagueNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("colleague_number not between", value1, value2, "colleagueNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNull() {
            addCriterion("job_type is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("job_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(Short value) {
            addCriterion("job_type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(Short value) {
            addCriterion("job_type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(Short value) {
            addCriterion("job_type >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("job_type >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(Short value) {
            addCriterion("job_type <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(Short value) {
            addCriterion("job_type <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<Short> values) {
            addCriterion("job_type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<Short> values) {
            addCriterion("job_type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(Short value1, Short value2) {
            addCriterion("job_type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(Short value1, Short value2) {
            addCriterion("job_type not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobPropertyIsNull() {
            addCriterion("job_property is null");
            return (Criteria) this;
        }

        public Criteria andJobPropertyIsNotNull() {
            addCriterion("job_property is not null");
            return (Criteria) this;
        }

        public Criteria andJobPropertyEqualTo(Short value) {
            addCriterion("job_property =", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyNotEqualTo(Short value) {
            addCriterion("job_property <>", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyGreaterThan(Short value) {
            addCriterion("job_property >", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyGreaterThanOrEqualTo(Short value) {
            addCriterion("job_property >=", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyLessThan(Short value) {
            addCriterion("job_property <", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyLessThanOrEqualTo(Short value) {
            addCriterion("job_property <=", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyIn(List<Short> values) {
            addCriterion("job_property in", values, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyNotIn(List<Short> values) {
            addCriterion("job_property not in", values, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyBetween(Short value1, Short value2) {
            addCriterion("job_property between", value1, value2, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyNotBetween(Short value1, Short value2) {
            addCriterion("job_property not between", value1, value2, "jobProperty");
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