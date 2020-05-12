package cn.threefishes.cloudrepository.entity;

public class SpecValue {
    private Integer specValueId;

    private Integer specId;

    private String specValueName;

    public Integer getSpecValueId() {
        return specValueId;
    }

    public void setSpecValueId(Integer specValueId) {
        this.specValueId = specValueId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecValueName() {
        return specValueName;
    }

    public void setSpecValueName(String specValueName) {
        this.specValueName = specValueName == null ? null : specValueName.trim();
    }
}