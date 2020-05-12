package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;

public class StatCategoryGeneral {
    private Integer statId;

    private Integer categoryId;

    private Integer categoryId1;

    private Integer categoryId2;

    private Integer categoryId3;

    private String categoryName;

    private Integer deep;

    private Long goodsCount;

    private Long haveOrdersGoodsCount;

    private Long noOrdersGoodsCount;

    private BigDecimal ordersAmount;

    private Long ordersNum;

    public Integer getStatId() {
        return statId;
    }

    public void setStatId(Integer statId) {
        this.statId = statId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(Integer categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public Integer getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(Integer categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public Integer getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(Integer categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getDeep() {
        return deep;
    }

    public void setDeep(Integer deep) {
        this.deep = deep;
    }

    public Long getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Long goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Long getHaveOrdersGoodsCount() {
        return haveOrdersGoodsCount;
    }

    public void setHaveOrdersGoodsCount(Long haveOrdersGoodsCount) {
        this.haveOrdersGoodsCount = haveOrdersGoodsCount;
    }

    public Long getNoOrdersGoodsCount() {
        return noOrdersGoodsCount;
    }

    public void setNoOrdersGoodsCount(Long noOrdersGoodsCount) {
        this.noOrdersGoodsCount = noOrdersGoodsCount;
    }

    public BigDecimal getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(BigDecimal ordersAmount) {
        this.ordersAmount = ordersAmount;
    }

    public Long getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(Long ordersNum) {
        this.ordersNum = ordersNum;
    }
}