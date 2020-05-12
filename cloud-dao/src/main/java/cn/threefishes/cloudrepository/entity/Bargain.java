package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Bargain {
    private Integer bargainId;

    private Integer scheduleState;

    private Integer bargainStorage;

    private BigDecimal bottomPrice;

    private Integer commonId;

    private Date endTime;

    private Integer goodsId;

    private BigDecimal intervalMax;

    private BigDecimal intervalMin;

    private Integer joinNumber;

    private Date startTime;

    public Integer getBargainId() {
        return bargainId;
    }

    public void setBargainId(Integer bargainId) {
        this.bargainId = bargainId;
    }

    public Integer getScheduleState() {
        return scheduleState;
    }

    public void setScheduleState(Integer scheduleState) {
        this.scheduleState = scheduleState;
    }

    public Integer getBargainStorage() {
        return bargainStorage;
    }

    public void setBargainStorage(Integer bargainStorage) {
        this.bargainStorage = bargainStorage;
    }

    public BigDecimal getBottomPrice() {
        return bottomPrice;
    }

    public void setBottomPrice(BigDecimal bottomPrice) {
        this.bottomPrice = bottomPrice;
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

    public BigDecimal getIntervalMax() {
        return intervalMax;
    }

    public void setIntervalMax(BigDecimal intervalMax) {
        this.intervalMax = intervalMax;
    }

    public BigDecimal getIntervalMin() {
        return intervalMin;
    }

    public void setIntervalMin(BigDecimal intervalMin) {
        this.intervalMin = intervalMin;
    }

    public Integer getJoinNumber() {
        return joinNumber;
    }

    public void setJoinNumber(Integer joinNumber) {
        this.joinNumber = joinNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}