package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Voucher {
    private Integer voucherId;

    private Date activeTime;

    private Integer appUsable;

    private Date endTime;

    private BigDecimal limitAmount;

    private Integer memberId;

    private String memberName;

    private Integer ordersId;

    private Long ordersSn;

    private BigDecimal price;

    private Date startTime;

    private Integer storeId;

    private String storeName;

    private Integer templateId;

    private Integer type;

    private String voucherCode;

    private String voucherDescribe;

    private Integer voucherState;

    private String voucherTitle;

    private Integer webUsable;

    private Integer wechatUsable;

    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Integer getAppUsable() {
        return appUsable;
    }

    public void setAppUsable(Integer appUsable) {
        this.appUsable = appUsable;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Long getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(Long ordersSn) {
        this.ordersSn = ordersSn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    public String getVoucherDescribe() {
        return voucherDescribe;
    }

    public void setVoucherDescribe(String voucherDescribe) {
        this.voucherDescribe = voucherDescribe == null ? null : voucherDescribe.trim();
    }

    public Integer getVoucherState() {
        return voucherState;
    }

    public void setVoucherState(Integer voucherState) {
        this.voucherState = voucherState;
    }

    public String getVoucherTitle() {
        return voucherTitle;
    }

    public void setVoucherTitle(String voucherTitle) {
        this.voucherTitle = voucherTitle == null ? null : voucherTitle.trim();
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