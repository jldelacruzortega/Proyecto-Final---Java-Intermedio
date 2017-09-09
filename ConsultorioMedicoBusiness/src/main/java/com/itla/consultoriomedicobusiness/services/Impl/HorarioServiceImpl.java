/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.services.Impl;

import com.itla.consultoriomedicobusiness.entity.Horario;
import com.itla.consultoriomedicobusiness.repository.HorarioRepository;
import com.itla.consultoriomedicobusiness.services.HorarioService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Service
@Transactional
public class HorarioServiceImpl implements HorarioService{
    
    private HorarioRepository horarioRepository;
    
    public HorarioServiceImpl(HorarioRepository horarioRepository){
        this.horarioRepository = horarioRepository;
        
    }

    @Override
    public void guardarHorario(Horario horario) {
        horarioRepository.save(horario);
    }

    @Override
    public Horario findHorarioById(Long id) {
        return horarioRepository.finById(id);
    }

}
