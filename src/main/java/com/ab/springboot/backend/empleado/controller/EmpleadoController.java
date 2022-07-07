package com.ab.springboot.backend.empleado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.springboot.backend.empleado.model.Empleado;
import com.ab.springboot.backend.empleado.service.EmpleadoService;



@RestController
@CrossOrigin (origins = {"*"})
@RequestMapping ("/api")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@PostMapping("/empleados")
	public Empleado save(@RequestBody Empleado empleado){
		return empleadoService.save(empleado);
	}
	
	@GetMapping("/empleados")
		
		public List<Empleado> empleado(){
		return empleadoService.findAll();
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado mostrar(@PathVariable Long id) {
		return empleadoService.findById(id);
	}
	
	
	@PutMapping ("/empleados/{id}")
	public Empleado update(@RequestBody Empleado empleado, @PathVariable Long id) {
		return empleadoService.update(empleado,id);
	}
	
	@DeleteMapping ("/empleados/{id}")
	public void delete(@PathVariable Long id) {
		empleadoService.delete(id);
	}

	
	
}