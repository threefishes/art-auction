package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TodayExplosionsSchedule {
    private Integer scheduleId;

    private String scheduleName;

    private String scheduleName2th;

    private Integer scheduleState;

    private Date scheduleTime;

    private Date updateTime;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName == null ? null : scheduleName.trim();
    }

    public String getScheduleName2th() {
        return scheduleName2th;
    }

    public void setScheduleName2th(String scheduleName2th) {
        this.scheduleName2th = scheduleName2th == null ? null : scheduleName2th.trim();
    }

    public Integer getScheduleState() {
        return scheduleState;
    }

    public void setScheduleState(Integer scheduleState) {
        this.scheduleState = scheduleState;
    }

    public Date getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}