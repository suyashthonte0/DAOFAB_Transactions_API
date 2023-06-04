package com.project.transactions.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class ChildEntity {

    @Id
    @Generated
    private int id;
    private int parentId;
    private int paidAmount;
}