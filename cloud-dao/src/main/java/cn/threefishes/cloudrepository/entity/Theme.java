package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Theme {
    private Integer themeId;

    private String backgroundColor;

    private String backgroundImage;

    private String backgroundRepeat;

    private Date enrollEndTime;

    private Date enrollStartTime;

    private Integer marginTop;

    private Date showEndTime;

    private Date showStartTime;

    private String themeDescribe;

    private String themeImage;

    private Integer themeState;

    private String themeTitle;

    private Date updateTime;

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
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

    public Date getEnrollEndTime() {
        return enrollEndTime;
    }

    public void setEnrollEndTime(Date enrollEndTime) {
        this.enrollEndTime = enrollEndTime;
    }

    public Date getEnrollStartTime() {
        return enrollStartTime;
    }

    public void setEnrollStartTime(Date enrollStartTime) {
        this.enrollStartTime = enrollStartTime;
    }

    public Integer getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(Integer marginTop) {
        this.marginTop = marginTop;
    }

    public Date getShowEndTime() {
        return showEndTime;
    }

    public void setShowEndTime(Date showEndTime) {
        this.showEndTime = showEndTime;
    }

    public Date getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(Date showStartTime) {
        this.showStartTime = showStartTime;
    }

    public String getThemeDescribe() {
        return themeDescribe;
    }

    public void setThemeDescribe(String themeDescribe) {
        this.themeDescribe = themeDescribe == null ? null : themeDescribe.trim();
    }

    public String getThemeImage() {
        return themeImage;
    }

    public void setThemeImage(String themeImage) {
        this.themeImage = themeImage == null ? null : themeImage.trim();
    }

    public Integer getThemeState() {
        return themeState;
    }

    public void setThemeState(Integer themeState) {
        this.themeState = themeState;
    }

    public String getThemeTitle() {
        return themeTitle;
    }

    public void setThemeTitle(String themeTitle) {
        this.themeTitle = themeTitle == null ? null : themeTitle.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}