/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.entity;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import org.hibernate.SessionFactory;

/**
 *
 * @author JoseLuis
 */
@Entity
@NamedQueries({
   @NamedQuery(name = Medico.FIND_MEDICO_BY_ID,query = "SELECT m FROM Medico m WHERE m.id=:id_medico") 
})
public class Medico extends Persona  implements Serializable{
    
    public final static String FIND_MEDICO_BY_ID="findMedicoById";
  
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private Long id;
    
    @Transient
    private Long codigo;
    
    @OneToMany(mappedBy = "Medico",fetch = FetchType.LAZY)
//        private List<Cita> citaList;
         
    private String especialidad;
    private String universidad;
    private String exequatur;
    private String institucion;
    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

 
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
        

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getExequatur() {
        return exequatur;
    }

    public void setExequatur(String exequatur) {
        this.exequatur = exequatur;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String instititucion) {
        this.institucion = instititucion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.codigo + " " + this.especialidad + " " + this.universidad + " " + this.exequatur
                + " " + this.institucion + " " + this.direccion + " " + this.telefono ;
    }
    
    public static Comparator<Medico> NombresComparator = new Comparator<Medico>() {

        @Override
        public int compare(Medico o1, Medico o2) {
            return o1.getNombre().compareTo(o2.getNombre());

        }
    };

    public static Comparator<Medico> ApellidosComparator = new Comparator<Medico>() {
        
        @Override
        public int compare(Medico o1, Medico o2) {
            return o1.getApellido().compareTo(o2.getApellido());

        }

    };

    public boolean equals(Object object) {

        if (object instanceof Medico) {
            Medico medico = (Medico) object;

          if (this.nombre.equals(medico.getNombre())
                    && this.apellido.equals(medico.getApellido())
                    && this.codigo.equals(medico.getCodigo())
                    && this.exequatur.equals(medico.getExequatur())
                    && this.especialidad.equals(medico.getEspecialidad())
                    && this.institucion.equals(medico.getInstitucion())
                    && this.direccion.equals(medico.getDireccion())
                    && this.telefono.equals(medico.getTelefono()))
                     {

                return true;
            }
        }
        return false;

    }
//
    @Override
    public int hashCode() {
       if (this.getNombre() != null
                && this.getApellido() != null
                && this.getCodigo() != null
                && this.getExequatur() != null
                && this.getEspecialidad() != null
                && this.getInstitucion() != null
                && this.getDireccion() != null
                && this.getTelefono() != null) {
            return (int) 7 * this.nombre.length() + this.apellido.length() + this.codigo.intValue()+ this.exequatur.length() + this.especialidad.length() + this.institucion.length()+ this.direccion.length() / this.telefono.length();
        }
        return 45;
    }

//    public List<Cita> getCitaList() {
//        return citaList;
//    }
//
//    public void setCitaList(List<Cita> citaList) {
//        this.citaList = citaList;
//    }

    
    
}
