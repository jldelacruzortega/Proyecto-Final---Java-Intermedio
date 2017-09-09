/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.services.Impl;

import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.repository.MedicoRepository;
import com.itla.consultoriomedicobusiness.services.MedicoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Jose Luis
 */
@Service
@Transactional
public class MedicoServiceImpl implements MedicoService {
    
     private MedicoRepository medicoRepository;

    public MedicoServiceImpl(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }


    @Override
    public void guardarMedico(Medico medico) {
        medicoRepository.save(medico);
    }

    @Override
    public Medico findMedicoById(Long id) {
        return medicoRepository.finById(id);
    }
  
}
    
 
    
    
   
    


