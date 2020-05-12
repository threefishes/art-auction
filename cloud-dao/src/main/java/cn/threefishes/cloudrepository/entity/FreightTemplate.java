package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class FreightTemplate {
    private Integer freightId;

    private String areaId;

    private String calcType;

    private Date editTime;

    private Integer freightFree;

    private Integer storeId;

    private String title;

    public Integer getFreightId() {
        return freightId;
    }

    public void setFreightId(Integer freightId) {
        this.freightId = freightId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType == null ? null : calcType.trim();
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getFreightFree() {
        return freightFree;
    }

    public void setFreightFree(Integer freightFree) {
        this.freightFree = freightFree;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}