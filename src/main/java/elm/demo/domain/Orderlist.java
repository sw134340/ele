package elm.demo.domain;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@JsonIgnoreProperties(value = "handler")    //用于解决mybatis关联查询时使用了懒加载方式过程中数据封装引发的问题
public class Orderlist implements Serializable {
    private Integer oid;

    private Integer ouserid;

    private Integer ogid;

    private Integer quantity;

    private Integer ostoreid;

    private Integer status;

    private Date addTime;

    private User user;
    private Storeinfo storeinfo;

    @Override
    public String toString() {
        return "Orderlist{" +
                "oid=" + oid +
                ", ouserid=" + ouserid +
                ", ogid=" + ogid +
                ", quantity=" + quantity +
                ", ostoreid=" + ostoreid +
                ", status=" + status +
                ", addTime=" + addTime +
                ", user=" + user +
                ", storeinfo=" + storeinfo +
                '}';
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Storeinfo getStoreinfo() {
        return storeinfo;
    }

    public void setStoreinfo(Storeinfo storeinfo) {
        this.storeinfo = storeinfo;
    }

    public Orderlist(Integer oid, Integer ouserid, Integer ogid, Integer quantity, Integer ostoreid, Integer status, Date addTime, User user, Storeinfo storeinfo) {
        this.oid = oid;
        this.ouserid = ouserid;
        this.ogid = ogid;
        this.quantity = quantity;
        this.ostoreid = ostoreid;
        this.status = status;
        this.addTime = addTime;
        this.user = user;
        this.storeinfo = storeinfo;
    }

    public Orderlist() {
    }
}