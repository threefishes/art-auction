package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class DistributorStatsLog {
    private Integer logId;

    private Integer distributorId;

    private Integer triggerType;

    private Integer triggerTypeState;

    private Integer distributionOrdersId;

    private Integer memberId;

    private Integer visitorLogId;

    private Integer state;

    private String msg;

    private Date createTime;

    private Date updateTime;

    private String amountChange;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public Integer getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(Integer triggerType) {
        this.triggerType = triggerType;
    }

    public Integer getTriggerTypeState() {
        return triggerTypeState;
    }

    public void setTriggerTypeState(Integer triggerTypeState) {
        this.triggerTypeState = triggerTypeState;
    }

    public Integer getDistributionOrdersId() {
        return distributionOrdersId;
    }

    public void setDistributionOrdersId(Integer distributionOrdersId) {
        this.distributionOrdersId = distributionOrdersId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getVisitorLogId() {
        return visitorLogId;
    }

    public void setVisitorLogId(Integer visitorLogId) {
        this.visitorLogId = visitorLogId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAmountChange() {
        return amountChange;
    }

    public void setAmountChange(String amountChange) {
        this.amountChange = amountChange == null ? null : amountChange.trim();
    }
}