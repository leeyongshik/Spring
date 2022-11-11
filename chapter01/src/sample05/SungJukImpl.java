package sample05;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	private String name;
	private int ko, ma, en;
	private int total;
	private double avg;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
	}

	public SungJukImpl() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = s.next();
		System.out.print("국어 입력 : ");
		ko = s.nextInt();
		System.out.print("영어 입력 : ");
		en = s.nextInt();
		System.out.print("수학 입력 : ");
		ma = s.nextInt();
		System.out.println();
	}

	@Override
	public void calc() {
		
		total = ko + ma + en;
		avg = total/3.0;
		
	}
	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+ko+"\t"+en+"\t"+ma+"\t"+total+"\t"+String.format("%.3f", avg));
	}

}
