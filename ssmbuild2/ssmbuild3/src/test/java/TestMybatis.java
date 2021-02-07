import com.dao.UserDao;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void test() throws IOException {
        //测试mybatis连接成功与否
        InputStream in= Resources.getResourceAsStream("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //代理模式，获取代理对象
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<User> userList=userDao.selectUser();
        for(User user:userList){
            System.out.println(user);
        }
    }
}
