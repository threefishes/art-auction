package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class DistributorGoods {
    private Integer distributorGoodsId;

    private Date addTime;

    private Integer commonId;

    private Integer distributionCount;

    private Integer distributorFavoritesId;

    private Integer distributorId;

    private Integer memberId;

    private String memberName;

    private Integer storeId;

    private String storeName;

    public Integer getDistributorGoodsId() {
        return distributorGoodsId;
    }

    public void setDistributorGoodsId(Integer distributorGoodsId) {
        this.distributorGoodsId = distributorGoodsId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getDistributionCount() {
        return distributionCount;
    }

    public void setDistributionCount(Integer distributionCount) {
        this.distributionCount = distributionCount;
    }

    public Integer getDistributorFavoritesId() {
        return distributorFavoritesId;
    }

    public void setDistributorFavoritesId(Integer distributorFavoritesId) {
        this.distributorFavoritesId = distributorFavoritesId;
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
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
}