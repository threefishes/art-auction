package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DistributorStats {
    private Integer id;

    private Integer distributorId;

    private Integer memberId;

    private BigDecimal commissionAmount;

    private BigDecimal unPayCommissionAmount;

    private BigDecimal distributionOrdersSale;

    private BigDecimal monthDistributionOrdersSale;

    private Long invitationDistributorCount;

    private Long visitCount;

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

    public BigDecimal getUnPayCommissionAmount() {
        return unPayCommissionAmount;
    }

    public void setUnPayCommissionAmount(BigDecimal unPayCommissionAmount) {
        this.unPayCommissionAmount = unPayCommissionAmount;
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

    public Long getInvitationDistributorCount() {
        return invitationDistributorCount;
    }

    public void setInvitationDistributorCount(Long invitationDistributorCount) {
        this.invitationDistributorCount = invitationDistributorCount;
    }

    public Long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
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