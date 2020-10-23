package elm.demo.domain;

import java.util.Date;

public class Active {
    private Integer aid;

    private String aname;

    private String aintro;

    private Date addTime;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAintro() {
        return aintro;
    }

    public void setAintro(String aintro) {
        this.aintro = aintro;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}