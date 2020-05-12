package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatMember {
    private Integer statId;

    private Integer memberId;

    private String memberName;

    private BigDecimal ordersAmount;

    private Long ordersNum;

    private Long pointsIncrease;

    private Long pointsReduce;

    private BigDecimal predepositIncrease;

    private BigDecimal predepositReduce;

    private Date statDate;

    public Integer getStatId() {
        return statId;
    }

    public void setStatId(Integer statId) {
        this.statId = statId;
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

    public BigDecimal getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(BigDecimal ordersAmount) {
        this.ordersAmount = ordersAmount;
    }

    public Long getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(Long ordersNum) {
        this.ordersNum = ordersNum;
    }

    public Long getPointsIncrease() {
        return pointsIncrease;
    }

    public void setPointsIncrease(Long pointsIncrease) {
        this.pointsIncrease = pointsIncrease;
    }

    public Long getPointsReduce() {
        return pointsReduce;
    }

    public void setPointsReduce(Long pointsReduce) {
        this.pointsReduce = pointsReduce;
    }

    public BigDecimal getPredepositIncrease() {
        return predepositIncrease;
    }

    public void setPredepositIncrease(BigDecimal predepositIncrease) {
        this.predepositIncrease = predepositIncrease;
    }

    public BigDecimal getPredepositReduce() {
        return predepositReduce;
    }

    public void setPredepositReduce(BigDecimal predepositReduce) {
        this.predepositReduce = predepositReduce;
    }

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }
}