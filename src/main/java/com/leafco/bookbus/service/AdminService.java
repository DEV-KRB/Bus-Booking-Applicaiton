package com.leafco.bookbus.service;

import java.util.List;

import com.leafco.bookbus.entity.Admin;

public interface AdminService {

	public List<Admin> showAdmins();

	public void saveAdmin(Admin theAdmin);
	
	public Admin getAdmin(int theId);
}
