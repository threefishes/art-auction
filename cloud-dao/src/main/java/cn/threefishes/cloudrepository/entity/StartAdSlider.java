package cn.threefishes.cloudrepository.entity;

public class StartAdSlider {
    private Integer startAdSliderId;

    private String imageJson;

    public Integer getStartAdSliderId() {
        return startAdSliderId;
    }

    public void setStartAdSliderId(Integer startAdSliderId) {
        this.startAdSliderId = startAdSliderId;
    }

    public String getImageJson() {
        return imageJson;
    }

    public void setImageJson(String imageJson) {
        this.imageJson = imageJson == null ? null : imageJson.trim();
    }
}