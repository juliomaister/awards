package com.awards.awards.model.repository;

import com.awards.awards.model.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, String> {
}