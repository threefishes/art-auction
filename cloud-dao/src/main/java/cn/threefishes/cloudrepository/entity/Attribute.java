package cn.threefishes.cloudrepository.entity;

public class Attribute {
    private Integer attributeId;

    private String attributeName;

    private Integer attributeSort;

    private Integer categoryId;

    private Integer isShow;

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    public Integer getAttributeSort() {
        return attributeSort;
    }

    public void setAttributeSort(Integer attributeSort) {
        this.attributeSort = attributeSort;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }
}