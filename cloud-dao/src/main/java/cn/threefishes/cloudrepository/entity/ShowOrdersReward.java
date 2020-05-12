package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ShowOrdersReward {
    private Integer rewardId;

    private BigDecimal authorFee;

    private Integer authorMemberId;

    private String authorMemberName;

    private String clientType;

    private Integer memberId;

    private String memberName;

    private BigDecimal payAmount;

    private String payCode;

    private Long paySn;

    private Integer payState;

    private Date payTime;

    private Integer rewardCommission;

    private Integer showOrdersId;

    private String showOrdersTitle;

    private BigDecimal siteFee;

    public Integer getRewardId() {
        return rewardId;
    }

    public void setRewardId(Integer rewardId) {
        this.rewardId = rewardId;
    }

    public BigDecimal getAuthorFee() {
        return authorFee;
    }

    public void setAuthorFee(BigDecimal authorFee) {
        this.authorFee = authorFee;
    }

    public Integer getAuthorMemberId() {
        return authorMemberId;
    }

    public void setAuthorMemberId(Integer authorMemberId) {
        this.authorMemberId = authorMemberId;
    }

    public String getAuthorMemberName() {
        return authorMemberName;
    }

    public void setAuthorMemberName(String authorMemberName) {
        this.authorMemberName = authorMemberName == null ? null : authorMemberName.trim();
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    public Long getPaySn() {
        return paySn;
    }

    public void setPaySn(Long paySn) {
        this.paySn = paySn;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getRewardCommission() {
        return rewardCommission;
    }

    public void setRewardCommission(Integer rewardCommission) {
        this.rewardCommission = rewardCommission;
    }

    public Integer getShowOrdersId() {
        return showOrdersId;
    }

    public void setShowOrdersId(Integer showOrdersId) {
        this.showOrdersId = showOrdersId;
    }

    public String getShowOrdersTitle() {
        return showOrdersTitle;
    }

    public void setShowOrdersTitle(String showOrdersTitle) {
        this.showOrdersTitle = showOrdersTitle == null ? null : showOrdersTitle.trim();
    }

    public BigDecimal getSiteFee() {
        return siteFee;
    }

    public void setSiteFee(BigDecimal siteFee) {
        this.siteFee = siteFee;
    }
}