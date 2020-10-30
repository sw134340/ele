package elm.demo.domain;

import java.io.Serializable;
import java.util.Date;

public class OrderlistCondition extends Orderlist implements Serializable {
private Integer minQuantity;
private Integer maxQuantity;
    private Date startDate;
    private Date endDate;

    @Override
    public String toString() {
        return "OrderlistCondition{" +
                "minQuantity=" + minQuantity +
                ", maxQuantity=" + maxQuantity +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public Integer getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public OrderlistCondition() {
    }

    public OrderlistCondition(Integer oid, Integer ocid, Integer ogid, Integer quantity, Integer ostoreid, Integer status, Date addTime, Storeinfo storeinfo, Customer customer, Goods goods, Integer minQuantity, Integer maxQuantity, Date startDate, Date endDate) {
        super(oid, ocid, ogid, quantity, ostoreid, status, addTime, storeinfo, customer, goods);
        this.minQuantity = minQuantity;
        this.maxQuantity = maxQuantity;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
