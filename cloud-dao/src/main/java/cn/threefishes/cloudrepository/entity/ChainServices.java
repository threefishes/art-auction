package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ChainServices {
    private Integer servicesId;

    private Integer ableState;

    private Date addTime;

    private Integer chainId;

    private String chainName;

    private String servicesDescription;

    private String servicesName;

    public Integer getServicesId() {
        return servicesId;
    }

    public void setServicesId(Integer servicesId) {
        this.servicesId = servicesId;
    }

    public Integer getAbleState() {
        return ableState;
    }

    public void setAbleState(Integer ableState) {
        this.ableState = ableState;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName == null ? null : chainName.trim();
    }

    public String getServicesDescription() {
        return servicesDescription;
    }

    public void setServicesDescription(String servicesDescription) {
        this.servicesDescription = servicesDescription == null ? null : servicesDescription.trim();
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName == null ? null : servicesName.trim();
    }
}