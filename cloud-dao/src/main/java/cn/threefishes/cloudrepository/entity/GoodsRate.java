package cn.threefishes.cloudrepository.entity;

public class GoodsRate {
    private Integer goodsId;

    private Integer commonId;

    private Integer commissionRate;

    private Integer categoryCommissionRate;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getCategoryCommissionRate() {
        return categoryCommissionRate;
    }

    public void setCategoryCommissionRate(Integer categoryCommissionRate) {
        this.categoryCommissionRate = categoryCommissionRate;
    }
}