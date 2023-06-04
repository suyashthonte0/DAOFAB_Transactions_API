package com.project.transactions.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class ParentEntity {

    @Id
    @Generated
    private int id;
    private String sender;
    private String receiver;
    private int totalAmount;
}