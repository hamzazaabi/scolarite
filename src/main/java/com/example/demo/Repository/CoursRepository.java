package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Cours;


public interface CoursRepository extends JpaRepository<Cours,Long>{

}
