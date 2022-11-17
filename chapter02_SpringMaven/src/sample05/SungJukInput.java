package sample05;


import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
	@Autowired
	private SungJukDTO2 sungJukDTO2 = null;
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;
	
	
	@Override
	public void execute() {
		
		//데이터
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.print("이름 입력 : ");
		String name = s.next();
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
		
		
		list.add(sungJukDTO2);
		System.out.println(list);
		
		//응답
		System.out.println(name+"님의 데이터를 입력 하였습니다.");

	}




}
