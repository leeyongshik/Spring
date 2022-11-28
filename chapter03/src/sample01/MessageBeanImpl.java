package sample01;

import lombok.Setter;

//target
public class MessageBeanImpl implements MessageBean {
	@Setter
	private String str;


	@Override
	public void showPrintBrefore() {
		System.out.println("show"+str);//핵심코드
		
	}

	@Override
	public void viewPrintBrefore() {
		try {
			Thread.sleep(1000);// 1초 - 기본단위 1/1000초
			System.out.println("view"+str);//핵심코드
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
	}

	@Override
	public void display() {
		System.out.println("display = "+str);//핵심코드
		
	}

	@Override
	public void showPrintAfter() {
		System.out.println("show = "+str);//핵심코드
		
	}

	@Override
	public void viewPrintAfter() {
		try {
			Thread.sleep(1000);// 1초 - 기본단위 1/1000초
			System.out.println("view"+str);//핵심코드
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public String showPrint() {
		System.out.println("show = "+str);//핵심코드
		return "Spring";
	}

	@Override
	public void viewPrint() {
		try {
			Thread.sleep(1000);// 1초 - 기본단위 1/1000초
			System.out.println("view = "+str);//핵심코드
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

}
