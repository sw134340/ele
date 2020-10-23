package elm.demo.domain;

import java.util.Date;

public class StAc {
    private Integer stid;

    private Integer fsid;

    private Integer faid;

    private Date addTime;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getFsid() {
        return fsid;
    }

    public void setFsid(Integer fsid) {
        this.fsid = fsid;
    }

    public Integer getFaid() {
        return faid;
    }

    public void setFaid(Integer faid) {
        this.faid = faid;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}