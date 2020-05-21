package PottomParkServer.JavaSpring.Articles;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ArticleController {
	private Article[] sideArticles = {
			new Article("FONTOS FONTOS FONTOS",
						"<p>Beiratkozás az általános iskolákba</p>"+
						"<p>A körzettel nem rendelkező általános iskola az oda jelentkezők részére a beiratkozást</p>"+ 
						"<p>2020. április 6-április 24. között tartja.</p>") ,
			new Article("BEIRATKOZÁS AZ ÓVODÁNKBA", 
						"<p>FONTOS</p>"+
						"<p>nem lakóhely/tartózkodási hely szerinti,</p>"+
						"<p>Önkormányzat által fenntartott óvodába történő felvétel tárgyában </p>")
			};
	private Article[] mainArticles = {
			new Article("ISKOLAI BEIRATKOZÁS 2020",
		            "<p>Beiratkozás az általános iskolákba"+
		            "<p>A körzettel nem rendelkező általános iskola az oda jelentkezők részére a beiratkozást"+
		            "<p>2020. április 6-április 24. között tartja."+
		            "<p><a href=\"https://www.oktatas.hu/kozneveles/aktualis_tanev_esemenyei/iskolai_beiratkozas_2020\">https://www.oktatas.hu/kozneveles/aktualis_tanev_esemenyei/iskolai_beiratkozas_2020</a>"+
		            "<p>Fontos! Tájékozódjanak a kiválasztott iskola weboldalán is!"+
		            "<p>Intézkedés csak levélben és a KRÉTA felületén. <a>https://eugyintezes.e-kreta.hu/kezdolap</a>") ,
			new Article("BEIRATKOZÁS AZ ÓVODÁNKBA - SZÁNDÉKBEJELENTÉS 2020 ÁPRILIS 17-IG", 
		            "<p>Szándékbejelentés"+
		            "<p>nem lakóhely/tartózkodási hely szerinti,"+
		            "<p>Önkormányzat által fenntartott óvodába történő felvétel tárgyában "+
		            "<p><a href=\"https://drive.google.com/file/d/1xKT_9KRQvnOHwKzEUn4pDYmDsen0F7Rv/view?usp=sharing\">https://drive.google.com/file/d/1xKT_9KRQvnOHwKzEUn4pDYmDsen0F7Rv/view?usp=sharing</a>"+
		            "<p>Módosított hirdetmény"+
		            "<p>A 2020/2021. Nevelési évre történő óvodai beiratkozás tárgyában"+
		            "<p><a href=\"https://drive.google.com/file/d/1A2844qcRBZ_nHCDEJcDT4c-kq94WSLw5/view?usp=sharing\">https://drive.google.com/file/d/1A2844qcRBZ_nHCDEJcDT4c-kq94WSLw5/view?usp=sharing</a>"+
		            "<p>A szándékbejelentést és a hirdetményt a linkek másolásával tudják megnyitni."),
			new Article("ISKOLAI BEIRATKOZÁS 2020",
		            "<p>Beiratkozás az általános iskolákba"+
		            "<p>A körzettel nem rendelkező általános iskola az oda jelentkezők részére a beiratkozást"+
		            "<p>2020. április 6-április 24. között tartja."+
		            "<p><a href=\"https://www.oktatas.hu/kozneveles/aktualis_tanev_esemenyei/iskolai_beiratkozas_2020\">https://www.oktatas.hu/kozneveles/aktualis_tanev_esemenyei/iskolai_beiratkozas_2020</a>"+
		            "<p>Fontos! Tájékozódjanak a kiválasztott iskola weboldalán is!"+
		            "<p>Intézkedés csak levélben és a KRÉTA felületén. <a>https://eugyintezes.e-kreta.hu/kezdolap</a>")
			};

	public ArticleController() { }
	
	@GetMapping(path = "/side-articles")
	public Article[] getSideArticles() {
		return sideArticles;
	}
	
	@GetMapping(path = "/side-articles/{id}")
	public Article getSideArticle(@PathVariable int id) {
		// TODO 
		return sideArticles[id];
	}
	
	@GetMapping(path = "/main-articles")
	public Article[] getMainArticles() {
		return mainArticles;
	}
	
	@GetMapping(path = "/main-articles/{id}")
	public Article getMainArticle(@PathVariable int id) {
		// TODO FILTER ONTO ARTICLES
		return mainArticles[id];
	}
	
	@GetMapping(path = "/main-articles/{article}/{id}")
	public Article getMainArticle(@PathVariable String article,@PathVariable int id) {
		// TODO FILTER ONTO ARTICLES
		return mainArticles[id];
	}
}
