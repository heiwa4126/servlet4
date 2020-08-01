package servlet4;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Servlet4Controller {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!\n";
	}

	@RequestMapping("/test1")
	public String test1() {
		return "test1!\n";
	}

	@RequestMapping("/test2")
	public Result test2() {
		return new Result("OK", "test2");
	}
}
