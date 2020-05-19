package helloWorld.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-18 11:36
 */
public class SpringSource {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        TestBean test=(TestBean)context.getBean("test");
    }
}