package com.fullmusic.pojo;

import java.util.Date;

public class User {
    private String id;

    private String vcName;

    private String vcAliName;

    private String vcPhone;

    private String vcWx;

    private String vcAddr;

    private Integer vcType;

    private String vcRemake;

    private Integer vcInvalid;

    private Date vcCreatedate;

    private Date vcUpdatedate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcAliName() {
        return vcAliName;
    }

    public void setVcAliName(String vcAliName) {
        this.vcAliName = vcAliName == null ? null : vcAliName.trim();
    }

    public String getVcPhone() {
        return vcPhone;
    }

    public void setVcPhone(String vcPhone) {
        this.vcPhone = vcPhone == null ? null : vcPhone.trim();
    }

    public String getVcWx() {
        return vcWx;
    }

    public void setVcWx(String vcWx) {
        this.vcWx = vcWx == null ? null : vcWx.trim();
    }

    public String getVcAddr() {
        return vcAddr;
    }

    public void setVcAddr(String vcAddr) {
        this.vcAddr = vcAddr == null ? null : vcAddr.trim();
    }

    public Integer getVcType() {
        return vcType;
    }

    public void setVcType(Integer vcType) {
        this.vcType = vcType;
    }

    public String getVcRemake() {
        return vcRemake;
    }

    public void setVcRemake(String vcRemake) {
        this.vcRemake = vcRemake == null ? null : vcRemake.trim();
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