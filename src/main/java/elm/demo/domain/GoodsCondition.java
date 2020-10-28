package elm.demo.domain;

import java.io.Serializable;
import java.util.Date;


public class GoodsCondition extends Goods implements Serializable {
    private Double minPrice;
    private Double maxPrice;
    private Date startDate;
    private Date endDate;

    public GoodsCondition() {
    }

    public GoodsCondition(Integer gid, String gname, String ginfo, String gphoto, Double gprice, Integer gtid, Typeofgoods typeofgoods, Integer gsid, Storeinfo storeinfo, Date addTime, Double minPrice, Double maxPrice, Date startDate, Date endDate) {
        super(gid, gname, ginfo, gphoto, gprice, gtid, typeofgoods, gsid, storeinfo, addTime);
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
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
