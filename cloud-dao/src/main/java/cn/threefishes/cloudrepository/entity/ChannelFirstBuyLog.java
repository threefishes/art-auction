package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ChannelFirstBuyLog {
    private Integer id;

    private Integer ordersId;

    private Integer memberId;

    private Integer saleChannel;

    private Date pushCreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getSaleChannel() {
        return saleChannel;
    }

    public void setSaleChannel(Integer saleChannel) {
        this.saleChannel = saleChannel;
    }

    public Date getPushCreateTime() {
        return pushCreateTime;
    }

    public void setPushCreateTime(Date pushCreateTime) {
        this.pushCreateTime = pushCreateTime;
    }
}