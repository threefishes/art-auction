package cn.threefishes.cloudrepository.entity;

public class WeixinUserTag {
    private Integer tagId;

    private String tagName;

    private Integer tagSort;

    private Integer userCount;

    private Integer weixinTagId;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Integer getTagSort() {
        return tagSort;
    }

    public void setTagSort(Integer tagSort) {
        this.tagSort = tagSort;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getWeixinTagId() {
        return weixinTagId;
    }

    public void setWeixinTagId(Integer weixinTagId) {
        this.weixinTagId = weixinTagId;
    }
}