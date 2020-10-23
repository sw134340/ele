package elm.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private Date addTime;

}
