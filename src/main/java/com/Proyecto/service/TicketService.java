package com.Proyecto.service;


import com.Proyecto.domain.Ticket;
import java.util.List;

public interface TicketService {
    
//    Método que retorna la lista de tickets
    public List<Ticket> getTickets();
    
    // Se obtiene un Ticket, a partir del id de un ticket
    public Ticket getTicket(Ticket ticket);
    
    // Se inserta un nuevo ticket si el id del ticket esta vacío
    // Se actualiza un ticket si el id del ticket NO esta vacío
    public void save(Ticket ticket);
    
    // Se elimina el ticket que tiene el id pasado por parámetro
    public void delete(Ticket ticket);
}
