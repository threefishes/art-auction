package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ProgramUploadVideo {
    private Integer videoId;

    private Long vodFileId;

    private Integer dwId;

    private String videoUrl;

    private String coverUrl;

    private Integer height;

    private Integer width;

    private Integer transState;

    private Date uploadTime;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Long getVodFileId() {
        return vodFileId;
    }

    public void setVodFileId(Long vodFileId) {
        this.vodFileId = vodFileId;
    }

    public Integer getDwId() {
        return dwId;
    }

    public void setDwId(Integer dwId) {
        this.dwId = dwId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getTransState() {
        return transState;
    }

    public void setTransState(Integer transState) {
        this.transState = transState;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}