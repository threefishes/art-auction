package cn.threefishes.cloudrepository.entity;

public class ArtificialMaterialCategory {
    private Integer categoryId;

    private String categoryName;

    private Integer categorySort;

    private Integer isDel;

    private Integer allowDel;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCategorySort() {
        return categorySort;
    }

    public void setCategorySort(Integer categorySort) {
        this.categorySort = categorySort;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getAllowDel() {
        return allowDel;
    }

    public void setAllowDel(Integer allowDel) {
        this.allowDel = allowDel;
    }
}