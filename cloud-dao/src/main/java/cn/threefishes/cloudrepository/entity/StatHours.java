package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatHours {
    private Integer statId;

    private Long newGoodsCommonNum;

    private Long newMemberNum;

    private Long newStoreNum;

    private BigDecimal ordersAmount;

    private Long ordersNum;

    private BigDecimal predepositBalanceAmount;

    private BigDecimal predepositCashAmount;

    private BigDecimal predepositConsumeAmount;

    private BigDecimal predepositRechargeAmount;

    private BigDecimal predepositRefundAmount;

    private BigDecimal refundAmount;

    private Date statDate;

    private Integer statHour;

    public Integer getStatId() {
        return statId;
    }

    public void setStatId(Integer statId) {
        this.statId = statId;
    }

    public Long getNewGoodsCommonNum() {
        return newGoodsCommonNum;
    }

    public void setNewGoodsCommonNum(Long newGoodsCommonNum) {
        this.newGoodsCommonNum = newGoodsCommonNum;
    }

    public Long getNewMemberNum() {
        return newMemberNum;
    }

    public void setNewMemberNum(Long newMemberNum) {
        this.newMemberNum = newMemberNum;
    }

    public Long getNewStoreNum() {
        return newStoreNum;
    }

    public void setNewStoreNum(Long newStoreNum) {
        this.newStoreNum = newStoreNum;
    }

    public BigDecimal getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(BigDecimal ordersAmount) {
        this.ordersAmount = ordersAmount;
    }

    public Long getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(Long ordersNum) {
        this.ordersNum = ordersNum;
    }

    public BigDecimal getPredepositBalanceAmount() {
        return predepositBalanceAmount;
    }

    public void setPredepositBalanceAmount(BigDecimal predepositBalanceAmount) {
        this.predepositBalanceAmount = predepositBalanceAmount;
    }

    public BigDecimal getPredepositCashAmount() {
        return predepositCashAmount;
    }

    public void setPredepositCashAmount(BigDecimal predepositCashAmount) {
        this.predepositCashAmount = predepositCashAmount;
    }

    public BigDecimal getPredepositConsumeAmount() {
        return predepositConsumeAmount;
    }

    public void setPredepositConsumeAmount(BigDecimal predepositConsumeAmount) {
        this.predepositConsumeAmount = predepositConsumeAmount;
    }

    public BigDecimal getPredepositRechargeAmount() {
        return predepositRechargeAmount;
    }

    public void setPredepositRechargeAmount(BigDecimal predepositRechargeAmount) {
        this.predepositRechargeAmount = predepositRechargeAmount;
    }

    public BigDecimal getPredepositRefundAmount() {
        return predepositRefundAmount;
    }

    public void setPredepositRefundAmount(BigDecimal predepositRefundAmount) {
        this.predepositRefundAmount = predepositRefundAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public Integer getStatHour() {
        return statHour;
    }

    public void setStatHour(Integer statHour) {
        this.statHour = statHour;
    }
}