package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ShopConfig {
    private Integer kdtId;

    private String name;

    private String clientId;

    private String clientSecret;

    private String accesstoken;

    private Date updateTime;

    private Integer expiresIn;

    private Integer kdtStatus;

    public Integer getKdtId() {
        return kdtId;
    }

    public void setKdtId(Integer kdtId) {
        this.kdtId = kdtId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret == null ? null : clientSecret.trim();
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken == null ? null : accesstoken.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Integer getKdtStatus() {
        return kdtStatus;
    }

    public void setKdtStatus(Integer kdtStatus) {
        this.kdtStatus = kdtStatus;
    }
}