package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SunJuk sungJuk = (SunJuk) context.getBean("sunJukImpl");
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		sungJuk.modify();
		System.out.println();
		
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		
		
	}

}
