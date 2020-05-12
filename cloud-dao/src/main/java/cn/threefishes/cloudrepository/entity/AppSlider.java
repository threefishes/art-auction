package cn.threefishes.cloudrepository.entity;

public class AppSlider {
    private Integer appSliderId;

    private String appSliderKey;

    private Integer appSliderSort;

    private String appSliderType;

    private String appSliderJson;

    public Integer getAppSliderId() {
        return appSliderId;
    }

    public void setAppSliderId(Integer appSliderId) {
        this.appSliderId = appSliderId;
    }

    public String getAppSliderKey() {
        return appSliderKey;
    }

    public void setAppSliderKey(String appSliderKey) {
        this.appSliderKey = appSliderKey == null ? null : appSliderKey.trim();
    }

    public Integer getAppSliderSort() {
        return appSliderSort;
    }

    public void setAppSliderSort(Integer appSliderSort) {
        this.appSliderSort = appSliderSort;
    }

    public String getAppSliderType() {
        return appSliderType;
    }

    public void setAppSliderType(String appSliderType) {
        this.appSliderType = appSliderType == null ? null : appSliderType.trim();
    }

    public String getAppSliderJson() {
        return appSliderJson;
    }

    public void setAppSliderJson(String appSliderJson) {
        this.appSliderJson = appSliderJson == null ? null : appSliderJson.trim();
    }
}