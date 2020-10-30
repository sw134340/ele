package elm.demo.domain;

import java.util.Date;

public class Orderlist {
    private Integer oid;

    private Integer ocid;

    private Integer ogid;

    private Integer quantity;

    private Integer ostoreid;

    private Integer status;

    private Date addTime;

    private Storeinfo storeinfo;
    private Customer customer;
    private Goods goods;

    @Override
    public String toString() {
        return "Orderlist{" +
                "oid=" + oid +
                ", ocid=" + ocid +
                ", ogid=" + ogid +
                ", quantity=" + quantity +
                ", ostoreid=" + ostoreid +
                ", status=" + status +
                ", addTime=" + addTime +
                ", storeinfo=" + storeinfo +
                ", customer=" + customer +
                ", goods=" + goods +
                '}';
    }

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

    public Storeinfo getStoreinfo() {
        return storeinfo;
    }

    public void setStoreinfo(Storeinfo storeinfo) {
        this.storeinfo = storeinfo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Orderlist(Integer oid, Integer ocid, Integer ogid, Integer quantity, Integer ostoreid, Integer status, Date addTime, Storeinfo storeinfo, Customer customer, Goods goods) {
        this.oid = oid;
        this.ocid = ocid;
        this.ogid = ogid;
        this.quantity = quantity;
        this.ostoreid = ostoreid;
        this.status = status;
        this.addTime = addTime;
        this.storeinfo = storeinfo;
        this.customer = customer;
        this.goods = goods;
    }

    public Orderlist() {
    }
}