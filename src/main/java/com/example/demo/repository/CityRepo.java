package com.example.demo.repository;

import com.example.demo.model.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends PagingAndSortingRepository<City,Integer> {
    @Query(nativeQuery = true, value =
            "select * from account where username=:username and password=:password")
    City checkLogin(@Param("username") String username, @Param("password") String password);

}
