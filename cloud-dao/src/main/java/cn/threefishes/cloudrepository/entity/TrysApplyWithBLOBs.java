package cn.threefishes.cloudrepository.entity;

public class TrysApplyWithBLOBs extends TrysApply {
    private String content;

    private String contentImage;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getContentImage() {
        return contentImage;
    }

    public void setContentImage(String contentImage) {
        this.contentImage = contentImage == null ? null : contentImage.trim();
    }
}