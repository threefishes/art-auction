package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class OrdersPushLog {
    private Integer pushLogId;

    private Integer pushFlag;

    private Integer pushOrderId;

    private String pushContent;

    private Date pushCreateTime;

    public Integer getPushLogId() {
        return pushLogId;
    }

    public void setPushLogId(Integer pushLogId) {
        this.pushLogId = pushLogId;
    }

    public Integer getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(Integer pushFlag) {
        this.pushFlag = pushFlag;
    }

    public Integer getPushOrderId() {
        return pushOrderId;
    }

    public void setPushOrderId(Integer pushOrderId) {
        this.pushOrderId = pushOrderId;
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
}