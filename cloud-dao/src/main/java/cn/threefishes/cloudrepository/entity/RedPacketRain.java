package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class RedPacketRain {
    private Integer rainId;

    private Integer showHome;

    private Integer showTv;

    private Integer showSpecail;

    private String rainName;

    private Integer activityRate;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Integer isDel;

    public Integer getRainId() {
        return rainId;
    }

    public void setRainId(Integer rainId) {
        this.rainId = rainId;
    }

    public Integer getShowHome() {
        return showHome;
    }

    public void setShowHome(Integer showHome) {
        this.showHome = showHome;
    }

    public Integer getShowTv() {
        return showTv;
    }

    public void setShowTv(Integer showTv) {
        this.showTv = showTv;
    }

    public Integer getShowSpecail() {
        return showSpecail;
    }

    public void setShowSpecail(Integer showSpecail) {
        this.showSpecail = showSpecail;
    }

    public String getRainName() {
        return rainName;
    }

    public void setRainName(String rainName) {
        this.rainName = rainName == null ? null : rainName.trim();
    }

    public Integer getActivityRate() {
        return activityRate;
    }

    public void setActivityRate(Integer activityRate) {
        this.activityRate = activityRate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}