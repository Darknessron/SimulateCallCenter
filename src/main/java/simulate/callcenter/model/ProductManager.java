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
public class ProductManager extends AbstractPhonePicker {
	
	private ProductManager()	{}
	
	private static class StaticHolder {
        static final ProductManager INSTANCE = new ProductManager();
    }
	
	public static ProductManager getSingleton() {
        return StaticHolder.INSTANCE;
    }

	@Override
	public boolean pickUpPhone(PhoneRecord record) {
		boolean result = false;

		this.isOccupied = true;
		TalkingUtil.talking();
		
		result = ResolveDice.IsProblemResolve();
		if (result)	{
			record.setLevel(ProblemLevel.HIGH);
			record.setSolved(true);
			record.setUpdateTime(Calendar.getInstance().getTime());
			record.setResolveName(getName());
		}else	{
			record.setLevel(ProblemLevel.HIGHEST);
			record.setSolved(false);
			record.setUpdateTime(Calendar.getInstance().getTime());
		}

		this.isOccupied = false;
		return result;
	}


}
