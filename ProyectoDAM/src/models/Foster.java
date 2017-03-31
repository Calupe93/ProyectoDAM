package models;

import java.time.LocalDate;
import java.util.List;
/**This class has the information related to a foster process
 *@author Camila
 *@version 1.0
 *@since 1.0 
 * */
public class Foster {
	private static int next_id;
	private int id;
	private Form foster_form;
	private Person foster;
	private Pet fostered_pet;
	private LocalDate foster_date;
	private LocalDate foster_end_date;
	private List<Monitoring> monitorings;
	private String notes;
	private boolean still_working;
	public Foster() {
		super();
		this.id = ++next_id;
	}
	public Form getFoster_form() {
		return foster_form;
	}
	public void setFoster_form(Form foster_form) {
		this.foster_form = foster_form;
	}
	public Person getFoster() {
		return foster;
	}
	public void setFoster(Person foster) {
		this.foster = foster;
	}
	public Pet getFostered_pet() {
		return fostered_pet;
	}
	public void setFostered_pet(Pet fostered_pet) {
		this.fostered_pet = fostered_pet;
	}
	public LocalDate getFoster_date() {
		return foster_date;
	}
	public void setFoster_date(LocalDate foster_date) {
		this.foster_date = foster_date;
	}
	public LocalDate getFoster_end_date() {
		return foster_end_date;
	}
	public void setFoster_end_date(LocalDate foster_end_date) {
		this.foster_end_date = foster_end_date;
	}
	public List<Monitoring> getMonitorings() {
		return monitorings;
	}
	public void setMonitorings(List<Monitoring> monitorings) {
		this.monitorings = monitorings;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public boolean isStill_working() {
		return still_working;
	}
	public void setStill_working(boolean still_working) {
		this.still_working = still_working;
	}
	public int getId() {
		return id;
	}
	
}
