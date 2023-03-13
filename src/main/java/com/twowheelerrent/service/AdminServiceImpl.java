package com.twowheelerrent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twowheelerrent.repository.AdminRepository;
import com.twowheelerrent.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Admin savedAdmin =  adminRepository.save(admin);  // Note :  save() is already implemented by Spring Data JPA
			return savedAdmin;
	}
	@Override
    public Admin updateAdmin(Admin admin) throws Exception {
        // TODO Auto-generated method stub
        Admin savedAdmin=adminRepository.save(admin);
        return savedAdmin;
	}
	@Override
    public String deleteByAdminId(int adminId) throws Exception {
        // TODO Auto-generated method stub
        adminRepository.deleteById(adminId);
        return "deleted successfully";
    }
    @Override
    public List<Admin> getAllAdmin() throws Exception {
        // TODO Auto-generated method stub
        List<Admin> allAdmin = adminRepository.findAll();
        return allAdmin;
 
    }

}




