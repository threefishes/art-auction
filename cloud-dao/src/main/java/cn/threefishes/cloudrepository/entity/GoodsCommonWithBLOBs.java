package cn.threefishes.cloudrepository.entity;

public class GoodsCommonWithBLOBs extends GoodsCommon {
    private String goodsSpecValueJson;

    private String specJson;

    public String getGoodsSpecValueJson() {
        return goodsSpecValueJson;
    }

    public void setGoodsSpecValueJson(String goodsSpecValueJson) {
        this.goodsSpecValueJson = goodsSpecValueJson == null ? null : goodsSpecValueJson.trim();
    }

    public String getSpecJson() {
        return specJson;
    }

    public void setSpecJson(String specJson) {
        this.specJson = specJson == null ? null : specJson.trim();
    }
}