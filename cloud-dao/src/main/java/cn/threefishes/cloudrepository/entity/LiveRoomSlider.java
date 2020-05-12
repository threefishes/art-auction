package cn.threefishes.cloudrepository.entity;

public class LiveRoomSlider {
    private Integer liveRoomSliderId;

    private String imageJson;

    public Integer getLiveRoomSliderId() {
        return liveRoomSliderId;
    }

    public void setLiveRoomSliderId(Integer liveRoomSliderId) {
        this.liveRoomSliderId = liveRoomSliderId;
    }

    public String getImageJson() {
        return imageJson;
    }

    public void setImageJson(String imageJson) {
        this.imageJson = imageJson == null ? null : imageJson.trim();
    }
}