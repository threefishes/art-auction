package cn.threefishes.cloudrepository.entity;

public class StatStorePriceRange {
    private Integer rangeId;

    private Integer rangePrice;

    private String rangeType;

    private Integer storeId;

    public Integer getRangeId() {
        return rangeId;
    }

    public void setRangeId(Integer rangeId) {
        this.rangeId = rangeId;
    }

    public Integer getRangePrice() {
        return rangePrice;
    }

    public void setRangePrice(Integer rangePrice) {
        this.rangePrice = rangePrice;
    }

    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType == null ? null : rangeType.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}