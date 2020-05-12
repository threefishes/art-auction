package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class AppArticle {
    private Integer appArticleId;

    private Integer allowDelete;

    private Integer categoryId;

    private Date createTime;

    private Integer sort;

    private String title;

    private String surfacePlotUrl;

    private Integer publishStatus;

    private Date publishTime;

    private Integer readCount;

    private Integer isTimer;

    private Date timer;

    private String content;

    public Integer getAppArticleId() {
        return appArticleId;
    }

    public void setAppArticleId(Integer appArticleId) {
        this.appArticleId = appArticleId;
    }

    public Integer getAllowDelete() {
        return allowDelete;
    }

    public void setAllowDelete(Integer allowDelete) {
        this.allowDelete = allowDelete;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getSurfacePlotUrl() {
        return surfacePlotUrl;
    }

    public void setSurfacePlotUrl(String surfacePlotUrl) {
        this.surfacePlotUrl = surfacePlotUrl == null ? null : surfacePlotUrl.trim();
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getIsTimer() {
        return isTimer;
    }

    public void setIsTimer(Integer isTimer) {
        this.isTimer = isTimer;
    }

    public Date getTimer() {
        return timer;
    }

    public void setTimer(Date timer) {
        this.timer = timer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}