package com.ab.springboot.backend.empleado.dao;

import org.springframework.data.repository.CrudRepository;

import com.ab.springboot.backend.empleado.model.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

}
