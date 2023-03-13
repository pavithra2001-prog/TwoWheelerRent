package com.twowheelerrent.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.twowheelerrent.entity.Admin;
import com.twowheelerrent.repository.AdminRepository;

@SpringBootTest
class AdminServiceImplTest {

	@Mock
	AdminRepository adminRepository;
	@InjectMocks
	AdminServiceImpl adminService;

	@Test
	@DisplayName("To Verify Insert Operation")
	void testInsertAdmin() {
		Admin sampleInput = new Admin("mene", "hac@gmail.com", "jwdg");
		Admin expectedOutput = new Admin("mene", "hac@gmail.com", "jwdg");
		BDDMockito.given(adminService.insertAdmin(sampleInput)).willReturn(expectedOutput);
	}

	@Disabled
	@Test
	void testUpdateAdmin() {
		fail("Not yet implemented");

	}

	@Disabled
	@Test
	void testDeleteByAdminId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllAdmin() throws Exception {
		Admin a1 = new Admin("mene", "hac@gmail.com", "jwdg");
		Admin a2 = new Admin("mene", "hac@gmail.com", "jwdg");
		BDDMockito.given(adminService.insertAdmin(a1)).willReturn(a2);
		List<Admin> sampleOutput = new ArrayList<>();
		sampleOutput.add(a1);
		sampleOutput.add(a2);
		BDDMockito.given(adminService.getAllAdmin()).willReturn(sampleOutput);
		List<Admin> actualOutput = adminService.getAllAdmin();
		assertNotNull(actualOutput);
		assertIterableEquals(sampleOutput, actualOutput);
	}

}
