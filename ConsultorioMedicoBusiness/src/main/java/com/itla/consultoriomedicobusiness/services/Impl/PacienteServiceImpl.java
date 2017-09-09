/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.services.Impl;

import com.itla.consultoriomedicobusiness.entity.Paciente;
import com.itla.consultoriomedicobusiness.repository.PacienteRepository;
import com.itla.consultoriomedicobusiness.services.PacienteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author JoseLuis
 */
@Service
@Transactional
public class PacienteServiceImpl implements PacienteService {

    private PacienteRepository pacienteRepository;
    
    public PacienteServiceImpl (PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }       
    

    @Override
    public void guardarPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public Paciente findPacienteById(Long id) {
        return pacienteRepository.finById(id);
    }

}
