package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ComboGoods {
    private Integer id;

    private String comboClass;

    private Integer comboCommonId;

    private Integer commonId;

    private Date createTime;

    private Integer storeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComboClass() {
        return comboClass;
    }

    public void setComboClass(String comboClass) {
        this.comboClass = comboClass == null ? null : comboClass.trim();
    }

    public Integer getComboCommonId() {
        return comboCommonId;
    }

    public void setComboCommonId(Integer comboCommonId) {
        this.comboCommonId = comboCommonId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}