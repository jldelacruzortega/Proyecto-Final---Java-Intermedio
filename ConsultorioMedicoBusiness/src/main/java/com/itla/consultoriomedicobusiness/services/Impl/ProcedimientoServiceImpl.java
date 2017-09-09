/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.services.Impl;

import com.itla.consultoriomedicobusiness.entity.Procedimiento;
import com.itla.consultoriomedicobusiness.repository.ProcedimientoRepository;
import com.itla.consultoriomedicobusiness.services.ProcedimientoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author JoseLuis
 */
@Service
@Transactional
public class ProcedimientoServiceImpl implements ProcedimientoService{ 
    
    private ProcedimientoRepository procedimientoRepository;
    
    public ProcedimientoServiceImpl (ProcedimientoRepository procedimientoRepository){
        this.procedimientoRepository = procedimientoRepository;
    }
    
    

    @Override
    public void guardarProcedimiento(Procedimiento procedimiento) {
        procedimientoRepository.save(procedimiento);
    }

    @Override
    public Procedimiento findProcedimientoById(Long id) {
        return procedimientoRepository.finById(id);
    }

}
