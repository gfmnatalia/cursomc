package com.curso.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.jpa.domain.Cidade;
import com.curso.jpa.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findByEstado(Integer estadoId) {
		return repo.findCidades(estadoId);
	}

}
