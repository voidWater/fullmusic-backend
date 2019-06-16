package com.fullmusic.pojo;

import java.util.Date;

public class Talk {
    private String id;

    private String vcUserId;

    private String vcClockinId;

    private String vcContent;

    private String vcResourceUrl;

    private Integer vcType;

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

    public String getVcClockinId() {
        return vcClockinId;
    }

    public void setVcClockinId(String vcClockinId) {
        this.vcClockinId = vcClockinId == null ? null : vcClockinId.trim();
    }

    public String getVcContent() {
        return vcContent;
    }

    public void setVcContent(String vcContent) {
        this.vcContent = vcContent == null ? null : vcContent.trim();
    }

    public String getVcResourceUrl() {
        return vcResourceUrl;
    }

    public void setVcResourceUrl(String vcResourceUrl) {
        this.vcResourceUrl = vcResourceUrl == null ? null : vcResourceUrl.trim();
    }

    public Integer getVcType() {
        return vcType;
    }

    public void setVcType(Integer vcType) {
        this.vcType = vcType;
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