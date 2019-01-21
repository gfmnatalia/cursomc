package com.curso.jpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.jpa.domain.Categoria;
import com.curso.jpa.repositories.CategoriaRepository;
import com.curso.jpa.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
		
	@Autowired
	private CategoriaRepository repo;
			
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));		
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);		
	}
}
