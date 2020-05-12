package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ChainEvaluate {
    private Integer evaluateId;

    private Date addtime;

    private String chainAvatar;

    private Integer chainId;

    private String chainName;

    private String content;

    private String memberAvatar;

    private Integer memberId;

    private String memberName;

    private Integer ordersId;

    private Long ordersSn;

    private Integer scores;

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getChainAvatar() {
        return chainAvatar;
    }

    public void setChainAvatar(String chainAvatar) {
        this.chainAvatar = chainAvatar == null ? null : chainAvatar.trim();
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName == null ? null : chainName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMemberAvatar() {
        return memberAvatar;
    }

    public void setMemberAvatar(String memberAvatar) {
        this.memberAvatar = memberAvatar == null ? null : memberAvatar.trim();
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

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Long getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(Long ordersSn) {
        this.ordersSn = ordersSn;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }
}