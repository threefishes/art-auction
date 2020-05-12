package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class CancelOrdersCodPushLog {
    private Integer pushOrdersId;

    private Integer pushState;

    private String pushOrdersSn;

    private String pushData;

    private String pushContent;

    private Date pushCreateTime;

    private Date pushUpdateTime;

    public Integer getPushOrdersId() {
        return pushOrdersId;
    }

    public void setPushOrdersId(Integer pushOrdersId) {
        this.pushOrdersId = pushOrdersId;
    }

    public Integer getPushState() {
        return pushState;
    }

    public void setPushState(Integer pushState) {
        this.pushState = pushState;
    }

    public String getPushOrdersSn() {
        return pushOrdersSn;
    }

    public void setPushOrdersSn(String pushOrdersSn) {
        this.pushOrdersSn = pushOrdersSn == null ? null : pushOrdersSn.trim();
    }

    public String getPushData() {
        return pushData;
    }

    public void setPushData(String pushData) {
        this.pushData = pushData == null ? null : pushData.trim();
    }

    public String getPushContent() {
        return pushContent;
    }

    public void setPushContent(String pushContent) {
        this.pushContent = pushContent == null ? null : pushContent.trim();
    }

    public Date getPushCreateTime() {
        return pushCreateTime;
    }

    public void setPushCreateTime(Date pushCreateTime) {
        this.pushCreateTime = pushCreateTime;
    }

    public Date getPushUpdateTime() {
        return pushUpdateTime;
    }

    public void setPushUpdateTime(Date pushUpdateTime) {
        this.pushUpdateTime = pushUpdateTime;
    }
}