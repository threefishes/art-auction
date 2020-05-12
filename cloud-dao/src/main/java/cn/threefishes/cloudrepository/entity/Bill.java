package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    private Integer billId;

    private BigDecimal billAmount;

    private Integer billSn;

    private Integer billState;

    private BigDecimal bookAmount;

    private BigDecimal commissionAmount;

    private BigDecimal coteAmount;

    private BigDecimal couponAmount;

    private Date createTime;

    private BigDecimal distributionAmount;

    private Date endTime;

    private BigDecimal freightAmount;

    private BigDecimal ordersAmount;

    private String paymentNote;

    private Date paymentTime;

    private BigDecimal refundAmount;

    private BigDecimal refundCommissionAmount;

    private BigDecimal refundCouponAmount;

    private Date stateTime;

    private Integer storeId;

    private String storeName;

    private BigDecimal allDistributionAmount;

    private BigDecimal refundDistributionAmount;

    private BigDecimal storeUpAmount;

    private BigDecimal allStoreUpAmount;

    private BigDecimal refundStoreUpAmount;

    private BigDecimal storeUpOrdersAmount;

    private BigDecimal storeUpFreightAmount;

    private BigDecimal storeUpCommissionAmount;

    private BigDecimal storeUpCouponAmount;

    private BigDecimal storeUpRefundAmount;

    private BigDecimal storeUpRefundCommissionAmount;

    private BigDecimal storeUpRefundCouponAmount;

    private BigDecimal storeUpBillAmount;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
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

    public BigDecimal getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(BigDecimal bookAmount) {
        this.bookAmount = bookAmount;
    }

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public BigDecimal getCoteAmount() {
        return coteAmount;
    }

    public void setCoteAmount(BigDecimal coteAmount) {
        this.coteAmount = coteAmount;
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

    public BigDecimal getDistributionAmount() {
        return distributionAmount;
    }

    public void setDistributionAmount(BigDecimal distributionAmount) {
        this.distributionAmount = distributionAmount;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public BigDecimal getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(BigDecimal ordersAmount) {
        this.ordersAmount = ordersAmount;
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

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getRefundCommissionAmount() {
        return refundCommissionAmount;
    }

    public void setRefundCommissionAmount(BigDecimal refundCommissionAmount) {
        this.refundCommissionAmount = refundCommissionAmount;
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

    public BigDecimal getAllDistributionAmount() {
        return allDistributionAmount;
    }

    public void setAllDistributionAmount(BigDecimal allDistributionAmount) {
        this.allDistributionAmount = allDistributionAmount;
    }

    public BigDecimal getRefundDistributionAmount() {
        return refundDistributionAmount;
    }

    public void setRefundDistributionAmount(BigDecimal refundDistributionAmount) {
        this.refundDistributionAmount = refundDistributionAmount;
    }

    public BigDecimal getStoreUpAmount() {
        return storeUpAmount;
    }

    public void setStoreUpAmount(BigDecimal storeUpAmount) {
        this.storeUpAmount = storeUpAmount;
    }

    public BigDecimal getAllStoreUpAmount() {
        return allStoreUpAmount;
    }

    public void setAllStoreUpAmount(BigDecimal allStoreUpAmount) {
        this.allStoreUpAmount = allStoreUpAmount;
    }

    public BigDecimal getRefundStoreUpAmount() {
        return refundStoreUpAmount;
    }

    public void setRefundStoreUpAmount(BigDecimal refundStoreUpAmount) {
        this.refundStoreUpAmount = refundStoreUpAmount;
    }

    public BigDecimal getStoreUpOrdersAmount() {
        return storeUpOrdersAmount;
    }

    public void setStoreUpOrdersAmount(BigDecimal storeUpOrdersAmount) {
        this.storeUpOrdersAmount = storeUpOrdersAmount;
    }

    public BigDecimal getStoreUpFreightAmount() {
        return storeUpFreightAmount;
    }

    public void setStoreUpFreightAmount(BigDecimal storeUpFreightAmount) {
        this.storeUpFreightAmount = storeUpFreightAmount;
    }

    public BigDecimal getStoreUpCommissionAmount() {
        return storeUpCommissionAmount;
    }

    public void setStoreUpCommissionAmount(BigDecimal storeUpCommissionAmount) {
        this.storeUpCommissionAmount = storeUpCommissionAmount;
    }

    public BigDecimal getStoreUpCouponAmount() {
        return storeUpCouponAmount;
    }

    public void setStoreUpCouponAmount(BigDecimal storeUpCouponAmount) {
        this.storeUpCouponAmount = storeUpCouponAmount;
    }

    public BigDecimal getStoreUpRefundAmount() {
        return storeUpRefundAmount;
    }

    public void setStoreUpRefundAmount(BigDecimal storeUpRefundAmount) {
        this.storeUpRefundAmount = storeUpRefundAmount;
    }

    public BigDecimal getStoreUpRefundCommissionAmount() {
        return storeUpRefundCommissionAmount;
    }

    public void setStoreUpRefundCommissionAmount(BigDecimal storeUpRefundCommissionAmount) {
        this.storeUpRefundCommissionAmount = storeUpRefundCommissionAmount;
    }

    public BigDecimal getStoreUpRefundCouponAmount() {
        return storeUpRefundCouponAmount;
    }

    public void setStoreUpRefundCouponAmount(BigDecimal storeUpRefundCouponAmount) {
        this.storeUpRefundCouponAmount = storeUpRefundCouponAmount;
    }

    public BigDecimal getStoreUpBillAmount() {
        return storeUpBillAmount;
    }

    public void setStoreUpBillAmount(BigDecimal storeUpBillAmount) {
        this.storeUpBillAmount = storeUpBillAmount;
    }
}