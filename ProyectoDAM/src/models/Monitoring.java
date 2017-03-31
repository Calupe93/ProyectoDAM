package models;

import java.time.LocalDate;
import java.util.List;
/**
 * This class has the information related to the monitorings that are done after and adoption or foster.
 * @author Camila
 * @version 1.0
 * @since 1.0
 *
 */
public class Monitoring {
	private LocalDate date;
	private String comments;
	public Monitoring() {
		super();
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
