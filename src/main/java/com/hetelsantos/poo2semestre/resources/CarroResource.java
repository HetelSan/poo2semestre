package com.hetelsantos.poo2semestre.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hetelsantos.poo2semestre.domain.Carro;

@RestController
@RequestMapping(value="/carros")
public class CarroResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Carro> listar() {
		
		Carro van = new Carro(1, "Fiat", "Ducato", 10, 100.0, 0.2);
		Carro fusca = new Carro(2, "Volkswagen", "Fusca", 4, 30.0, 0.15);
		
		List<Carro> lista = new ArrayList<>();
		lista.add(van);
		lista.add(fusca);

		return lista;
	}
}
