package models;

import java.time.LocalDate;
import java.util.List;
/**
 *@author Camila
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
}
