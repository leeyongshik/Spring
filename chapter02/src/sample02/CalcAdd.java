package sample02;


public class CalcAdd implements Calc {
	int x,y;
	public CalcAdd(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void calculate() {
		
		System.out.println(x +" + " + y + " = " + (x+y));

	}

}
