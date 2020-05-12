package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class DwPushLog {
    private Integer pushLogId;

    private String pushContent;

    private Date pushCreateTime;

    private Integer pushFlag;

    private Integer pushType;

    private String pushParams;

    private String ordersSn;

    private String returnContent;

    private Date returnTime;

    public Integer getPushLogId() {
        return pushLogId;
    }

    public void setPushLogId(Integer pushLogId) {
        this.pushLogId = pushLogId;
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

    public Integer getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(Integer pushFlag) {
        this.pushFlag = pushFlag;
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    public String getPushParams() {
        return pushParams;
    }

    public void setPushParams(String pushParams) {
        this.pushParams = pushParams == null ? null : pushParams.trim();
    }

    public String getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(String ordersSn) {
        this.ordersSn = ordersSn == null ? null : ordersSn.trim();
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent == null ? null : returnContent.trim();
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }
}