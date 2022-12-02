package com.example.BackEndSpringBoot.Repositorirs;

import com.example.BackEndSpringBoot.Entities.category;
import com.example.BackEndSpringBoot.Entities.livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface categoryRepository extends JpaRepository<category, Long> {

    @Override
    List<category> findAll();
}
