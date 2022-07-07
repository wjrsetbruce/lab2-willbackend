package com.ab.springboot.backend.empleado.service;

import java.util.List;

import com.ab.springboot.backend.empleado.model.Empleado;

public interface EmpleadoService {
	
	public Empleado save(Empleado empleado);
	
	public void delete(Long id);
	
	public Empleado findById(Long id);
	
	public List<Empleado> findAll();
	
	public Empleado update(Empleado empleado, Long id);
	
	
}
