package com.Demo.entity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.entity.ProductEntity;
import com.Demo.entity.repo.ProductRepo;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepo repo;
	
	@GetMapping("/getall")
	public List<ProductEntity> getEntity() {
		
		return repo.findAll();
		
	}
	
	@PostMapping("/save")
	public ProductEntity save(@RequestBody ProductEntity entity) {
	
		return repo.save(entity);
		
	}
	
	
	

}
