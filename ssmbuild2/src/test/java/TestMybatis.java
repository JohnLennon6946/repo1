import com.dao.AccountMapper;
import com.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
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
    public void test1() throws IOException {
        InputStream in= Resources.getResourceAsStream("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AccountMapper mapper=sqlSession.getMapper(AccountMapper.class);
        List<Account> list=mapper.selectAll();
        for(Account account:list){
            System.out.println(account);
        }
    }
    @Test
    public void test2() throws IOException {
        InputStream in= Resources.getResourceAsStream("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AccountMapper mapper=sqlSession.getMapper(AccountMapper.class);
        Account account=new Account();
        account.setName("ztg");
        account.setMoney(1);
        mapper.addAccount(account);
        sqlSession.commit();
    }
}
