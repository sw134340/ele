package elm.demo.domain;

import java.io.Serializable;
import java.util.Date;


public class GoodsCondition extends Goods implements Serializable {
    private Integer gidCondition;
    private Date startDate;
    private Date endDate;

    public GoodsCondition() {
    }

    public GoodsCondition(Integer gid, String gname, Date addTime, Integer uidCondition, Date startDate, Date endDate) {
        super();
        this.gidCondition = gidCondition;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "GoodsCondition{" +
                "gidCondition=" + gidCondition +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                "} " + super.toString();
    }

    public Integer getGidCondition() {
        return gidCondition;
    }

    public void setGidCondition(Integer gidCondition) {
        this.gidCondition = gidCondition;
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
}
