/**
 * 
 */
package simulate.callcenter.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import simulate.callcenter.model.CustomerService;

/**
 * @author Ron
 *
 */
public class CustomerServicePool {

	private static long expTime = 6000;//6 seconds
	public static Queue<CustomerService> available = new LinkedList<CustomerService>();
	public static Queue<CustomerService> inUse = new LinkedList<CustomerService>();
	
	
	public synchronized static CustomerService getCustomerService() {
		if (!available.isEmpty()) {
			return available.poll();
		}

		// either no PooledObject is available or each has expired, so return a new one
		return createPooledObject(now);
	}	
	
	private synchronized static PooledObject createPooledObject(long now) {
		PooledObject po = new PooledObject();
		push(inUse, po, now);
		return po;
        }

	private synchronized static void push(HashMap<PooledObject, Long> map,
			PooledObject po, long now) {
		map.put(po, now);
	}

	public static void releaseObject(PooledObject po) {
		cleanUp(po);
		available.put(po, System.currentTimeMillis());
		inUse.remove(po);
	}
	
	private static PooledObject popElement(HashMap<PooledObject, Long> map) {
		 Map.Entry<PooledObject, Long> entry = map.entrySet().iterator().next();
		 PooledObject key= entry.getKey();
		 //Long value=entry.getValue();
		 map.remove(entry.getKey());
		 return key;
	}
	
	private static PooledObject popElement(HashMap<PooledObject, Long> map, PooledObject key) {
		map.remove(key);
		return key;
	}
	
	public static void cleanUp(PooledObject po) {
		po.setTemp1(null);
		po.setTemp2(null);
		po.setTemp3(null);
	}
}
