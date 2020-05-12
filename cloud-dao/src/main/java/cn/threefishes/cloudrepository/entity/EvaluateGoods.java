package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class EvaluateGoods {
    private Integer evaluateId;

    private Integer commonId;

    private String content;

    private String contentAgain;

    private Integer evaluateNum;

    private Date evaluateTime;

    private Date evaluateTimeAgain;

    private String explainContent;

    private String explainContentAgain;

    private String goodsFullSpecs;

    private Integer goodsId;

    private String goodsImage;

    private String goodsName;

    private Integer hasImage;

    private String images;

    private String imagesAgain;

    private Integer memberId;

    private String memberName;

    private Integer ordersId;

    private Long ordersSn;

    private Integer ordersType;

    private Integer scores;

    private Integer storeId;

    private String storeName;

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getContentAgain() {
        return contentAgain;
    }

    public void setContentAgain(String contentAgain) {
        this.contentAgain = contentAgain == null ? null : contentAgain.trim();
    }

    public Integer getEvaluateNum() {
        return evaluateNum;
    }

    public void setEvaluateNum(Integer evaluateNum) {
        this.evaluateNum = evaluateNum;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public Date getEvaluateTimeAgain() {
        return evaluateTimeAgain;
    }

    public void setEvaluateTimeAgain(Date evaluateTimeAgain) {
        this.evaluateTimeAgain = evaluateTimeAgain;
    }

    public String getExplainContent() {
        return explainContent;
    }

    public void setExplainContent(String explainContent) {
        this.explainContent = explainContent == null ? null : explainContent.trim();
    }

    public String getExplainContentAgain() {
        return explainContentAgain;
    }

    public void setExplainContentAgain(String explainContentAgain) {
        this.explainContentAgain = explainContentAgain == null ? null : explainContentAgain.trim();
    }

    public String getGoodsFullSpecs() {
        return goodsFullSpecs;
    }

    public void setGoodsFullSpecs(String goodsFullSpecs) {
        this.goodsFullSpecs = goodsFullSpecs == null ? null : goodsFullSpecs.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getHasImage() {
        return hasImage;
    }

    public void setHasImage(Integer hasImage) {
        this.hasImage = hasImage;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getImagesAgain() {
        return imagesAgain;
    }

    public void setImagesAgain(String imagesAgain) {
        this.imagesAgain = imagesAgain == null ? null : imagesAgain.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Long getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(Long ordersSn) {
        this.ordersSn = ordersSn;
    }

    public Integer getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(Integer ordersType) {
        this.ordersType = ordersType;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }
}