package cn.threefishes.cloudrepository.entity;

public class WebSlider {
    private Integer webSliderId;

    private String webSliderKey;

    private Integer webSliderSort;

    private String webSliderType;

    private String webSliderJson;

    public Integer getWebSliderId() {
        return webSliderId;
    }

    public void setWebSliderId(Integer webSliderId) {
        this.webSliderId = webSliderId;
    }

    public String getWebSliderKey() {
        return webSliderKey;
    }

    public void setWebSliderKey(String webSliderKey) {
        this.webSliderKey = webSliderKey == null ? null : webSliderKey.trim();
    }

    public Integer getWebSliderSort() {
        return webSliderSort;
    }

    public void setWebSliderSort(Integer webSliderSort) {
        this.webSliderSort = webSliderSort;
    }

    public String getWebSliderType() {
        return webSliderType;
    }

    public void setWebSliderType(String webSliderType) {
        this.webSliderType = webSliderType == null ? null : webSliderType.trim();
    }

    public String getWebSliderJson() {
        return webSliderJson;
    }

    public void setWebSliderJson(String webSliderJson) {
        this.webSliderJson = webSliderJson == null ? null : webSliderJson.trim();
    }
}