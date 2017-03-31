package models;

import java.time.LocalDate;
import java.util.List;
/**This class has the information related to an adoption process
 *@author Camila
 *@version 1.0
 *@since 1.0 
 * */
public class Adoption {
	private static int next_id;
	private int id;
	private Form adoption_form;
	private Person adoptant;
	private Pet adopted_pet;
	private LocalDate adoption_date;
	private List<Monitoring> monitorings;
	private String notes;
	private boolean still_working;
	public Adoption() {
		super();
		this.id = ++next_id;
	}
	public Form getAdoption_form() {
		return adoption_form;
	}
	public void setAdoption_form(Form adoption_form) {
		this.adoption_form = adoption_form;
	}
	public Person getAdoptant() {
		return adoptant;
	}
	public void setAdoptant(Person adoptant) {
		this.adoptant = adoptant;
	}
	public Pet getAdopted_pet() {
		return adopted_pet;
	}
	public void setAdopted_pet(Pet adopted_pet) {
		this.adopted_pet = adopted_pet;
	}
	public LocalDate getAdoption_date() {
		return adoption_date;
	}
	public void setAdoption_date(LocalDate adoption_date) {
		this.adoption_date = adoption_date;
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
