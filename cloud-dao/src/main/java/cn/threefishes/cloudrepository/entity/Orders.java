package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer ordersId;

    private Integer adminReceivePayState;

    private Date autoReceiveTime;

    private Integer cancelReason;

    private String cancelRole;

    private Date cancelTime;

    private Integer cannotShip;

    private BigDecimal commissionAmount;

    private BigDecimal conformPrice;

    private BigDecimal couponAmount;

    private Date createTime;

    private String createTimeDate;

    private String createTimeHour;

    private Integer delayReceiveState;

    private Integer deleteState;

    private Integer evaluationAppendState;

    private Integer evaluationState;

    private Date evaluationTime;

    private BigDecimal finalAmount;

    private Date finishTime;

    private BigDecimal freightAmount;

    private Integer goId;

    private Integer groupId;

    private String idCard;

    private String invoiceCode;

    private String invoiceContent;

    private String invoiceTitle;

    private Integer isFreeFreight;

    private BigDecimal limitAmount;

    private Integer lockState;

    private Integer memberId;

    private String memberName;

    private BigDecimal ordersAmount;

    private String ordersFrom;

    private String ordersFrom1;

    private Long ordersSn;

    private Integer ordersState;

    private Integer ordersType;

    private String outOrdersSn;

    private Integer payId;

    private Long paySn;

    private String paymentClientType;

    private String paymentCode;

    private Date paymentTime;

    private String paymentTypeCode;

    private BigDecimal predepositAmount;

    private String reciverAddress;

    private Integer receiverAreaId1;

    private Integer receiverAreaId2;

    private Integer receiverAreaId3;

    private Integer receiverAreaId4;

    private String receiverAreaInfo;

    private String receiverMessage;

    private String receiverName;

    private String receiverPhone;

    private BigDecimal refundAmount;

    private Integer refundState;

    private Date sendTime;

    private String shipCode;

    private String shipName;

    private String shipNote;

    private String shipSn;

    private Integer shipTimeType;

    private BigDecimal shopCommitmentAmount;

    private BigDecimal storeDiscountAmount;

    private Integer storeId;

    private String storeName;

    private BigDecimal taxAmount;

    private Integer templateId;

    private String voucherCode;

    private BigDecimal voucherPrice;

    private BigDecimal onlinePayDiscountAmount;

    private BigDecimal happyGoldAmount;

    private Integer isStaffBuy;

    private Integer pushState;

    private Integer isPaperInvoice;

    private Integer saleChannel;

    private Integer channelFirstBuy;

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

    public Date getAutoReceiveTime() {
        return autoReceiveTime;
    }

    public void setAutoReceiveTime(Date autoReceiveTime) {
        this.autoReceiveTime = autoReceiveTime;
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

    public Integer getCannotShip() {
        return cannotShip;
    }

    public void setCannotShip(Integer cannotShip) {
        this.cannotShip = cannotShip;
    }

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
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

    public Integer getDelayReceiveState() {
        return delayReceiveState;
    }

    public void setDelayReceiveState(Integer delayReceiveState) {
        this.delayReceiveState = delayReceiveState;
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }

    public Integer getEvaluationAppendState() {
        return evaluationAppendState;
    }

    public void setEvaluationAppendState(Integer evaluationAppendState) {
        this.evaluationAppendState = evaluationAppendState;
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

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Integer getGoId() {
        return goId;
    }

    public void setGoId(Integer goId) {
        this.goId = goId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode == null ? null : invoiceCode.trim();
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent == null ? null : invoiceContent.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public Integer getIsFreeFreight() {
        return isFreeFreight;
    }

    public void setIsFreeFreight(Integer isFreeFreight) {
        this.isFreeFreight = isFreeFreight;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Integer getLockState() {
        return lockState;
    }

    public void setLockState(Integer lockState) {
        this.lockState = lockState;
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

    public Integer getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(Integer ordersType) {
        this.ordersType = ordersType;
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

    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    public void setPaymentTypeCode(String paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode == null ? null : paymentTypeCode.trim();
    }

    public BigDecimal getPredepositAmount() {
        return predepositAmount;
    }

    public void setPredepositAmount(BigDecimal predepositAmount) {
        this.predepositAmount = predepositAmount;
    }

    public String getReciverAddress() {
        return reciverAddress;
    }

    public void setReciverAddress(String reciverAddress) {
        this.reciverAddress = reciverAddress == null ? null : reciverAddress.trim();
    }

    public Integer getReceiverAreaId1() {
        return receiverAreaId1;
    }

    public void setReceiverAreaId1(Integer receiverAreaId1) {
        this.receiverAreaId1 = receiverAreaId1;
    }

    public Integer getReceiverAreaId2() {
        return receiverAreaId2;
    }

    public void setReceiverAreaId2(Integer receiverAreaId2) {
        this.receiverAreaId2 = receiverAreaId2;
    }

    public Integer getReceiverAreaId3() {
        return receiverAreaId3;
    }

    public void setReceiverAreaId3(Integer receiverAreaId3) {
        this.receiverAreaId3 = receiverAreaId3;
    }

    public Integer getReceiverAreaId4() {
        return receiverAreaId4;
    }

    public void setReceiverAreaId4(Integer receiverAreaId4) {
        this.receiverAreaId4 = receiverAreaId4;
    }

    public String getReceiverAreaInfo() {
        return receiverAreaInfo;
    }

    public void setReceiverAreaInfo(String receiverAreaInfo) {
        this.receiverAreaInfo = receiverAreaInfo == null ? null : receiverAreaInfo.trim();
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

    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode == null ? null : shipCode.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getShipNote() {
        return shipNote;
    }

    public void setShipNote(String shipNote) {
        this.shipNote = shipNote == null ? null : shipNote.trim();
    }

    public String getShipSn() {
        return shipSn;
    }

    public void setShipSn(String shipSn) {
        this.shipSn = shipSn == null ? null : shipSn.trim();
    }

    public Integer getShipTimeType() {
        return shipTimeType;
    }

    public void setShipTimeType(Integer shipTimeType) {
        this.shipTimeType = shipTimeType;
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

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
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

    public Integer getIsPaperInvoice() {
        return isPaperInvoice;
    }

    public void setIsPaperInvoice(Integer isPaperInvoice) {
        this.isPaperInvoice = isPaperInvoice;
    }

    public Integer getSaleChannel() {
        return saleChannel;
    }

    public void setSaleChannel(Integer saleChannel) {
        this.saleChannel = saleChannel;
    }

    public Integer getChannelFirstBuy() {
        return channelFirstBuy;
    }

    public void setChannelFirstBuy(Integer channelFirstBuy) {
        this.channelFirstBuy = channelFirstBuy;
    }
}