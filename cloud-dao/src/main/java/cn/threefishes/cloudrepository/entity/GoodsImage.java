package cn.threefishes.cloudrepository.entity;

public class GoodsImage {
    private Integer imageId;

    private Integer colorId;

    private Integer commonId;

    private String imageName;

    private Integer imageSort;

    private Integer isDefault;

    private Integer firstDefault;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
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

    public Integer getImageSort() {
        return imageSort;
    }

    public void setImageSort(Integer imageSort) {
        this.imageSort = imageSort;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getFirstDefault() {
        return firstDefault;
    }

    public void setFirstDefault(Integer firstDefault) {
        this.firstDefault = firstDefault;
    }
}