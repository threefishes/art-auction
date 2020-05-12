package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class DistributorGoodsVisitorLog {
    private Integer logId;

    private Integer commonId;

    private Integer memberId;

    private Integer distributorGoodsId;

    private Date addTime;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getDistributorGoodsId() {
        return distributorGoodsId;
    }

    public void setDistributorGoodsId(Integer distributorGoodsId) {
        this.distributorGoodsId = distributorGoodsId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}