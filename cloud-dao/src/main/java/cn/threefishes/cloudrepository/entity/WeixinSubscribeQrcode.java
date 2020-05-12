package cn.threefishes.cloudrepository.entity;

public class WeixinSubscribeQrcode {
    private Integer dataId;

    private String sign;

    private String type;

    private Integer weixinQrcodeId;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getWeixinQrcodeId() {
        return weixinQrcodeId;
    }

    public void setWeixinQrcodeId(Integer weixinQrcodeId) {
        this.weixinQrcodeId = weixinQrcodeId;
    }
}