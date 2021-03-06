package elm.demo.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import elm.demo.dao.CustomerMapper;
import elm.demo.dao.UserMapper;
import elm.demo.domain.Customer;
import elm.demo.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyBatisTest {
    InputStream resourceAsStream = null;
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null;

    @Before
    public void init() throws IOException {
        //1 加载配置文件
        resourceAsStream = Resources.getResourceAsStream("mybatisForTest.xml");
        //2 获取SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3 获取sqlSession
        sqlSession = sqlSessionFactory.openSession(true);
    }

    public void destroy() throws IOException {
        //6 关闭资源
//        sqlSession.commit();
        sqlSession.close();
        resourceAsStream.close();
    }


    @Test
    public void test01(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

    @Test
    public void test02(){
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = customerMapper.selectByExample(null);
        for (Customer customer:customers
             ) {
            System.out.println(customer);
        }
    }
}
