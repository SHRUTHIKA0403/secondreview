package com.Khokho.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Khokho.demo.model.details;
import com.Khokho.demo.service.KhokhoService;

@RestController
public class KhokhoController {
	@Autowired
	KhokhoService khokhoService;
@GetMapping(value="/fetchdata")
public List<details>getAllDatas(){
	List<details>dataList=khokhoService.getAllDatas();
	return dataList;
}
@PostMapping(value="/saveKhokho")
public details saveKhokho(@RequestBody details a)
{
	return khokhoService.saveKhokho(a);
}
@PutMapping(value="/updateKhokho")
public details updateAthletics(@RequestBody details a)
{
	return khokhoService.saveKhokho(a);
}
@DeleteMapping(value="/deleteKhokho/{id}")
public void deleteKhokho(@PathVariable("id") int playerID)
{
	khokhoService.deleteKhokho(playerID);
}

//sorting
	@GetMapping("/pageget/{mname}")
	public List<details>sortmovie(@PathVariable("mname")String mname)
	{
		return khokhoService.sortAsec(mname);
	}
	//pagination
	@GetMapping("/pagination/{pageno}/{pagesize}")
	public List<details>page(@PathVariable("pageno")int pageno,@PathVariable("pagesize")int pagesize){
	{
		return khokhoService.pagination(pageno,pagesize);
	}
	}
}