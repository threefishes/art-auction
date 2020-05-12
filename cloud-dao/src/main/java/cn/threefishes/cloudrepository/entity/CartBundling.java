package cn.threefishes.cloudrepository.entity;

public class CartBundling {
    private Integer cartBundlingId;

    private Integer cartId;

    private Integer commonId;

    private Integer goodsId;

    private Integer memberId;

    public Integer getCartBundlingId() {
        return cartBundlingId;
    }

    public void setCartBundlingId(Integer cartBundlingId) {
        this.cartBundlingId = cartBundlingId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
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