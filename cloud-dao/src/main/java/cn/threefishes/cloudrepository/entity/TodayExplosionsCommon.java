package cn.threefishes.cloudrepository.entity;

public class TodayExplosionsCommon {
    private Integer explosionsCommonId;

    private Integer scheduleId;

    private Integer commonId;

    private String goodsName;

    private Integer sort;

    private String goodsDescribe;

    private String goodsImage;

    private String buyerSays;

    private String tagOne;

    private String tagTwo;

    private String tagThree;

    public Integer getExplosionsCommonId() {
        return explosionsCommonId;
    }

    public void setExplosionsCommonId(Integer explosionsCommonId) {
        this.explosionsCommonId = explosionsCommonId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe == null ? null : goodsDescribe.trim();
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public String getBuyerSays() {
        return buyerSays;
    }

    public void setBuyerSays(String buyerSays) {
        this.buyerSays = buyerSays == null ? null : buyerSays.trim();
    }

    public String getTagOne() {
        return tagOne;
    }

    public void setTagOne(String tagOne) {
        this.tagOne = tagOne == null ? null : tagOne.trim();
    }

    public String getTagTwo() {
        return tagTwo;
    }

    public void setTagTwo(String tagTwo) {
        this.tagTwo = tagTwo == null ? null : tagTwo.trim();
    }

    public String getTagThree() {
        return tagThree;
    }

    public void setTagThree(String tagThree) {
        this.tagThree = tagThree == null ? null : tagThree.trim();
    }
}