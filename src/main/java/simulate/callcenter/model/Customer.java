/**
 * 
 */
package simulate.callcenter.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import simulate.callcenter.CallCenter;

/**
 * @author Ron
 *
 */
public class Customer implements Runnable {
	private static final Logger logger = LogManager.getLogger(Customer.class);
	private String name;
	private static final Random R = new Random();
	
	@Override
	public void run() {
		callToCallCenter();
	}
	
	private void callToCallCenter()	{
		try {			
			setName(Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(R.nextInt(100));
			CallCenter.answerTheCall(getName());
		} catch (Exception e) {
			logger.error("CallCenter is down", e);
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
