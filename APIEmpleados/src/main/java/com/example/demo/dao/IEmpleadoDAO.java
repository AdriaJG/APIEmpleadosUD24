package com.example.demo.dao;

import java.util.List;
import com.example.demo.statics.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Empleado;

@Repository
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	public List<Empleado> findByNombre(String nombre);
	public List<Empleado> findByTrabajo(Trabajos trabajo);
}
