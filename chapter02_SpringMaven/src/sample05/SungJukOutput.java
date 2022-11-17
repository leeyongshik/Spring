package sample05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class SungJukOutput implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
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
