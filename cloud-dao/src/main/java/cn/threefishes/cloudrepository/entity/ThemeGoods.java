package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ThemeGoods {
    private Integer themeGoodsId;

    private String storeName;

    private Date addTime;

    private Integer commonId;

    private Integer storeId;

    private Integer themeId;

    private Integer themeVerify;

    private String verifyRemark;

    private Date verifyTime;

    public Integer getThemeGoodsId() {
        return themeGoodsId;
    }

    public void setThemeGoodsId(Integer themeGoodsId) {
        this.themeGoodsId = themeGoodsId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public Integer getThemeVerify() {
        return themeVerify;
    }

    public void setThemeVerify(Integer themeVerify) {
        this.themeVerify = themeVerify;
    }

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark == null ? null : verifyRemark.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }
}