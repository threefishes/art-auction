package cn.threefishes.cloudrepository.entity;

public class ArticlePosition {
    private Integer positionId;

    private Integer allowAddCategory;

    private String positionTitle;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getAllowAddCategory() {
        return allowAddCategory;
    }

    public void setAllowAddCategory(Integer allowAddCategory) {
        this.allowAddCategory = allowAddCategory;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle == null ? null : positionTitle.trim();
    }
}