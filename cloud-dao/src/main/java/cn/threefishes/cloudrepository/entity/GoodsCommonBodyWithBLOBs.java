package cn.threefishes.cloudrepository.entity;

public class GoodsCommonBodyWithBLOBs extends GoodsCommonBody {
    private String goodsBody;

    private String mobileBody;

    public String getGoodsBody() {
        return goodsBody;
    }

    public void setGoodsBody(String goodsBody) {
        this.goodsBody = goodsBody == null ? null : goodsBody.trim();
    }

    public String getMobileBody() {
        return mobileBody;
    }

    public void setMobileBody(String mobileBody) {
        this.mobileBody = mobileBody == null ? null : mobileBody.trim();
    }
}