package cn.threefishes.cloudrepository.entity;

public class BrandLabel {
    private Integer brandLabelId;

    private String brandLabelName;

    private Integer brandLabelSort;

    public Integer getBrandLabelId() {
        return brandLabelId;
    }

    public void setBrandLabelId(Integer brandLabelId) {
        this.brandLabelId = brandLabelId;
    }

    public String getBrandLabelName() {
        return brandLabelName;
    }

    public void setBrandLabelName(String brandLabelName) {
        this.brandLabelName = brandLabelName == null ? null : brandLabelName.trim();
    }

    public Integer getBrandLabelSort() {
        return brandLabelSort;
    }

    public void setBrandLabelSort(Integer brandLabelSort) {
        this.brandLabelSort = brandLabelSort;
    }
}