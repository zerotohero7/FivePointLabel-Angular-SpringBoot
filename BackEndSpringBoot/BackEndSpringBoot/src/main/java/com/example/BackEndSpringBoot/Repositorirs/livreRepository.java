package com.example.BackEndSpringBoot.Repositorirs;

import com.example.BackEndSpringBoot.Entities.livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface livreRepository extends JpaRepository<livre, Long> {
    @Override
    List<livre> findAll();
}
