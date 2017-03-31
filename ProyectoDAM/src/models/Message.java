package models;
/**This class has the content of any message
 *@author Camila
 *@version 1.0
 *@since 1.0 
 * */
public class Message {
	private String issue;
	private String content;
	private Shelter shelter;
	private Person person;
	public Message(String content, Shelter shelter, Person person) {
		super();
		this.content = content;
		this.shelter = shelter;
		this.person = person;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Shelter getShelter() {
		return shelter;
	}
	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
