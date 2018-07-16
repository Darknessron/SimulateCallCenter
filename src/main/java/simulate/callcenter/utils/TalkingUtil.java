/**
 * 
 */
package simulate.callcenter.utils;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Ron
 *
 */
public class TalkingUtil {

	private static final Random R = new Random();
	
	public static void talking()	{
		System.out.println("start talking to customer......");
		try {
			TimeUnit.SECONDS.sleep(R.nextInt(10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end of talking");
	}
}
