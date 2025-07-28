package com.awards.awards.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Series {
    @Id
    private String seriesId;

    private String title;
    private String type;

    @OneToMany(mappedBy = "series")
    private List<Nomination> nominations;
}
