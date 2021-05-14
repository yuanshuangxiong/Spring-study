import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        Student student= (Student) applicationContext.getBean("student");
        System.out.println(student.getName());
    }
}
