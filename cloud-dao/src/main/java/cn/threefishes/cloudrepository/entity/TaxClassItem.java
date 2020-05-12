package cn.threefishes.cloudrepository.entity;

public class TaxClassItem {
    private Integer commonId;

    private Integer taxClassId;

    private String taxClassSlv;

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
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