package com.mucasantos.cursomc.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mucasantos.cursomc.domain.Categoria;
import com.mucasantos.cursomc.domain.Cliente;
import com.mucasantos.cursomc.domain.Pedido;
import com.mucasantos.cursomc.services.CategoriaService;
import com.mucasantos.cursomc.services.ClienteService;
import com.mucasantos.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="pedido/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Pedido obj =  service.buscar(id);
		
		return ResponseEntity.ok().body(obj);

	}
	
	@RequestMapping(value="pedidos", method=RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		
		List<Pedido> obj =  service.buscarTodos();
		
		return ResponseEntity.ok().body(obj);

	}
}
