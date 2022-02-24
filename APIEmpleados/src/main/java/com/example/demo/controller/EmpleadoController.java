/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import javax.websocket.ClientEndpoint;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;
import com.example.demo.statics.Trabajos;

/**
 * @author Fenrir
 *
 */
@RestController
@RequestMapping("/api/")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpelados();
	}
	
	@GetMapping("empleados/{id}")
	public Empleado buscarEmpleado(@PathVariable(name="id") Long id) {
		Empleado empleadoXID = new Empleado();
		empleadoXID = empleadoServiceImpl.buscaEmpleado(id);
		return empleadoXID;
	}
	
	@GetMapping("empleados/nombre/{nombre}")
	public List<Empleado> buscarEmpleado(@PathVariable(name="nombre") String nombre) {
		return empleadoServiceImpl.listarNombreEmpleados(nombre);
	}
	
	@GetMapping("empleados/trabajo/{trabajo}")
	public List<Empleado> buscarEmpleadoTrabajo(@PathVariable(name="trabajo") Trabajos trabajo){
		Trabajos trabajoEnum;
		return empleadoServiceImpl.listarPorTrabajo(trabajo);
	}
	
	@PostMapping("empleados")
	public Empleado guardarCliente(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@PutMapping("empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id") Long id, @RequestBody Empleado empelado) {
		Empleado empleadoSeleccionado = new Empleado();
		Empleado empleadoActualizado = new Empleado();
		empleadoSeleccionado = empleadoServiceImpl.buscaEmpleado(id);
		empleadoSeleccionado.setNombre(empelado.getNombre());
		empleadoSeleccionado.setTrabajo(empelado.getTrabajo());
		empleadoActualizado = empleadoServiceImpl.actualizarEmpleado(empleadoSeleccionado);
		
		return empleadoActualizado;
		
	}
	
	@DeleteMapping("empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
	
	

}
