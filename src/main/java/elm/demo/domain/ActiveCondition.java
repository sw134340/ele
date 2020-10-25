package elm.demo.domain;

import java.io.Serializable;
import java.util.Date;


public class ActiveCondition extends Active implements Serializable {
    private Integer aidCondition;
    private Date startDate;
    private Date endDate;

    public ActiveCondition() {
    }

    public ActiveCondition(Integer aid, String aname, Date addTime, Integer aidCondition, Date startDate, Date endDate) {
        super();
        this.aidCondition = aidCondition;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ActiveCondition{" +
                "aidCondition=" + aidCondition +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                "} " + super.toString();
    }

    public Integer getAidCondition() {
        return aidCondition;
    }

    public void setAidCondition(Integer aidCondition) {
        this.aidCondition = aidCondition;
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
