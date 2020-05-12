package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DistributionOrders {
    private Integer distributionOrdersId;

    private Date addTime;

    private Integer commissionRate;

    private Integer commonId;

    private Integer distributionOrdersType;

    private Integer distributionStorePay;

    private Date distributionStorePayTime;

    private Integer distributorId;

    private Date finishTime;

    private Integer memberId;

    private Date ordersFinishTime;

    private Integer ordersGoodsId;

    private Integer storeId;

    private Integer chargeId;

    private Integer managerId;

    private Integer isStoreUp;

    private Integer isAward;

    private Integer distributorRank;

    private BigDecimal distributorCommissionAmount;

    private BigDecimal chargeCommissionAmount;

    private BigDecimal managerCommissionAmount;

    public Integer getDistributionOrdersId() {
        return distributionOrdersId;
    }

    public void setDistributionOrdersId(Integer distributionOrdersId) {
        this.distributionOrdersId = distributionOrdersId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getDistributionOrdersType() {
        return distributionOrdersType;
    }

    public void setDistributionOrdersType(Integer distributionOrdersType) {
        this.distributionOrdersType = distributionOrdersType;
    }

    public Integer getDistributionStorePay() {
        return distributionStorePay;
    }

    public void setDistributionStorePay(Integer distributionStorePay) {
        this.distributionStorePay = distributionStorePay;
    }

    public Date getDistributionStorePayTime() {
        return distributionStorePayTime;
    }

    public void setDistributionStorePayTime(Date distributionStorePayTime) {
        this.distributionStorePayTime = distributionStorePayTime;
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getOrdersFinishTime() {
        return ordersFinishTime;
    }

    public void setOrdersFinishTime(Date ordersFinishTime) {
        this.ordersFinishTime = ordersFinishTime;
    }

    public Integer getOrdersGoodsId() {
        return ordersGoodsId;
    }

    public void setOrdersGoodsId(Integer ordersGoodsId) {
        this.ordersGoodsId = ordersGoodsId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getIsStoreUp() {
        return isStoreUp;
    }

    public void setIsStoreUp(Integer isStoreUp) {
        this.isStoreUp = isStoreUp;
    }

    public Integer getIsAward() {
        return isAward;
    }

    public void setIsAward(Integer isAward) {
        this.isAward = isAward;
    }

    public Integer getDistributorRank() {
        return distributorRank;
    }

    public void setDistributorRank(Integer distributorRank) {
        this.distributorRank = distributorRank;
    }

    public BigDecimal getDistributorCommissionAmount() {
        return distributorCommissionAmount;
    }

    public void setDistributorCommissionAmount(BigDecimal distributorCommissionAmount) {
        this.distributorCommissionAmount = distributorCommissionAmount;
    }

    public BigDecimal getChargeCommissionAmount() {
        return chargeCommissionAmount;
    }

    public void setChargeCommissionAmount(BigDecimal chargeCommissionAmount) {
        this.chargeCommissionAmount = chargeCommissionAmount;
    }

    public BigDecimal getManagerCommissionAmount() {
        return managerCommissionAmount;
    }

    public void setManagerCommissionAmount(BigDecimal managerCommissionAmount) {
        this.managerCommissionAmount = managerCommissionAmount;
    }
}