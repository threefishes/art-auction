package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Discount {
    private Integer discountId;

    private String discountExplain;

    private String discountName;

    private Double discountRate;

    private Integer discountState;

    private String discountTitle;

    private Date endTime;

    private Integer limitAmount;

    private Date startTime;

    private Integer storeId;

    private Integer webUsable;

    private Integer appUsable;

    private Integer wechatUsable;

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public String getDiscountExplain() {
        return discountExplain;
    }

    public void setDiscountExplain(String discountExplain) {
        this.discountExplain = discountExplain == null ? null : discountExplain.trim();
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName == null ? null : discountName.trim();
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public Integer getDiscountState() {
        return discountState;
    }

    public void setDiscountState(Integer discountState) {
        this.discountState = discountState;
    }

    public String getDiscountTitle() {
        return discountTitle;
    }

    public void setDiscountTitle(String discountTitle) {
        this.discountTitle = discountTitle == null ? null : discountTitle.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Integer limitAmount) {
        this.limitAmount = limitAmount;
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

    public Integer getWebUsable() {
        return webUsable;
    }

    public void setWebUsable(Integer webUsable) {
        this.webUsable = webUsable;
    }

    public Integer getAppUsable() {
        return appUsable;
    }

    public void setAppUsable(Integer appUsable) {
        this.appUsable = appUsable;
    }

    public Integer getWechatUsable() {
        return wechatUsable;
    }

    public void setWechatUsable(Integer wechatUsable) {
        this.wechatUsable = wechatUsable;
    }
}