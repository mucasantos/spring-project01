package com.mucasantos.cursomc.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mucasantos.cursomc.domain.Categoria;
import com.mucasantos.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj =  service.buscar(id);
		
		return ResponseEntity.ok().body(obj);

	}
	
	@RequestMapping( method=RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		
		List<Categoria> obj =  service.buscarTodos();
		
		return ResponseEntity.ok().body(obj);

	}
}
