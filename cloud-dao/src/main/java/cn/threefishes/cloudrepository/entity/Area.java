package cn.threefishes.cloudrepository.entity;

public class Area {
    private Integer areaId;

    private String areaCode;

    private Integer areaDeep;

    private String areaName;

    private Integer areaParentId;

    private String areaRegion;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public Integer getAreaDeep() {
        return areaDeep;
    }

    public void setAreaDeep(Integer areaDeep) {
        this.areaDeep = areaDeep;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(Integer areaParentId) {
        this.areaParentId = areaParentId;
    }

    public String getAreaRegion() {
        return areaRegion;
    }

    public void setAreaRegion(String areaRegion) {
        this.areaRegion = areaRegion == null ? null : areaRegion.trim();
    }
}