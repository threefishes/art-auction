package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ComplainTalk {
    private Integer talkId;

    private Integer complainId;

    private Integer disableState;

    private String talkContent;

    private Date talkName;

    private Integer talkType;

    private String talkUser;

    private Integer userId;

    public Integer getTalkId() {
        return talkId;
    }

    public void setTalkId(Integer talkId) {
        this.talkId = talkId;
    }

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public Integer getDisableState() {
        return disableState;
    }

    public void setDisableState(Integer disableState) {
        this.disableState = disableState;
    }

    public String getTalkContent() {
        return talkContent;
    }

    public void setTalkContent(String talkContent) {
        this.talkContent = talkContent == null ? null : talkContent.trim();
    }

    public Date getTalkName() {
        return talkName;
    }

    public void setTalkName(Date talkName) {
        this.talkName = talkName;
    }

    public Integer getTalkType() {
        return talkType;
    }

    public void setTalkType(Integer talkType) {
        this.talkType = talkType;
    }

    public String getTalkUser() {
        return talkUser;
    }

    public void setTalkUser(String talkUser) {
        this.talkUser = talkUser == null ? null : talkUser.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}