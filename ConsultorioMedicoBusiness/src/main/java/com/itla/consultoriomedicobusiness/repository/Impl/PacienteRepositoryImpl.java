/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Paciente;
import com.itla.consultoriomedicobusiness.repository.PacienteRepository;
import com.itla.consultoriomedicobusiness.util.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author JoseLuis
 */
public class PacienteRepositoryImpl implements PacienteRepository {

//    private Logger LOG = Logger.getLogger(PacienteRepositoryImpl.class.getName());
//
//    private PreparedStatement ps;
//
//    private List<Paciente> PacienteList = new ArrayList<>();
//
//    public PacienteRepositoryImpl() {   }
     private Logger LOG=Logger.getLogger(PacienteRepositoryImpl.class.getName());
   
    private SessionFactory sessionFactory;
    
   
    public PacienteRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    @Override
    public void save(Paciente entity) {
         System.out.println("El paciente "+entity.toString()+ " ha sido guardado");
         
           Session session=sessionFactory.openSession();
        session.persist(entity);
        session.flush();
        
        
//        Connection connection = null;
//        try {
//            connection = new ConnectionDB().getConnection();
//            String QUERY = "INSERT INTO paciente (Nombre,Apellido,Sexo,Edad,Cedula,Telefono,Direccion,Correo,Descripcion) values(?,?,?,?,?,?,?,?,?)";
//            ps = connection.prepareStatement(QUERY);
//
//            ps.setString(1, entity.getNombre());
//            ps.setString(2, entity.getApellido());
//            ps.setString(3, entity.getSexo());
//            ps.setInt(4, entity.getEdad());
//            ps.setString(5, entity.getCedula());
//            ps.setString(6, entity.getTelefono());
//            ps.setString(7, entity.getDireccion());
//            ps.setString(8, entity.getCorreo());
//            ps.setString(9, entity.getDescripcion());
//
//            ps.executeUpdate();
//
//            LOG.log(Level.INFO, "Paciente guardado con exito");
//
//            ps = connection.prepareStatement(QUERY);
//        } catch (ClassNotFoundException ex) {
//            LOG.log(Level.SEVERE, ex.getMessage(), ex);
//        } catch (SQLException ex) {
//            LOG.log(Level.SEVERE, ex.getMessage(), ex);
//       } finally {
//           try {
//                ps.close();
//               connection.close();
//            } catch (SQLException ex) {
//                LOG.log(Level.SEVERE, ex.getMessage(), ex);
//            }
//        }
    }

    @Override
    public void update(Paciente entity) {
//        int index = PacienteList.indexOf(entity);
//        PacienteList.set(index, entity);
    }

    @Override
    public Paciente finById(Long id) {
        Session session=sessionFactory.openSession();
       Paciente paciente =(Paciente) session.get(Paciente.class, id);
       return paciente; 
        
    }

    @Override
    public List<Paciente> findAll() {
//        return PacienteList;
          return null;
    }
    
    private Paciente getPaceinte(ResultSet res) throws SQLException{
        Paciente paciente= new Paciente();
        paciente.setId(res.getLong(1));
        paciente.setNombre(res.getString("Nombre"));
        paciente.setCorreo(res.getString("Apellido"));
        paciente.setSexo(res.getString("Sexo"));
        paciente.setEdad(res.getInt("Edad"));
        paciente.setCedula(res.getString("Cedula"));
        paciente.setTelefono(res.getString("Telefono"));
        paciente.setDireccion(res.getString("Direccion"));
        paciente.setCorreo(res.getString("Correo"));
        paciente.setDescripcion(res.getString("Descripcion"));
             
        
        return paciente;
        
    }

}
