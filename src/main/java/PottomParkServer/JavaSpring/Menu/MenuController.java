package PottomParkServer.JavaSpring.Menu;

import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class MenuController {

	private String[][] menuItems =  {
		    {"Bemutatkozás","Madarász óvoda","Zöld óvoda","Dokumentumok"},
		    {"Alapítvány","Célja","Adatai"},
		    {"Programok","Madarászás- programok","Alapítányi programok","Korábbi programok"},
		    {"Galéria","Cica csoport","Katica csoport","Maci csoport","Süni csoport","Bagoly csoport","Mókus csoport","Udvar","Gyermekeink munkái","VAN KÉPÜNK RÓLA"},
		    {"Kapcsolat / Othon-ovi","Ajánlott oldalak","Elérhetőségeink"},
		    {"Étkezés"}
		};
    
	public MenuController() { }
	/*
	@GetMapping(path = "/menu-items/{id}")
	public String[] getMenuItem(@PathVariable int id) {
		if(menuItems.length > id) {			
			return menuItems[id];
		} else {
			return null;
		}
	}
	
	@GetMapping(path = "/menu-items")
	public String[][] getMenuItems() {
		return menuItems;
	}
	*/
}
