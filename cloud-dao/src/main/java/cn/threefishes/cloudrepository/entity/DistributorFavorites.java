package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class DistributorFavorites {
    private Integer distributorFavoritesId;

    private Date createTime;

    private String distributorFavoritesName;

    private Integer distributorId;

    private Integer isDefault;

    public Integer getDistributorFavoritesId() {
        return distributorFavoritesId;
    }

    public void setDistributorFavoritesId(Integer distributorFavoritesId) {
        this.distributorFavoritesId = distributorFavoritesId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDistributorFavoritesName() {
        return distributorFavoritesName;
    }

    public void setDistributorFavoritesName(String distributorFavoritesName) {
        this.distributorFavoritesName = distributorFavoritesName == null ? null : distributorFavoritesName.trim();
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
}