package com.Khokho.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Khokho.demo.model.details;
import com.Khokho.demo.repository.KhokhoRepository;
@Service
public class KhokhoService {
@Autowired
KhokhoRepository Repository;
	public List<details> getAllDatas() {
		List<details>dataList=Repository.findAll();
		return dataList;
	}

	public details saveKhokho(details a) {
		details obj=Repository.save(a);
		return obj;
	}
	
	public details updateKhokho(details a) {
		details obj=Repository.save(a);
		return obj;
	}
	
	public void deleteKhokho(int playerID) {
		Repository.deleteById(playerID);
	}
	
	public List<details>sortAsec(String field)
	{
		return Repository.findAll(Sort.by(field).ascending());
	}
	public List<details>pagination(int pageno,int pagesize){
		Page<details>p = Repository.findAll(PageRequest.of(pageno, pagesize));
		return p.getContent();
	}
}