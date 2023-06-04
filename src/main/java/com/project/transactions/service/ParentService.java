package com.project.transactions.service;

import com.project.transactions.entity.ParentEntity;
import com.project.transactions.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {

    @Autowired
    private ParentRepository parentRepository;

    public List<ParentEntity> saveProduct(List<ParentEntity> parentEntityList){
        parentRepository.saveAll(parentEntityList);
        return null;
    }

    public List<ParentEntity> findAll(){
        return (List<ParentEntity>) parentRepository.findAll();
    }
}
