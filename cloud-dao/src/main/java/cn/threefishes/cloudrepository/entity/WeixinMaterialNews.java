package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class WeixinMaterialNews {
    private Integer materialId;

    private String mediaId;

    private Date updateTime;

    private Integer usableState;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
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