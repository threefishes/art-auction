package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TencentCloudVideo {
    private Integer dwid;

    private String videoid;

    private Date uploadTencentTime;

    public Integer getDwid() {
        return dwid;
    }

    public void setDwid(Integer dwid) {
        this.dwid = dwid;
    }

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid == null ? null : videoid.trim();
    }

    public Date getUploadTencentTime() {
        return uploadTencentTime;
    }

    public void setUploadTencentTime(Date uploadTencentTime) {
        this.uploadTencentTime = uploadTencentTime;
    }
}