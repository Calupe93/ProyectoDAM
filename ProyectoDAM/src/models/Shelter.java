package models;

import java.util.List;
/**
 *@author Camila
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
}
