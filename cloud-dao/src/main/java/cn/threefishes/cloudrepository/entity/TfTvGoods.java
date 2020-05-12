package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TfTvGoods {
    private Integer id;

    private Integer dwId;

    private Integer commonId;

    private String goodsName;

    private String imageName;

    private String jingle;

    private Date bdBtime;

    private Date bdEtime;

    private Date createTime;

    private BigDecimal saleAmt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDwId() {
        return dwId;
    }

    public void setDwId(Integer dwId) {
        this.dwId = dwId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getJingle() {
        return jingle;
    }

    public void setJingle(String jingle) {
        this.jingle = jingle == null ? null : jingle.trim();
    }

    public Date getBdBtime() {
        return bdBtime;
    }

    public void setBdBtime(Date bdBtime) {
        this.bdBtime = bdBtime;
    }

    public Date getBdEtime() {
        return bdEtime;
    }

    public void setBdEtime(Date bdEtime) {
        this.bdEtime = bdEtime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(BigDecimal saleAmt) {
        this.saleAmt = saleAmt;
    }
}