package elm.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CustomerCondition extends Customer implements Serializable {
    private Integer cidCondition;
//    private Date MinCbirth;
//    private Date MaxCbirth;
//    private Boolean Cgender;
    private Date startDate;
    private Date endDate;

    public CustomerCondition() {
    }

    public CustomerCondition(Integer cidCondition, Date startDate, Date endDate) {
        this.cidCondition = cidCondition;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getCidCondition() {
        return cidCondition;
    }

    public void setCidCondition(Integer cidCondition) {
        this.cidCondition = cidCondition;
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

    @Override
    public String toString() {
        return "CustomerCondition{" +
                "cidCondition=" + cidCondition +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
