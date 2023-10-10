package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * @SpringBootApplication 메타 어노테이션
 * 
 * 	+ @SpringBootConfiguration:cf) ex01, ex02
 *  + @ComponentScan: ex04, 하부 패키지를 스캔한다. cf)ex03
 *  + @EnableAutoConfiguration:
 *  	1. MVC, AOP, Security, JPA 등을 자동으로 설정한다. 
 *  	2. 발견된 Starter Dependency(Library) 기반으로 설정(관례를 따르는 default 설정)
 *  	3. + application.properties나 applicatoin.yml 안의 미세 설정 (필수)
 *  	
 */

@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class,args)){
	}

}
	}
