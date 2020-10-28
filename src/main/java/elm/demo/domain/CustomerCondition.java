package elm.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CustomerCondition extends Customer implements Serializable {
    private Integer cidCondition;
    private Date MinCbirth;
    private Date MaxCbirth;
    private Boolean Cgender;
    private Date startDate;
    private Date endDate;

    public CustomerCondition() {
    }

    public CustomerCondition(Integer cidCondition, Date minCbirth, Date maxCbirth, Boolean cgender, Date startDate, Date endDate) {
        this.cidCondition = cidCondition;
        MinCbirth = minCbirth;
        MaxCbirth = maxCbirth;
        Cgender = cgender;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getCidCondition() {
        return cidCondition;
    }

    public void setCidCondition(Integer cidCondition) {
        this.cidCondition = cidCondition;
    }

    public Date getMinCbirth() {
        return MinCbirth;
    }

    public void setMinCbirth(Date minCbirth) {
        MinCbirth = minCbirth;
    }

    public Date getMaxCbirth() {
        return MaxCbirth;
    }

    public void setMaxCbirth(Date maxCbirth) {
        MaxCbirth = maxCbirth;
    }

    public Boolean getCgender() {
        return Cgender;
    }

    public void setCgender(Boolean cgender) {
        Cgender = cgender;
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
