package cn.threefishes.cloudrepository.entity;

public class DwExpress {
    private Integer dwExpressId;

    private String shipSn;

    private String delyGb;

    private String wbNo;

    private String dwOrderNo;

    private String itemCode;

    private String skuCode;

    private String codeName;

    private String codeSname;

    private String content;

    public Integer getDwExpressId() {
        return dwExpressId;
    }

    public void setDwExpressId(Integer dwExpressId) {
        this.dwExpressId = dwExpressId;
    }

    public String getShipSn() {
        return shipSn;
    }

    public void setShipSn(String shipSn) {
        this.shipSn = shipSn == null ? null : shipSn.trim();
    }

    public String getDelyGb() {
        return delyGb;
    }

    public void setDelyGb(String delyGb) {
        this.delyGb = delyGb == null ? null : delyGb.trim();
    }

    public String getWbNo() {
        return wbNo;
    }

    public void setWbNo(String wbNo) {
        this.wbNo = wbNo == null ? null : wbNo.trim();
    }

    public String getDwOrderNo() {
        return dwOrderNo;
    }

    public void setDwOrderNo(String dwOrderNo) {
        this.dwOrderNo = dwOrderNo == null ? null : dwOrderNo.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public String getCodeSname() {
        return codeSname;
    }

    public void setCodeSname(String codeSname) {
        this.codeSname = codeSname == null ? null : codeSname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}