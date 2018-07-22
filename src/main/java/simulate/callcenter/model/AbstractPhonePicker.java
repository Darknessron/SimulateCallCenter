/**
 * 
 */
package simulate.callcenter.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Ron
 *
 */
public abstract class AbstractPhonePicker {
	private static final Logger logger = LogManager.getLogger(AbstractPhonePicker.class);
	private static final Random R = new Random();

	protected boolean isOccupied;
	protected String name;
	
	/**
	 * Answer the phone
	 * @param record phone record
	 * @return Was the problem been solved
	 */
	public abstract boolean pickUpPhone(PhoneRecord record);
	

	public void talking(String customerName)	{
		logger.info("{} start talking to customer {}", getName() , customerName);
		try {
			TimeUnit.SECONDS.sleep(R.nextInt(10));
		} catch (InterruptedException e) {
			logger.error(e);
		}
		logger.info("{} end of talking with {}", getName() , customerName);
	}

	/**
	 * @return the isOccupied
	 */
	public boolean isOccupied() {
		return isOccupied;
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
