package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class LiveRoom {
    private Integer roomId;

    private String roomTitle;

    private String roomDesc;

    private String liveImage;

    private String chatroomId;

    private String pushUrl;

    private String pullUrl;

    private String pullUrl2;

    private String pullRtmpUrl;

    private String videoUrl;

    private Byte status;

    private Byte liveType;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    private Integer memberId;

    private Integer storeId;

    private Integer watchNum;

    private Integer chatroomStatus;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomTitle() {
        return roomTitle;
    }

    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle == null ? null : roomTitle.trim();
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc == null ? null : roomDesc.trim();
    }

    public String getLiveImage() {
        return liveImage;
    }

    public void setLiveImage(String liveImage) {
        this.liveImage = liveImage == null ? null : liveImage.trim();
    }

    public String getChatroomId() {
        return chatroomId;
    }

    public void setChatroomId(String chatroomId) {
        this.chatroomId = chatroomId == null ? null : chatroomId.trim();
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl == null ? null : pushUrl.trim();
    }

    public String getPullUrl() {
        return pullUrl;
    }

    public void setPullUrl(String pullUrl) {
        this.pullUrl = pullUrl == null ? null : pullUrl.trim();
    }

    public String getPullUrl2() {
        return pullUrl2;
    }

    public void setPullUrl2(String pullUrl2) {
        this.pullUrl2 = pullUrl2 == null ? null : pullUrl2.trim();
    }

    public String getPullRtmpUrl() {
        return pullRtmpUrl;
    }

    public void setPullRtmpUrl(String pullRtmpUrl) {
        this.pullRtmpUrl = pullRtmpUrl == null ? null : pullRtmpUrl.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getLiveType() {
        return liveType;
    }

    public void setLiveType(Byte liveType) {
        this.liveType = liveType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getWatchNum() {
        return watchNum;
    }

    public void setWatchNum(Integer watchNum) {
        this.watchNum = watchNum;
    }

    public Integer getChatroomStatus() {
        return chatroomStatus;
    }

    public void setChatroomStatus(Integer chatroomStatus) {
        this.chatroomStatus = chatroomStatus;
    }
}