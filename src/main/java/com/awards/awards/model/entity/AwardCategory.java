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
public class AwardCategory {

    @Id
    private String categoryId;

    private String name;
    private String description;

    @OneToMany(mappedBy = "awardCategory")
    private List<Nomination> nominations;
}
