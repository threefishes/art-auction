package cn.threefishes.cloudrepository.entity;

public class ActivityAwards {
    private Integer awardsId;

    private Integer activityId;

    private String awardsContent;

    private Integer awardsCount;

    private Integer awardsGiveCount;

    private Integer awardsInfoId;

    private String awardsName;

    private Float awardsRate;

    private Integer awardsState;

    private String awardsType;

    public Integer getAwardsId() {
        return awardsId;
    }

    public void setAwardsId(Integer awardsId) {
        this.awardsId = awardsId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getAwardsContent() {
        return awardsContent;
    }

    public void setAwardsContent(String awardsContent) {
        this.awardsContent = awardsContent == null ? null : awardsContent.trim();
    }

    public Integer getAwardsCount() {
        return awardsCount;
    }

    public void setAwardsCount(Integer awardsCount) {
        this.awardsCount = awardsCount;
    }

    public Integer getAwardsGiveCount() {
        return awardsGiveCount;
    }

    public void setAwardsGiveCount(Integer awardsGiveCount) {
        this.awardsGiveCount = awardsGiveCount;
    }

    public Integer getAwardsInfoId() {
        return awardsInfoId;
    }

    public void setAwardsInfoId(Integer awardsInfoId) {
        this.awardsInfoId = awardsInfoId;
    }

    public String getAwardsName() {
        return awardsName;
    }

    public void setAwardsName(String awardsName) {
        this.awardsName = awardsName == null ? null : awardsName.trim();
    }

    public Float getAwardsRate() {
        return awardsRate;
    }

    public void setAwardsRate(Float awardsRate) {
        this.awardsRate = awardsRate;
    }

    public Integer getAwardsState() {
        return awardsState;
    }

    public void setAwardsState(Integer awardsState) {
        this.awardsState = awardsState;
    }

    public String getAwardsType() {
        return awardsType;
    }

    public void setAwardsType(String awardsType) {
        this.awardsType = awardsType == null ? null : awardsType.trim();
    }
}