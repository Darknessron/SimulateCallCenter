/**
 * 
 */
package simulate.callcenter;

import java.util.Calendar;

import org.apache.commons.chain.Chain;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ContextBase;

import simulate.callcenter.chain.ProblemSolveChain;
import simulate.callcenter.model.PhoneRecord;
import simulate.callcenter.utils.CustomerServicePool;

/**
 * @author Ron
 *
 */
public class CallCenter {
	public static final String PHONE_RECORD = "PhoneRecord";
	private static final Chain problemSolveChain = new ProblemSolveChain();
	
	static {
		CustomerServicePool.initCustomerServicePool(20);
	}
	
	@SuppressWarnings("unchecked")
	public static void answerTheCall(String customerName) throws Exception	{
		PhoneRecord phoneRecord = new PhoneRecord();
		phoneRecord.setCreateTime(Calendar.getInstance().getTime());
		phoneRecord.setCustomerName(customerName);
		
		Context context = new ContextBase(); 
		context.put(PHONE_RECORD, phoneRecord);
		
		problemSolveChain.execute(context);
		if (!phoneRecord.isSomeoneAnswer())	{
			System.out.println("no one answer "+ customerName);
		}
	}
}
