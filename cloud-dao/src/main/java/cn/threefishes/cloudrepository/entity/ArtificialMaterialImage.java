package cn.threefishes.cloudrepository.entity;

public class ArtificialMaterialImage {
    private Long materialImageId;

    private Integer materialId;

    private String url;

    private String width;

    private String height;

    public Long getMaterialImageId() {
        return materialImageId;
    }

    public void setMaterialImageId(Long materialImageId) {
        this.materialImageId = materialImageId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width == null ? null : width.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }
}