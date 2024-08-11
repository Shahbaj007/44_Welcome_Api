package in.rahulit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String port = env.getProperty("server.port");
		
		
		String msg = "Welcome to Rahul IT (" + port + ")";
		
		return msg;
		
	}
	
}
