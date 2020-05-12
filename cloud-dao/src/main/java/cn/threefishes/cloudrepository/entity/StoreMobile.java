package cn.threefishes.cloudrepository.entity;

public class StoreMobile {
    private Integer storeId;

    private Integer decorationOnly;

    private Integer decorationState;

    private String storeBanner;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getDecorationOnly() {
        return decorationOnly;
    }

    public void setDecorationOnly(Integer decorationOnly) {
        this.decorationOnly = decorationOnly;
    }

    public Integer getDecorationState() {
        return decorationState;
    }

    public void setDecorationState(Integer decorationState) {
        this.decorationState = decorationState;
    }

    public String getStoreBanner() {
        return storeBanner;
    }

    public void setStoreBanner(String storeBanner) {
        this.storeBanner = storeBanner == null ? null : storeBanner.trim();
    }
}