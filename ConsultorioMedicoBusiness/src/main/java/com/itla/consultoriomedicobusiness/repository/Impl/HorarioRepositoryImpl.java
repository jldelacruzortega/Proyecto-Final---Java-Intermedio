/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Horario;
import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.repository.HorarioRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Repository
public class HorarioRepositoryImpl implements HorarioRepository {
    
      
    
    private SessionFactory sessionFactory;

    public HorarioRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Horario entity) {
        
    }

    @Override
    public void update(Horario entity) {
        
    }

    @Override
    public Horario finById(Long id) {
        Session session=sessionFactory.openSession();
        Query query=session.getNamedQuery(Horario.FIND_HORARIO_BY_ID);
        query.setParameter("id_horario", id);
        
        return (Horario) query.uniqueResult();
    }

    @Override
    public List<Horario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        

}
