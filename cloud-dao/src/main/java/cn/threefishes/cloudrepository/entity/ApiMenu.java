package cn.threefishes.cloudrepository.entity;

public class ApiMenu {
    private Integer menuId;

    private String menuAd;

    private String menuName;

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

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}