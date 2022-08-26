package com.aulaapi.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaapi.restapi.entidadae.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Integer> {

    
} 
