import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.AccountService;

public class TestSpring {
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService= (AccountService) context.getBean("accountService");
        accountService.selectAll();
    }
}
