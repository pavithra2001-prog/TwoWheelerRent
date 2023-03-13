package com.twowheelerrent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.twowheelerrent.entity.Admin;

@Service
public interface AdminService {
	public Admin insertAdmin(Admin admin);

	public Admin updateAdmin(Admin admin) throws Exception;

	public String deleteByAdminId(int adminId) throws Exception;

	public List<Admin> getAllAdmin() throws Exception;

}
