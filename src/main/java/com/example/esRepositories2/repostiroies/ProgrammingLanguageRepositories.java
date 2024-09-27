package com.example.esRepositories2.repostiroies;

import com.example.esRepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepositories extends JpaRepository<ProgrammingLanguage,Long> {
}
