package cn.threefishes.cloudrepository.entity;

public class SmsCodeBlacklist {
    private Long mobile;

    private Short restrictedreg;

    private Short restrictedlog;

    private Short restrictedpwd;

    private Short restrictedver;

    private Short restrictedbin;

    private Short status;

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Short getRestrictedreg() {
        return restrictedreg;
    }

    public void setRestrictedreg(Short restrictedreg) {
        this.restrictedreg = restrictedreg;
    }

    public Short getRestrictedlog() {
        return restrictedlog;
    }

    public void setRestrictedlog(Short restrictedlog) {
        this.restrictedlog = restrictedlog;
    }

    public Short getRestrictedpwd() {
        return restrictedpwd;
    }

    public void setRestrictedpwd(Short restrictedpwd) {
        this.restrictedpwd = restrictedpwd;
    }

    public Short getRestrictedver() {
        return restrictedver;
    }

    public void setRestrictedver(Short restrictedver) {
        this.restrictedver = restrictedver;
    }

    public Short getRestrictedbin() {
        return restrictedbin;
    }

    public void setRestrictedbin(Short restrictedbin) {
        this.restrictedbin = restrictedbin;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}