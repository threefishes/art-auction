package cn.threefishes.cloudrepository.entity;

public class CategoryCommission {
    private Integer commissionId;

    private Integer categoryId;

    private Integer commissionRate;

    private Integer selfCommissionRate;

    public Integer getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Integer commissionId) {
        this.commissionId = commissionId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getSelfCommissionRate() {
        return selfCommissionRate;
    }

    public void setSelfCommissionRate(Integer selfCommissionRate) {
        this.selfCommissionRate = selfCommissionRate;
    }
}