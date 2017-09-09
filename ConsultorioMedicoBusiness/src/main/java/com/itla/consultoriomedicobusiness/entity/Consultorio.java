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
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Entity
@NamedQueries({
   @NamedQuery(name = Consultorio.FIND_CONSULTORIO_BY_ID,query = "SELECT c FROM consultorio c WHERE c.id=:id_consultorio") 
})
public class Consultorio extends Catalogo implements Serializable {
    
     public final static String FIND_CONSULTORIO_BY_ID="findConsultorioById";
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultorio")
    private Long id;
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
