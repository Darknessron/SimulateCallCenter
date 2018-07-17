/**
 * 
 */
package simulate.callcenter.chain.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import simulate.callcenter.CallCenter;
import simulate.callcenter.exception.AllBusyException;
import simulate.callcenter.model.CustomerService;
import simulate.callcenter.model.PhoneRecord;
import simulate.callcenter.utils.CustomerServicePool;

/**
 * @author Ron
 *
 */
public class CustomerServiceCommand implements Command {

	/* (non-Javadoc)
	 * @see org.apache.commons.chain.Command#execute(org.apache.commons.chain.Context)
	 */
	@Override
	public boolean execute(Context context) throws Exception {
		boolean isProblemResolve = false;
		PhoneRecord phoneRecord = (PhoneRecord)context.get(CallCenter.PHONE_RECORD);
		try	{
			CustomerService cs = CustomerServicePool.getCustomerService();
			isProblemResolve = cs.pickUpPhone(phoneRecord);
			CustomerServicePool.releaseCustomerService(cs);
		}catch(AllBusyException ex)	{
			System.out.println("All CS are busy, escalate to next level");
			return false;
		}
		return isProblemResolve;
	}

}
