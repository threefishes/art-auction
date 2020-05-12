package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EagleAwardLog {
    private Integer eagleAwardLogId;

    private Integer isSuper;

    private Integer memberId;

    private Integer supMemberId;

    private Date doTime;

    private Date startTime;

    private Date endTime;

    private BigDecimal allAmount;

    private BigDecimal awardAmount;

    public Integer getEagleAwardLogId() {
        return eagleAwardLogId;
    }

    public void setEagleAwardLogId(Integer eagleAwardLogId) {
        this.eagleAwardLogId = eagleAwardLogId;
    }

    public Integer getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(Integer isSuper) {
        this.isSuper = isSuper;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getSupMemberId() {
        return supMemberId;
    }

    public void setSupMemberId(Integer supMemberId) {
        this.supMemberId = supMemberId;
    }

    public Date getDoTime() {
        return doTime;
    }

    public void setDoTime(Date doTime) {
        this.doTime = doTime;
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

    public BigDecimal getAllAmount() {
        return allAmount;
    }

    public void setAllAmount(BigDecimal allAmount) {
        this.allAmount = allAmount;
    }

    public BigDecimal getAwardAmount() {
        return awardAmount;
    }

    public void setAwardAmount(BigDecimal awardAmount) {
        this.awardAmount = awardAmount;
    }
}