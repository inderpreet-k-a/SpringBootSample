package com.example.SampleSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	String Hello()
	{
		return "This is a sample SpringBoot application used to integrate "
				+ "Jenkins with AWS to deploy the app on EC2 instance!!!!!";
	}
}
