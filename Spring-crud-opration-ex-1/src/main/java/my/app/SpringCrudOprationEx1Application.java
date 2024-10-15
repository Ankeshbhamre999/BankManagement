package my.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"my.app.EmpController"})
public class SpringCrudOprationEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudOprationEx1Application.class, args);
	}

}
