package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TurntableLucklyDetail {
    private Integer id;

    private Integer memberId;

    private String memberName;

    private String avatar;

    private Integer turntableId;

    private Integer prizeId;

    private String uuid;

    private Integer storeId;

    private String imageUrl;

    private Date prizeExpireTime;

    private Integer collocationId;

    private String collocationName;

    private String collocationContent;

    private Integer prizeType;

    private Double prizePrice;

    private Integer takePoints;

    private Integer state;

    private Integer sendPrize;

    private Date sendPrizeTime;

    private Integer claim;

    private Date claimPrizeTime;

    private String receiveName;

    private String receivePhone;

    private String receiveArea;

    private String receiveAddress;

    private String shipName;

    private String shipSn;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getTurntableId() {
        return turntableId;
    }

    public void setTurntableId(Integer turntableId) {
        this.turntableId = turntableId;
    }

    public Integer getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Date getPrizeExpireTime() {
        return prizeExpireTime;
    }

    public void setPrizeExpireTime(Date prizeExpireTime) {
        this.prizeExpireTime = prizeExpireTime;
    }

    public Integer getCollocationId() {
        return collocationId;
    }

    public void setCollocationId(Integer collocationId) {
        this.collocationId = collocationId;
    }

    public String getCollocationName() {
        return collocationName;
    }

    public void setCollocationName(String collocationName) {
        this.collocationName = collocationName == null ? null : collocationName.trim();
    }

    public String getCollocationContent() {
        return collocationContent;
    }

    public void setCollocationContent(String collocationContent) {
        this.collocationContent = collocationContent == null ? null : collocationContent.trim();
    }

    public Integer getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(Integer prizeType) {
        this.prizeType = prizeType;
    }

    public Double getPrizePrice() {
        return prizePrice;
    }

    public void setPrizePrice(Double prizePrice) {
        this.prizePrice = prizePrice;
    }

    public Integer getTakePoints() {
        return takePoints;
    }

    public void setTakePoints(Integer takePoints) {
        this.takePoints = takePoints;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSendPrize() {
        return sendPrize;
    }

    public void setSendPrize(Integer sendPrize) {
        this.sendPrize = sendPrize;
    }

    public Date getSendPrizeTime() {
        return sendPrizeTime;
    }

    public void setSendPrizeTime(Date sendPrizeTime) {
        this.sendPrizeTime = sendPrizeTime;
    }

    public Integer getClaim() {
        return claim;
    }

    public void setClaim(Integer claim) {
        this.claim = claim;
    }

    public Date getClaimPrizeTime() {
        return claimPrizeTime;
    }

    public void setClaimPrizeTime(Date claimPrizeTime) {
        this.claimPrizeTime = claimPrizeTime;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getReceiveArea() {
        return receiveArea;
    }

    public void setReceiveArea(String receiveArea) {
        this.receiveArea = receiveArea == null ? null : receiveArea.trim();
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getShipSn() {
        return shipSn;
    }

    public void setShipSn(String shipSn) {
        this.shipSn = shipSn == null ? null : shipSn.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}