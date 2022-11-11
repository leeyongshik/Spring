package sample05;


import java.util.ArrayList;

public class SungJukOutput implements SungJuk {
	private ArrayList arrayList =null;;
	
	public SungJukOutput(ArrayList arrayList) {
		this.arrayList = arrayList;
	}

	@Override
	public void execute() {
		
		System.out.println(arrayList);
		
		

	}

}
