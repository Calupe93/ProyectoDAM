package models;

import java.util.List;
/**This class has the information of the shelter
 *@author Camila
 *@version 1.0
 *@since 1.0 
 * */
public class Shelter {
	private static int next_id = 0;
	private int id;
	private String psw;
	private String name;
	private Address address;
	private List<String> telephones;
	private List<String> emails;
	private List<Pet> pets;
	private List<Pet> pets_to_adopt;
	private List<Pet> pets_to_foster;
	private Person shelter_responsable;
	private List<Person> current_volunteers;
	private List<Person> ex_volunteers;
	private List<Person> current_adoptants;
	private List<Person> ex_adoptants;
	private List<Person> current_fosters;
	private List<Person> ex_fosters;
	public Shelter() {
		super();
		this.id = ++this.next_id;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getTelephones() {
		return telephones;
	}
	public void setTelephones(List<String> telephones) {
		this.telephones = telephones;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public List<Pet> getPets_to_adopt() {
		return pets_to_adopt;
	}
	public void setPets_to_adopt(List<Pet> pets_to_adopt) {
		this.pets_to_adopt = pets_to_adopt;
	}
	public List<Pet> getPets_to_foster() {
		return pets_to_foster;
	}
	public void setPets_to_foster(List<Pet> pets_to_foster) {
		this.pets_to_foster = pets_to_foster;
	}
	public Person getShelter_responsable() {
		return shelter_responsable;
	}
	public void setShelter_responsable(Person shelter_responsable) {
		this.shelter_responsable = shelter_responsable;
	}
	public List<Person> getCurrent_volunteers() {
		return current_volunteers;
	}
	public void setCurrent_volunteers(List<Person> current_volunteers) {
		this.current_volunteers = current_volunteers;
	}
	public List<Person> getEx_volunteers() {
		return ex_volunteers;
	}
	public void setEx_volunteers(List<Person> ex_volunteers) {
		this.ex_volunteers = ex_volunteers;
	}
	public List<Person> getCurrent_adoptants() {
		return current_adoptants;
	}
	public void setCurrent_adoptants(List<Person> current_adoptants) {
		this.current_adoptants = current_adoptants;
	}
	public List<Person> getEx_adoptants() {
		return ex_adoptants;
	}
	public void setEx_adoptants(List<Person> ex_adoptants) {
		this.ex_adoptants = ex_adoptants;
	}
	public List<Person> getCurrent_fosters() {
		return current_fosters;
	}
	public void setCurrent_fosters(List<Person> current_fosters) {
		this.current_fosters = current_fosters;
	}
	public List<Person> getEx_fosters() {
		return ex_fosters;
	}
	public void setEx_fosters(List<Person> ex_fosters) {
		this.ex_fosters = ex_fosters;
	}
	public int getId() {
		return id;
	}
}
