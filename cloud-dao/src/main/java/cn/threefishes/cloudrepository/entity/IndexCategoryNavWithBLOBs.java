package cn.threefishes.cloudrepository.entity;

public class IndexCategoryNavWithBLOBs extends IndexCategoryNav {
    private String categoryNavAdvJson;

    private String categoryNavImage;

    public String getCategoryNavAdvJson() {
        return categoryNavAdvJson;
    }

    public void setCategoryNavAdvJson(String categoryNavAdvJson) {
        this.categoryNavAdvJson = categoryNavAdvJson == null ? null : categoryNavAdvJson.trim();
    }

    public String getCategoryNavImage() {
        return categoryNavImage;
    }

    public void setCategoryNavImage(String categoryNavImage) {
        this.categoryNavImage = categoryNavImage == null ? null : categoryNavImage.trim();
    }
}