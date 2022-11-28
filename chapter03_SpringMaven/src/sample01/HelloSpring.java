package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("acQuickStart.xml");
		MessageBean messageBean =(MessageBean) context.getBean("messageBeanImpl");
		
		
		/*
		messageBean.showPrintBrefore();
		System.out.println();
		messageBean.viewPrintBrefore();
		System.out.println();
		messageBean.display();
		*/
		
//		messageBean.showPrintAfter();
//		System.out.println();
//		messageBean.viewPrintAfter();
//		System.out.println();
//		messageBean.display();
		
		messageBean.showPrint();
		System.out.println();
		messageBean.viewPrint();
		System.out.println();
		messageBean.display();
		
	}

}
