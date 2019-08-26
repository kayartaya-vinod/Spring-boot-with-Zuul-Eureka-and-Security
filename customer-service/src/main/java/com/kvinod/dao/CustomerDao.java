package com.kvinod.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kvinod.entity.Customer;

public interface CustomerDao extends PagingAndSortingRepository<Customer, String> {
}
