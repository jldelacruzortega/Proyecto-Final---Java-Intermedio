/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.util;

import com.itla.consultoriomedicobusiness.entity.Paciente;
import java.util.Comparator;

/**
 *
 * @author JoseLuis
 */
public class PacienteOrdering implements Comparator<Paciente> {

    @Override
    public int compare(Paciente o1, Paciente o2) {
        return o2.getNombre().compareTo(o1.getNombre());
        
    }
    
}
