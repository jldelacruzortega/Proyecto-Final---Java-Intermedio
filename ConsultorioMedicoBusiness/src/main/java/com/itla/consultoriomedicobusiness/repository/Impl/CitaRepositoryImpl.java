/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Cita;
import com.itla.consultoriomedicobusiness.repository.CitaRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author JoseLuis
 */
public class CitaRepositoryImpl implements CitaRepository {

   
 
    private SessionFactory sessionFactory;

    public CitaRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    

    @Override
    public void save(Cita entity) {
        Session session=sessionFactory.openSession();
        session.persist(entity);
        session.flush(); 
       
    }

    @Override
    public void update(Cita entity) {
       
    }

    @Override
    public Cita finById(Long id) {
       return null;
    }

    @Override
    public List<Cita> findAll() {
        return null;
    }

    
}
