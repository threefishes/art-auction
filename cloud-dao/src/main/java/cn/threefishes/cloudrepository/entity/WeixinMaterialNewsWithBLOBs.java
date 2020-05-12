package cn.threefishes.cloudrepository.entity;

public class WeixinMaterialNewsWithBLOBs extends WeixinMaterialNews {
    private String searchContent;

    private String simpleList;

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent == null ? null : searchContent.trim();
    }

    public String getSimpleList() {
        return simpleList;
    }

    public void setSimpleList(String simpleList) {
        this.simpleList = simpleList == null ? null : simpleList.trim();
    }
}