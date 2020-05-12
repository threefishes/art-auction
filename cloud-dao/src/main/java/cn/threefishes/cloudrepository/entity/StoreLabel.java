package cn.threefishes.cloudrepository.entity;

public class StoreLabel {
    private Integer storeLabelId;

    private String image;

    private Integer isFold;

    private Integer parentId;

    private Integer storeId;

    private String storeLabelName;

    private Integer storeLabelSort;

    public Integer getStoreLabelId() {
        return storeLabelId;
    }

    public void setStoreLabelId(Integer storeLabelId) {
        this.storeLabelId = storeLabelId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getIsFold() {
        return isFold;
    }

    public void setIsFold(Integer isFold) {
        this.isFold = isFold;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreLabelName() {
        return storeLabelName;
    }

    public void setStoreLabelName(String storeLabelName) {
        this.storeLabelName = storeLabelName == null ? null : storeLabelName.trim();
    }

    public Integer getStoreLabelSort() {
        return storeLabelSort;
    }

    public void setStoreLabelSort(Integer storeLabelSort) {
        this.storeLabelSort = storeLabelSort;
    }
}