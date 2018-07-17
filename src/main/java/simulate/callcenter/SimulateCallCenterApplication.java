package simulate.callcenter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import simulate.callcenter.model.Customer;

@SpringBootApplication
public class SimulateCallCenterApplication {
	
	@Autowired
	private PhoneRecordRepository repository; 

	public static void main(String[] args) {
		SpringApplication.run(SimulateCallCenterApplication.class, args);

		/*
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			executorService.execute(new Customer());
		}
		*/

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			
			ExecutorService executorService = Executors.newCachedThreadPool();
			for (int i = 0; i < 100; i++) {
				executorService.execute(new Customer());
			}
			
			
			/*
			System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
            */

		};
	}
}
