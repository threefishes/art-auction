package cn.threefishes.cloudrepository.entity;

public class TaxClassCode {
    private Integer id;

    private String bm;

    private String hbbm;

    private String mc;

    private String sm;

    private String slv;

    private String zzstsgl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm == null ? null : bm.trim();
    }

    public String getHbbm() {
        return hbbm;
    }

    public void setHbbm(String hbbm) {
        this.hbbm = hbbm == null ? null : hbbm.trim();
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm == null ? null : sm.trim();
    }

    public String getSlv() {
        return slv;
    }

    public void setSlv(String slv) {
        this.slv = slv == null ? null : slv.trim();
    }

    public String getZzstsgl() {
        return zzstsgl;
    }

    public void setZzstsgl(String zzstsgl) {
        this.zzstsgl = zzstsgl == null ? null : zzstsgl.trim();
    }
}