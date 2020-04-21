package com.hetelsantos.poo2semestre.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/carros")
public class CarroResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!!!";
	}
}
