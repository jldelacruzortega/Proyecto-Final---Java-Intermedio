/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author JoseLuis
 */
@Entity
@NamedQueries({
   @NamedQuery(name = Procedimiento.FIND_PROCEDIMIENTO_BY_ID,query = "SELECT m FROM procedimiento m WHERE m.id=:id_procedimiento") 
})
public class Procedimiento extends Catalogo implements Serializable {
    
     public final static String FIND_PROCEDIMIENTO_BY_ID="findProcedimientoById";
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_procedimiento")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
}
