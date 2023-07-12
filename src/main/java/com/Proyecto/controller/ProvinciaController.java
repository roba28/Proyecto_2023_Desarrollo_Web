package com.Proyecto.controller;

import org.springframework.ui.Model;
import com.Proyecto.domain.Provincia;
import com.Proyecto.service.ProvinciaService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/provincia")
public class ProvinciaController {

    @Autowired
    ProvinciaService provinciaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso /provincia/listado");
        List<Provincia> provincias = provinciaService.getProvincias();

        model.addAttribute("provincias", provincias);
        return "/provincia/listado";
    }
   

}