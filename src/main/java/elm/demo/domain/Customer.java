package elm.demo.domain;

import lombok.Data;

import java.util.Date;
@Data
public class Customer {
    private Integer cid;

    private String cname;

    private String cphone;

    private String cemail;

    private String cpass;

    private Date cbirth;

    private String cavatar;//头像

    private Boolean cgender;//性别

    private Boolean cstatus;//用户身份（vip）

    private Date addTime;

}