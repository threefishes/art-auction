package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;

public class BundlingGoods extends BundlingGoodsKey {
    private Integer commonId;

    private BigDecimal goodsPrice;

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}