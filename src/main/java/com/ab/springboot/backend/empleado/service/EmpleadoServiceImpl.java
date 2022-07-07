package com.ab.springboot.backend.empleado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ab.springboot.backend.empleado.dao.EmpleadoRepository;
import com.ab.springboot.backend.empleado.model.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	@Transactional(readOnly = false)
	public Empleado save(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long id) {

		empleadoRepository.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado findById(Long id) {

		return empleadoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Empleado> findAll() {

		return (List<Empleado>) empleadoRepository.findAll();
	}

	@Override
	public Empleado update(Empleado empleado, Long id) {

		Empleado empleadoActual = findById(id);
		empleadoActual.setFirstName(empleado.getFirstName());
		empleadoActual.setLastName(empleado.getLastName());
		empleadoActual.setEmailId(empleado.getEmailId());
		return empleadoRepository.save(empleado);
	}
	

}
