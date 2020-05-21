package PottomParkServer.JavaSpring.Menu;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MenuItem {

	private static int idCounter = 0;
	
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private List<Integer> articles;

	// Constructors start
	
	public MenuItem(String title) {
		super();
		this.title = title;
		this.id = idCounter++;
	}
	
	// Getters Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Integer> getArticles() {
		return articles;
	}

	public void setArticles(List<Integer> articles) {
		this.articles = articles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem other = (MenuItem) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
