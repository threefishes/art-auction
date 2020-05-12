package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class VoucherTemplate {
    private Integer templateId;

    private Date addTime;

    private Integer appUsable;

    private Integer giveoutNum;

    private Integer haveCreated;

    private BigDecimal limitAmount;

    private Integer limitMembergradelevel;

    private String limitMembergradename;

    private Integer sellerId;

    private String sellerName;

    private Integer stateAdminId;

    private Integer storeId;

    private String storeName;

    private String templateDescribe;

    private BigDecimal templatePrice;

    private Date templateStartTime;

    private Integer templateState;

    private String templateTitle;

    private Integer templateType;

    private Integer totalNum;

    private Date updateTime;

    private Date useEndTime;

    private Date useStartTime;

    private Integer usedNum;

    private Integer validDays;

    private Integer voucherCenterRecommend;

    private Integer webUsable;

    private Integer wechatUsable;

    private Integer checkMaterial;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getAppUsable() {
        return appUsable;
    }

    public void setAppUsable(Integer appUsable) {
        this.appUsable = appUsable;
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

    public Integer getLimitMembergradelevel() {
        return limitMembergradelevel;
    }

    public void setLimitMembergradelevel(Integer limitMembergradelevel) {
        this.limitMembergradelevel = limitMembergradelevel;
    }

    public String getLimitMembergradename() {
        return limitMembergradename;
    }

    public void setLimitMembergradename(String limitMembergradename) {
        this.limitMembergradename = limitMembergradename == null ? null : limitMembergradename.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Integer getStateAdminId() {
        return stateAdminId;
    }

    public void setStateAdminId(Integer stateAdminId) {
        this.stateAdminId = stateAdminId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getTemplateDescribe() {
        return templateDescribe;
    }

    public void setTemplateDescribe(String templateDescribe) {
        this.templateDescribe = templateDescribe == null ? null : templateDescribe.trim();
    }

    public BigDecimal getTemplatePrice() {
        return templatePrice;
    }

    public void setTemplatePrice(BigDecimal templatePrice) {
        this.templatePrice = templatePrice;
    }

    public Date getTemplateStartTime() {
        return templateStartTime;
    }

    public void setTemplateStartTime(Date templateStartTime) {
        this.templateStartTime = templateStartTime;
    }

    public Integer getTemplateState() {
        return templateState;
    }

    public void setTemplateState(Integer templateState) {
        this.templateState = templateState;
    }

    public String getTemplateTitle() {
        return templateTitle;
    }

    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle == null ? null : templateTitle.trim();
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
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

    public Integer getVoucherCenterRecommend() {
        return voucherCenterRecommend;
    }

    public void setVoucherCenterRecommend(Integer voucherCenterRecommend) {
        this.voucherCenterRecommend = voucherCenterRecommend;
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

    public Integer getCheckMaterial() {
        return checkMaterial;
    }

    public void setCheckMaterial(Integer checkMaterial) {
        this.checkMaterial = checkMaterial;
    }
}