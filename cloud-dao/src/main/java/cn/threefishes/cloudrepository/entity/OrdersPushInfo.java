package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class OrdersPushInfo {
    private Integer id;

    private Integer ordersId;

    private String ordersSn;

    private String pushContent;

    private Integer state;

    private Date pushTime;

    private Date updateTime;

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

    public String getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(String ordersSn) {
        this.ordersSn = ordersSn == null ? null : ordersSn.trim();
    }

    public String getPushContent() {
        return pushContent;
    }

    public void setPushContent(String pushContent) {
        this.pushContent = pushContent == null ? null : pushContent.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}