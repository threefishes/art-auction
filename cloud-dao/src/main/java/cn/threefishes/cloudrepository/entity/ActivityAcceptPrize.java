package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ActivityAcceptPrize {
    private Integer acceptPrizeId;

    private String acceptPrizeAddress;

    private String acceptPrizeName;

    private String acceptPrizePhone;

    private Integer acceptState;

    private Integer activityId;

    private Integer activityType;

    private Date addTime;

    private String awardsContent;

    private Integer awardsId;

    private String awardsName;

    private String awardsType;

    private Integer giveOutState;

    private Date giveOutTime;

    private String memberAvatar;

    private String memberAvatarUrl;

    private Integer memberId;

    private String memberName;

    private String shipName;

    private String shipSn;

    private Integer state;

    private Integer takePoints;

    private String prizeJson;

    public Integer getAcceptPrizeId() {
        return acceptPrizeId;
    }

    public void setAcceptPrizeId(Integer acceptPrizeId) {
        this.acceptPrizeId = acceptPrizeId;
    }

    public String getAcceptPrizeAddress() {
        return acceptPrizeAddress;
    }

    public void setAcceptPrizeAddress(String acceptPrizeAddress) {
        this.acceptPrizeAddress = acceptPrizeAddress == null ? null : acceptPrizeAddress.trim();
    }

    public String getAcceptPrizeName() {
        return acceptPrizeName;
    }

    public void setAcceptPrizeName(String acceptPrizeName) {
        this.acceptPrizeName = acceptPrizeName == null ? null : acceptPrizeName.trim();
    }

    public String getAcceptPrizePhone() {
        return acceptPrizePhone;
    }

    public void setAcceptPrizePhone(String acceptPrizePhone) {
        this.acceptPrizePhone = acceptPrizePhone == null ? null : acceptPrizePhone.trim();
    }

    public Integer getAcceptState() {
        return acceptState;
    }

    public void setAcceptState(Integer acceptState) {
        this.acceptState = acceptState;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAwardsContent() {
        return awardsContent;
    }

    public void setAwardsContent(String awardsContent) {
        this.awardsContent = awardsContent == null ? null : awardsContent.trim();
    }

    public Integer getAwardsId() {
        return awardsId;
    }

    public void setAwardsId(Integer awardsId) {
        this.awardsId = awardsId;
    }

    public String getAwardsName() {
        return awardsName;
    }

    public void setAwardsName(String awardsName) {
        this.awardsName = awardsName == null ? null : awardsName.trim();
    }

    public String getAwardsType() {
        return awardsType;
    }

    public void setAwardsType(String awardsType) {
        this.awardsType = awardsType == null ? null : awardsType.trim();
    }

    public Integer getGiveOutState() {
        return giveOutState;
    }

    public void setGiveOutState(Integer giveOutState) {
        this.giveOutState = giveOutState;
    }

    public Date getGiveOutTime() {
        return giveOutTime;
    }

    public void setGiveOutTime(Date giveOutTime) {
        this.giveOutTime = giveOutTime;
    }

    public String getMemberAvatar() {
        return memberAvatar;
    }

    public void setMemberAvatar(String memberAvatar) {
        this.memberAvatar = memberAvatar == null ? null : memberAvatar.trim();
    }

    public String getMemberAvatarUrl() {
        return memberAvatarUrl;
    }

    public void setMemberAvatarUrl(String memberAvatarUrl) {
        this.memberAvatarUrl = memberAvatarUrl == null ? null : memberAvatarUrl.trim();
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTakePoints() {
        return takePoints;
    }

    public void setTakePoints(Integer takePoints) {
        this.takePoints = takePoints;
    }

    public String getPrizeJson() {
        return prizeJson;
    }

    public void setPrizeJson(String prizeJson) {
        this.prizeJson = prizeJson == null ? null : prizeJson.trim();
    }
}