/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;
import com.example.demo.statics.Trabajos;

/**
 * @author Fenrir
 *
 */
public interface IEmpleadoService {
	public List<Empleado> listarEmpelados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado buscaEmpleado(Long id);
	
	public List<Empleado> listarNombreEmpleados(String nombre);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Long id);
	
	public List<Empleado> listarPorTrabajo(Trabajos trabajo);
	
}
