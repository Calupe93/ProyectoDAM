package models;

import java.time.LocalDate;
import java.util.List;
/**This class has the information of the pet
 *@author Camila
 *@version 1.0
 *@since 1.0 
 * */
public class Pet {
	private static int next_id;
	private int id;
	private String name;
	private LocalDate estimated_birthdate;
	private int age;
	private float current_weight;
	private int estimated_adult_weight;
	private String description;
	private Shelter shelter;
	private String specie;
	private List<String> race;
	private List<String> friends; //con quien se lleva bien (ejemplo: niños, perros...)
	private List<String> enemies; //con quien se lleva mal o no le gusta (ejempo: gatos, petardos...)
	private List<String> super_power; //cualidad destacable (ejemplo: siempre tiene energia / defensor de la casa)
	private List<Medication> medication;
	private List<Disease> diseases;
	private boolean sterilized;
	private boolean chip;
	private boolean is_sent;
	public Pet() {
		super();
		this.id = ++this.next_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getEstimated_birthdate() {
		return estimated_birthdate;
	}
	public void setEstimated_birthdate(LocalDate estimated_birthdate) {
		this.estimated_birthdate = estimated_birthdate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getCurrent_weight() {
		return current_weight;
	}
	public void setCurrent_weight(float current_weight) {
		this.current_weight = current_weight;
	}
	public int getEstimated_adult_weight() {
		return estimated_adult_weight;
	}
	public void setEstimated_adult_weight(int estimated_adult_weight) {
		this.estimated_adult_weight = estimated_adult_weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Shelter getShelter() {
		return shelter;
	}
	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}
	public String getSpecie() {
		return specie;
	}
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	public List<String> getRace() {
		return race;
	}
	public void setRace(List<String> race) {
		this.race = race;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public List<String> getEnemies() {
		return enemies;
	}
	public void setEnemies(List<String> enemies) {
		this.enemies = enemies;
	}
	public List<String> getSuper_power() {
		return super_power;
	}
	public void setSuper_power(List<String> super_power) {
		this.super_power = super_power;
	}
	public List<Medication> getMedication() {
		return medication;
	}
	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}
	public List<Disease> getDiseases() {
		return diseases;
	}
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}
	public boolean isSterilized() {
		return sterilized;
	}
	public void setSterilized(boolean sterilized) {
		this.sterilized = sterilized;
	}
	public boolean isChip() {
		return chip;
	}
	public void setChip(boolean chip) {
		this.chip = chip;
	}
	public boolean isIs_sent() {
		return is_sent;
	}
	public void setIs_sent(boolean is_sent) {
		this.is_sent = is_sent;
	}
	public int getId() {
		return id;
	}
}
