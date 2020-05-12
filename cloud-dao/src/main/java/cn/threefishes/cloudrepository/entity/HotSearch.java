package cn.threefishes.cloudrepository.entity;

public class HotSearch {
    private Integer hotId;

    private String hotName;

    private String hotValue;

    public Integer getHotId() {
        return hotId;
    }

    public void setHotId(Integer hotId) {
        this.hotId = hotId;
    }

    public String getHotName() {
        return hotName;
    }

    public void setHotName(String hotName) {
        this.hotName = hotName == null ? null : hotName.trim();
    }

    public String getHotValue() {
        return hotValue;
    }

    public void setHotValue(String hotValue) {
        this.hotValue = hotValue == null ? null : hotValue.trim();
    }
}