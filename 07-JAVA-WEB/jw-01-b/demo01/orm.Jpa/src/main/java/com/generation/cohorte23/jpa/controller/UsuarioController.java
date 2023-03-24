package com.generation.cohorte23.jpa.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.jpa.models.UsuarioModel;
import com.generation.cohorte23.jpa.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioServices usuarioService;

	@GetMapping()
	public ArrayList<UsuarioModel> listarUsuarios() {
		return usuarioService.listarUsuarios();

	}

	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuarioModelo) {
		return usuarioService.guardarUsuario(usuarioModelo);

	}

	// http://localhost:8080/usuario/query?prioridad=2

	@GetMapping("/query")
	public ArrayList<UsuarioModel> obtenerPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
		return usuarioService.obtenerPorPrioridad(prioridad);
	}

	// con este metodo se busca asi: http://localhost:8080/usuario/2

	@GetMapping(path = "{id}")
	public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
		return usuarioService.obtenerPorId(id);
	}

	// eliminar
	@DeleteMapping(path = "{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = usuarioService.eliminarUsuario(id);
		if (ok) {
			return "se elimino el usuario";
		} else {
			return "no se elimino el usuario";
		}

	}

}
