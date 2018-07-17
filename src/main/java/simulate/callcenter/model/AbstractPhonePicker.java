/**
 * 
 */
package simulate.callcenter.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Ron
 *
 */
public abstract class AbstractPhonePicker {
	private static final Random R = new Random();

	protected boolean isOccupied;
	private String name;
	
	/**
	 * Answer the phone
	 * @param record phone record
	 * @return Was the problem been solved
	 */
	public abstract boolean pickUpPhone(PhoneRecord record);
	

	public void talking()	{
		System.out.println("start talking to customer......");
		try {
			TimeUnit.SECONDS.sleep(R.nextInt(10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end of talking");
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
