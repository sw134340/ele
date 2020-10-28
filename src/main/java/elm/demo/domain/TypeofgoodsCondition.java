package elm.demo.domain;

import java.io.Serializable;
import java.util.Date;


public class TypeofgoodsCondition extends Typeofgoods implements Serializable {
    private Date startDate;
    private Date endDate;

    public TypeofgoodsCondition() {
    }

    @Override
    public String toString() {
        return "TypeofgoodsCondition{" +
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

    public TypeofgoodsCondition(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
