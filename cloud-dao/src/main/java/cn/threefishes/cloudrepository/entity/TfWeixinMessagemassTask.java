package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TfWeixinMessagemassTask {
    private Integer taskId;

    private String taskName;

    private String memberIds;

    private String content;

    private Integer finishState;

    private Date addTime;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(String memberIds) {
        this.memberIds = memberIds == null ? null : memberIds.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getFinishState() {
        return finishState;
    }

    public void setFinishState(Integer finishState) {
        this.finishState = finishState;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}