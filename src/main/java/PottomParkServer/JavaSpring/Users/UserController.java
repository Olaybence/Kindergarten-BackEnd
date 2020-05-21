package PottomParkServer.JavaSpring.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping(path = "/users/{id}")
	public User getUsersById(@PathVariable int id) {
		return new User("Hello World" + id);
	}
	
	@GetMapping(path = "/users")
	public User getUsers() {
		return new User("Hello World");
	}
}
