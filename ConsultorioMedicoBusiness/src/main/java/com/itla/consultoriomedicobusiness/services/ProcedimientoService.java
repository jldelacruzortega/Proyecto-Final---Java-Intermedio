/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.services;

import com.itla.consultoriomedicobusiness.entity.Procedimiento;

/**
 *
 * @author JoseLuis
 */
public interface ProcedimientoService {
    
     void guardarProcedimiento(Procedimiento procedimiento);
     Procedimiento findProcedimientoById(Long id);
    
}
