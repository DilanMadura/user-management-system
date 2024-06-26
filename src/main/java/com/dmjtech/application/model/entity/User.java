package com.dmjtech.application.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private Integer id;
    private String name;
    private String email;
}
