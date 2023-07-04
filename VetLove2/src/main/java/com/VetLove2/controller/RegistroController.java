package com.VetLove2.controller;

import com.VetLove2.domain.Registro;
import com.VetLove2.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {

    private RegistroService registroService;

    @Autowired
    public RegistroController(RegistroService registroService) {
        this.registroService = registroService;
    }

    @GetMapping("/registro/formulario")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("registro", new Registro());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute("registro") Registro registro) {
        String contrasena = registro.getContrasena();
        String repetirContrasena = registro.getRepetirContrasena();

        if (contrasena != null && contrasena.equals(repetirContrasena)) {
            registroService.guardar(registro);
            return "registro_exitoso";
        } else {
            return "registro_error";
        }
    }
}






