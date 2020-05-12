package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class DwMemberUpdateLog {
    private Integer updateLogId;

    private Date updateCreateTime;

    private Integer updateFlag;

    private Integer updateMemberId;

    private Integer superiorMemberId;

    private Integer updateType;

    public Integer getUpdateLogId() {
        return updateLogId;
    }

    public void setUpdateLogId(Integer updateLogId) {
        this.updateLogId = updateLogId;
    }

    public Date getUpdateCreateTime() {
        return updateCreateTime;
    }

    public void setUpdateCreateTime(Date updateCreateTime) {
        this.updateCreateTime = updateCreateTime;
    }

    public Integer getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(Integer updateFlag) {
        this.updateFlag = updateFlag;
    }

    public Integer getUpdateMemberId() {
        return updateMemberId;
    }

    public void setUpdateMemberId(Integer updateMemberId) {
        this.updateMemberId = updateMemberId;
    }

    public Integer getSuperiorMemberId() {
        return superiorMemberId;
    }

    public void setSuperiorMemberId(Integer superiorMemberId) {
        this.superiorMemberId = superiorMemberId;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }
}