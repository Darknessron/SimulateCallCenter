/**
 * 
 */
package simulate.callcenter.model;

import java.util.Calendar;

import simulate.callcenter.utils.ProblemLevel;
import simulate.callcenter.utils.ResolveDice;
import simulate.callcenter.utils.TalkingUtil;

/**
 * @author Ron
 *
 */
public class CustomerService extends AbstractPhonePicker {

	@Override
	public boolean pickUpPhone(PhoneRecord record) {
		boolean result = false;
		
		this.isOccupied = true;
		TalkingUtil.talking();
		
		result = ResolveDice.IsProblemResolve();
		if (result)	{
			record.setLevel(ProblemLevel.LOW);
			record.setSolved(true);
			record.setUpdateTime(Calendar.getInstance().getTime());
			record.setResolveName(getName());
		}else	{
			record.setLevel(ProblemLevel.MIDDLE);
			record.setSolved(false);
			record.setUpdateTime(Calendar.getInstance().getTime());
		}
		this.isOccupied = false;
		
		return result;
	}


}
