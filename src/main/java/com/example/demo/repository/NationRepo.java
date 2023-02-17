package com.example.demo.repository;

import com.example.demo.model.City;
import com.example.demo.model.Nation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationRepo extends PagingAndSortingRepository<Nation,Integer> {
}
