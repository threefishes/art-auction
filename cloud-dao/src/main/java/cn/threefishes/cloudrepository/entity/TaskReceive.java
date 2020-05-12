package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TaskReceive {
    private Integer receiveId;

    private Integer memberId;

    private String memberName;

    private Integer taskId;

    private Integer filesId;

    private String vodFilesId;

    private Integer receiveState;

    private Integer sellerId;

    private String sellerName;

    private Date addTime;

    private Date updateTime;

    private Date auditTime;

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
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

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getFilesId() {
        return filesId;
    }

    public void setFilesId(Integer filesId) {
        this.filesId = filesId;
    }

    public String getVodFilesId() {
        return vodFilesId;
    }

    public void setVodFilesId(String vodFilesId) {
        this.vodFilesId = vodFilesId == null ? null : vodFilesId.trim();
    }

    public Integer getReceiveState() {
        return receiveState;
    }

    public void setReceiveState(Integer receiveState) {
        this.receiveState = receiveState;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}