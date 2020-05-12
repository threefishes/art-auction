package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersBook {
    private Integer bookId;

    private BigDecimal bookAmount;

    private Date bookCancelTime;

    private String bookPhone;

    private Integer bookStep;

    private Integer cancelState;

    private BigDecimal depositAmount;

    private Date endTime;

    private Integer noticeState;

    private Integer ordersId;

    private Long ordersSn;

    private String outOrdersSn;

    private Integer payId;

    private Long paySn;

    private String paymentClientType;

    private String paymentCode;

    private Date paymentTime;

    private BigDecimal predepositAmount;

    private BigDecimal realPayAmount;

    private Integer storeId;

    private BigDecimal happyGoldAmount;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public BigDecimal getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(BigDecimal bookAmount) {
        this.bookAmount = bookAmount;
    }

    public Date getBookCancelTime() {
        return bookCancelTime;
    }

    public void setBookCancelTime(Date bookCancelTime) {
        this.bookCancelTime = bookCancelTime;
    }

    public String getBookPhone() {
        return bookPhone;
    }

    public void setBookPhone(String bookPhone) {
        this.bookPhone = bookPhone == null ? null : bookPhone.trim();
    }

    public Integer getBookStep() {
        return bookStep;
    }

    public void setBookStep(Integer bookStep) {
        this.bookStep = bookStep;
    }

    public Integer getCancelState() {
        return cancelState;
    }

    public void setCancelState(Integer cancelState) {
        this.cancelState = cancelState;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getNoticeState() {
        return noticeState;
    }

    public void setNoticeState(Integer noticeState) {
        this.noticeState = noticeState;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Long getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(Long ordersSn) {
        this.ordersSn = ordersSn;
    }

    public String getOutOrdersSn() {
        return outOrdersSn;
    }

    public void setOutOrdersSn(String outOrdersSn) {
        this.outOrdersSn = outOrdersSn == null ? null : outOrdersSn.trim();
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
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

    public BigDecimal getPredepositAmount() {
        return predepositAmount;
    }

    public void setPredepositAmount(BigDecimal predepositAmount) {
        this.predepositAmount = predepositAmount;
    }

    public BigDecimal getRealPayAmount() {
        return realPayAmount;
    }

    public void setRealPayAmount(BigDecimal realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public BigDecimal getHappyGoldAmount() {
        return happyGoldAmount;
    }

    public void setHappyGoldAmount(BigDecimal happyGoldAmount) {
        this.happyGoldAmount = happyGoldAmount;
    }
}