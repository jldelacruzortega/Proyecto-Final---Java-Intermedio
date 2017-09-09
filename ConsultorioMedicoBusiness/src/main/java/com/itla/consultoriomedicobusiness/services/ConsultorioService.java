/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.services;

import com.itla.consultoriomedicobusiness.entity.Consultorio;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface ConsultorioService {
    
    void guardarConsultorio(Consultorio consultorio);
    Consultorio findConsultorioById(Long id);
}
