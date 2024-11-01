package com.example.TP_JAXRS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TP_JAXRS.entities.Compte;


@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {

}
