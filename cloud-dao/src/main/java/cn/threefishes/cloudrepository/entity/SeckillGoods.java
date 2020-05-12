package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SeckillGoods {
    private Integer seckillGoodsId;

    private Integer commonId;

    private Date endTime;

    private Integer goodsId;

    private BigDecimal goodsPrice;

    private Integer goodsStorage;

    private Integer limitAmount;

    private Integer scheduleId;

    private Integer scheduleState;

    private Date startTime;

    public Integer getSeckillGoodsId() {
        return seckillGoodsId;
    }

    public void setSeckillGoodsId(Integer seckillGoodsId) {
        this.seckillGoodsId = seckillGoodsId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsStorage() {
        return goodsStorage;
    }

    public void setGoodsStorage(Integer goodsStorage) {
        this.goodsStorage = goodsStorage;
    }

    public Integer getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Integer limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getScheduleState() {
        return scheduleState;
    }

    public void setScheduleState(Integer scheduleState) {
        this.scheduleState = scheduleState;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}