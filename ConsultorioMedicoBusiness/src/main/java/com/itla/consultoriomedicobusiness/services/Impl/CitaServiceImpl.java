/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.services.Impl;

import com.itla.consultoriomedicobusiness.entity.Cita;
import com.itla.consultoriomedicobusiness.repository.CitaRepository;
import com.itla.consultoriomedicobusiness.services.CitaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author JoseLuis
 */
@Service
@Transactional
public class CitaServiceImpl implements CitaService {
    
    private CitaRepository citaRepository;
    public CitaServiceImpl(CitaRepository citaRepository){
        this.citaRepository = citaRepository;
        
    }

    @Override
    public void guardarCita(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public Cita findCitaById(Long id) {
        return citaRepository.finById(id);
    }

}
