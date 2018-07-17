/**
 * 
 */
package simulate.callcenter.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import simulate.callcenter.utils.ProblemLevel;

/**
 * @author Ron
 *
 */
@Entity
public class PhoneRecord {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String customerName;
	private ProblemLevel level;
	private boolean isSolved;
	private boolean isSomeoneAnswer;
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
	/**
	 * @return the isSomeoneAnswer
	 */
	public boolean isSomeoneAnswer() {
		return isSomeoneAnswer;
	}
	/**
	 * @param isSomeoneAnswer the isSomeoneAnswer to set
	 */
	public void setSomeoneAnswer(boolean isSomeoneAnswer) {
		this.isSomeoneAnswer = isSomeoneAnswer;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
