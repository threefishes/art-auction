package cn.threefishes.cloudrepository.entity;

public class DwRunBook {
    private Integer runBookId;

    private Long ordersSn;

    private Integer runBookState;

    private Integer runBookType;

    private String runBookParams;

    public Integer getRunBookId() {
        return runBookId;
    }

    public void setRunBookId(Integer runBookId) {
        this.runBookId = runBookId;
    }

    public Long getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(Long ordersSn) {
        this.ordersSn = ordersSn;
    }

    public Integer getRunBookState() {
        return runBookState;
    }

    public void setRunBookState(Integer runBookState) {
        this.runBookState = runBookState;
    }

    public Integer getRunBookType() {
        return runBookType;
    }

    public void setRunBookType(Integer runBookType) {
        this.runBookType = runBookType;
    }

    public String getRunBookParams() {
        return runBookParams;
    }

    public void setRunBookParams(String runBookParams) {
        this.runBookParams = runBookParams == null ? null : runBookParams.trim();
    }
}