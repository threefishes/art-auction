package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DistributorCommissionStats {
    private Integer id;

    private Integer distributorId;

    private Integer memberId;

    private BigDecimal commissionAmount;

    private BigDecimal monthCommissionAmount;

    private BigDecimal halfYearCommissionAmount;

    private BigDecimal yearCommissionAmount;

    private BigDecimal unPayCommissionAmount;

    private Integer distributionOrdersCount;

    private BigDecimal distributionOrdersSale;

    private BigDecimal monthDistributionOrdersSale;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public BigDecimal getMonthCommissionAmount() {
        return monthCommissionAmount;
    }

    public void setMonthCommissionAmount(BigDecimal monthCommissionAmount) {
        this.monthCommissionAmount = monthCommissionAmount;
    }

    public BigDecimal getHalfYearCommissionAmount() {
        return halfYearCommissionAmount;
    }

    public void setHalfYearCommissionAmount(BigDecimal halfYearCommissionAmount) {
        this.halfYearCommissionAmount = halfYearCommissionAmount;
    }

    public BigDecimal getYearCommissionAmount() {
        return yearCommissionAmount;
    }

    public void setYearCommissionAmount(BigDecimal yearCommissionAmount) {
        this.yearCommissionAmount = yearCommissionAmount;
    }

    public BigDecimal getUnPayCommissionAmount() {
        return unPayCommissionAmount;
    }

    public void setUnPayCommissionAmount(BigDecimal unPayCommissionAmount) {
        this.unPayCommissionAmount = unPayCommissionAmount;
    }

    public Integer getDistributionOrdersCount() {
        return distributionOrdersCount;
    }

    public void setDistributionOrdersCount(Integer distributionOrdersCount) {
        this.distributionOrdersCount = distributionOrdersCount;
    }

    public BigDecimal getDistributionOrdersSale() {
        return distributionOrdersSale;
    }

    public void setDistributionOrdersSale(BigDecimal distributionOrdersSale) {
        this.distributionOrdersSale = distributionOrdersSale;
    }

    public BigDecimal getMonthDistributionOrdersSale() {
        return monthDistributionOrdersSale;
    }

    public void setMonthDistributionOrdersSale(BigDecimal monthDistributionOrdersSale) {
        this.monthDistributionOrdersSale = monthDistributionOrdersSale;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}