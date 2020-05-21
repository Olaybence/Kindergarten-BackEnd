package PottomParkServer.JavaSpring.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuService {
	private static List<List<MenuItem>> menuItems = new ArrayList<List<MenuItem>>();

	static {
		menuItems.add(Arrays.asList(new MenuItem("Bemutatkozás"), new MenuItem("Madarász óvoda"),
				new MenuItem("Zöld óvoda"), new MenuItem("Dokumentumok")));
		menuItems.add(Arrays.asList(new MenuItem("Alapítvány"), new MenuItem("Célja"), new MenuItem("Adatai")));
		menuItems.add(Arrays.asList(new MenuItem("Programok"), new MenuItem("Madarászás- programok"),
				new MenuItem("Alapítányi programok"), new MenuItem("Korábbi programok")));
		menuItems.add(
				Arrays.asList(new MenuItem("Galéria"), new MenuItem("Katica csoport"), new MenuItem("Maci csoport"),
						new MenuItem("Süni csoport"), new MenuItem("Bagoly csoport"), new MenuItem("Mókus csoport"),
						new MenuItem("Udvar"), new MenuItem("Gyermekeink munkái"), new MenuItem("VAN KÉPÜNK RÓLA")));
		menuItems.add(Arrays.asList(new MenuItem("Kapcsolat / Othon-ovi"), new MenuItem("Ajánlott oldalak"),
				new MenuItem("Elérhetőségeink")));
		menuItems.add(Arrays.asList(new MenuItem("Étkezés")));
	};

	public List<List<MenuItem>> menu() {
		return menuItems;
	}

	public List<MenuItem> deleteMenuByIndex(int id) {
		if (0 <= id && id < menuItems.size()) {
			return menuItems.remove(id);
		}
		return null;
	}

	public MenuItem deleteSubItemByIndex(int i, int j) {
		if (0 < i && i < menuItems.size() && 0 <= j && j < menuItems.get(i).size()) {
			return menuItems.get(i).remove(j);
		}
		return null;
	}

}
