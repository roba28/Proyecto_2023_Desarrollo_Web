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
    
    //Lista de fechas utilizando consultas con JPQL    
    public List<Ticket> metodoFecha(String fecha);
    
    //Lista de estados utilizando consultas con SQL    
    public List<Ticket> metodoEstado(String estado);
    
    //Lista de incidentes utilizando consultas con SQL    
    public List<Ticket> metodoIncidente(String incidente);
    
    //Lista de incidentes por usuario utilizando consultas con SQL    
    public List<Ticket> metodoTecnico(String tecnico);
}
