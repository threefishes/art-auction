package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ExchangeOrders {
    private Integer id;

    private String exchangeSn;

    private String exchangeUserName;

    private Integer ordersId;

    private String ordersSn;

    private Integer goodsCommonId;

    private String goodsImage;

    private String goodsName;

    private Double exchangeAmount;

    private Integer exchangeNum;

    private Integer shipId;

    private String shipCode;

    private String shipSn;

    private String shipInfo;

    private Date shipTime;

    private Integer state;

    private String exchangeNote;

    private String exchangeReason;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExchangeSn() {
        return exchangeSn;
    }

    public void setExchangeSn(String exchangeSn) {
        this.exchangeSn = exchangeSn == null ? null : exchangeSn.trim();
    }

    public String getExchangeUserName() {
        return exchangeUserName;
    }

    public void setExchangeUserName(String exchangeUserName) {
        this.exchangeUserName = exchangeUserName == null ? null : exchangeUserName.trim();
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

    public Integer getGoodsCommonId() {
        return goodsCommonId;
    }

    public void setGoodsCommonId(Integer goodsCommonId) {
        this.goodsCommonId = goodsCommonId;
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

    public Double getExchangeAmount() {
        return exchangeAmount;
    }

    public void setExchangeAmount(Double exchangeAmount) {
        this.exchangeAmount = exchangeAmount;
    }

    public Integer getExchangeNum() {
        return exchangeNum;
    }

    public void setExchangeNum(Integer exchangeNum) {
        this.exchangeNum = exchangeNum;
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode == null ? null : shipCode.trim();
    }

    public String getShipSn() {
        return shipSn;
    }

    public void setShipSn(String shipSn) {
        this.shipSn = shipSn == null ? null : shipSn.trim();
    }

    public String getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(String shipInfo) {
        this.shipInfo = shipInfo == null ? null : shipInfo.trim();
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getExchangeNote() {
        return exchangeNote;
    }

    public void setExchangeNote(String exchangeNote) {
        this.exchangeNote = exchangeNote == null ? null : exchangeNote.trim();
    }

    public String getExchangeReason() {
        return exchangeReason;
    }

    public void setExchangeReason(String exchangeReason) {
        this.exchangeReason = exchangeReason == null ? null : exchangeReason.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}