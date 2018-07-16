package simulate.callcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ApplicationConfig.class)
public class SimulateCallCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulateCallCenterApplication.class, args);
	}
}
