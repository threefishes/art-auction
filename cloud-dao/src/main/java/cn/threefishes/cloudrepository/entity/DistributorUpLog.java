package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DistributorUpLog {
    private Integer distributorUpLogId;

    private Integer isSuper;

    private Integer memberId;

    private Integer upMemberId;

    private Integer upType;

    private Date addTime;

    private BigDecimal upAmount;

    public Integer getDistributorUpLogId() {
        return distributorUpLogId;
    }

    public void setDistributorUpLogId(Integer distributorUpLogId) {
        this.distributorUpLogId = distributorUpLogId;
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

    public Integer getUpMemberId() {
        return upMemberId;
    }

    public void setUpMemberId(Integer upMemberId) {
        this.upMemberId = upMemberId;
    }

    public Integer getUpType() {
        return upType;
    }

    public void setUpType(Integer upType) {
        this.upType = upType;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public BigDecimal getUpAmount() {
        return upAmount;
    }

    public void setUpAmount(BigDecimal upAmount) {
        this.upAmount = upAmount;
    }
}