package elm.demo.domain;

import java.io.Serializable;
import java.util.Date;

public class OrderlistCondition extends Orderlist implements Serializable {
private Integer minquantity;
private Integer maxquantity;
    private Date startDate;
    private Date endDate;

    @Override
    public String toString() {
        return "OrderlistCondition{" +
                "minquantity=" + minquantity +
                ", maxquantity=" + maxquantity +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public Integer getMinquantity() {
        return minquantity;
    }

    public void setMinquantity(Integer minquantity) {
        this.minquantity = minquantity;
    }

    public Integer getMaxquantity() {
        return maxquantity;
    }

    public void setMaxquantity(Integer maxquantity) {
        this.maxquantity = maxquantity;
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

    public OrderlistCondition(Integer oid, Integer ouserid, Integer ogid, Integer quantity, Integer ostoreid, Integer status, Date addTime, Integer minquantity, Integer maxquantity, Date startDate, Date endDate) {
        super(oid, ouserid, ogid, quantity, ostoreid, status, addTime);
        this.minquantity = minquantity;
        this.maxquantity = maxquantity;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public OrderlistCondition() {
    }
}
