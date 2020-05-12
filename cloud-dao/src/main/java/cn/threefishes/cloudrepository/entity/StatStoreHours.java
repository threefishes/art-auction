package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatStoreHours {
    private Integer statId;

    private BigDecimal ordersAmount;

    private Long ordersGoodsNum;

    private Long ordersNum;

    private Date statDate;

    private Integer statHour;

    private Integer storeClassId;

    private String storeClassName;

    private Integer storeId;

    private String storeName;

    public Integer getStatId() {
        return statId;
    }

    public void setStatId(Integer statId) {
        this.statId = statId;
    }

    public BigDecimal getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(BigDecimal ordersAmount) {
        this.ordersAmount = ordersAmount;
    }

    public Long getOrdersGoodsNum() {
        return ordersGoodsNum;
    }

    public void setOrdersGoodsNum(Long ordersGoodsNum) {
        this.ordersGoodsNum = ordersGoodsNum;
    }

    public Long getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(Long ordersNum) {
        this.ordersNum = ordersNum;
    }

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public Integer getStatHour() {
        return statHour;
    }

    public void setStatHour(Integer statHour) {
        this.statHour = statHour;
    }

    public Integer getStoreClassId() {
        return storeClassId;
    }

    public void setStoreClassId(Integer storeClassId) {
        this.storeClassId = storeClassId;
    }

    public String getStoreClassName() {
        return storeClassName;
    }

    public void setStoreClassName(String storeClassName) {
        this.storeClassName = storeClassName == null ? null : storeClassName.trim();
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
}