package cn.threefishes.cloudrepository.entity;

public class GoodsSpecImage {
    private Integer specImageId;

    private Integer commonId;

    private String imageName;

    public Integer getSpecImageId() {
        return specImageId;
    }

    public void setSpecImageId(Integer specImageId) {
        this.specImageId = specImageId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }
}