package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CheckIn {
    private Integer id;

    private Integer memberId;

    private Integer superId;

    private Integer continueDays;

    private Integer activityId;

    private BigDecimal couponPrice;

    private Integer shareActivityId;

    private BigDecimal shareCouponPrice;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    public Integer getContinueDays() {
        return continueDays;
    }

    public void setContinueDays(Integer continueDays) {
        this.continueDays = continueDays;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Integer getShareActivityId() {
        return shareActivityId;
    }

    public void setShareActivityId(Integer shareActivityId) {
        this.shareActivityId = shareActivityId;
    }

    public BigDecimal getShareCouponPrice() {
        return shareCouponPrice;
    }

    public void setShareCouponPrice(BigDecimal shareCouponPrice) {
        this.shareCouponPrice = shareCouponPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}