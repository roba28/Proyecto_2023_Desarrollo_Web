package com.Proyecto.controller;

import org.springframework.ui.Model;
import com.Proyecto.domain.Usuario;
import com.Proyecto.service.UsuarioService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso /usuario/listado");
        List<Usuario> usuarios = usuarioService.getUsuarios();

        model.addAttribute("usuarios", usuarios);
        return "/usuario/listado";
    }
    
        @GetMapping("/Registrarse")
    public String Registrarse(Model model) {
//        log.info("Consumiendo el recurso /usuario/listado");
//        List<Usuario> usuarios = usuarioService.getUsuarios();
//
//        model.addAttribute("usuarios", usuarios);
        return "Registrarse";
    }
   

}