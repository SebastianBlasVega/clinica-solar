package com.sharp.clinica_solar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/JefeCompras")
public class JefeCompraController {
@GetMapping("/homeJC")
	public String mostrarFormularioJefeCompra() {
		return "JefeCompras/homeCompras";	
}
@GetMapping("/comprarProductos")
	public String mostrarFormularioProductos() {
		return "JefeCompras/comprarProductos";	
		}
@GetMapping("/listaCompras")
	public String mostrarFormularioUsuarios() {
		return "JefeCompras/listaCompras";	
		}
@GetMapping("/listaProveedores")
	public String mostrarFormularioCompras() {
		return "JefeCompras/listaProveedores";	
		}
}

