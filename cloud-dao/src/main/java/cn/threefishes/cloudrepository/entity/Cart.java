package cn.threefishes.cloudrepository.entity;

public class Cart {
    private Integer cartId;

    private Integer bundlingId;

    private Integer buyNum;

    private Integer commonId;

    private Integer distributionOrdersId;

    private Integer goodsId;

    private Integer memberId;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getBundlingId() {
        return bundlingId;
    }

    public void setBundlingId(Integer bundlingId) {
        this.bundlingId = bundlingId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getDistributionOrdersId() {
        return distributionOrdersId;
    }

    public void setDistributionOrdersId(Integer distributionOrdersId) {
        this.distributionOrdersId = distributionOrdersId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}