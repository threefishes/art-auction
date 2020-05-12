package cn.threefishes.cloudrepository.entity;

public class TBlackuser {
    private Integer userautoid;

    private String username;

    private String address;

    private String homephone;

    private Integer status;

    public Integer getUserautoid() {
        return userautoid;
    }

    public void setUserautoid(Integer userautoid) {
        this.userautoid = userautoid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone == null ? null : homephone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}