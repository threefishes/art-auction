package cn.threefishes.cloudrepository.entity;

public class ShipCompany {
    private Integer shipId;

    private String shipCode;

    private String shipLetter;

    private String shipName;

    private Integer shipState;

    private Integer shipType;

    private String shipUrl;

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode == null ? null : shipCode.trim();
    }

    public String getShipLetter() {
        return shipLetter;
    }

    public void setShipLetter(String shipLetter) {
        this.shipLetter = shipLetter == null ? null : shipLetter.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public Integer getShipState() {
        return shipState;
    }

    public void setShipState(Integer shipState) {
        this.shipState = shipState;
    }

    public Integer getShipType() {
        return shipType;
    }

    public void setShipType(Integer shipType) {
        this.shipType = shipType;
    }

    public String getShipUrl() {
        return shipUrl;
    }

    public void setShipUrl(String shipUrl) {
        this.shipUrl = shipUrl == null ? null : shipUrl.trim();
    }
}