package com.fullcycle.desafio.docker.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullcycle.desafio.docker.pfa.model.Modulo;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Long>{

}
