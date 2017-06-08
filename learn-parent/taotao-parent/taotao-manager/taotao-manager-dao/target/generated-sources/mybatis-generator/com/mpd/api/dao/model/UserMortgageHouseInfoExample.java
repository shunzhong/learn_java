package com.mpd.api.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserMortgageHouseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMortgageHouseInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_Id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_Id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_Id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_Id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_Id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_Id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_Id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_Id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_Id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_Id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_Id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_Id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_Id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_Id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusIsNull() {
            addCriterion("mortgage_status is null");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusIsNotNull() {
            addCriterion("mortgage_status is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusEqualTo(Byte value) {
            addCriterion("mortgage_status =", value, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusNotEqualTo(Byte value) {
            addCriterion("mortgage_status <>", value, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusGreaterThan(Byte value) {
            addCriterion("mortgage_status >", value, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mortgage_status >=", value, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusLessThan(Byte value) {
            addCriterion("mortgage_status <", value, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusLessThanOrEqualTo(Byte value) {
            addCriterion("mortgage_status <=", value, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusIn(List<Byte> values) {
            addCriterion("mortgage_status in", values, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusNotIn(List<Byte> values) {
            addCriterion("mortgage_status not in", values, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusBetween(Byte value1, Byte value2) {
            addCriterion("mortgage_status between", value1, value2, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("mortgage_status not between", value1, value2, "mortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageDateIsNull() {
            addCriterion("mortgage_date is null");
            return (Criteria) this;
        }

        public Criteria andMortgageDateIsNotNull() {
            addCriterion("mortgage_date is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageDateEqualTo(Date value) {
            addCriterion("mortgage_date =", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateNotEqualTo(Date value) {
            addCriterion("mortgage_date <>", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateGreaterThan(Date value) {
            addCriterion("mortgage_date >", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mortgage_date >=", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateLessThan(Date value) {
            addCriterion("mortgage_date <", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateLessThanOrEqualTo(Date value) {
            addCriterion("mortgage_date <=", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateIn(List<Date> values) {
            addCriterion("mortgage_date in", values, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateNotIn(List<Date> values) {
            addCriterion("mortgage_date not in", values, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateBetween(Date value1, Date value2) {
            addCriterion("mortgage_date between", value1, value2, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateNotBetween(Date value1, Date value2) {
            addCriterion("mortgage_date not between", value1, value2, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNull() {
            addCriterion("handler is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("handler is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("handler =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("handler <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("handler >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("handler >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("handler <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("handler <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("handler like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("handler not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("handler in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("handler not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("handler between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("handler not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andMortgageFileIsNull() {
            addCriterion("mortgage_file is null");
            return (Criteria) this;
        }

        public Criteria andMortgageFileIsNotNull() {
            addCriterion("mortgage_file is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageFileEqualTo(String value) {
            addCriterion("mortgage_file =", value, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileNotEqualTo(String value) {
            addCriterion("mortgage_file <>", value, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileGreaterThan(String value) {
            addCriterion("mortgage_file >", value, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_file >=", value, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileLessThan(String value) {
            addCriterion("mortgage_file <", value, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileLessThanOrEqualTo(String value) {
            addCriterion("mortgage_file <=", value, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileLike(String value) {
            addCriterion("mortgage_file like", value, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileNotLike(String value) {
            addCriterion("mortgage_file not like", value, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileIn(List<String> values) {
            addCriterion("mortgage_file in", values, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileNotIn(List<String> values) {
            addCriterion("mortgage_file not in", values, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileBetween(String value1, String value2) {
            addCriterion("mortgage_file between", value1, value2, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andMortgageFileNotBetween(String value1, String value2) {
            addCriterion("mortgage_file not between", value1, value2, "mortgageFile");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkIsNull() {
            addCriterion("approve_remark is null");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkIsNotNull() {
            addCriterion("approve_remark is not null");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkEqualTo(String value) {
            addCriterion("approve_remark =", value, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkNotEqualTo(String value) {
            addCriterion("approve_remark <>", value, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkGreaterThan(String value) {
            addCriterion("approve_remark >", value, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("approve_remark >=", value, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkLessThan(String value) {
            addCriterion("approve_remark <", value, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkLessThanOrEqualTo(String value) {
            addCriterion("approve_remark <=", value, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkLike(String value) {
            addCriterion("approve_remark like", value, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkNotLike(String value) {
            addCriterion("approve_remark not like", value, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkIn(List<String> values) {
            addCriterion("approve_remark in", values, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkNotIn(List<String> values) {
            addCriterion("approve_remark not in", values, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkBetween(String value1, String value2) {
            addCriterion("approve_remark between", value1, value2, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andApproveRemarkNotBetween(String value1, String value2) {
            addCriterion("approve_remark not between", value1, value2, "approveRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeIsNull() {
            addCriterion("mortgage_type is null");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeIsNotNull() {
            addCriterion("mortgage_type is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeEqualTo(Byte value) {
            addCriterion("mortgage_type =", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeNotEqualTo(Byte value) {
            addCriterion("mortgage_type <>", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeGreaterThan(Byte value) {
            addCriterion("mortgage_type >", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("mortgage_type >=", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeLessThan(Byte value) {
            addCriterion("mortgage_type <", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeLessThanOrEqualTo(Byte value) {
            addCriterion("mortgage_type <=", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeIn(List<Byte> values) {
            addCriterion("mortgage_type in", values, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeNotIn(List<Byte> values) {
            addCriterion("mortgage_type not in", values, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeBetween(Byte value1, Byte value2) {
            addCriterion("mortgage_type between", value1, value2, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("mortgage_type not between", value1, value2, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeIsNull() {
            addCriterion("mortgage_obj_type is null");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeIsNotNull() {
            addCriterion("mortgage_obj_type is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeEqualTo(Byte value) {
            addCriterion("mortgage_obj_type =", value, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeNotEqualTo(Byte value) {
            addCriterion("mortgage_obj_type <>", value, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeGreaterThan(Byte value) {
            addCriterion("mortgage_obj_type >", value, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("mortgage_obj_type >=", value, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeLessThan(Byte value) {
            addCriterion("mortgage_obj_type <", value, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeLessThanOrEqualTo(Byte value) {
            addCriterion("mortgage_obj_type <=", value, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeIn(List<Byte> values) {
            addCriterion("mortgage_obj_type in", values, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeNotIn(List<Byte> values) {
            addCriterion("mortgage_obj_type not in", values, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeBetween(Byte value1, Byte value2) {
            addCriterion("mortgage_obj_type between", value1, value2, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageObjTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("mortgage_obj_type not between", value1, value2, "mortgageObjType");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkIsNull() {
            addCriterion("mortgage_remark is null");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkIsNotNull() {
            addCriterion("mortgage_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkEqualTo(String value) {
            addCriterion("mortgage_remark =", value, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkNotEqualTo(String value) {
            addCriterion("mortgage_remark <>", value, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkGreaterThan(String value) {
            addCriterion("mortgage_remark >", value, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_remark >=", value, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkLessThan(String value) {
            addCriterion("mortgage_remark <", value, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkLessThanOrEqualTo(String value) {
            addCriterion("mortgage_remark <=", value, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkLike(String value) {
            addCriterion("mortgage_remark like", value, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkNotLike(String value) {
            addCriterion("mortgage_remark not like", value, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkIn(List<String> values) {
            addCriterion("mortgage_remark in", values, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkNotIn(List<String> values) {
            addCriterion("mortgage_remark not in", values, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkBetween(String value1, String value2) {
            addCriterion("mortgage_remark between", value1, value2, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andMortgageRemarkNotBetween(String value1, String value2) {
            addCriterion("mortgage_remark not between", value1, value2, "mortgageRemark");
            return (Criteria) this;
        }

        public Criteria andCancellationDateIsNull() {
            addCriterion("cancellation_date is null");
            return (Criteria) this;
        }

        public Criteria andCancellationDateIsNotNull() {
            addCriterion("cancellation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancellationDateEqualTo(Date value) {
            addCriterionForJDBCDate("cancellation_date =", value, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cancellation_date <>", value, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("cancellation_date >", value, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cancellation_date >=", value, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateLessThan(Date value) {
            addCriterionForJDBCDate("cancellation_date <", value, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cancellation_date <=", value, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateIn(List<Date> values) {
            addCriterionForJDBCDate("cancellation_date in", values, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cancellation_date not in", values, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cancellation_date between", value1, value2, "cancellationDate");
            return (Criteria) this;
        }

        public Criteria andCancellationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cancellation_date not between", value1, value2, "cancellationDate");
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