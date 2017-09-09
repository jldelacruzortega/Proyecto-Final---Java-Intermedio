/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Consultorio;
import com.itla.consultoriomedicobusiness.repository.ConsultorioRepository;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Repository
public class ConsultorioRepositoryImpl implements ConsultorioRepository {
    
      private SessionFactory sessionFactory;

    public ConsultorioRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Consultorio entity) {
        
    }

    @Override
    public void update(Consultorio entity) {
        
    }

    @Override
    public Consultorio finById(Long id) {
                Session session=sessionFactory.openSession();
        return (Consultorio) session.get(Consultorio.class, id);

    }

    @Override
    public List<Consultorio> findAll() {
       return null;
    }

}
