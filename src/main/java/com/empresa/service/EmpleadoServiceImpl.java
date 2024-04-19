package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Empleado;
import com.empresa.repository.EmpleadoRepository;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> listaEmpleado() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado insertaEmpleado(Empleado obj) {
		return empleadoRepository.save(obj);
	}

}
