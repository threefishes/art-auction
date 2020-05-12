package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CouponActivity {
    private Integer activityId;

    private String activityExplain;

    private String activityName;

    private Date activityStartTime;

    private Integer activityState;

    private Integer activityType;

    private Date addTime;

    private Integer adminId;

    private String adminName;

    private Integer appUsable;

    private BigDecimal couponPrice;

    private Integer expendPoints;

    private Integer giveoutNum;

    private Integer haveCreated;

    private BigDecimal limitAmount;

    private Integer limitMemberGradeLevel;

    private String limitMemberGradeName;

    private Integer recommendState;

    private Double storeCommitmentRate;

    private Integer totalNum;

    private Date updateTime;

    private Date useEndTime;

    private Integer useGoodsRange;

    private String useGoodsRangeExplain;

    private Date useStartTime;

    private Integer usedNum;

    private Integer validDays;

    private Integer webUsable;

    private Integer wechatUsable;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityExplain() {
        return activityExplain;
    }

    public void setActivityExplain(String activityExplain) {
        this.activityExplain = activityExplain == null ? null : activityExplain.trim();
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Integer getActivityState() {
        return activityState;
    }

    public void setActivityState(Integer activityState) {
        this.activityState = activityState;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Integer getAppUsable() {
        return appUsable;
    }

    public void setAppUsable(Integer appUsable) {
        this.appUsable = appUsable;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Integer getExpendPoints() {
        return expendPoints;
    }

    public void setExpendPoints(Integer expendPoints) {
        this.expendPoints = expendPoints;
    }

    public Integer getGiveoutNum() {
        return giveoutNum;
    }

    public void setGiveoutNum(Integer giveoutNum) {
        this.giveoutNum = giveoutNum;
    }

    public Integer getHaveCreated() {
        return haveCreated;
    }

    public void setHaveCreated(Integer haveCreated) {
        this.haveCreated = haveCreated;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Integer getLimitMemberGradeLevel() {
        return limitMemberGradeLevel;
    }

    public void setLimitMemberGradeLevel(Integer limitMemberGradeLevel) {
        this.limitMemberGradeLevel = limitMemberGradeLevel;
    }

    public String getLimitMemberGradeName() {
        return limitMemberGradeName;
    }

    public void setLimitMemberGradeName(String limitMemberGradeName) {
        this.limitMemberGradeName = limitMemberGradeName == null ? null : limitMemberGradeName.trim();
    }

    public Integer getRecommendState() {
        return recommendState;
    }

    public void setRecommendState(Integer recommendState) {
        this.recommendState = recommendState;
    }

    public Double getStoreCommitmentRate() {
        return storeCommitmentRate;
    }

    public void setStoreCommitmentRate(Double storeCommitmentRate) {
        this.storeCommitmentRate = storeCommitmentRate;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(Date useEndTime) {
        this.useEndTime = useEndTime;
    }

    public Integer getUseGoodsRange() {
        return useGoodsRange;
    }

    public void setUseGoodsRange(Integer useGoodsRange) {
        this.useGoodsRange = useGoodsRange;
    }

    public String getUseGoodsRangeExplain() {
        return useGoodsRangeExplain;
    }

    public void setUseGoodsRangeExplain(String useGoodsRangeExplain) {
        this.useGoodsRangeExplain = useGoodsRangeExplain == null ? null : useGoodsRangeExplain.trim();
    }

    public Date getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(Date useStartTime) {
        this.useStartTime = useStartTime;
    }

    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    public Integer getWebUsable() {
        return webUsable;
    }

    public void setWebUsable(Integer webUsable) {
        this.webUsable = webUsable;
    }

    public Integer getWechatUsable() {
        return wechatUsable;
    }

    public void setWechatUsable(Integer wechatUsable) {
        this.wechatUsable = wechatUsable;
    }
}