
package com.Proyecto.service.impl;

import com.Proyecto.dao.AdjuntosTecnicoDao;
import com.Proyecto.domain.AdjuntosTecnico;
import com.Proyecto.service.AdjuntosTecnicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdjuntosTecnicoServiceImpl implements AdjuntosTecnicoService{
    
    @Autowired
    private AdjuntosTecnicoDao adjuntosTecnicoDao;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<AdjuntosTecnico> getAdjuntosTecnicos() {
        List<AdjuntosTecnico> lista = adjuntosTecnicoDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public AdjuntosTecnico getAdjuntosTecnico(AdjuntosTecnico adjuntosTecnico) {
        return adjuntosTecnicoDao.findById(adjuntosTecnico.getIdAdjunto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(AdjuntosTecnico adjuntosTecnico) {
        adjuntosTecnicoDao.save(adjuntosTecnico);
    }

    @Override
    @Transactional
    public void delete(AdjuntosTecnico adjuntosTecnico) {
        adjuntosTecnicoDao.delete(adjuntosTecnico);
    }
}
