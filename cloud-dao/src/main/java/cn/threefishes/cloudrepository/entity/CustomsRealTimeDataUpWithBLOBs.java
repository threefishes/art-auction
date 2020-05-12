package cn.threefishes.cloudrepository.entity;

public class CustomsRealTimeDataUpWithBLOBs extends CustomsRealTimeDataUp {
    private String waitSign;

    private String sign;

    private String waitPush;

    public String getWaitSign() {
        return waitSign;
    }

    public void setWaitSign(String waitSign) {
        this.waitSign = waitSign == null ? null : waitSign.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getWaitPush() {
        return waitPush;
    }

    public void setWaitPush(String waitPush) {
        this.waitPush = waitPush == null ? null : waitPush.trim();
    }
}