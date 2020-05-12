package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class WagesBill {
    private Integer wagesBillId;

    private Date startTime;

    private Date endTime;

    private Date addTime;

    public Integer getWagesBillId() {
        return wagesBillId;
    }

    public void setWagesBillId(Integer wagesBillId) {
        this.wagesBillId = wagesBillId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}