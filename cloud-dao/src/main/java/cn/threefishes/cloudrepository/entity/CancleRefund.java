package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CancleRefund {
    private Integer cancleRefundId;

    private Integer refundId;

    private Date addTime;

    private String adminMessage;

    private Date adminTime;

    private Date billTime;

    private String buyerMessage;

    private Integer commissionRate;

    private Integer commonId;

    private BigDecimal couponAmount;

    private Date delayTime;

    private Integer goodsId;

    private String goodsImage;

    private String goodsName;

    private Integer goodsNum;

    private Integer goodsState;

    private Integer memberId;

    private String memberName;

    private Integer orderGoodsType;

    private Integer orderLock;

    private Integer ordersGoodsId;

    private Integer ordersId;

    private Long ordersSn;

    private Integer ordersType;

    private Integer reasonId;

    private String reasonInfo;

    private String receiveMessage;

    private Date receiveTime;

    private BigDecimal refundAmount;

    private Long refundSn;

    private Integer refundState;

    private Integer refundType;

    private Integer returnType;

    private String sellerMessage;

    private Integer sellerState;

    private Date sellerTime;

    private Integer shipId;

    private String shipSn;

    private Date shipTime;

    private Integer storeId;

    private String storeName;

    private Integer refundSource;

    private Integer adminState;

    private Integer refundMemberCancel;

    private Integer returnMemberAutoCancel;

    private Integer returnSellerAutoReceive;

    private Integer dwReturnType;

    private Integer sellerStateReason;

    private String picJson;

    public Integer getCancleRefundId() {
        return cancleRefundId;
    }

    public void setCancleRefundId(Integer cancleRefundId) {
        this.cancleRefundId = cancleRefundId;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAdminMessage() {
        return adminMessage;
    }

    public void setAdminMessage(String adminMessage) {
        this.adminMessage = adminMessage == null ? null : adminMessage.trim();
    }

    public Date getAdminTime() {
        return adminTime;
    }

    public void setAdminTime(Date adminTime) {
        this.adminTime = adminTime;
    }

    public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Date getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Date delayTime) {
        this.delayTime = delayTime;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
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

    public Integer getOrderGoodsType() {
        return orderGoodsType;
    }

    public void setOrderGoodsType(Integer orderGoodsType) {
        this.orderGoodsType = orderGoodsType;
    }

    public Integer getOrderLock() {
        return orderLock;
    }

    public void setOrderLock(Integer orderLock) {
        this.orderLock = orderLock;
    }

    public Integer getOrdersGoodsId() {
        return ordersGoodsId;
    }

    public void setOrdersGoodsId(Integer ordersGoodsId) {
        this.ordersGoodsId = ordersGoodsId;
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

    public Integer getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(Integer ordersType) {
        this.ordersType = ordersType;
    }

    public Integer getReasonId() {
        return reasonId;
    }

    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    public String getReasonInfo() {
        return reasonInfo;
    }

    public void setReasonInfo(String reasonInfo) {
        this.reasonInfo = reasonInfo == null ? null : reasonInfo.trim();
    }

    public String getReceiveMessage() {
        return receiveMessage;
    }

    public void setReceiveMessage(String receiveMessage) {
        this.receiveMessage = receiveMessage == null ? null : receiveMessage.trim();
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Long getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(Long refundSn) {
        this.refundSn = refundSn;
    }

    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public String getSellerMessage() {
        return sellerMessage;
    }

    public void setSellerMessage(String sellerMessage) {
        this.sellerMessage = sellerMessage == null ? null : sellerMessage.trim();
    }

    public Integer getSellerState() {
        return sellerState;
    }

    public void setSellerState(Integer sellerState) {
        this.sellerState = sellerState;
    }

    public Date getSellerTime() {
        return sellerTime;
    }

    public void setSellerTime(Date sellerTime) {
        this.sellerTime = sellerTime;
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getShipSn() {
        return shipSn;
    }

    public void setShipSn(String shipSn) {
        this.shipSn = shipSn == null ? null : shipSn.trim();
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
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

    public Integer getRefundSource() {
        return refundSource;
    }

    public void setRefundSource(Integer refundSource) {
        this.refundSource = refundSource;
    }

    public Integer getAdminState() {
        return adminState;
    }

    public void setAdminState(Integer adminState) {
        this.adminState = adminState;
    }

    public Integer getRefundMemberCancel() {
        return refundMemberCancel;
    }

    public void setRefundMemberCancel(Integer refundMemberCancel) {
        this.refundMemberCancel = refundMemberCancel;
    }

    public Integer getReturnMemberAutoCancel() {
        return returnMemberAutoCancel;
    }

    public void setReturnMemberAutoCancel(Integer returnMemberAutoCancel) {
        this.returnMemberAutoCancel = returnMemberAutoCancel;
    }

    public Integer getReturnSellerAutoReceive() {
        return returnSellerAutoReceive;
    }

    public void setReturnSellerAutoReceive(Integer returnSellerAutoReceive) {
        this.returnSellerAutoReceive = returnSellerAutoReceive;
    }

    public Integer getDwReturnType() {
        return dwReturnType;
    }

    public void setDwReturnType(Integer dwReturnType) {
        this.dwReturnType = dwReturnType;
    }

    public Integer getSellerStateReason() {
        return sellerStateReason;
    }

    public void setSellerStateReason(Integer sellerStateReason) {
        this.sellerStateReason = sellerStateReason;
    }

    public String getPicJson() {
        return picJson;
    }

    public void setPicJson(String picJson) {
        this.picJson = picJson == null ? null : picJson.trim();
    }
}