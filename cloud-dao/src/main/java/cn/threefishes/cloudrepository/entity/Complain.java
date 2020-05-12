package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Complain {
    private Integer complainId;

    private String accusedContent;

    private Integer accusedId;

    private String accusedImages;

    private String accusedName;

    private Integer accusedSellerId;

    private Date accusedTime;

    private String accuserContent;

    private Integer accuserId;

    private String accuserImages;

    private String accuserName;

    private Date accuserTime;

    private String adminCheckContent;

    private String adminCheckName;

    private Date adminCheckTime;

    private String adminConfirmContent;

    private String adminConfirmName;

    private Date adminConfirmTime;

    private Integer commonId;

    private Integer complainState;

    private String goodsFullSpecs;

    private Integer goodsId;

    private String goodsImage;

    private String goodsName;

    private Integer ordersGoodsId;

    private Integer ordersId;

    private String ordersSn;

    private Integer subjectId;

    private String subjectTitle;

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public String getAccusedContent() {
        return accusedContent;
    }

    public void setAccusedContent(String accusedContent) {
        this.accusedContent = accusedContent == null ? null : accusedContent.trim();
    }

    public Integer getAccusedId() {
        return accusedId;
    }

    public void setAccusedId(Integer accusedId) {
        this.accusedId = accusedId;
    }

    public String getAccusedImages() {
        return accusedImages;
    }

    public void setAccusedImages(String accusedImages) {
        this.accusedImages = accusedImages == null ? null : accusedImages.trim();
    }

    public String getAccusedName() {
        return accusedName;
    }

    public void setAccusedName(String accusedName) {
        this.accusedName = accusedName == null ? null : accusedName.trim();
    }

    public Integer getAccusedSellerId() {
        return accusedSellerId;
    }

    public void setAccusedSellerId(Integer accusedSellerId) {
        this.accusedSellerId = accusedSellerId;
    }

    public Date getAccusedTime() {
        return accusedTime;
    }

    public void setAccusedTime(Date accusedTime) {
        this.accusedTime = accusedTime;
    }

    public String getAccuserContent() {
        return accuserContent;
    }

    public void setAccuserContent(String accuserContent) {
        this.accuserContent = accuserContent == null ? null : accuserContent.trim();
    }

    public Integer getAccuserId() {
        return accuserId;
    }

    public void setAccuserId(Integer accuserId) {
        this.accuserId = accuserId;
    }

    public String getAccuserImages() {
        return accuserImages;
    }

    public void setAccuserImages(String accuserImages) {
        this.accuserImages = accuserImages == null ? null : accuserImages.trim();
    }

    public String getAccuserName() {
        return accuserName;
    }

    public void setAccuserName(String accuserName) {
        this.accuserName = accuserName == null ? null : accuserName.trim();
    }

    public Date getAccuserTime() {
        return accuserTime;
    }

    public void setAccuserTime(Date accuserTime) {
        this.accuserTime = accuserTime;
    }

    public String getAdminCheckContent() {
        return adminCheckContent;
    }

    public void setAdminCheckContent(String adminCheckContent) {
        this.adminCheckContent = adminCheckContent == null ? null : adminCheckContent.trim();
    }

    public String getAdminCheckName() {
        return adminCheckName;
    }

    public void setAdminCheckName(String adminCheckName) {
        this.adminCheckName = adminCheckName == null ? null : adminCheckName.trim();
    }

    public Date getAdminCheckTime() {
        return adminCheckTime;
    }

    public void setAdminCheckTime(Date adminCheckTime) {
        this.adminCheckTime = adminCheckTime;
    }

    public String getAdminConfirmContent() {
        return adminConfirmContent;
    }

    public void setAdminConfirmContent(String adminConfirmContent) {
        this.adminConfirmContent = adminConfirmContent == null ? null : adminConfirmContent.trim();
    }

    public String getAdminConfirmName() {
        return adminConfirmName;
    }

    public void setAdminConfirmName(String adminConfirmName) {
        this.adminConfirmName = adminConfirmName == null ? null : adminConfirmName.trim();
    }

    public Date getAdminConfirmTime() {
        return adminConfirmTime;
    }

    public void setAdminConfirmTime(Date adminConfirmTime) {
        this.adminConfirmTime = adminConfirmTime;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getComplainState() {
        return complainState;
    }

    public void setComplainState(Integer complainState) {
        this.complainState = complainState;
    }

    public String getGoodsFullSpecs() {
        return goodsFullSpecs;
    }

    public void setGoodsFullSpecs(String goodsFullSpecs) {
        this.goodsFullSpecs = goodsFullSpecs == null ? null : goodsFullSpecs.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getOrdersGoodsId() {
        return ordersGoodsId;
    }

    public void setOrdersGoodsId(Integer ordersGoodsId) {
        this.ordersGoodsId = ordersGoodsId;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(String ordersSn) {
        this.ordersSn = ordersSn == null ? null : ordersSn.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle == null ? null : subjectTitle.trim();
    }
}