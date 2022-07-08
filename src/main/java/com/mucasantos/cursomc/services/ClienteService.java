package com.mucasantos.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mucasantos.cursomc.domain.Categoria;
import com.mucasantos.cursomc.domain.Cliente;
import com.mucasantos.cursomc.repositories.CategoriaRepository;
import com.mucasantos.cursomc.repositories.ClienteRepository;
import com.mucasantos.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException("Objeto não encontrado! Id:" + id + "', Tipo: " +
			
					Cliente.class.getName()
					));
		
	}
public List<Cliente> buscarTodos() {
		
		List<Cliente> obj = repo.findAll();
		
		return obj;
		
	}

}
