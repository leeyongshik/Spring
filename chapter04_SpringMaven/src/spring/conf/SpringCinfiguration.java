package spring.conf;



import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:spring/db.properties")
public class SpringCinfiguration {
	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	//applicationContext.xml을 대신해주는 java 파일
	
//	@Bean
//	public BasicDataSource dataSource() {
//		BasicDataSource basicDataSource = new BasicDataSource();
//			basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//			basicDataSource.setUrl("jdbc:oracle:thin:@UQ6UF3I29AUZDRMN_medium?TNS_ADMIN=/Users/Wallet_UQ6UF3I29AUZDRMN");
//			basicDataSource.setUsername("java");
//			basicDataSource.setPassword("Wjstks0cjfl!@");
//		return basicDataSource;
//	}
	
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
			basicDataSource.setDriverClassName(driver);
			basicDataSource.setUrl(url);
			basicDataSource.setUsername(username);
			basicDataSource.setPassword(password);
		return basicDataSource;
	}
	
}

/*
@Bean 
- 메소드 위에 써준다.
- return 되는 클래스를 빈을 생성한다.
- 반드시 메소드의 이름은 id명으로 설정해야 한다.
 */
