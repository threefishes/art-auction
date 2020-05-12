package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class VirtualBill {
    private Integer billId;

    private Integer billSn;

    private Integer billState;

    private BigDecimal code1Amount;

    private BigDecimal code2Amount;

    private BigDecimal commission1Amount;

    private BigDecimal commission2Amount;

    private BigDecimal couponAmount;

    private Date createTime;

    private Date endTime;

    private String paymentNote;

    private Date paymentTime;

    private BigDecimal refundCouponAmount;

    private Date stateTime;

    private Integer storeId;

    private String storeName;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getBillSn() {
        return billSn;
    }

    public void setBillSn(Integer billSn) {
        this.billSn = billSn;
    }

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
    }

    public BigDecimal getCode1Amount() {
        return code1Amount;
    }

    public void setCode1Amount(BigDecimal code1Amount) {
        this.code1Amount = code1Amount;
    }

    public BigDecimal getCode2Amount() {
        return code2Amount;
    }

    public void setCode2Amount(BigDecimal code2Amount) {
        this.code2Amount = code2Amount;
    }

    public BigDecimal getCommission1Amount() {
        return commission1Amount;
    }

    public void setCommission1Amount(BigDecimal commission1Amount) {
        this.commission1Amount = commission1Amount;
    }

    public BigDecimal getCommission2Amount() {
        return commission2Amount;
    }

    public void setCommission2Amount(BigDecimal commission2Amount) {
        this.commission2Amount = commission2Amount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPaymentNote() {
        return paymentNote;
    }

    public void setPaymentNote(String paymentNote) {
        this.paymentNote = paymentNote == null ? null : paymentNote.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public BigDecimal getRefundCouponAmount() {
        return refundCouponAmount;
    }

    public void setRefundCouponAmount(BigDecimal refundCouponAmount) {
        this.refundCouponAmount = refundCouponAmount;
    }

    public Date getStateTime() {
        return stateTime;
    }

    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }
}