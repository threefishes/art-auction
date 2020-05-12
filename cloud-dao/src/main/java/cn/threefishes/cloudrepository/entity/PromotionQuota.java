package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class PromotionQuota {
    private Integer storeId;

    private Date bargainEndTime;

    private Date bookEndTime;

    private Date bundlingEndTime;

    private Date comboEndTime;

    private Date conformEndTime;

    private Date discountEndTime;

    private Date giftEndTime;

    private Date groupEndTime;

    private Date pointsGoodsEndTime;

    private Date seckillEndTime;

    private String storeName;

    private Date themeEndTime;

    private Date trysEndTime;

    private Date voucherEndTime;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getBargainEndTime() {
        return bargainEndTime;
    }

    public void setBargainEndTime(Date bargainEndTime) {
        this.bargainEndTime = bargainEndTime;
    }

    public Date getBookEndTime() {
        return bookEndTime;
    }

    public void setBookEndTime(Date bookEndTime) {
        this.bookEndTime = bookEndTime;
    }

    public Date getBundlingEndTime() {
        return bundlingEndTime;
    }

    public void setBundlingEndTime(Date bundlingEndTime) {
        this.bundlingEndTime = bundlingEndTime;
    }

    public Date getComboEndTime() {
        return comboEndTime;
    }

    public void setComboEndTime(Date comboEndTime) {
        this.comboEndTime = comboEndTime;
    }

    public Date getConformEndTime() {
        return conformEndTime;
    }

    public void setConformEndTime(Date conformEndTime) {
        this.conformEndTime = conformEndTime;
    }

    public Date getDiscountEndTime() {
        return discountEndTime;
    }

    public void setDiscountEndTime(Date discountEndTime) {
        this.discountEndTime = discountEndTime;
    }

    public Date getGiftEndTime() {
        return giftEndTime;
    }

    public void setGiftEndTime(Date giftEndTime) {
        this.giftEndTime = giftEndTime;
    }

    public Date getGroupEndTime() {
        return groupEndTime;
    }

    public void setGroupEndTime(Date groupEndTime) {
        this.groupEndTime = groupEndTime;
    }

    public Date getPointsGoodsEndTime() {
        return pointsGoodsEndTime;
    }

    public void setPointsGoodsEndTime(Date pointsGoodsEndTime) {
        this.pointsGoodsEndTime = pointsGoodsEndTime;
    }

    public Date getSeckillEndTime() {
        return seckillEndTime;
    }

    public void setSeckillEndTime(Date seckillEndTime) {
        this.seckillEndTime = seckillEndTime;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Date getThemeEndTime() {
        return themeEndTime;
    }

    public void setThemeEndTime(Date themeEndTime) {
        this.themeEndTime = themeEndTime;
    }

    public Date getTrysEndTime() {
        return trysEndTime;
    }

    public void setTrysEndTime(Date trysEndTime) {
        this.trysEndTime = trysEndTime;
    }

    public Date getVoucherEndTime() {
        return voucherEndTime;
    }

    public void setVoucherEndTime(Date voucherEndTime) {
        this.voucherEndTime = voucherEndTime;
    }
}