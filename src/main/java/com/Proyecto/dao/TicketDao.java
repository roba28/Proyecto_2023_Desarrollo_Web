
package com.Proyecto.dao;


import com.Proyecto.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket, Long>{
    
}
