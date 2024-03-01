package com.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menu.model.Menu;
import com.menu.repository.MenuRepository;


@Service
public class MenuService {

	@Autowired
	MenuRepository repo;
	
	
	
	public List<Menu>getAllMenus()
	{
		List<Menu>menus=repo.findAll();
		
		return menus;
	}
	//insert menu details
	public void saveMenu(Menu menu) {
		
		repo.save(menu);
	}
	
	public void updateMenu(Menu menu,int menuId) {
		repo.save(menu);
	}
	
	public void delete(int menuId) {
		repo.deleteById(menuId);
	}
}

