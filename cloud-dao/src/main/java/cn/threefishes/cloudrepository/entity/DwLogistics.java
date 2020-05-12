package cn.threefishes.cloudrepository.entity;

public class DwLogistics {
    private String codeMgroup;

    private String codeName;

    private String codeSname;

    private String content;

    private String kdnCode;

    public String getCodeMgroup() {
        return codeMgroup;
    }

    public void setCodeMgroup(String codeMgroup) {
        this.codeMgroup = codeMgroup == null ? null : codeMgroup.trim();
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

    public String getKdnCode() {
        return kdnCode;
    }

    public void setKdnCode(String kdnCode) {
        this.kdnCode = kdnCode == null ? null : kdnCode.trim();
    }
}