/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;

/**
 * @author jrauluribes
 *
 */
@RestController
public class AdminController {

	@GetMapping
	public Persona holaMundo(@RequestParam String name) {
		
		Persona p = new Persona();
		p.setApellidos("apellidos");
		p.setEdad(1);
		if( name != null && name.trim() != "" ) {
			p.setNombres(name);
		}else {			
			p.setNombres("nombres");
		}
			

		return p;
	}

}
