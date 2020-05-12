package cn.threefishes.cloudrepository.entity;

public class AdvertorialArticleWithBLOBs extends AdvertorialArticle {
    private String commonIdList;

    private String content;

    private String summary;

    public String getCommonIdList() {
        return commonIdList;
    }

    public void setCommonIdList(String commonIdList) {
        this.commonIdList = commonIdList == null ? null : commonIdList.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}