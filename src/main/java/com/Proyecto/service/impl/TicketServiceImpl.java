
package com.Proyecto.service.impl;

import com.Proyecto.dao.TicketDao;
import com.Proyecto.domain.Ticket;
import com.Proyecto.service.TicketService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TicketServiceImpl implements TicketService{
    
    @Autowired
    private TicketDao ticketDao;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<Ticket> getTickets() {
        List<Ticket> lista = ticketDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Ticket getTicket(Ticket ticket) {
        return ticketDao.findById(ticket.getIdTicket()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Ticket ticket) {
        ticketDao.save(ticket);
    }

    @Override
    @Transactional
    public void delete(Ticket ticket) {
        ticketDao.delete(ticket);
    }
}
