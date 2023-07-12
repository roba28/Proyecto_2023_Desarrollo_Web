package com.Proyecto.controller;

import org.springframework.ui.Model;
import com.Proyecto.domain.Ticket;
import com.Proyecto.service.TicketService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso /ticket/listado");
        List<Ticket> tickets = ticketService.getTickets();

        model.addAttribute("tickets", tickets);
        return "/ticket/listado";
    }
   

}