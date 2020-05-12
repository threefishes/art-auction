package cn.threefishes.cloudrepository.entity;

public class GmallBank {
    private Integer bankId;

    private String bankName;

    private Integer bankOrder;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Integer getBankOrder() {
        return bankOrder;
    }

    public void setBankOrder(Integer bankOrder) {
        this.bankOrder = bankOrder;
    }
}