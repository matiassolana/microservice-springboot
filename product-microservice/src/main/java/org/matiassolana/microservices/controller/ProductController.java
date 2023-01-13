package org.matiassolana.microservices.controller;

import java.util.List;

import org.matiassolana.microservices.entity.ProductEntity;
import org.matiassolana.microservices.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<ProductEntity> getAllProducts() {
		return productRepository.findAll();
	}

	@PostMapping	
	public void createProducts(@RequestBody ProductEntity productEntity) {
		productRepository.save(productEntity);
	}

}
