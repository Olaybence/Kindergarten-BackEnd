package PottomParkServer.JavaSpring.Menu;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class MenuResource {

	private MenuService ms;
	
	@GetMapping("/menu-items")
	public List<List<MenuItem>> getMenu() {
		 return ms.menu();
	}
	
	@DeleteMapping("/menu-items/{id}")
	public ResponseEntity<Void> deleteMenuItem(@PathVariable int id) {
		List<MenuItem> menuItem = ms.deleteMenuByIndex(id);
		if(menuItem != null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/menu-items/{id}/{id2}")
	public ResponseEntity<Void> deleteSubitem(@PathVariable int id, @PathVariable int id2) {
		MenuItem menuItem = ms.deleteSubItemByIndex(id,id2);
		if(menuItem != null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}
	
	//DELETE /menu-items/delete/{i}/{j} 
}
