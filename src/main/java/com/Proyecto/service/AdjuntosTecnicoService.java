package com.Proyecto.service;


import com.Proyecto.domain.AdjuntosTecnico;
import java.util.List;

public interface AdjuntosTecnicoService {
    
//    Método que retorna la lista de adjuntosTecnicos
    public List<AdjuntosTecnico> getAdjuntosTecnicos();
    
    // Se obtiene un AdjuntosTecnico, a partir del id de un adjuntosTecnico
    public AdjuntosTecnico getAdjuntosTecnico(AdjuntosTecnico adjuntosTecnico);
    
    // Se inserta un nuevo adjuntosTecnico si el id del adjuntosTecnico esta vacío
    // Se actualiza un adjuntosTecnico si el id del adjuntosTecnico NO esta vacío
    public void save(AdjuntosTecnico adjuntosTecnico);
    
    // Se elimina el adjuntosTecnico que tiene el id pasado por parámetro
    public void delete(AdjuntosTecnico adjuntosTecnico);
}
