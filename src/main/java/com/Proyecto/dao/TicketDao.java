package com.Proyecto.dao;

import com.Proyecto.domain.Ticket;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TicketDao extends JpaRepository<Ticket, Long> {

    //Método JPQL para filtrar por fecha
    @Query(value = "SELECT a FROM Ticket a where a.fechaRegistroUsuario LIKE CONCAT('%', :fecha, '%')")
    public List<Ticket> metodoFecha(@Param("fecha") String fecha);

    //Método nativo para filtrar por estado
//    @Query(value="SELECT a FROM Ticket a inner join a.Estado e on a.estado = e.estadoTicket where e.descripcion LIKE CONCAT('%', :estado, '%')")
//    @Query(value="SELECT a FROM Ticket a inner join a.Estado e where e.descripcion LIKE CONCAT('%', :estado, '%')")
    @Query(nativeQuery = true,
            value = "SELECT id_ticket, id_usuario, estado, tipo_incidencia, prioridad, titulo, comentarios_usuario, fecha_registro_usuario, fecha_registra_tecnico, id_tecnico, comentario_tecnico, e.descripcion  FROM ticket t inner join estado_Ticket e on t.estado = e.estado_Ticket where e.descripcion LIKE CONCAT('%', :estado, '%')")
    public List<Ticket> metodoEstado(@Param("estado") String estado);

    //Método nativo para filtrar por incidencia    
    @Query(nativeQuery = true,
            value = "SELECT id_ticket, id_usuario, estado, t.tipo_incidencia, prioridad, titulo, comentarios_usuario, fecha_registro_usuario, fecha_registra_tecnico, id_tecnico, comentario_tecnico, i.descripcion  FROM ticket t inner join Incidencia i on t.tipo_incidencia = i.tipo_incidencia where i.descripcion LIKE CONCAT('%', :incidente, '%')")
    public List<Ticket> metodoIncidente(@Param("incidente") String incidente);

    //Método nativo para filtrar por Tecnico    
    @Query(nativeQuery = true,
            value = "SELECT  id_ticket, t.id_usuario, estado, tipo_incidencia, prioridad, titulo, comentarios_usuario, fecha_registro_usuario, fecha_registra_tecnico, id_tecnico, comentario_tecnico, descripcion FROM sistema_incidentes.ticket t inner join sistema_incidentes.usuario u on t.id_tecnico = u.id_usuario where usuario LIKE CONCAT('%', :tecnico, '%')")
    public List<Ticket> metodoTecnico(@Param("tecnico") String tecnico);

}
