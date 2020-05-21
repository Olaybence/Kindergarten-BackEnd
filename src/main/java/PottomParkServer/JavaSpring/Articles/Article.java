package PottomParkServer.JavaSpring.Articles;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Article {

	@GeneratedValue
	@Id
    private String id;
	
	private String title;
	private String content;
	
	public Article(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
