import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=context.getBean("userService",UserService.class);
        userService.selectUser();
    }
}
