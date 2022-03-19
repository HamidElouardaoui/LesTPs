package ma.fst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner {

	public static void main(String[] args) {

		// on supprime -->ApplicationContext c = new
		// ClassPathXmlApplicationContext("spring.xml");
		// on supprime -->ClientController ctrl = (ClientController)
		// c.getBean("ctrl_client");
		// on remplace par cette ligne
		SpringApplication.run(ApplicationRunner.class, args); 

	}

}
