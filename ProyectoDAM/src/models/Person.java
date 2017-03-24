package models;

import java.util.List;
/**
 *@author Camila
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
}
