package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Conform {
    private Integer conformId;

    private String conformName;

    private BigDecimal conformPrice;

    private Integer conformState;

    private String conformTitle;

    private Date endTime;

    private Integer isFreeFreight;

    private Integer isGift;

    private BigDecimal limitAmount;

    private String ruleOutAreaIds;

    private String ruleOutAreaNames;

    private Date startTime;

    private Integer storeId;

    private Integer templateId;

    private BigDecimal templatePrice;

    public Integer getConformId() {
        return conformId;
    }

    public void setConformId(Integer conformId) {
        this.conformId = conformId;
    }

    public String getConformName() {
        return conformName;
    }

    public void setConformName(String conformName) {
        this.conformName = conformName == null ? null : conformName.trim();
    }

    public BigDecimal getConformPrice() {
        return conformPrice;
    }

    public void setConformPrice(BigDecimal conformPrice) {
        this.conformPrice = conformPrice;
    }

    public Integer getConformState() {
        return conformState;
    }

    public void setConformState(Integer conformState) {
        this.conformState = conformState;
    }

    public String getConformTitle() {
        return conformTitle;
    }

    public void setConformTitle(String conformTitle) {
        this.conformTitle = conformTitle == null ? null : conformTitle.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIsFreeFreight() {
        return isFreeFreight;
    }

    public void setIsFreeFreight(Integer isFreeFreight) {
        this.isFreeFreight = isFreeFreight;
    }

    public Integer getIsGift() {
        return isGift;
    }

    public void setIsGift(Integer isGift) {
        this.isGift = isGift;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public String getRuleOutAreaIds() {
        return ruleOutAreaIds;
    }

    public void setRuleOutAreaIds(String ruleOutAreaIds) {
        this.ruleOutAreaIds = ruleOutAreaIds == null ? null : ruleOutAreaIds.trim();
    }

    public String getRuleOutAreaNames() {
        return ruleOutAreaNames;
    }

    public void setRuleOutAreaNames(String ruleOutAreaNames) {
        this.ruleOutAreaNames = ruleOutAreaNames == null ? null : ruleOutAreaNames.trim();
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

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public BigDecimal getTemplatePrice() {
        return templatePrice;
    }

    public void setTemplatePrice(BigDecimal templatePrice) {
        this.templatePrice = templatePrice;
    }
}