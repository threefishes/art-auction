package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ProgramDeptVideo {
    private Integer videoId;

    private Integer dwId;

    private String videoName;

    private Date uploadTime;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getDwId() {
        return dwId;
    }

    public void setDwId(Integer dwId) {
        this.dwId = dwId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}