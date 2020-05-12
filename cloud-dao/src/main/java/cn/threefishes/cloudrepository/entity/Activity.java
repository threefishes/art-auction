package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Activity {
    private Integer activityId;

    private Integer activityState;

    private Integer activityType;

    private Date updateTime;

    private String activityJson;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityState() {
        return activityState;
    }

    public void setActivityState(Integer activityState) {
        this.activityState = activityState;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getActivityJson() {
        return activityJson;
    }

    public void setActivityJson(String activityJson) {
        this.activityJson = activityJson == null ? null : activityJson.trim();
    }
}