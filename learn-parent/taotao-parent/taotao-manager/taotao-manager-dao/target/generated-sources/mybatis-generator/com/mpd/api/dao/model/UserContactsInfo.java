package com.mpd.api.dao.model;

import java.math.BigDecimal;

public class UserContactsInfo {
    private String id;

    private String contractName;

    private BigDecimal contractTelphone;

    private String contractAddress;

    private Short relationType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public BigDecimal getContractTelphone() {
        return contractTelphone;
    }

    public void setContractTelphone(BigDecimal contractTelphone) {
        this.contractTelphone = contractTelphone;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress == null ? null : contractAddress.trim();
    }

    public Short getRelationType() {
        return relationType;
    }

    public void setRelationType(Short relationType) {
        this.relationType = relationType;
    }
}