package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Special {
    private Integer specialId;

    private String backgroundColor;

    private String backgroundImage;

    private String backgroundRepeat;

    private Integer marginTop;

    private String specialImage;

    private Integer specialState;

    private String specialTitle;

    private Date updateTime;

    public Integer getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Integer specialId) {
        this.specialId = specialId;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor == null ? null : backgroundColor.trim();
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage == null ? null : backgroundImage.trim();
    }

    public String getBackgroundRepeat() {
        return backgroundRepeat;
    }

    public void setBackgroundRepeat(String backgroundRepeat) {
        this.backgroundRepeat = backgroundRepeat == null ? null : backgroundRepeat.trim();
    }

    public Integer getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(Integer marginTop) {
        this.marginTop = marginTop;
    }

    public String getSpecialImage() {
        return specialImage;
    }

    public void setSpecialImage(String specialImage) {
        this.specialImage = specialImage == null ? null : specialImage.trim();
    }

    public Integer getSpecialState() {
        return specialState;
    }

    public void setSpecialState(Integer specialState) {
        this.specialState = specialState;
    }

    public String getSpecialTitle() {
        return specialTitle;
    }

    public void setSpecialTitle(String specialTitle) {
        this.specialTitle = specialTitle == null ? null : specialTitle.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}