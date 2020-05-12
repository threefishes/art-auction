package cn.threefishes.cloudrepository.entity;

public class TfDimHour {
    private Integer hourId;

    private Integer hourCode;

    private String hourName;

    public Integer getHourId() {
        return hourId;
    }

    public void setHourId(Integer hourId) {
        this.hourId = hourId;
    }

    public Integer getHourCode() {
        return hourCode;
    }

    public void setHourCode(Integer hourCode) {
        this.hourCode = hourCode;
    }

    public String getHourName() {
        return hourName;
    }

    public void setHourName(String hourName) {
        this.hourName = hourName == null ? null : hourName.trim();
    }
}