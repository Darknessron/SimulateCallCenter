/**
 * 
 */
package simulate.callcenter.utils;

import java.util.Random;

/**
 * @author Ron
 *
 */
public class ResolveDice {
	
	private static final Random DICE = new Random();

	public static boolean IsProblemResolve()	{
		return DICE.nextBoolean();
	}
}
