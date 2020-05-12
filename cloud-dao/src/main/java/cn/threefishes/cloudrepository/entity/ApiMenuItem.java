package cn.threefishes.cloudrepository.entity;

public class ApiMenuItem {
    private Integer itemId;

    private String itemData;

    private String itemMore;

    private String itemName;

    private Integer itemType;

    private Integer menuId;

    private Integer sort;

    private String subitemData;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemData() {
        return itemData;
    }

    public void setItemData(String itemData) {
        this.itemData = itemData == null ? null : itemData.trim();
    }

    public String getItemMore() {
        return itemMore;
    }

    public void setItemMore(String itemMore) {
        this.itemMore = itemMore == null ? null : itemMore.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getSubitemData() {
        return subitemData;
    }

    public void setSubitemData(String subitemData) {
        this.subitemData = subitemData == null ? null : subitemData.trim();
    }
}