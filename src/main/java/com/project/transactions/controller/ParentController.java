package com.project.transactions.controller;

import com.project.transactions.entity.ChildEntity;
import com.project.transactions.entity.ParentEntity;
import com.project.transactions.repository.ParentRepository;
import com.project.transactions.service.ChildService;
import com.project.transactions.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ParentController {

    @Autowired
    private ParentService parentService;

    @Autowired
    private ChildService childService;

    @GetMapping("/getparents")
    public List<ParentEntity> getProducts(){
        List<ParentEntity> parentEntityList = null;
        parentService.saveProduct(parentEntityList);
        return parentService.findAll();

    }

    @GetMapping("/getchilds")
    public List<ChildEntity> getChilds(){
        List<ChildEntity> parentEntityList = null;
        childService.saveProduct(parentEntityList);
        return childService.findAll();

    }
}
