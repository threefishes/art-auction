package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class VideoAlbumFiles {
    private Integer filesId;

    private Integer albumId;

    private Integer filesHeight;

    private String filesName;

    private String originalName;

    private Date uploadTime;

    private Integer filesSize;

    private Integer albumType;

    private Integer filesWidth;

    private Integer storeId;

    private String vodFilesId;

    private Integer filesType;

    private Integer downloadNum;

    private Integer attentionNum;

    private String coverUrl;

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

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName == null ? null : originalName.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getFilesSize() {
        return filesSize;
    }

    public void setFilesSize(Integer filesSize) {
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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getVodFilesId() {
        return vodFilesId;
    }

    public void setVodFilesId(String vodFilesId) {
        this.vodFilesId = vodFilesId == null ? null : vodFilesId.trim();
    }

    public Integer getFilesType() {
        return filesType;
    }

    public void setFilesType(Integer filesType) {
        this.filesType = filesType;
    }

    public Integer getDownloadNum() {
        return downloadNum;
    }

    public void setDownloadNum(Integer downloadNum) {
        this.downloadNum = downloadNum;
    }

    public Integer getAttentionNum() {
        return attentionNum;
    }

    public void setAttentionNum(Integer attentionNum) {
        this.attentionNum = attentionNum;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }
}