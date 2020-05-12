package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Bundling {
    private Integer bundlingId;

    private String bundlingExplain;

    private String bundlingName;

    private String bundlingTitle;

    private Date endTime;

    private Date startTime;

    private Integer storeId;

    public Integer getBundlingId() {
        return bundlingId;
    }

    public void setBundlingId(Integer bundlingId) {
        this.bundlingId = bundlingId;
    }

    public String getBundlingExplain() {
        return bundlingExplain;
    }

    public void setBundlingExplain(String bundlingExplain) {
        this.bundlingExplain = bundlingExplain == null ? null : bundlingExplain.trim();
    }

    public String getBundlingName() {
        return bundlingName;
    }

    public void setBundlingName(String bundlingName) {
        this.bundlingName = bundlingName == null ? null : bundlingName.trim();
    }

    public String getBundlingTitle() {
        return bundlingTitle;
    }

    public void setBundlingTitle(String bundlingTitle) {
        this.bundlingTitle = bundlingTitle == null ? null : bundlingTitle.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}