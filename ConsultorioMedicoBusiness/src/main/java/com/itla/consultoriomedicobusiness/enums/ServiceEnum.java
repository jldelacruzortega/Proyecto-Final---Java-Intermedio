/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.enums;


/**
 * 
 * @author JoseLuis
 */

public enum ServiceEnum {

     
    CITA_SERVICE("citaService"),
    MEDICO_SERVICE("medicoService"),
    PACIENTE_SERVICE("pacienteService"),
    PROCEDIMIENTO_SERVICE("procedimientoService"),
    CONSULTORIO_SERVICE("consultorioService"),
    HORARIO_SERVICE("horarioService");
    
      ServiceEnum(String service) {
       this.value=service;
    }
    
    private String value;

    public String getValue() {
        return value;
    }

}
