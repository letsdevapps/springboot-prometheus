package com.pro.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calendar")
public class CalendarApi {

	@GetMapping({"/", "", "/index"})
	public String index() {
		return "Hello from Calendar API";
	}
}