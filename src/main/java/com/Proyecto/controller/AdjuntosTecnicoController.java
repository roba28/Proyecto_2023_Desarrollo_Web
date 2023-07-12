package com.Proyecto.controller;

import org.springframework.ui.Model;
import com.Proyecto.domain.AdjuntosTecnico;
import com.Proyecto.service.AdjuntosTecnicoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/adjuntosTecnico")
public class AdjuntosTecnicoController {

    @Autowired
    AdjuntosTecnicoService adjuntosTecnicoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso /adjuntosTecnico/listado");
        List<AdjuntosTecnico> adjuntosTecnicos = adjuntosTecnicoService.getAdjuntosTecnicos();

        model.addAttribute("adjuntosTecnicos", adjuntosTecnicos);
        return "/adjuntosTecnico/listado";
    }
   

}