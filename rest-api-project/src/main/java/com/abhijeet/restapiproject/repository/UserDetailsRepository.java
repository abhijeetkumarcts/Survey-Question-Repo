package com.abhijeet.restapiproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhijeet.restapiproject.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{
	List<UserDetails> findByRole(String role);
}