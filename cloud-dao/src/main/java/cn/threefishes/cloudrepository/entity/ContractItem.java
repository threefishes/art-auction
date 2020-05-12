package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;

public class ContractItem {
    private Integer ctiId;

    private BigDecimal ctiCost;

    private String ctiDescribe;

    private String ctiDescurl;

    private String ctiIcon;

    private String ctiName;

    private Integer ctiSort;

    private Integer ctiState;

    public Integer getCtiId() {
        return ctiId;
    }

    public void setCtiId(Integer ctiId) {
        this.ctiId = ctiId;
    }

    public BigDecimal getCtiCost() {
        return ctiCost;
    }

    public void setCtiCost(BigDecimal ctiCost) {
        this.ctiCost = ctiCost;
    }

    public String getCtiDescribe() {
        return ctiDescribe;
    }

    public void setCtiDescribe(String ctiDescribe) {
        this.ctiDescribe = ctiDescribe == null ? null : ctiDescribe.trim();
    }

    public String getCtiDescurl() {
        return ctiDescurl;
    }

    public void setCtiDescurl(String ctiDescurl) {
        this.ctiDescurl = ctiDescurl == null ? null : ctiDescurl.trim();
    }

    public String getCtiIcon() {
        return ctiIcon;
    }

    public void setCtiIcon(String ctiIcon) {
        this.ctiIcon = ctiIcon == null ? null : ctiIcon.trim();
    }

    public String getCtiName() {
        return ctiName;
    }

    public void setCtiName(String ctiName) {
        this.ctiName = ctiName == null ? null : ctiName.trim();
    }

    public Integer getCtiSort() {
        return ctiSort;
    }

    public void setCtiSort(Integer ctiSort) {
        this.ctiSort = ctiSort;
    }

    public Integer getCtiState() {
        return ctiState;
    }

    public void setCtiState(Integer ctiState) {
        this.ctiState = ctiState;
    }
}