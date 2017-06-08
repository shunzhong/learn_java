package com.mpd.api.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class AllocationInfo {
    private String id;

    private String createBy;

    private Date createDate;

    private Date allocationBegindate;

    private Date allocationEnddate;

    private BigDecimal allocationRatePercentage;

    private Short allocationState;

    private Short type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getAllocationBegindate() {
        return allocationBegindate;
    }

    public void setAllocationBegindate(Date allocationBegindate) {
        this.allocationBegindate = allocationBegindate;
    }

    public Date getAllocationEnddate() {
        return allocationEnddate;
    }

    public void setAllocationEnddate(Date allocationEnddate) {
        this.allocationEnddate = allocationEnddate;
    }

    public BigDecimal getAllocationRatePercentage() {
        return allocationRatePercentage;
    }

    public void setAllocationRatePercentage(BigDecimal allocationRatePercentage) {
        this.allocationRatePercentage = allocationRatePercentage;
    }

    public Short getAllocationState() {
        return allocationState;
    }

    public void setAllocationState(Short allocationState) {
        this.allocationState = allocationState;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }
}