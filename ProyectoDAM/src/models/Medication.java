package models;

import java.sql.Time;
import java.util.List;
/**
 *@author Camila
 *@since 1.0 
 * */
public class Medication {
	private String name;
	private String quantity;
	private int times_per_day;
	private String concept;
	private List<Time> dosis_hours;
}
