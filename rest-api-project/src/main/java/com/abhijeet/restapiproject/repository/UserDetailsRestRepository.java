package com.abhijeet.restapiproject.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.abhijeet.restapiproject.model.UserDetails;

public interface UserDetailsRestRepository extends PagingAndSortingRepository<UserDetails, Long>{
	List<UserDetails> findByRole(String role);
}