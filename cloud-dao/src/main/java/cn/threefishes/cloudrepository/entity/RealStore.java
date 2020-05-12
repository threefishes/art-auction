package cn.threefishes.cloudrepository.entity;

public class RealStore {
    private Integer realStoreId;

    private String address;

    private Integer areaId1;

    private Integer areaId2;

    private String areaInfo;

    private Float lat;

    private Float lng;

    private String phone;

    private String realStoreName;

    private Integer storeId;

    private String trafficLine;

    public Integer getRealStoreId() {
        return realStoreId;
    }

    public void setRealStoreId(Integer realStoreId) {
        this.realStoreId = realStoreId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAreaId1() {
        return areaId1;
    }

    public void setAreaId1(Integer areaId1) {
        this.areaId1 = areaId1;
    }

    public Integer getAreaId2() {
        return areaId2;
    }

    public void setAreaId2(Integer areaId2) {
        this.areaId2 = areaId2;
    }

    public String getAreaInfo() {
        return areaInfo;
    }

    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo == null ? null : areaInfo.trim();
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRealStoreName() {
        return realStoreName;
    }

    public void setRealStoreName(String realStoreName) {
        this.realStoreName = realStoreName == null ? null : realStoreName.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getTrafficLine() {
        return trafficLine;
    }

    public void setTrafficLine(String trafficLine) {
        this.trafficLine = trafficLine == null ? null : trafficLine.trim();
    }
}