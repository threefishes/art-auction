package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class AlbumFiles {
    private Integer filesId;

    private Integer albumId;

    private Integer filesHeight;

    private String filesName;

    private Long filesSize;

    private Integer albumType;

    private Integer filesWidth;

    private String originalName;

    private Integer storeId;

    private Date uploadTime;

    public Integer getFilesId() {
        return filesId;
    }

    public void setFilesId(Integer filesId) {
        this.filesId = filesId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getFilesHeight() {
        return filesHeight;
    }

    public void setFilesHeight(Integer filesHeight) {
        this.filesHeight = filesHeight;
    }

    public String getFilesName() {
        return filesName;
    }

    public void setFilesName(String filesName) {
        this.filesName = filesName == null ? null : filesName.trim();
    }

    public Long getFilesSize() {
        return filesSize;
    }

    public void setFilesSize(Long filesSize) {
        this.filesSize = filesSize;
    }

    public Integer getAlbumType() {
        return albumType;
    }

    public void setAlbumType(Integer albumType) {
        this.albumType = albumType;
    }

    public Integer getFilesWidth() {
        return filesWidth;
    }

    public void setFilesWidth(Integer filesWidth) {
        this.filesWidth = filesWidth;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName == null ? null : originalName.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}