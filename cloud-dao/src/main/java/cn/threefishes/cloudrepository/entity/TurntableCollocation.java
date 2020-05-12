package cn.threefishes.cloudrepository.entity;

public class TurntableCollocation {
    private Integer collocationId;

    private Integer turntableId;

    private Integer prizeId;

    private Integer prizeType;

    private String collocationName;

    private String collocationContent;

    private Double prizePrice;

    private String imageUrl;

    private Integer numLimit;

    private Integer luckilyRate;

    private Integer position;

    private Integer hasCollocation;

    private Integer delStatus;

    public Integer getCollocationId() {
        return collocationId;
    }

    public void setCollocationId(Integer collocationId) {
        this.collocationId = collocationId;
    }

    public Integer getTurntableId() {
        return turntableId;
    }

    public void setTurntableId(Integer turntableId) {
        this.turntableId = turntableId;
    }

    public Integer getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public Integer getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(Integer prizeType) {
        this.prizeType = prizeType;
    }

    public String getCollocationName() {
        return collocationName;
    }

    public void setCollocationName(String collocationName) {
        this.collocationName = collocationName == null ? null : collocationName.trim();
    }

    public String getCollocationContent() {
        return collocationContent;
    }

    public void setCollocationContent(String collocationContent) {
        this.collocationContent = collocationContent == null ? null : collocationContent.trim();
    }

    public Double getPrizePrice() {
        return prizePrice;
    }

    public void setPrizePrice(Double prizePrice) {
        this.prizePrice = prizePrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Integer getNumLimit() {
        return numLimit;
    }

    public void setNumLimit(Integer numLimit) {
        this.numLimit = numLimit;
    }

    public Integer getLuckilyRate() {
        return luckilyRate;
    }

    public void setLuckilyRate(Integer luckilyRate) {
        this.luckilyRate = luckilyRate;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getHasCollocation() {
        return hasCollocation;
    }

    public void setHasCollocation(Integer hasCollocation) {
        this.hasCollocation = hasCollocation;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }
}