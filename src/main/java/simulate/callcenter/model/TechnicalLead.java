/**
 * 
 */
package simulate.callcenter.model;

import java.util.Calendar;

import simulate.callcenter.utils.ProblemLevel;
import simulate.callcenter.utils.ResolveDice;

/**
 * @author Ron
 *
 */

public class TechnicalLead extends AbstractPhonePicker {
	
	private TechnicalLead(String name)	{
		this.name = name;
	}
	
	private static class StaticHolder {
        static final TechnicalLead INSTANCE = new TechnicalLead("TechnicalLead");
    }
	
	public static TechnicalLead getSingleton() {
        return StaticHolder.INSTANCE;
    }
	
	@Override
	public boolean pickUpPhone(PhoneRecord record) {
		boolean result = false;

		this.isOccupied = true;
		record.setSomeoneAnswer(true);
		talking(record.getCustomerName());
		
		result = ResolveDice.IsProblemResolve();
		if (result)	{
			record.setLevel(ProblemLevel.MIDDLE);
			record.setSolved(true);
			record.setUpdateTime(Calendar.getInstance().getTime());
			record.setResolveName(getName());
		}else	{
			record.setLevel(ProblemLevel.HIGH);
			record.setSolved(false);
			record.setUpdateTime(Calendar.getInstance().getTime());
		}
		this.isOccupied = false;
		
		return result;
	}


}
