package models;

import java.sql.Time;
import java.util.List;
/**This class has the information of the medication that any pet could need
 *@author Camila
 *@version 1.0
 *@since 1.0 
 * */
public class Medication {
	private String name;
	private String quantity;
	private int times_per_day;
	private String concept;
	private List<Time> dosis_hours;
	public Medication() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getTimes_per_day() {
		return times_per_day;
	}
	public void setTimes_per_day(int times_per_day) {
		this.times_per_day = times_per_day;
	}
	public String getConcept() {
		return concept;
	}
	public void setConcept(String concept) {
		this.concept = concept;
	}
	public List<Time> getDosis_hours() {
		return dosis_hours;
	}
	public void setDosis_hours(List<Time> dosis_hours) {
		this.dosis_hours = dosis_hours;
	}
	
}
