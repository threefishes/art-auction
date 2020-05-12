package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class IndexCategoryNav {
    private Integer categoryId;

    private Date categoryNavUpdateTime;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCategoryNavUpdateTime() {
        return categoryNavUpdateTime;
    }

    public void setCategoryNavUpdateTime(Date categoryNavUpdateTime) {
        this.categoryNavUpdateTime = categoryNavUpdateTime;
    }
}