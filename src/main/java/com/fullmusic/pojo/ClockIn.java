package com.fullmusic.pojo;

import java.util.Date;

public class ClockIn {
    private String id;

    private String vcUserId;

    private String vcContent;

    private Integer vcType;

    private String vcResourceUrl;

    private Integer vcLikenum;

    private Integer vcInvalid;

    private Date vcCreatedate;

    private Date vcUpdatedate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVcUserId() {
        return vcUserId;
    }

    public void setVcUserId(String vcUserId) {
        this.vcUserId = vcUserId == null ? null : vcUserId.trim();
    }

    public String getVcContent() {
        return vcContent;
    }

    public void setVcContent(String vcContent) {
        this.vcContent = vcContent == null ? null : vcContent.trim();
    }

    public Integer getVcType() {
        return vcType;
    }

    public void setVcType(Integer vcType) {
        this.vcType = vcType;
    }

    public String getVcResourceUrl() {
        return vcResourceUrl;
    }

    public void setVcResourceUrl(String vcResourceUrl) {
        this.vcResourceUrl = vcResourceUrl == null ? null : vcResourceUrl.trim();
    }

    public Integer getVcLikenum() {
        return vcLikenum;
    }

    public void setVcLikenum(Integer vcLikenum) {
        this.vcLikenum = vcLikenum;
    }

    public Integer getVcInvalid() {
        return vcInvalid;
    }

    public void setVcInvalid(Integer vcInvalid) {
        this.vcInvalid = vcInvalid;
    }

    public Date getVcCreatedate() {
        return vcCreatedate;
    }

    public void setVcCreatedate(Date vcCreatedate) {
        this.vcCreatedate = vcCreatedate;
    }

    public Date getVcUpdatedate() {
        return vcUpdatedate;
    }

    public void setVcUpdatedate(Date vcUpdatedate) {
        this.vcUpdatedate = vcUpdatedate;
    }
}