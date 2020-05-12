package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TaskTemplate {
    private Integer templateId;

    private BigDecimal amount;

    private String templateContent1;

    private String templateContent2;

    private Integer adminId;

    private Date addTime;

    private Date updateTime;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTemplateContent1() {
        return templateContent1;
    }

    public void setTemplateContent1(String templateContent1) {
        this.templateContent1 = templateContent1 == null ? null : templateContent1.trim();
    }

    public String getTemplateContent2() {
        return templateContent2;
    }

    public void setTemplateContent2(String templateContent2) {
        this.templateContent2 = templateContent2 == null ? null : templateContent2.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}