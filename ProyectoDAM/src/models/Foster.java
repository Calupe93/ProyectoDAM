package models;

import java.time.LocalDate;
import java.util.List;
/**
 *@author Camila
 *@since 1.0 
 * */
public class Foster {
	private static int next_id;
	private int id;
//	private Form foster_form;
	private Person foster;
	private Pet fostered_pet;
	private LocalDate foster_date;
	private LocalDate foster_end_date;
	private List<LocalDate> monitorings;
	private String notes;
	private boolean still_working;
}
