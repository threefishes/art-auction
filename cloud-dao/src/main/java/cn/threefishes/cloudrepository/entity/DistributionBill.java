package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DistributionBill {
    private Integer distributionBillId;

    private Integer distributionBillSn;

    private BigDecimal distributionOrdersAmount;

    private Date distributionCreateTime;

    private Date distributionEndTime;

    private Date distributionStartTime;

    private Integer memberId;

    private Integer distributorId;

    private BigDecimal openShopAmount;

    public Integer getDistributionBillId() {
        return distributionBillId;
    }

    public void setDistributionBillId(Integer distributionBillId) {
        this.distributionBillId = distributionBillId;
    }

    public Integer getDistributionBillSn() {
        return distributionBillSn;
    }

    public void setDistributionBillSn(Integer distributionBillSn) {
        this.distributionBillSn = distributionBillSn;
    }

    public BigDecimal getDistributionOrdersAmount() {
        return distributionOrdersAmount;
    }

    public void setDistributionOrdersAmount(BigDecimal distributionOrdersAmount) {
        this.distributionOrdersAmount = distributionOrdersAmount;
    }

    public Date getDistributionCreateTime() {
        return distributionCreateTime;
    }

    public void setDistributionCreateTime(Date distributionCreateTime) {
        this.distributionCreateTime = distributionCreateTime;
    }

    public Date getDistributionEndTime() {
        return distributionEndTime;
    }

    public void setDistributionEndTime(Date distributionEndTime) {
        this.distributionEndTime = distributionEndTime;
    }

    public Date getDistributionStartTime() {
        return distributionStartTime;
    }

    public void setDistributionStartTime(Date distributionStartTime) {
        this.distributionStartTime = distributionStartTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public BigDecimal getOpenShopAmount() {
        return openShopAmount;
    }

    public void setOpenShopAmount(BigDecimal openShopAmount) {
        this.openShopAmount = openShopAmount;
    }
}