package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplication1Application {

	public static void main(String[] args) {
		System.out.println("loading.....");
		SpringApplication.run(SpringBootApplication1Application.class, args);
		System.out.println("ending.....");
	}

}
