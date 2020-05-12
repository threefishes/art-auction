package cn.threefishes.cloudrepository.entity;

public class StoreCustomsInfo {
    private Integer id;

    private Integer storeId;

    private String storeName;

    private String alipayCustomsPlace;

    private String wechatCustomsPlace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getAlipayCustomsPlace() {
        return alipayCustomsPlace;
    }

    public void setAlipayCustomsPlace(String alipayCustomsPlace) {
        this.alipayCustomsPlace = alipayCustomsPlace == null ? null : alipayCustomsPlace.trim();
    }

    public String getWechatCustomsPlace() {
        return wechatCustomsPlace;
    }

    public void setWechatCustomsPlace(String wechatCustomsPlace) {
        this.wechatCustomsPlace = wechatCustomsPlace == null ? null : wechatCustomsPlace.trim();
    }
}