package cn.threefishes.cloudrepository.entity;

public class Menu {
    private Integer menuId;

    private String menuAd;

    private String menuData;

    private String menuIcon;

    private String menuName;

    private String menuNav;

    private Integer sort;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuAd() {
        return menuAd;
    }

    public void setMenuAd(String menuAd) {
        this.menuAd = menuAd == null ? null : menuAd.trim();
    }

    public String getMenuData() {
        return menuData;
    }

    public void setMenuData(String menuData) {
        this.menuData = menuData == null ? null : menuData.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuNav() {
        return menuNav;
    }

    public void setMenuNav(String menuNav) {
        this.menuNav = menuNav == null ? null : menuNav.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}