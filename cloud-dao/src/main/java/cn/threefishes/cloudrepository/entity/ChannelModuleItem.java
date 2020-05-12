package cn.threefishes.cloudrepository.entity;

public class ChannelModuleItem {
    private Integer moduleItemId;

    private Integer moduleId;

    private String moduleItemKey;

    private String moduleItemName;

    private Integer moduleItemSort;

    private String moduleItemType;

    private String moduleItemJson;

    public Integer getModuleItemId() {
        return moduleItemId;
    }

    public void setModuleItemId(Integer moduleItemId) {
        this.moduleItemId = moduleItemId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleItemKey() {
        return moduleItemKey;
    }

    public void setModuleItemKey(String moduleItemKey) {
        this.moduleItemKey = moduleItemKey == null ? null : moduleItemKey.trim();
    }

    public String getModuleItemName() {
        return moduleItemName;
    }

    public void setModuleItemName(String moduleItemName) {
        this.moduleItemName = moduleItemName == null ? null : moduleItemName.trim();
    }

    public Integer getModuleItemSort() {
        return moduleItemSort;
    }

    public void setModuleItemSort(Integer moduleItemSort) {
        this.moduleItemSort = moduleItemSort;
    }

    public String getModuleItemType() {
        return moduleItemType;
    }

    public void setModuleItemType(String moduleItemType) {
        this.moduleItemType = moduleItemType == null ? null : moduleItemType.trim();
    }

    public String getModuleItemJson() {
        return moduleItemJson;
    }

    public void setModuleItemJson(String moduleItemJson) {
        this.moduleItemJson = moduleItemJson == null ? null : moduleItemJson.trim();
    }
}