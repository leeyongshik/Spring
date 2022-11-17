package sample05;

import java.util.List;

import lombok.Setter;
@Setter
public class SungJukOutput implements SungJuk {
	private List<SungJukDTO2> list;
	
	

//	public void setList(List<SungJukDTO2> list) {
//		this.list = list;
//	}



	@Override
	public void execute() {
		
		for(SungJukDTO2 sunkJukDTO2 : list) {
			System.out.println(sunkJukDTO2);
		}
		
		
		
		

	}

}
