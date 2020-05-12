package cn.threefishes.cloudrepository.entity;

public class StoreMd {
    private Integer storeId;

    private String md;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md == null ? null : md.trim();
    }
}