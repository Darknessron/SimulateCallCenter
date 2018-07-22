package simulate.callcenter;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import simulate.callcenter.model.PhoneRecord;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimulateCallCenterApplicationTests {

	@Autowired
	private PhoneRecordRepository repository;

	@Test
	public void contextLoads() {
		SimulateCallCenterApplication.main(new String[] {});
		try {
			// wait for 3 mins to ensure all customers call to call center
			TimeUnit.MINUTES.sleep(3);
			List<PhoneRecord> records = StreamSupport.stream(repository.findAll().spliterator(), false)
					.collect(Collectors.toList());
			
			// All phone call should be save to DB 
			Assert.assertEquals(1000, records.size());
			
			//Because there are too many customers, there should be at least one phone call which no one answer.
			List<PhoneRecord> noOneAnswer = repository.findByIsSomeoneAnswer(false);
			Assert.assertFalse(noOneAnswer.isEmpty());
			
			//There should be at least one problem been solved.
			List<PhoneRecord> solveds = repository.findByIsSolved(true);
			Assert.assertFalse(solveds.isEmpty());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
