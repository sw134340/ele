package elm.demo.domain;

import java.io.Serializable;
import java.util.Date;


public class TypeofgoodsCondition extends Typeofgoods implements Serializable {
    private Integer tidCondition;
    private Date startDate;
    private Date endDate;

    public TypeofgoodsCondition() {
    }

    public TypeofgoodsCondition(Integer tid, String tname, String tinfo, Date addTime, Integer tidCondition, Date startDate, Date endDate) {
        super(tid, tname, tinfo, addTime);
        this.tidCondition = tidCondition;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getTidCondition() {
        return tidCondition;
    }

    public void setTidCondition(Integer tidCondition) {
        this.tidCondition = tidCondition;
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
