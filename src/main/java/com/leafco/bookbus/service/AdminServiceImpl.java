package com.leafco.bookbus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leafco.bookbus.dao.AdminDao;
import com.leafco.bookbus.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	@Override
	@Transactional
	public List<Admin> showAdmins() {
		
		return adminDao.showAdmins();
	}

	@Override
	@Transactional
	public void saveAdmin(Admin theAdmin) {
		
		adminDao.saveAdmin(theAdmin);
	}

	@Override
	@Transactional
	public Admin getAdmin(int theId) {
		return adminDao.getAdmin(theId);
	}

}
