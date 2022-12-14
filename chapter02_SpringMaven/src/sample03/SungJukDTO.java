package sample03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

//@Setter
//@Getter
@Component
public class SungJukDTO {
	String name;
	int kor, eng, math, tot;
	
	
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("홍길동") String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	@Autowired
	public void setKor(@Value("97")int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	@Autowired
	public void setEng(@Value("100")int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	@Autowired
	public void setMath(@Value("95")int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	double avg;
	
}
