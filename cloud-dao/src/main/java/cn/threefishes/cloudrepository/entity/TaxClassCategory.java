package cn.threefishes.cloudrepository.entity;

public class TaxClassCategory {
    private Integer categoryId;

    private Integer taxClassId;

    private String taxClassSlv;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getTaxClassId() {
        return taxClassId;
    }

    public void setTaxClassId(Integer taxClassId) {
        this.taxClassId = taxClassId;
    }

    public String getTaxClassSlv() {
        return taxClassSlv;
    }

    public void setTaxClassSlv(String taxClassSlv) {
        this.taxClassSlv = taxClassSlv == null ? null : taxClassSlv.trim();
    }
}