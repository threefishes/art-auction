package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Sensitives {
    private Integer sensitiveId;

    private Date addTime;

    private Integer isUse;

    private String sensitiveWord;

    public Integer getSensitiveId() {
        return sensitiveId;
    }

    public void setSensitiveId(Integer sensitiveId) {
        this.sensitiveId = sensitiveId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public String getSensitiveWord() {
        return sensitiveWord;
    }

    public void setSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord == null ? null : sensitiveWord.trim();
    }
}