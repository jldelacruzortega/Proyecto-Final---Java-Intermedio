/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.services;

import com.itla.consultoriomedicobusiness.entity.Medico;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface MedicoService {
    
  void guardarMedico(Medico medico);  
  Medico findMedicoById(Long id);   
    
}
