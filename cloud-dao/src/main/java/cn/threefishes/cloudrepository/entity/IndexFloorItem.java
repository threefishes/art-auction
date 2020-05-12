package cn.threefishes.cloudrepository.entity;

public class IndexFloorItem {
    private Integer floorItemId;

    private Integer floorId;

    private String floorItemKey;

    private String floorItemName;

    private Integer floorItemSort;

    private String floorItemType;

    private String floorItemJson;

    public Integer getFloorItemId() {
        return floorItemId;
    }

    public void setFloorItemId(Integer floorItemId) {
        this.floorItemId = floorItemId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public String getFloorItemKey() {
        return floorItemKey;
    }

    public void setFloorItemKey(String floorItemKey) {
        this.floorItemKey = floorItemKey == null ? null : floorItemKey.trim();
    }

    public String getFloorItemName() {
        return floorItemName;
    }

    public void setFloorItemName(String floorItemName) {
        this.floorItemName = floorItemName == null ? null : floorItemName.trim();
    }

    public Integer getFloorItemSort() {
        return floorItemSort;
    }

    public void setFloorItemSort(Integer floorItemSort) {
        this.floorItemSort = floorItemSort;
    }

    public String getFloorItemType() {
        return floorItemType;
    }

    public void setFloorItemType(String floorItemType) {
        this.floorItemType = floorItemType == null ? null : floorItemType.trim();
    }

    public String getFloorItemJson() {
        return floorItemJson;
    }

    public void setFloorItemJson(String floorItemJson) {
        this.floorItemJson = floorItemJson == null ? null : floorItemJson.trim();
    }
}