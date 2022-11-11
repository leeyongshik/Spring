package sample05;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungJukInput implements SungJuk {
	private SungJukDTO2 sungJukDTO2 = null;
//	private ArrayList<Object> list;
	
	public SungJukInput(SungJukDTO2 sungJukDTO2) {
		this.sungJukDTO2 = sungJukDTO2;
	}
	
//	public void List() {
//		ArrayList<Object> list = new ArrayList<Object>();
//		this.list = list;
//	}
	@Override
	public void execute() {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.print("이름 입력 : ");
		sungJukDTO2.setName(s.next());
		System.out.print("국어 입력 : ");
		sungJukDTO2.setKor(s.nextInt());
		System.out.print("영어 입력 : ");
		sungJukDTO2.setKor(s.nextInt());
		System.out.print("수학 입력 : ");
		sungJukDTO2.setKor(s.nextInt());
		System.out.println(sungJukDTO2.getName()+"님의 데이터를 입력 하였습니다.");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ArrayList list = (ArrayList) context.getBean("arrayList");
		list.add(sungJukDTO2);
		System.out.println(list.get(0));
		

	}

}
