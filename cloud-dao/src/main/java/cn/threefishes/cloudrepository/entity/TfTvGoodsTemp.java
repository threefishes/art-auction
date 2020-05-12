package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TfTvGoodsTemp {
    private Long id;

    private Long dwId;

    private Long flag;

    private Date bdBtime;

    private Date bdEtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDwId() {
        return dwId;
    }

    public void setDwId(Long dwId) {
        this.dwId = dwId;
    }

    public Long getFlag() {
        return flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
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
}