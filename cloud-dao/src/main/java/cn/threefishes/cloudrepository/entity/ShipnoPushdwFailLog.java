package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ShipnoPushdwFailLog {
    private Integer shipnoLogId;

    private String shipNo;

    private String claimNo;

    private Integer memberId;

    private Integer state;

    private String message;

    private Integer pushType;

    private Date createTime;

    public Integer getShipnoLogId() {
        return shipnoLogId;
    }

    public void setShipnoLogId(Integer shipnoLogId) {
        this.shipnoLogId = shipnoLogId;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo == null ? null : shipNo.trim();
    }

    public String getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo == null ? null : claimNo.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}