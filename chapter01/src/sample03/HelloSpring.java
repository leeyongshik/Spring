package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean messageBean = (MessageBean)context.getBean("messageBean"); // 싱글톤
		messageBean.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean2 = context.getBean("messageBean", MessageBean.class);
		messageBean2.sayHello("Spring");
		System.out.println();
	}

}
