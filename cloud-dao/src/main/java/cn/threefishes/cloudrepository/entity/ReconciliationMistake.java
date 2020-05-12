package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ReconciliationMistake {
    private Integer mistakeId;

    private String ordersSn;

    private String outOrdersSn;

    private String paySn;

    private String refundSn;

    private BigDecimal paymentAmount;

    private BigDecimal refundAmount;

    private Date createTime;

    private Date paymentTime;

    private Date refundTime;

    private Integer ordersState;

    private Date outPaymentTime;

    private BigDecimal outPayAmount;

    public Integer getMistakeId() {
        return mistakeId;
    }

    public void setMistakeId(Integer mistakeId) {
        this.mistakeId = mistakeId;
    }

    public String getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(String ordersSn) {
        this.ordersSn = ordersSn == null ? null : ordersSn.trim();
    }

    public String getOutOrdersSn() {
        return outOrdersSn;
    }

    public void setOutOrdersSn(String outOrdersSn) {
        this.outOrdersSn = outOrdersSn == null ? null : outOrdersSn.trim();
    }

    public String getPaySn() {
        return paySn;
    }

    public void setPaySn(String paySn) {
        this.paySn = paySn == null ? null : paySn.trim();
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn == null ? null : refundSn.trim();
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getOrdersState() {
        return ordersState;
    }

    public void setOrdersState(Integer ordersState) {
        this.ordersState = ordersState;
    }

    public Date getOutPaymentTime() {
        return outPaymentTime;
    }

    public void setOutPaymentTime(Date outPaymentTime) {
        this.outPaymentTime = outPaymentTime;
    }

    public BigDecimal getOutPayAmount() {
        return outPayAmount;
    }

    public void setOutPayAmount(BigDecimal outPayAmount) {
        this.outPayAmount = outPayAmount;
    }
}