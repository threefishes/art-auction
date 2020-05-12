package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class PurchaseChat {
    private Integer id;

    private String content;

    private Date createTime;

    private Integer purchaseBuyId;

    private Integer purchaseQuotedpriceId;

    private String role;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPurchaseBuyId() {
        return purchaseBuyId;
    }

    public void setPurchaseBuyId(Integer purchaseBuyId) {
        this.purchaseBuyId = purchaseBuyId;
    }

    public Integer getPurchaseQuotedpriceId() {
        return purchaseQuotedpriceId;
    }

    public void setPurchaseQuotedpriceId(Integer purchaseQuotedpriceId) {
        this.purchaseQuotedpriceId = purchaseQuotedpriceId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}