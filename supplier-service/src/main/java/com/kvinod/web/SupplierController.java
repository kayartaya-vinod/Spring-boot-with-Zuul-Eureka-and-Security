package com.kvinod.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kvinod.dao.SupplierDao;
import com.kvinod.entity.Supplier;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

	@Autowired
	SupplierDao dao;

	@GetMapping
	public Iterable<Supplier> allSuppliers(
			@RequestParam(value = "_page", defaultValue = "1", required = false) Integer pageNum,
			@RequestParam(value = "_limit", defaultValue = "10", required = false) Integer size) {
		Pageable pageable = PageRequest.of(pageNum, size);
		return dao.findAll(pageable).getContent();
	}
}
