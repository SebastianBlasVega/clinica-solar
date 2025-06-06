package com.sharp.clinica_solar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/")
    public String mostrarFormularioLogin() {
        return "login";
    }
}
