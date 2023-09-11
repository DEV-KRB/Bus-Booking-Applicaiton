package com.leafco.bookbus.dao;

import java.util.List;

import com.leafco.bookbus.entity.Admin;

public interface AdminDao {

	public List<Admin> showAdmins();

	public void saveAdmin(Admin theAdmin);
	
	public Admin getAdmin(int theId);
}
