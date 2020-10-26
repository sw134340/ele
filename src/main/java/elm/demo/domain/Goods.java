package elm.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Goods implements Serializable {
    private Integer gid;

    private String gname;

    private String ginfo;

    private String gphoto;

    private Double gprice;

    private Integer gtid;

    private Integer gsid;

    private Date addTime;

    public Goods() {
    }

    public Goods(Integer gid, String gname, String ginfo, String gphoto, Double gprice, Integer gtid, Integer gsid, Date addTime) {
        this.gid = gid;
        this.gname = gname;
        this.ginfo = ginfo;
        this.gphoto = gphoto;
        this.gprice = gprice;
        this.gtid = gtid;
        this.gsid = gsid;
        this.addTime = addTime;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGinfo() {
        return ginfo;
    }

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo;
    }

    public String getGphoto() {
        return gphoto;
    }

    public void setGphoto(String gphoto) {
        this.gphoto = gphoto;
    }

    public Double getGprice() {
        return gprice;
    }

    public void setGprice(Double gprice) {
        this.gprice = gprice;
    }

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    public Integer getGsid() {
        return gsid;
    }

    public void setGsid(Integer gsid) {
        this.gsid = gsid;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}