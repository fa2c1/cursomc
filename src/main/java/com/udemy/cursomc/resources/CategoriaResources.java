package com.udemy.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.cursomc.domain.Categorias;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categorias> Listar() {
		
		Categorias cat1 = new Categorias(1, "Informatica");
		Categorias cat2 = new Categorias(2, "Escritorio");
		
		List<Categorias> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}

}
