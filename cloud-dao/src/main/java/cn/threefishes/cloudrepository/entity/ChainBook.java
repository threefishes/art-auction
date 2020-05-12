package cn.threefishes.cloudrepository.entity;

public class ChainBook {
    private Integer chainBookId;

    private Integer buyNum;

    private Integer chainGoodsId;

    private Integer chainId;

    private String chainName;

    private Integer commonId;

    private Integer goodsId;

    private String goodsServices;

    private Integer memberId;

    public Integer getChainBookId() {
        return chainBookId;
    }

    public void setChainBookId(Integer chainBookId) {
        this.chainBookId = chainBookId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getChainGoodsId() {
        return chainGoodsId;
    }

    public void setChainGoodsId(Integer chainGoodsId) {
        this.chainGoodsId = chainGoodsId;
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName == null ? null : chainName.trim();
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

    public String getGoodsServices() {
        return goodsServices;
    }

    public void setGoodsServices(String goodsServices) {
        this.goodsServices = goodsServices == null ? null : goodsServices.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}