package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatPromotionHours {
    private Integer statId;

    private BigDecimal ordersAmount;

    private Long ordersGoodsNum;

    private Long ordersNum;

    private Integer promotionType;

    private Date statDate;

    private Integer statHour;

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

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
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
}