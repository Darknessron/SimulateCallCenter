package simulate.callcenter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import simulate.callcenter.model.Customer;

@SpringBootApplication
public class SimulateCallCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulateCallCenterApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			
			ExecutorService executorService = Executors.newCachedThreadPool();
			for (int i = 0; i < 100; i++) {
				executorService.execute(new Customer());
			}

		};
	}
}
