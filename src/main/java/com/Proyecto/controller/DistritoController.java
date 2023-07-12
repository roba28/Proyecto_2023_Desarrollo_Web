package com.Proyecto.controller;

import org.springframework.ui.Model;
import com.Proyecto.domain.Distrito;
import com.Proyecto.service.DistritoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/distrito")
public class DistritoController {

    @Autowired
    DistritoService distritoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso /distrito/listado");
        List<Distrito> distritos = distritoService.getDistritos();

        model.addAttribute("distritos", distritos);
        return "/distrito/listado";
    }
   

}