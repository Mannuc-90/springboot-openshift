package test.openshift.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test COntroller
 * @author manpr
 *
 */
@RestController
public class TestController {
	
	/**
	 * Test Endpoint
	 * @return
	 */
	@GetMapping("/test")
	public String test() {
		System.out.println("test method");
		return "success";
	}

}
