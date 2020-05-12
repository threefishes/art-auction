package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class VirtualOrders {
    private Integer ordersId;

    private Integer adminReceivePayState;

    private Integer cancelReason;

    private String cancelRole;

    private Date cancelTime;

    private BigDecimal conformPrice;

    private BigDecimal couponAmount;

    private Date createTime;

    private String createTimeDate;

    private String createTimeHour;

    private Integer deleteState;

    private Date endTime;

    private Integer evaluationState;

    private Date evaluationTime;

    private Date finishTime;

    private Integer isSend;

    private BigDecimal limitAmount;

    private Integer memberId;

    private String memberName;

    private BigDecimal ordersAmount;

    private String ordersFrom;

    private String ordersFrom1;

    private Long ordersSn;

    private Integer ordersState;

    private String outOrdersSn;

    private Integer payId;

    private Long paySn;

    private String paymentClientType;

    private String paymentCode;

    private Date paymentTime;

    private BigDecimal predepositAmount;

    private String receiverMessage;

    private String receiverName;

    private String receiverPhone;

    private BigDecimal refundAmount;

    private BigDecimal shopCommitmentAmount;

    private BigDecimal storeDiscountAmount;

    private Integer storeId;

    private String storeName;

    private Integer templateId;

    private Integer useState;

    private String voucherCode;

    private BigDecimal voucherPrice;

    private BigDecimal onlinePayDiscountAmount;

    private BigDecimal happyGoldAmount;

    private Integer isStaffBuy;

    private Integer pushState;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getAdminReceivePayState() {
        return adminReceivePayState;
    }

    public void setAdminReceivePayState(Integer adminReceivePayState) {
        this.adminReceivePayState = adminReceivePayState;
    }

    public Integer getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(Integer cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelRole() {
        return cancelRole;
    }

    public void setCancelRole(String cancelRole) {
        this.cancelRole = cancelRole == null ? null : cancelRole.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public BigDecimal getConformPrice() {
        return conformPrice;
    }

    public void setConformPrice(BigDecimal conformPrice) {
        this.conformPrice = conformPrice;
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

    public String getCreateTimeDate() {
        return createTimeDate;
    }

    public void setCreateTimeDate(String createTimeDate) {
        this.createTimeDate = createTimeDate == null ? null : createTimeDate.trim();
    }

    public String getCreateTimeHour() {
        return createTimeHour;
    }

    public void setCreateTimeHour(String createTimeHour) {
        this.createTimeHour = createTimeHour == null ? null : createTimeHour.trim();
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getEvaluationState() {
        return evaluationState;
    }

    public void setEvaluationState(Integer evaluationState) {
        this.evaluationState = evaluationState;
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public BigDecimal getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(BigDecimal ordersAmount) {
        this.ordersAmount = ordersAmount;
    }

    public String getOrdersFrom() {
        return ordersFrom;
    }

    public void setOrdersFrom(String ordersFrom) {
        this.ordersFrom = ordersFrom == null ? null : ordersFrom.trim();
    }

    public String getOrdersFrom1() {
        return ordersFrom1;
    }

    public void setOrdersFrom1(String ordersFrom1) {
        this.ordersFrom1 = ordersFrom1 == null ? null : ordersFrom1.trim();
    }

    public Long getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(Long ordersSn) {
        this.ordersSn = ordersSn;
    }

    public Integer getOrdersState() {
        return ordersState;
    }

    public void setOrdersState(Integer ordersState) {
        this.ordersState = ordersState;
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

    public String getReceiverMessage() {
        return receiverMessage;
    }

    public void setReceiverMessage(String receiverMessage) {
        this.receiverMessage = receiverMessage == null ? null : receiverMessage.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getShopCommitmentAmount() {
        return shopCommitmentAmount;
    }

    public void setShopCommitmentAmount(BigDecimal shopCommitmentAmount) {
        this.shopCommitmentAmount = shopCommitmentAmount;
    }

    public BigDecimal getStoreDiscountAmount() {
        return storeDiscountAmount;
    }

    public void setStoreDiscountAmount(BigDecimal storeDiscountAmount) {
        this.storeDiscountAmount = storeDiscountAmount;
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

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getUseState() {
        return useState;
    }

    public void setUseState(Integer useState) {
        this.useState = useState;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    public BigDecimal getVoucherPrice() {
        return voucherPrice;
    }

    public void setVoucherPrice(BigDecimal voucherPrice) {
        this.voucherPrice = voucherPrice;
    }

    public BigDecimal getOnlinePayDiscountAmount() {
        return onlinePayDiscountAmount;
    }

    public void setOnlinePayDiscountAmount(BigDecimal onlinePayDiscountAmount) {
        this.onlinePayDiscountAmount = onlinePayDiscountAmount;
    }

    public BigDecimal getHappyGoldAmount() {
        return happyGoldAmount;
    }

    public void setHappyGoldAmount(BigDecimal happyGoldAmount) {
        this.happyGoldAmount = happyGoldAmount;
    }

    public Integer getIsStaffBuy() {
        return isStaffBuy;
    }

    public void setIsStaffBuy(Integer isStaffBuy) {
        this.isStaffBuy = isStaffBuy;
    }

    public Integer getPushState() {
        return pushState;
    }

    public void setPushState(Integer pushState) {
        this.pushState = pushState;
    }
}