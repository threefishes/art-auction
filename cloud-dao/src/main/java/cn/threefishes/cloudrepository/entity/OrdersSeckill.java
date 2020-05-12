package cn.threefishes.cloudrepository.entity;

public class OrdersSeckill {
    private Integer ordersSeckillId;

    private Integer buyNum;

    private Integer memberId;

    private Integer seckillGoodsId;

    public Integer getOrdersSeckillId() {
        return ordersSeckillId;
    }

    public void setOrdersSeckillId(Integer ordersSeckillId) {
        this.ordersSeckillId = ordersSeckillId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getSeckillGoodsId() {
        return seckillGoodsId;
    }

    public void setSeckillGoodsId(Integer seckillGoodsId) {
        this.seckillGoodsId = seckillGoodsId;
    }
}