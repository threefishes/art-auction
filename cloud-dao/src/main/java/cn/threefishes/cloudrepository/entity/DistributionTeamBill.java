package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DistributionTeamBill {
    private Integer teamBillId;

    private Integer teamBillSn;

    private BigDecimal teamOrdersAmount;

    private Date teamCreateTime;

    private Date teamEndTime;

    private Date teamStartTime;

    private Integer memberId;

    private Integer memberType;

    private BigDecimal teamOpenShopAmount;

    public Integer getTeamBillId() {
        return teamBillId;
    }

    public void setTeamBillId(Integer teamBillId) {
        this.teamBillId = teamBillId;
    }

    public Integer getTeamBillSn() {
        return teamBillSn;
    }

    public void setTeamBillSn(Integer teamBillSn) {
        this.teamBillSn = teamBillSn;
    }

    public BigDecimal getTeamOrdersAmount() {
        return teamOrdersAmount;
    }

    public void setTeamOrdersAmount(BigDecimal teamOrdersAmount) {
        this.teamOrdersAmount = teamOrdersAmount;
    }

    public Date getTeamCreateTime() {
        return teamCreateTime;
    }

    public void setTeamCreateTime(Date teamCreateTime) {
        this.teamCreateTime = teamCreateTime;
    }

    public Date getTeamEndTime() {
        return teamEndTime;
    }

    public void setTeamEndTime(Date teamEndTime) {
        this.teamEndTime = teamEndTime;
    }

    public Date getTeamStartTime() {
        return teamStartTime;
    }

    public void setTeamStartTime(Date teamStartTime) {
        this.teamStartTime = teamStartTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public BigDecimal getTeamOpenShopAmount() {
        return teamOpenShopAmount;
    }

    public void setTeamOpenShopAmount(BigDecimal teamOpenShopAmount) {
        this.teamOpenShopAmount = teamOpenShopAmount;
    }
}