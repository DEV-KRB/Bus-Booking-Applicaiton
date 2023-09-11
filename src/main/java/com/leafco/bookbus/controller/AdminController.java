package com.leafco.bookbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leafco.bookbus.entity.Admin;
import com.leafco.bookbus.service.AdminService;

@Controller
@RequestMapping("/api")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@GetMapping("/menu")
	public String mainmenu() {
		
		return "main-menu";
	}
	
	@GetMapping("/list")
	public String showList(Model model) {
		
		//get data from dao
		List<Admin> theAdmin = adminService.showAdmins();
		//add data to model
		model.addAttribute("admins" , theAdmin);
		return "admin-list";
	}
	
	@GetMapping("/adminform")
	public String adminform(Model model) {
		
		return "admin-form";
	}
	
	@GetMapping("/adminAddForm")
	public String addAdmin(Model theModel) {
		
		Admin admin = new Admin();
		theModel.addAttribute("admin", admin);
		return "newAdmin";
	}
	
	@PostMapping("/saveAdmin")
	public String saveAdmin(@ModelAttribute("admin") Admin theAdmin) {
		
		adminService.saveAdmin(theAdmin);
		return "redirect:/api/list";
	}
	
}
