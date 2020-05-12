package cn.threefishes.cloudrepository.entity;

public class GoodsCustom extends GoodsCustomKey {
    private String customValue;

    public String getCustomValue() {
        return customValue;
    }

    public void setCustomValue(String customValue) {
        this.customValue = customValue == null ? null : customValue.trim();
    }
}