package com.Khokho.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Khokho.demo.model.details;

public interface KhokhoRepository extends JpaRepository <details,Integer>{
	//sports findByusername(String username);
}