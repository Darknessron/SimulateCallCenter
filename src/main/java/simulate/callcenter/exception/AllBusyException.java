/**
 * 
 */
package simulate.callcenter.exception;

/**
 * @author Ron
 *
 */
public class AllBusyException extends Exception {
	
	public AllBusyException()	{
		super("All Customer Service are busy");
	}
}
