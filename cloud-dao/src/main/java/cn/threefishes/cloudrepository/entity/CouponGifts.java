package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CouponGifts {
    private Integer giftsId;

    private String activityIdJson;

    private Date addTime;

    private Integer adminId;

    private String adminName;

    private String bannerImgApp;

    private String bannerImgPc;

    private Date giftsEndTime;

    private String giftsExplain;

    private String giftsName;

    private BigDecimal giftsPrice;

    private Date giftsStartTime;

    private Integer giftsState;

    private Integer giftsType;

    private Integer giveoutNum;

    private String themeColor;

    private Integer totalNum;

    private Date updateTime;

    private String voucherTemplateIdJson;

    private Integer isSend;

    public Integer getGiftsId() {
        return giftsId;
    }

    public void setGiftsId(Integer giftsId) {
        this.giftsId = giftsId;
    }

    public String getActivityIdJson() {
        return activityIdJson;
    }

    public void setActivityIdJson(String activityIdJson) {
        this.activityIdJson = activityIdJson == null ? null : activityIdJson.trim();
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

    public String getBannerImgApp() {
        return bannerImgApp;
    }

    public void setBannerImgApp(String bannerImgApp) {
        this.bannerImgApp = bannerImgApp == null ? null : bannerImgApp.trim();
    }

    public String getBannerImgPc() {
        return bannerImgPc;
    }

    public void setBannerImgPc(String bannerImgPc) {
        this.bannerImgPc = bannerImgPc == null ? null : bannerImgPc.trim();
    }

    public Date getGiftsEndTime() {
        return giftsEndTime;
    }

    public void setGiftsEndTime(Date giftsEndTime) {
        this.giftsEndTime = giftsEndTime;
    }

    public String getGiftsExplain() {
        return giftsExplain;
    }

    public void setGiftsExplain(String giftsExplain) {
        this.giftsExplain = giftsExplain == null ? null : giftsExplain.trim();
    }

    public String getGiftsName() {
        return giftsName;
    }

    public void setGiftsName(String giftsName) {
        this.giftsName = giftsName == null ? null : giftsName.trim();
    }

    public BigDecimal getGiftsPrice() {
        return giftsPrice;
    }

    public void setGiftsPrice(BigDecimal giftsPrice) {
        this.giftsPrice = giftsPrice;
    }

    public Date getGiftsStartTime() {
        return giftsStartTime;
    }

    public void setGiftsStartTime(Date giftsStartTime) {
        this.giftsStartTime = giftsStartTime;
    }

    public Integer getGiftsState() {
        return giftsState;
    }

    public void setGiftsState(Integer giftsState) {
        this.giftsState = giftsState;
    }

    public Integer getGiftsType() {
        return giftsType;
    }

    public void setGiftsType(Integer giftsType) {
        this.giftsType = giftsType;
    }

    public Integer getGiveoutNum() {
        return giveoutNum;
    }

    public void setGiveoutNum(Integer giveoutNum) {
        this.giveoutNum = giveoutNum;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor == null ? null : themeColor.trim();
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

    public String getVoucherTemplateIdJson() {
        return voucherTemplateIdJson;
    }

    public void setVoucherTemplateIdJson(String voucherTemplateIdJson) {
        this.voucherTemplateIdJson = voucherTemplateIdJson == null ? null : voucherTemplateIdJson.trim();
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }
}