package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;

public class FreightArea {
    private Integer freightAreaId;

    private Integer freightId;

    private BigDecimal item1;

    private BigDecimal item2;

    private BigDecimal price1;

    private BigDecimal price2;

    public Integer getFreightAreaId() {
        return freightAreaId;
    }

    public void setFreightAreaId(Integer freightAreaId) {
        this.freightAreaId = freightAreaId;
    }

    public Integer getFreightId() {
        return freightId;
    }

    public void setFreightId(Integer freightId) {
        this.freightId = freightId;
    }

    public BigDecimal getItem1() {
        return item1;
    }

    public void setItem1(BigDecimal item1) {
        this.item1 = item1;
    }

    public BigDecimal getItem2() {
        return item2;
    }

    public void setItem2(BigDecimal item2) {
        this.item2 = item2;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
    }

    public BigDecimal getPrice2() {
        return price2;
    }

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }
}