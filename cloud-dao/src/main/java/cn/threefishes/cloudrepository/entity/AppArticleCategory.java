package cn.threefishes.cloudrepository.entity;

public class AppArticleCategory {
    private Integer appCategoryId;

    private Integer positionId;

    private Integer sort;

    private String title;

    private Integer type;

    public Integer getAppCategoryId() {
        return appCategoryId;
    }

    public void setAppCategoryId(Integer appCategoryId) {
        this.appCategoryId = appCategoryId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}