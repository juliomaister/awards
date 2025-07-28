package com.awards.awards.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Nomination {
    @Id
    private String nominationId;

    @ManyToOne
    @JoinColumn(name = "series_id", nullable = false)
    private Series series;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private AwardCategory awardCategory;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    private boolean isWinner;
    private String episodeName;
}
