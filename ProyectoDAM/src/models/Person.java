package models;

import java.util.List;
/**This class has the information of any registered person
 *@author Camila
 *@version 1.0
 *@since 1.0 
 * */
public abstract class Person {
	private static int next_id = 0;
	private int id;
	private String username;
	private String psw;
	private String name;
	private String first_surname;
	private String last_surname;
	private Address address;
	private String main_telephone;
	private List<String> telephones;
	private String email;
	private List<Pet> favourites_pets;
	private List<Shelter> favourites_shelters;
	public Person() {
		super();
		this.id = ++this.next_id;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getFirst_surname() {
		return first_surname;
	}
	public void setFirst_surname(String first_surname) {
		this.first_surname = first_surname;
	}
	public String getLast_surname() {
		return last_surname;
	}
	public void setLast_surname(String last_surname) {
		this.last_surname = last_surname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMain_telephone() {
		return main_telephone;
	}
	public void setMain_telephone(String main_telephone) {
		this.main_telephone = main_telephone;
	}
	public List<String> getTelephones() {
		return telephones;
	}
	public void setTelephones(List<String> telephones) {
		this.telephones = telephones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Pet> getFavourites_pets() {
		return favourites_pets;
	}
	public void setFavourites_pets(List<Pet> favourites_pets) {
		this.favourites_pets = favourites_pets;
	}
	public List<Shelter> getFavourites_shelters() {
		return favourites_shelters;
	}
	public void setFavourites_shelters(List<Shelter> favourites_shelters) {
		this.favourites_shelters = favourites_shelters;
	}
	
}
