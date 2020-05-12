package cn.threefishes.cloudrepository.entity;

public class StoreWithBLOBs extends Store {
    private String storeAftersales;

    private String storePresales;

    public String getStoreAftersales() {
        return storeAftersales;
    }

    public void setStoreAftersales(String storeAftersales) {
        this.storeAftersales = storeAftersales == null ? null : storeAftersales.trim();
    }

    public String getStorePresales() {
        return storePresales;
    }

    public void setStorePresales(String storePresales) {
        this.storePresales = storePresales == null ? null : storePresales.trim();
    }
}