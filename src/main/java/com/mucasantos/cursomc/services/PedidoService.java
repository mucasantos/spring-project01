package com.mucasantos.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mucasantos.cursomc.domain.Categoria;
import com.mucasantos.cursomc.domain.Pedido;
import com.mucasantos.cursomc.repositories.CategoriaRepository;
import com.mucasantos.cursomc.repositories.PedidoRepository;
import com.mucasantos.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		
		Optional<Pedido> obj = repo.findById(id);
		
		return obj.orElseThrow(() ->  new ObjectNotFoundException("Objeto não encontrado! Id:" + id + "', Tipo: " +
			
					Categoria.class.getName()
		));
		
	}
public List<Pedido> buscarTodos() {
		
		List<Pedido> obj = repo.findAll();
		
		return obj;
		
	}

}
