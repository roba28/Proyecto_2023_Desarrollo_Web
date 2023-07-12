package com.Proyecto.controller;

import org.springframework.ui.Model;
import com.Proyecto.domain.AdjuntosCliente;
import com.Proyecto.service.AdjuntosClienteService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/adjuntosCliente")
public class AdjuntosClienteController {

    @Autowired
    AdjuntosClienteService adjuntosClienteService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso /adjuntosCliente/listado");
        List<AdjuntosCliente> adjuntosClientes = adjuntosClienteService.getAdjuntosClientes();

        model.addAttribute("adjuntosClientes", adjuntosClientes);
        return "/adjuntosCliente/listado";
    }
   

}