package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class IndexFloor {
    private Integer floorId;

    private String floorColorName;

    private String floorName;

    private String floorNavImage;

    private String floorNavText;

    private Integer floorShow;

    private Integer floorSort;

    private String floorTemplateName;

    private String floorType;

    private Date floorUpdateTime;

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public String getFloorColorName() {
        return floorColorName;
    }

    public void setFloorColorName(String floorColorName) {
        this.floorColorName = floorColorName == null ? null : floorColorName.trim();
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }

    public String getFloorNavImage() {
        return floorNavImage;
    }

    public void setFloorNavImage(String floorNavImage) {
        this.floorNavImage = floorNavImage == null ? null : floorNavImage.trim();
    }

    public String getFloorNavText() {
        return floorNavText;
    }

    public void setFloorNavText(String floorNavText) {
        this.floorNavText = floorNavText == null ? null : floorNavText.trim();
    }

    public Integer getFloorShow() {
        return floorShow;
    }

    public void setFloorShow(Integer floorShow) {
        this.floorShow = floorShow;
    }

    public Integer getFloorSort() {
        return floorSort;
    }

    public void setFloorSort(Integer floorSort) {
        this.floorSort = floorSort;
    }

    public String getFloorTemplateName() {
        return floorTemplateName;
    }

    public void setFloorTemplateName(String floorTemplateName) {
        this.floorTemplateName = floorTemplateName == null ? null : floorTemplateName.trim();
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType == null ? null : floorType.trim();
    }

    public Date getFloorUpdateTime() {
        return floorUpdateTime;
    }

    public void setFloorUpdateTime(Date floorUpdateTime) {
        this.floorUpdateTime = floorUpdateTime;
    }
}