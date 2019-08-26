package com.kvinod.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kvinod.entity.Supplier;

public interface SupplierDao extends PagingAndSortingRepository<Supplier, String> {
}
