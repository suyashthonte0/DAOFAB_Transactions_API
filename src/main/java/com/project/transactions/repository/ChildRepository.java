package com.project.transactions.repository;

import com.project.transactions.entity.ChildEntity;
import com.project.transactions.entity.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<ChildEntity, Integer> {
}
