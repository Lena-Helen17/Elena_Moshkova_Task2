package com.moshkova.task2.repository;

import com.moshkova.task2.model.Pseudonym;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PseudonymRepository extends JpaRepository<Pseudonym, Integer> {
}
