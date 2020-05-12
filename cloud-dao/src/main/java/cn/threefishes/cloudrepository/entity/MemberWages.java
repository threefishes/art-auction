package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MemberWages {
    private Integer memberWagesId;

    private Integer isSuper;

    private Integer wagesBillId;

    private Integer memberId;

    private String memberName;

    private Integer memberType;

    private Date doTime;

    private Date startTime;

    private Date endTime;

    private BigDecimal wagesAmount;

    private BigDecimal eagleAwardAmount;

    private BigDecimal teamAmount;

    private BigDecimal distributorUpAmount;

    private BigDecimal openShopAmount;

    public Integer getMemberWagesId() {
        return memberWagesId;
    }

    public void setMemberWagesId(Integer memberWagesId) {
        this.memberWagesId = memberWagesId;
    }

    public Integer getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(Integer isSuper) {
        this.isSuper = isSuper;
    }

    public Integer getWagesBillId() {
        return wagesBillId;
    }

    public void setWagesBillId(Integer wagesBillId) {
        this.wagesBillId = wagesBillId;
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

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public Date getDoTime() {
        return doTime;
    }

    public void setDoTime(Date doTime) {
        this.doTime = doTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getWagesAmount() {
        return wagesAmount;
    }

    public void setWagesAmount(BigDecimal wagesAmount) {
        this.wagesAmount = wagesAmount;
    }

    public BigDecimal getEagleAwardAmount() {
        return eagleAwardAmount;
    }

    public void setEagleAwardAmount(BigDecimal eagleAwardAmount) {
        this.eagleAwardAmount = eagleAwardAmount;
    }

    public BigDecimal getTeamAmount() {
        return teamAmount;
    }

    public void setTeamAmount(BigDecimal teamAmount) {
        this.teamAmount = teamAmount;
    }

    public BigDecimal getDistributorUpAmount() {
        return distributorUpAmount;
    }

    public void setDistributorUpAmount(BigDecimal distributorUpAmount) {
        this.distributorUpAmount = distributorUpAmount;
    }

    public BigDecimal getOpenShopAmount() {
        return openShopAmount;
    }

    public void setOpenShopAmount(BigDecimal openShopAmount) {
        this.openShopAmount = openShopAmount;
    }
}