package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class SungJukModify implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		Scanner s = new Scanner(System.in);
		System.out.println();
		
		System.out.print("수정할이름 입력 : ");
		String name = s.next();
		
		
		int sw=0;
		
		for(SungJukDTO2 sungJukDTO2 :list) {
			if(sungJukDTO2.getName().equals(name)) {
				System.out.println(sungJukDTO2);
			
			
			System.out.print("국어 입력 : ");
			int kor = s.nextInt();
			System.out.print("영어 입력 : ");
			int eng = s.nextInt();
			System.out.print("수학 입력 : ");
			int math = s.nextInt();
			
			int tot = kor + eng + math;
			double avg = (double)tot/3;
			
			//DB
			
			sungJukDTO2.setName(name);
			sungJukDTO2.setKor(kor);
			sungJukDTO2.setEng(eng);
			sungJukDTO2.setMath(math);
			sungJukDTO2.setTot(tot);
			sungJukDTO2.setAvg(avg);
			
			System.out.println(name+"님의 데이터를 수정 하였습니다.");
			sw=1;
			}
		}//for 
		if(sw==0) System.out.println("찾고자하는 이름이 없습니다.");
		
	}

}
