package simulate.callcenter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import simulate.callcenter.model.Customer;

@SpringBootApplication
public class SimulateCallCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulateCallCenterApplication.class, args);
		
		//Customers start to call the call center.
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			executorService.execute(new Customer());
		}

	}
}
