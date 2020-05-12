package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Channel {
    private Integer channelId;

    private Integer categoryId;

    private String categoryName;

    private String channelDescription;

    private String channelFloorId;

    private String channelKeywords;

    private String channelName;

    private Integer channelShow;

    private String channelStyle;

    private Integer channelTopId;

    private Date channelUpdateTime;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getChannelDescription() {
        return channelDescription;
    }

    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription == null ? null : channelDescription.trim();
    }

    public String getChannelFloorId() {
        return channelFloorId;
    }

    public void setChannelFloorId(String channelFloorId) {
        this.channelFloorId = channelFloorId == null ? null : channelFloorId.trim();
    }

    public String getChannelKeywords() {
        return channelKeywords;
    }

    public void setChannelKeywords(String channelKeywords) {
        this.channelKeywords = channelKeywords == null ? null : channelKeywords.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getChannelShow() {
        return channelShow;
    }

    public void setChannelShow(Integer channelShow) {
        this.channelShow = channelShow;
    }

    public String getChannelStyle() {
        return channelStyle;
    }

    public void setChannelStyle(String channelStyle) {
        this.channelStyle = channelStyle == null ? null : channelStyle.trim();
    }

    public Integer getChannelTopId() {
        return channelTopId;
    }

    public void setChannelTopId(Integer channelTopId) {
        this.channelTopId = channelTopId;
    }

    public Date getChannelUpdateTime() {
        return channelUpdateTime;
    }

    public void setChannelUpdateTime(Date channelUpdateTime) {
        this.channelUpdateTime = channelUpdateTime;
    }
}