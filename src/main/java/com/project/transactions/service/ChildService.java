package com.project.transactions.service;

import com.project.transactions.entity.ChildEntity;
import com.project.transactions.entity.ParentEntity;
import com.project.transactions.repository.ChildRepository;
import com.project.transactions.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    @Autowired
    private ChildRepository parentRepository;

    public List<ChildEntity> saveProduct(List<ChildEntity> parentEntityList){
        parentRepository.saveAll(parentEntityList);
        return null;
    }

    public List<ChildEntity> findAll(){
        return parentRepository.findAll();
    }
}
