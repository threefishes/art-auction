package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class WeixinMaterialImage {
    private Integer materialId;

    private String imageAlias;

    private String imageName;

    private String materialImageUrl;

    private String mediaId;

    private Date updateTime;

    private Integer usableState;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getImageAlias() {
        return imageAlias;
    }

    public void setImageAlias(String imageAlias) {
        this.imageAlias = imageAlias == null ? null : imageAlias.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getMaterialImageUrl() {
        return materialImageUrl;
    }

    public void setMaterialImageUrl(String materialImageUrl) {
        this.materialImageUrl = materialImageUrl == null ? null : materialImageUrl.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUsableState() {
        return usableState;
    }

    public void setUsableState(Integer usableState) {
        this.usableState = usableState;
    }
}