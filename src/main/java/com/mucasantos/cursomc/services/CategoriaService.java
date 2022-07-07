package com.mucasantos.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mucasantos.cursomc.domain.Categoria;
import com.mucasantos.cursomc.repositories.CategoriaRepository;
import com.mucasantos.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
	if (obj == null) {
			
			
		}
		
		return obj.orElseThrow(() ->  new ObjectNotFoundException("Objeto não encontrado! Id:" + id + "', Tipo: " +
			
					Categoria.class.getName()
					));
		
	}
public List<Categoria> buscarTodos() {
		
		List<Categoria> obj = repo.findAll();
		
		return obj;
		
	}

}
