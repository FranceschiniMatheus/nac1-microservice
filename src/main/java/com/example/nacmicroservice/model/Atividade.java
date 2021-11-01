package com.example.nacmicroservice.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Atividade {

	@Id
	public String id;
	public Integer rm;
	public String nome;
	public String urlGitHub;
	public int numeroAtividade;
}
