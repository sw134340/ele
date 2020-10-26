package elm.demo.domain;

import lombok.Data;

import java.util.Date;
@Data
public class Orderlist {
    private Integer oid;

    private Integer ouserid;

    private Integer ogid;

    private Integer quantity;

    private Integer ostoreid;

    private Integer status;

    private Date addTime;

    public Orderlist(Integer oid, Integer ouserid, Integer ogid, Integer quantity, Integer ostoreid, Integer status, Date addTime) {
        this.oid = oid;
        this.ouserid = ouserid;
        this.ogid = ogid;
        this.quantity = quantity;
        this.ostoreid = ostoreid;
        this.status = status;
        this.addTime = addTime;
    }

    public Orderlist() {
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOuserid() {
        return ouserid;
    }

    public void setOuserid(Integer ouserid) {
        this.ouserid = ouserid;
    }

    public Integer getOgid() {
        return ogid;
    }

    public void setOgid(Integer ogid) {
        this.ogid = ogid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getOstoreid() {
        return ostoreid;
    }

    public void setOstoreid(Integer ostoreid) {
        this.ostoreid = ostoreid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}