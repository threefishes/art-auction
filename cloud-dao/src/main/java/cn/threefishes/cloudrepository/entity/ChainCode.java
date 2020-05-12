package cn.threefishes.cloudrepository.entity;

public class ChainCode {
    private Integer chainCodeId;

    private Integer chainId;

    private Integer ordersId;

    private Integer takeCode;

    private Integer useState;

    public Integer getChainCodeId() {
        return chainCodeId;
    }

    public void setChainCodeId(Integer chainCodeId) {
        this.chainCodeId = chainCodeId;
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getTakeCode() {
        return takeCode;
    }

    public void setTakeCode(Integer takeCode) {
        this.takeCode = takeCode;
    }

    public Integer getUseState() {
        return useState;
    }

    public void setUseState(Integer useState) {
        this.useState = useState;
    }
}