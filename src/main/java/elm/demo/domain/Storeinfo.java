package elm.demo.domain;

import java.util.Date;

public class Storeinfo {
    private Integer sid;

    private String sname;

    private String spassword;

    private String sphoto;

    private String marking;

    private String dispatching;

    private String sadderss;

    private Boolean offer;

    private Date addTime;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSphoto() {
        return sphoto;
    }

    public void setSphoto(String sphoto) {
        this.sphoto = sphoto;
    }

    public String getMarking() {
        return marking;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }

    public String getDispatching() {
        return dispatching;
    }

    public void setDispatching(String dispatching) {
        this.dispatching = dispatching;
    }

    public String getSadderss() {
        return sadderss;
    }

    public void setSadderss(String sadderss) {
        this.sadderss = sadderss;
    }

    public Boolean getOffer() {
        return offer;
    }

    public void setOffer(Boolean offer) {
        this.offer = offer;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}