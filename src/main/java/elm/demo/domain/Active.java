package elm.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Active implements Serializable {
    private Integer aid;

    private String aname;

    private String aintro;

    private Date addTime;


    public Active() {
    }

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

    public Active(Integer aid, String aname, String aintro, Date addTime) {
        this.aid = aid;
        this.aname = aname;
        this.aintro = aintro;
        this.addTime = addTime;
    }
}