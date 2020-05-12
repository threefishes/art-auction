package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class PointsOrders {
    private Integer pointsOrdersId;

    private Integer buyNum;

    private Date cancelTime;

    private Integer commonId;

    private Date createTime;

    private Integer expendPoints;

    private Date finishTime;

    private String goodsFullSpecs;

    private Integer goodsId;

    private String goodsImage;

    private String goodsName;

    private Integer memberId;

    private String memberName;

    private Long pointsOrdersSn;

    private Integer pointsOrdersState;

    private String receiverAddress;

    private Integer receiverAreaId1;

    private Integer receiverAreaId2;

    private Integer receiverAreaId3;

    private Integer receiverAreaId4;

    private String receiverAreaInfo;

    private String receiverMessage;

    private String receiverName;

    private String receiverPhone;

    private Date sendTime;

    private String shipCode;

    private String shipName;

    private String shipNote;

    private String shipSn;

    private Integer storeId;

    private String storeName;

    private String unitName;

    public Integer getPointsOrdersId() {
        return pointsOrdersId;
    }

    public void setPointsOrdersId(Integer pointsOrdersId) {
        this.pointsOrdersId = pointsOrdersId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getExpendPoints() {
        return expendPoints;
    }

    public void setExpendPoints(Integer expendPoints) {
        this.expendPoints = expendPoints;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getGoodsFullSpecs() {
        return goodsFullSpecs;
    }

    public void setGoodsFullSpecs(String goodsFullSpecs) {
        this.goodsFullSpecs = goodsFullSpecs == null ? null : goodsFullSpecs.trim();
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

    public Long getPointsOrdersSn() {
        return pointsOrdersSn;
    }

    public void setPointsOrdersSn(Long pointsOrdersSn) {
        this.pointsOrdersSn = pointsOrdersSn;
    }

    public Integer getPointsOrdersState() {
        return pointsOrdersState;
    }

    public void setPointsOrdersState(Integer pointsOrdersState) {
        this.pointsOrdersState = pointsOrdersState;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }
}