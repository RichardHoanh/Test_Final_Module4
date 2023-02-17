package com.example.demo.service;


import com.example.demo.model.Nation;
import com.example.demo.repository.NationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NationService {
    @Autowired
    NationRepo nationRepo;
    public List<Nation> getAll(){
        return (List<Nation>) nationRepo.findAll();
    }



    public Nation findById(int id) {
        return nationRepo.findById(id).get();
    }








}
