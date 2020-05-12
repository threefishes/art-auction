package cn.threefishes.cloudrepository.entity;

public class StatPriceRange {
    private Integer rangeId;

    private Integer rangePrice;

    private String rangeType;

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
}