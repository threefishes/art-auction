package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;

public class RedPacketRainCollocation {
    private Integer collocationId;

    private Integer prizeActivityId;

    private Integer rainId;

    private String activityName;

    private String activityContent;

    private Integer activityRate;

    private String imageUrl;

    private BigDecimal price;

    private Integer foreignKey;

    private Integer type;

    private Integer numLimit;

    private Integer isDel;

    public Integer getCollocationId() {
        return collocationId;
    }

    public void setCollocationId(Integer collocationId) {
        this.collocationId = collocationId;
    }

    public Integer getPrizeActivityId() {
        return prizeActivityId;
    }

    public void setPrizeActivityId(Integer prizeActivityId) {
        this.prizeActivityId = prizeActivityId;
    }

    public Integer getRainId() {
        return rainId;
    }

    public void setRainId(Integer rainId) {
        this.rainId = rainId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    public Integer getActivityRate() {
        return activityRate;
    }

    public void setActivityRate(Integer activityRate) {
        this.activityRate = activityRate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(Integer foreignKey) {
        this.foreignKey = foreignKey;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNumLimit() {
        return numLimit;
    }

    public void setNumLimit(Integer numLimit) {
        this.numLimit = numLimit;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}