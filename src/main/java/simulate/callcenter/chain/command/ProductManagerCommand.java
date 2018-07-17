/**
 * 
 */
package simulate.callcenter.chain.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import simulate.callcenter.CallCenter;
import simulate.callcenter.model.PhoneRecord;
import simulate.callcenter.model.ProductManager;

/**
 * @author Ron
 *
 */
public class ProductManagerCommand implements Command {

	/* (non-Javadoc)
	 * @see org.apache.commons.chain.Command#execute(org.apache.commons.chain.Context)
	 */
	@Override
	public boolean execute(Context context) throws Exception {
		boolean isProblemResolve = false;
		PhoneRecord phoneRecord = (PhoneRecord)context.get(CallCenter.PHONE_RECORD);
		ProductManager pm = ProductManager.getSingleton();
		if (pm.isOccupied())	{
			System.out.println("ProductManager is busy, escalate to next level");
			return false;
		}else	{
			isProblemResolve = pm.pickUpPhone(phoneRecord);
		}
		return isProblemResolve;
	}

}
