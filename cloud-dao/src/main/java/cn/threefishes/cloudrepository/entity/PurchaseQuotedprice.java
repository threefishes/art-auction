package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseQuotedprice {
    private Integer id;

    private String annex;

    private String companyName;

    private String contacts;

    private String content;

    private Date createTime;

    private BigDecimal num;

    private String phone;

    private BigDecimal price;

    private String priceMemo;

    private Integer purchaseBuyId;

    private String purchaseBuyTitle;

    private Date replyTime;

    private Integer sellerId;

    private Integer state;

    private String title;

    private String unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex == null ? null : annex.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
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

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPriceMemo() {
        return priceMemo;
    }

    public void setPriceMemo(String priceMemo) {
        this.priceMemo = priceMemo == null ? null : priceMemo.trim();
    }

    public Integer getPurchaseBuyId() {
        return purchaseBuyId;
    }

    public void setPurchaseBuyId(Integer purchaseBuyId) {
        this.purchaseBuyId = purchaseBuyId;
    }

    public String getPurchaseBuyTitle() {
        return purchaseBuyTitle;
    }

    public void setPurchaseBuyTitle(String purchaseBuyTitle) {
        this.purchaseBuyTitle = purchaseBuyTitle == null ? null : purchaseBuyTitle.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }
}