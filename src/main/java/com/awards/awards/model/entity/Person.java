package com.awards.awards.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Person {

    @Id
    private String personId;

    private String name;
    private String role;

    @OneToMany(mappedBy = "person")
    private List<Nomination> nominations;
}
