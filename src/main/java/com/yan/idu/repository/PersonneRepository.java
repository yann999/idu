package com.yan.idu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yan.idu.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
