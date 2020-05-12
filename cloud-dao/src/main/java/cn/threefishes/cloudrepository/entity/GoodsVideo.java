package cn.threefishes.cloudrepository.entity;

public class GoodsVideo {
    private Integer videoId;

    private Integer commonId;

    private String videoName;

    private Integer videoSort;

    private String videoCosFilesId;

    private Integer isDefault;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public Integer getVideoSort() {
        return videoSort;
    }

    public void setVideoSort(Integer videoSort) {
        this.videoSort = videoSort;
    }

    public String getVideoCosFilesId() {
        return videoCosFilesId;
    }

    public void setVideoCosFilesId(String videoCosFilesId) {
        this.videoCosFilesId = videoCosFilesId == null ? null : videoCosFilesId.trim();
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
}