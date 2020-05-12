package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ArtificialMaterial {
    private Integer materialId;

    private Integer commonId;

    private Integer memberId;

    private String memberName;

    private String avatar;

    private Integer categoryId;

    private Date releaseDate;

    private Integer dateQuantum;

    private Date createTime;

    private Integer isDel;

    private String dateQuantumDesc;

    private String materialBody;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getDateQuantum() {
        return dateQuantum;
    }

    public void setDateQuantum(Integer dateQuantum) {
        this.dateQuantum = dateQuantum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getDateQuantumDesc() {
        return dateQuantumDesc;
    }

    public void setDateQuantumDesc(String dateQuantumDesc) {
        this.dateQuantumDesc = dateQuantumDesc == null ? null : dateQuantumDesc.trim();
    }

    public String getMaterialBody() {
        return materialBody;
    }

    public void setMaterialBody(String materialBody) {
        this.materialBody = materialBody == null ? null : materialBody.trim();
    }
}