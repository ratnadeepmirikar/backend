package com.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.menu.model.Menu;
import com.menu.service.MenuService;

@RestController

public class MenuController {

	@Autowired
	MenuService service;
	
	//@PostMapping-add the data
	@PostMapping("/add")
	
	private void saveMenu(@RequestBody Menu menu) {
		 service.saveMenu(menu);
		
		
	}
	@GetMapping("/menu")
	public List<Menu> getAllMenu() {
		return service.getAllMenus();
		
		
	}
	
	
	
	
}