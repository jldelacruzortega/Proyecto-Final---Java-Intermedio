/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.services.Impl;

import com.itla.consultoriomedicobusiness.entity.Consultorio;
import com.itla.consultoriomedicobusiness.repository.ConsultorioRepository;
import com.itla.consultoriomedicobusiness.services.ConsultorioService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Service
@Transactional
public class ConsultorioServiceImpl implements ConsultorioService {
    
    private ConsultorioRepository consultorioRepository;
    
    public ConsultorioServiceImpl(ConsultorioRepository consultorioRepository){
        this.consultorioRepository = consultorioRepository;
    }

    @Override
    public void guardarConsultorio(Consultorio consultorio) {
        consultorioRepository.save(consultorio);
    }

    @Override
    public Consultorio findConsultorioById(Long id) {
        return consultorioRepository.finById(id);
    }

}
