package com.mpd.api.dao.model;

public class ManualAssessment {
    private Integer id;

    private String topic;

    private String question;

    private Byte assessmentStatus;

    private String userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public Byte getAssessmentStatus() {
        return assessmentStatus;
    }

    public void setAssessmentStatus(Byte assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}