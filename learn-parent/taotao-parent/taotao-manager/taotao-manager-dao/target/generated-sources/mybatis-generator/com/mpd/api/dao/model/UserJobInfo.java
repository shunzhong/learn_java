package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserJobInfo {
    private String id;

    private String position;

    private String departement;

    private Date inductionDate;

    private Boolean isSocialInsurance;

    private Float annualIncome;

    private Float familyIncome;

    private Short socialInsuranceYears;

    private String companyName;

    private String companyPhone;

    private String ondustry;

    private String colleagueName;

    private BigDecimal colleagueNumber;

    private String companyAddress;

    private Short jobType;

    private Short jobProperty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement == null ? null : departement.trim();
    }

    public Date getInductionDate() {
        return inductionDate;
    }

    public void setInductionDate(Date inductionDate) {
        this.inductionDate = inductionDate;
    }

    public Boolean getIsSocialInsurance() {
        return isSocialInsurance;
    }

    public void setIsSocialInsurance(Boolean isSocialInsurance) {
        this.isSocialInsurance = isSocialInsurance;
    }

    public Float getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Float annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Float getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(Float familyIncome) {
        this.familyIncome = familyIncome;
    }

    public Short getSocialInsuranceYears() {
        return socialInsuranceYears;
    }

    public void setSocialInsuranceYears(Short socialInsuranceYears) {
        this.socialInsuranceYears = socialInsuranceYears;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getOndustry() {
        return ondustry;
    }

    public void setOndustry(String ondustry) {
        this.ondustry = ondustry == null ? null : ondustry.trim();
    }

    public String getColleagueName() {
        return colleagueName;
    }

    public void setColleagueName(String colleagueName) {
        this.colleagueName = colleagueName == null ? null : colleagueName.trim();
    }

    public BigDecimal getColleagueNumber() {
        return colleagueNumber;
    }

    public void setColleagueNumber(BigDecimal colleagueNumber) {
        this.colleagueNumber = colleagueNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public Short getJobType() {
        return jobType;
    }

    public void setJobType(Short jobType) {
        this.jobType = jobType;
    }

    public Short getJobProperty() {
        return jobProperty;
    }

    public void setJobProperty(Short jobProperty) {
        this.jobProperty = jobProperty;
    }
}