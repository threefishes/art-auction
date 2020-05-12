package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PredepositGather {
    private Integer gatherId;

    private String gatherSn;

    private BigDecimal availableAmount;

    private BigDecimal balanceAmount;

    private String operationStage;

    private Date gatherTime;

    private Date addTime;

    public Integer getGatherId() {
        return gatherId;
    }

    public void setGatherId(Integer gatherId) {
        this.gatherId = gatherId;
    }

    public String getGatherSn() {
        return gatherSn;
    }

    public void setGatherSn(String gatherSn) {
        this.gatherSn = gatherSn == null ? null : gatherSn.trim();
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getOperationStage() {
        return operationStage;
    }

    public void setOperationStage(String operationStage) {
        this.operationStage = operationStage == null ? null : operationStage.trim();
    }

    public Date getGatherTime() {
        return gatherTime;
    }

    public void setGatherTime(Date gatherTime) {
        this.gatherTime = gatherTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}