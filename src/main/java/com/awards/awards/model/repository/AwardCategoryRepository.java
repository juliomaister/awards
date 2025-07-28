package com.awards.awards.model.repository;

import com.awards.awards.model.entity.AwardCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwardCategoryRepository extends JpaRepository<AwardCategory, String> {
}