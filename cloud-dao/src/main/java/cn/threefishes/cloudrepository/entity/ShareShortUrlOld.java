package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ShareShortUrlOld {
    private Long shareId;

    private Integer commonId;

    private Integer distributionGoodsId;

    private String shortUrl;

    private String longUrl;

    private Date createTime;

    private Date updateTime;

    public Long getShareId() {
        return shareId;
    }

    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getDistributionGoodsId() {
        return distributionGoodsId;
    }

    public void setDistributionGoodsId(Integer distributionGoodsId) {
        this.distributionGoodsId = distributionGoodsId;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl == null ? null : shortUrl.trim();
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl == null ? null : longUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}