package com.mpd.api.dao.model;

import java.math.BigDecimal;

public class Task {
    private String id;

    private String name;

    private String taskCode;

    private String nextTaskCode;

    private String lastTaskCode;

    private BigDecimal xPosition;

    private BigDecimal yPosition;

    private String lasterCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    public String getNextTaskCode() {
        return nextTaskCode;
    }

    public void setNextTaskCode(String nextTaskCode) {
        this.nextTaskCode = nextTaskCode == null ? null : nextTaskCode.trim();
    }

    public String getLastTaskCode() {
        return lastTaskCode;
    }

    public void setLastTaskCode(String lastTaskCode) {
        this.lastTaskCode = lastTaskCode == null ? null : lastTaskCode.trim();
    }

    public BigDecimal getxPosition() {
        return xPosition;
    }

    public void setxPosition(BigDecimal xPosition) {
        this.xPosition = xPosition;
    }

    public BigDecimal getyPosition() {
        return yPosition;
    }

    public void setyPosition(BigDecimal yPosition) {
        this.yPosition = yPosition;
    }

    public String getLasterCode() {
        return lasterCode;
    }

    public void setLasterCode(String lasterCode) {
        this.lasterCode = lasterCode == null ? null : lasterCode.trim();
    }
}