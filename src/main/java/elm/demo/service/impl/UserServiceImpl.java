package elm.demo.service.impl;

import elm.demo.dao.UserMapper;
import elm.demo.service.UserService;
import elm.demo.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import elm.demo.domain.User;

import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/19 0019
 * @描述
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer key) {
        System.out.println("service的方法被调用了");
        return userMapper.selectByPrimaryKey(key);
    }

    @Override
    public List<User> select() {
        return userMapper.select();
    }

    @Override
    public Integer insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public Integer delete(Integer key) {
        return userMapper.delete(key);
    }

    @Override
    public Integer update(User record) {
        return userMapper.update(record);
    }

    @Override
    public User selectByUser(User record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setPassword(MD5Util.getMD5(record.getPassword()));
        return userMapper.selectByUser(record);
    }

    @Override
    public List<User> selectByUsername(String str) {
        return userMapper.selectByUsername(str);
    }
}
