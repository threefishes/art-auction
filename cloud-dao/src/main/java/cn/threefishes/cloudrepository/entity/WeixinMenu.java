package cn.threefishes.cloudrepository.entity;

public class WeixinMenu {
    private Integer menuId;

    private String clickMsgType;

    private String menuKey;

    private String menuName;

    private Integer menuSort;

    private Integer menuState;

    private String menuType;

    private String menuViewUrl;

    private Integer parentId;

    private String parentName;

    private String menuReplyData;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getClickMsgType() {
        return clickMsgType;
    }

    public void setClickMsgType(String clickMsgType) {
        this.clickMsgType = clickMsgType == null ? null : clickMsgType.trim();
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey == null ? null : menuKey.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    public Integer getMenuState() {
        return menuState;
    }

    public void setMenuState(Integer menuState) {
        this.menuState = menuState;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getMenuViewUrl() {
        return menuViewUrl;
    }

    public void setMenuViewUrl(String menuViewUrl) {
        this.menuViewUrl = menuViewUrl == null ? null : menuViewUrl.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public String getMenuReplyData() {
        return menuReplyData;
    }

    public void setMenuReplyData(String menuReplyData) {
        this.menuReplyData = menuReplyData == null ? null : menuReplyData.trim();
    }
}