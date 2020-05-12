package cn.threefishes.cloudrepository.entity;

public class OrdersPay {
    private Integer payId;

    private String couponId;

    private Integer couponReturn;

    private Integer memberId;

    private Integer payOrdersType;

    private Long paySn;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public Integer getCouponReturn() {
        return couponReturn;
    }

    public void setCouponReturn(Integer couponReturn) {
        this.couponReturn = couponReturn;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getPayOrdersType() {
        return payOrdersType;
    }

    public void setPayOrdersType(Integer payOrdersType) {
        this.payOrdersType = payOrdersType;
    }

    public Long getPaySn() {
        return paySn;
    }

    public void setPaySn(Long paySn) {
        this.paySn = paySn;
    }
}