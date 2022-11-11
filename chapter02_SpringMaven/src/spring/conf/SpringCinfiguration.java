package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;

@Configuration
public class SpringCinfiguration {
	//applicationContext.xml을 대신해주는 java 파일
	
	@Bean
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	@Bean
	public CalcAdd calcAdd(){
		return new CalcAdd(30, 50);
	}
	
	//옛날 자바 문법처럼 쓰는 법
	@Bean(name="calcMul")
	public CalcMul getCalcMul(){
		return new CalcMul();
	}
}

/*
@Bean 
- 메소드 위에 써준다.
- return 되는 클래스를 빈을 생성한다.
- 반드시 메소드의 이름은 id명으로 설정해야 한다.
 
 */
