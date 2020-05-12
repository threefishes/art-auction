package cn.threefishes.cloudrepository.entity;

public class ShowOrdersMusic {
    private Integer musicId;

    private String fileUrl;

    private String showText;

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText = showText == null ? null : showText.trim();
    }
}