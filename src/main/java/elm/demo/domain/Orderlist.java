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

    private Integer ocid;
    private Customer customer;
    private Integer ogid;

    private Integer quantity;

    private Integer ostoreid;

    private Integer status;

    private Date addTime;

   private  Goods goods;
    private Storeinfo storeinfo;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOcid() {
        return ocid;
    }

    public void setOcid(Integer ocid) {
        this.ocid = ocid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Storeinfo getStoreinfo() {
        return storeinfo;
    }

    public void setStoreinfo(Storeinfo storeinfo) {
        this.storeinfo = storeinfo;
    }

    public Orderlist(Integer oid, Integer ocid, Customer customer, Integer ogid, Integer quantity, Integer ostoreid, Integer status, Date addTime, Goods goods, Storeinfo storeinfo) {
        this.oid = oid;
        this.ocid = ocid;
        this.customer = customer;
        this.ogid = ogid;
        this.quantity = quantity;
        this.ostoreid = ostoreid;
        this.status = status;
        this.addTime = addTime;
        this.goods = goods;
        this.storeinfo = storeinfo;
    }

    public Orderlist() {
    }
}