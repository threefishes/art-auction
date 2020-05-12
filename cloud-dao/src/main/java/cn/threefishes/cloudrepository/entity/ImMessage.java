package cn.threefishes.cloudrepository.entity;

public class ImMessage {
    private Integer messageId;

    private Long addTime;

    private Integer fromUserId;

    private String fromUserName;

    private Integer fromUserType;

    private String messageContent;

    private Integer messageState;

    private Integer messageStateAndroid;

    private Integer messageStateIos;

    private Integer messageStateWap;

    private Integer messageType;

    private Integer toUserId;

    private String toUserName;

    private Integer toUserType;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName == null ? null : fromUserName.trim();
    }

    public Integer getFromUserType() {
        return fromUserType;
    }

    public void setFromUserType(Integer fromUserType) {
        this.fromUserType = fromUserType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public Integer getMessageState() {
        return messageState;
    }

    public void setMessageState(Integer messageState) {
        this.messageState = messageState;
    }

    public Integer getMessageStateAndroid() {
        return messageStateAndroid;
    }

    public void setMessageStateAndroid(Integer messageStateAndroid) {
        this.messageStateAndroid = messageStateAndroid;
    }

    public Integer getMessageStateIos() {
        return messageStateIos;
    }

    public void setMessageStateIos(Integer messageStateIos) {
        this.messageStateIos = messageStateIos;
    }

    public Integer getMessageStateWap() {
        return messageStateWap;
    }

    public void setMessageStateWap(Integer messageStateWap) {
        this.messageStateWap = messageStateWap;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName == null ? null : toUserName.trim();
    }

    public Integer getToUserType() {
        return toUserType;
    }

    public void setToUserType(Integer toUserType) {
        this.toUserType = toUserType;
    }
}