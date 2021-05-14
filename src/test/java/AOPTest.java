import aop.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("aop.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");
        userService.add();
    }
}
