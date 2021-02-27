
package com.groceryPlanningApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@RequestMapping("/")
public String index() {
	return "index.html";
}
@RequestMapping("/signin")
public String SignIn() {
	return "index1.html";
}

}
