package models;
/**This class has the information of a determined disease
 *@author Camila
 *@version 1.0
 *@since 1.0 
 * */
public class Disease {
	private String name;
	private boolean treatable;
	private boolean curable;
	private String description;
	public Disease() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTreatable() {
		return treatable;
	}
	public void setTreatable(boolean treatable) {
		this.treatable = treatable;
	}
	public boolean isCurable() {
		return curable;
	}
	public void setCurable(boolean curable) {
		this.curable = curable;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}