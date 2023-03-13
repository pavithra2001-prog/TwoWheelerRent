package com.twowheelerrent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twowheelerrent.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>, AdminCustomRepository {

}
