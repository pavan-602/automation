package sjb.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
	@GetMapping("/hello")
	public String getrequest()
	{
		return "hello from spring";
	}

}
