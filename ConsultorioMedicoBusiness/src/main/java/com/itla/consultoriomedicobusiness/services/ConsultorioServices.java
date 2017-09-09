/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.services;

import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.repository.MedicoRepository;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConsultorioServices {
    
    private MedicoRepository medicoRepository = null;
    
    public void guardarMedico(Medico medico){
        medicoRepository.save(medico);
    }
    
    public Medico findMedidcoById(Long Id){
        return medicoRepository.finById(Id);
    }

}
