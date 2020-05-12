package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Trys {
    private Integer trysId;

    private Date addTime;

    private Integer categoryId;

    private Integer commonId;

    private Integer contentType;

    private Integer currentNum;

    private Date endTime;

    private String goodsFullSpecs;

    private Integer goodsId;

    private String goodsName;

    private BigDecimal goodsPrice;

    private String imageName;

    private Integer maxNum;

    private Integer provideNum;

    private Integer sellerId;

    private Date startTime;

    private Integer storeId;

    private String storeName;

    private Integer trysReportNum;

    private Integer trysState;

    private Integer trysType;

    private BigDecimal voucherPrice;

    private Integer voucherTemplateId;

    private String content;

    public Integer getTrysId() {
        return trysId;
    }

    public void setTrysId(Integer trysId) {
        this.trysId = trysId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getProvideNum() {
        return provideNum;
    }

    public void setProvideNum(Integer provideNum) {
        this.provideNum = provideNum;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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

    public Integer getTrysReportNum() {
        return trysReportNum;
    }

    public void setTrysReportNum(Integer trysReportNum) {
        this.trysReportNum = trysReportNum;
    }

    public Integer getTrysState() {
        return trysState;
    }

    public void setTrysState(Integer trysState) {
        this.trysState = trysState;
    }

    public Integer getTrysType() {
        return trysType;
    }

    public void setTrysType(Integer trysType) {
        this.trysType = trysType;
    }

    public BigDecimal getVoucherPrice() {
        return voucherPrice;
    }

    public void setVoucherPrice(BigDecimal voucherPrice) {
        this.voucherPrice = voucherPrice;
    }

    public Integer getVoucherTemplateId() {
        return voucherTemplateId;
    }

    public void setVoucherTemplateId(Integer voucherTemplateId) {
        this.voucherTemplateId = voucherTemplateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}