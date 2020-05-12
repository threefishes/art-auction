package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RefundBook {
    private Integer refundBookId;

    private String batchNo;

    private String bookStep;

    private String outOrdersSn;

    private String outRefundId;

    private BigDecimal payAmount;

    private Long paySn;

    private String paymentClientType;

    private String paymentCode;

    private Date paymentTime;

    private BigDecimal refundAmount;

    private Integer refundId;

    private Long refundSn;

    public Integer getRefundBookId() {
        return refundBookId;
    }

    public void setRefundBookId(Integer refundBookId) {
        this.refundBookId = refundBookId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getBookStep() {
        return bookStep;
    }

    public void setBookStep(String bookStep) {
        this.bookStep = bookStep == null ? null : bookStep.trim();
    }

    public String getOutOrdersSn() {
        return outOrdersSn;
    }

    public void setOutOrdersSn(String outOrdersSn) {
        this.outOrdersSn = outOrdersSn == null ? null : outOrdersSn.trim();
    }

    public String getOutRefundId() {
        return outRefundId;
    }

    public void setOutRefundId(String outRefundId) {
        this.outRefundId = outRefundId == null ? null : outRefundId.trim();
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Long getPaySn() {
        return paySn;
    }

    public void setPaySn(Long paySn) {
        this.paySn = paySn;
    }

    public String getPaymentClientType() {
        return paymentClientType;
    }

    public void setPaymentClientType(String paymentClientType) {
        this.paymentClientType = paymentClientType == null ? null : paymentClientType.trim();
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
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

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public Long getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(Long refundSn) {
        this.refundSn = refundSn;
    }
}