package com.example.nacmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.nacmicroservice.model.Atividade;

public interface AtividadeRepository extends MongoRepository<Atividade, String>{

}
