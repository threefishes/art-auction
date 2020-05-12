package cn.threefishes.cloudrepository.entity;

public class MemberInvoiceEmail {
    private Integer memberId;

    private String email;

    private String postJson;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPostJson() {
        return postJson;
    }

    public void setPostJson(String postJson) {
        this.postJson = postJson == null ? null : postJson.trim();
    }
}