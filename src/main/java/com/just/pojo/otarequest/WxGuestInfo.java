package com.just.pojo.otarequest;

/**
 * Created by flyhigh on 2016/5/24.
 */
public class WxGuestInfo {
    String guestname = "";
    String mobile = "";
    String profileid = "";//渠道档案ID
    String idno = "";
    String idtype = "";

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        if (guestname == null)
            guestname = "";
        this.guestname = guestname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        if (idno == null)
            idno = "";
        this.idno = idno;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        if (idtype == null)
            idtype = "";
        this.idtype = idtype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        if (mobile == null)
            mobile = "";
        this.mobile = mobile;
    }

    public String getProfileid() {
        return profileid;
    }

    public void setProfileid(String profileid) {
        if (profileid == null)
            profileid = "";
        this.profileid = profileid;
    }
}
