package cn.threefishes.cloudrepository.entity;

public class ChainCouponActivity {
    private Integer id;

    private Integer activityId;

    private String address;

    private String areaInfo;

    private Integer chainAbleState;

    private Integer chainAvailableNum;

    private Integer chainGiveoutNum;

    private Integer chainId;

    private String chainName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAreaInfo() {
        return areaInfo;
    }

    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo == null ? null : areaInfo.trim();
    }

    public Integer getChainAbleState() {
        return chainAbleState;
    }

    public void setChainAbleState(Integer chainAbleState) {
        this.chainAbleState = chainAbleState;
    }

    public Integer getChainAvailableNum() {
        return chainAvailableNum;
    }

    public void setChainAvailableNum(Integer chainAvailableNum) {
        this.chainAvailableNum = chainAvailableNum;
    }

    public Integer getChainGiveoutNum() {
        return chainGiveoutNum;
    }

    public void setChainGiveoutNum(Integer chainGiveoutNum) {
        this.chainGiveoutNum = chainGiveoutNum;
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
}