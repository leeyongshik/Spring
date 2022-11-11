package sample04;

import org.springframework.stereotype.Component;

@Component // class 명과 id가 동일 할 경우 생략 가능
public class CalcAdd implements Calc {

	@Override
	public void calculate(int x, int y) {
		System.out.println(x +" + " + y + " = " + (x+y));

	}

}
