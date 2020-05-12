package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class RefundReason {
    private Integer reasonId;

    private String reasonInfo;

    private Integer reasonSort;

    private Date updateTime;

    public Integer getReasonId() {
        return reasonId;
    }

    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    public String getReasonInfo() {
        return reasonInfo;
    }

    public void setReasonInfo(String reasonInfo) {
        this.reasonInfo = reasonInfo == null ? null : reasonInfo.trim();
    }

    public Integer getReasonSort() {
        return reasonSort;
    }

    public void setReasonSort(Integer reasonSort) {
        this.reasonSort = reasonSort;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}