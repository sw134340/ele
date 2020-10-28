package elm.demo.domain;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

public class StoreinfoCondition extends Storeinfo implements Serializable {
    private Date startDate;
    private Date endDate;

    @Override
    public String toString() {
        return "StoreinfoCondition{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
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


    public StoreinfoCondition(Integer sid, String sname, String spassword, String sphoto, String marking, String dispatching, String sadderss, Boolean offer, Date addTime, Date startDate, Date endDate) {
        super(sid, sname, spassword, sphoto, marking, dispatching, sadderss, offer, addTime);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public StoreinfoCondition() {
    }
}
