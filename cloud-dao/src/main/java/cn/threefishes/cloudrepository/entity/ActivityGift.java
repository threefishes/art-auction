package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;

public class ActivityGift {
    private Integer giftId;

    private String giftGoodsName;

    private String giftImageName;

    private BigDecimal giftPrice;

    private Integer giftState;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftGoodsName() {
        return giftGoodsName;
    }

    public void setGiftGoodsName(String giftGoodsName) {
        this.giftGoodsName = giftGoodsName == null ? null : giftGoodsName.trim();
    }

    public String getGiftImageName() {
        return giftImageName;
    }

    public void setGiftImageName(String giftImageName) {
        this.giftImageName = giftImageName == null ? null : giftImageName.trim();
    }

    public BigDecimal getGiftPrice() {
        return giftPrice;
    }

    public void setGiftPrice(BigDecimal giftPrice) {
        this.giftPrice = giftPrice;
    }

    public Integer getGiftState() {
        return giftState;
    }

    public void setGiftState(Integer giftState) {
        this.giftState = giftState;
    }
}