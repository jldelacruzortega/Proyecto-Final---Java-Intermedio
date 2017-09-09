/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.repository.MedicoRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JoseLuis
 */
@Repository
public class MedicoRepositoryImpl implements MedicoRepository {

    private Logger LOG = Logger.getLogger(MedicoRepositoryImpl.class.getName());

    private SessionFactory sessionFactory;

    public MedicoRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Medico entity) {
        Session session = sessionFactory.openSession();
        session.persist(entity);
        session.flush();

    }

    @Override
    public void update(Medico entity) {

    }

    @Override
    public Medico finById(Long id) {
        Session session = sessionFactory.openSession();
        Medico medico = (Medico) session.get(Medico.class, id);
        return medico;
    }

    @Override
    public List<Medico> findAll() {
        return null;
    }

//    private Medico getMedico(ResultSet res) throws SQLException {
//
//        Medico medico = new Medico();
//
//        medico.setId(res.getLong(1));
//        medico.setNombre(res.getString("nombre"));
//        medico.setApellido(res.getString("apellido"));
//        medico.setEspecialidad(res.getString("especialidad"));
//        medico.setUniversidad(res.getString("universidad"));
//        medico.setExequatur(res.getString("exequatur"));
//        medico.setInstitucion(res.getString("institucion"));
//        medico.setDireccion(res.getString("direccion"));
//        medico.setTelefono(res.getString("telefono"));
//        medico.setCorreo(res.getString("correo"));
//
//        return medico;
//    }

}
