package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Eleve;

public interface EleveRepository extends JpaRepository<Eleve,Long> {

}
