/**
 * 
 */
package simulate.callcenter.model;

/**
 * @author Ron
 *
 */
public abstract class AbstractPhonePicker {

	protected boolean isOccupied;
	private String name;
	
	/**
	 * Answer the phone
	 * @param record phone record
	 * @return Was the problem been solved
	 */
	public abstract boolean pickUpPhone(PhoneRecord record);

	/**
	 * @return the isOccupied
	 */
	public boolean isOccupied() {
		return isOccupied;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
