package com.example.demo.service;


import com.example.demo.model.City;
import com.example.demo.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CityService {
    @Autowired
    CityRepo cityRepo;

    public List<City> getAll() {
        return (List<City>) cityRepo.findAll();
    }

    public City findBlogById(int id) {
        return cityRepo.findById(id).get();
    }

    public void create(City blog) {
        cityRepo.save(blog);
    }

    public void deleteById (int id){
        cityRepo.deleteById(id);
    }

}
