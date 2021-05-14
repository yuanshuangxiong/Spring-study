import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.userServiceImpl;

public class UserTest {
    public static void main(String[] args) {
        //获取applicationcantext
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        //通过id获取bean

        userServiceImpl userService=(userServiceImpl)applicationContext.getBean("userService");
        userService.setUser();
    }
}
