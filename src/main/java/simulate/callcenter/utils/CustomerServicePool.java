/**
 * 
 */
package simulate.callcenter.utils;

import java.util.LinkedList;
import java.util.Queue;

import simulate.callcenter.exception.AllBusyException;
import simulate.callcenter.model.CustomerService;

/**
 * @author Ron
 *
 */
public class CustomerServicePool {

	private static Queue<CustomerService> available = new LinkedList<CustomerService>();


	public synchronized static void initCustomerServicePool(int number) {
		CustomerService cs = null;
		int no = available.size();
		if (no >= number) return; 
		for (;no < number; no++ )	{
			cs = new CustomerService();
			cs.setName("Customer Service No. "+(no+1));
			available.add(cs);
		}
	}
	public synchronized static CustomerService getCustomerService() throws AllBusyException {
		if (!available.isEmpty()) {
			return available.poll();
		} else {
			throw new AllBusyException();
		}
	}

	public static void releaseCustomerService(CustomerService cs) {
		available.add(cs);
	}
	
}
