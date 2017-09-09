/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.util;

import com.itla.consultoriomedicobusiness.entity.Medico;
import java.util.Comparator;

/**
 *
 * @author JoseLuis
 */
public class MedicoOrdering implements Comparator<Medico> {

    @Override
    public int compare(Medico o1, Medico o2) {
        return o2.getNombre().compareTo(o1.getNombre());
    }
    
    
    
}
