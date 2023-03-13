package com.twowheelerrent.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twowheelerrent.service.AdminService;
import com.twowheelerrent.entity.Admin;



@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;

	private final Logger mylogs = LoggerFactory.getLogger(this.getClass());

	@PostMapping("/addadmin")
	public ResponseEntity<String> addReview(@RequestBody Admin admin) {

		try {
			Admin savedAdmin = adminService.insertAdmin(admin);
			String responseMsg = "save with ReviewId" + savedAdmin.getAdminId();

			mylogs.info("A value is added ");
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg = "Contact customer care Ph.no:- 1800-250-900 or mail to:- bookstore@gmail.com \n " + e;
			return new ResponseEntity<String>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@PutMapping("/update/{adminId}")
    public  Admin updateAdmin(@RequestBody Admin admin) throws Exception{
        return adminService.updateAdmin(admin);
    }
	@DeleteMapping("/delete/{adminId}")
    public String deleteAdmin(@PathVariable int adminId) throws Exception
    {
            adminService.deleteByAdminId(adminId);
            return "deleted Successfully";
    }
	  
    @GetMapping("/allAdmin")
    public List<Admin> getAllAdmin()
    {
        try {
            List<Admin> allAdmin = adminService.getAllAdmin();
            return allAdmin;
        }catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }



}
