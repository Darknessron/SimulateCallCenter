/**
 * 
 */
package simulate.callcenter.model;

import java.util.Date;

import simulate.callcenter.utils.ProblemLevel;

/**
 * @author Ron
 *
 */
public class PhoneRecord {
	
	private String customerName;
	private ProblemLevel level;
	private boolean isSolved;
	private String resolveName;
	private Date createTime;
	private Date updateTime;
	
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the level
	 */
	public ProblemLevel getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(ProblemLevel level) {
		this.level = level;
	}
	/**
	 * @return the isSolved
	 */
	public boolean isSolved() {
		return isSolved;
	}
	/**
	 * @param isSolved the isSolved to set
	 */
	public void setSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}
	/**
	 * @return the resolveName
	 */
	public String getResolveName() {
		return resolveName;
	}
	/**
	 * @param resolveName the resolveName to set
	 */
	public void setResolveName(String resolveName) {
		this.resolveName = resolveName;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
