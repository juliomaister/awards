package com.awards.awards.model.repository;

import com.awards.awards.model.entity.Nomination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NominationRepository extends JpaRepository<Nomination, String> {
}