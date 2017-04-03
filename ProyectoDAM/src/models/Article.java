package models;
/**This class contains all the information of a article
 * 
 * @author Camila
 * @version 1.0
 * @since 1.0
 */
public class Article {
	private String subject; // categoria o asunto que trata la noticia, la interfaz gráfica debería proporcionar un desplegable con las diferentes categorias, por ejemplo: recaudacion de fondos, acogida urgente, busqueda de voluntarios...
	private String title;
	private String text;
	private String image; //imagen, no se de que tipo debería ser
	public Article() {
		super();
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
