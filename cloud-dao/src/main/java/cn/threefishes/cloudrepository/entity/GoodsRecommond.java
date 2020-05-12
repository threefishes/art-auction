package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class GoodsRecommond {
    private Integer recommondId;

    private Date addTime;

    private Integer categoryId;

    private String categoryText;

    private Integer commonId;

    private Integer goodsCategoryId;

    private Integer goodsCategoryId1;

    private Integer goodsCategoryId2;

    private Integer goodsCategoryId3;

    private String goodsImageName;

    private String goodsName;

    public Integer getRecommondId() {
        return recommondId;
    }

    public void setRecommondId(Integer recommondId) {
        this.recommondId = recommondId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryText() {
        return categoryText;
    }

    public void setCategoryText(String categoryText) {
        this.categoryText = categoryText == null ? null : categoryText.trim();
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Integer goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public Integer getGoodsCategoryId1() {
        return goodsCategoryId1;
    }

    public void setGoodsCategoryId1(Integer goodsCategoryId1) {
        this.goodsCategoryId1 = goodsCategoryId1;
    }

    public Integer getGoodsCategoryId2() {
        return goodsCategoryId2;
    }

    public void setGoodsCategoryId2(Integer goodsCategoryId2) {
        this.goodsCategoryId2 = goodsCategoryId2;
    }

    public Integer getGoodsCategoryId3() {
        return goodsCategoryId3;
    }

    public void setGoodsCategoryId3(Integer goodsCategoryId3) {
        this.goodsCategoryId3 = goodsCategoryId3;
    }

    public String getGoodsImageName() {
        return goodsImageName;
    }

    public void setGoodsImageName(String goodsImageName) {
        this.goodsImageName = goodsImageName == null ? null : goodsImageName.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }
}