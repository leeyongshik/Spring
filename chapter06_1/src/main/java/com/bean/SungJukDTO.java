package com.bean;


public class SungJukDTO {
	private String name;
	private int kor, eng, math, tot;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot() {
		this.tot = eng+math+kor;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = tot/3.0;
	}
	private double avg;
}
