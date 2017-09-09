/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Procedimiento;
import com.itla.consultoriomedicobusiness.repository.ProcedimientoRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseLuis
 */
public class ProcedimientoRepositoryImpl implements ProcedimientoRepository {

   
   private List<Procedimiento> ProcedimientoList = new ArrayList<>();

    @Override
    public void save(Procedimiento entity) {
        ProcedimientoList.add(entity);
    }

    @Override
    public void update(Procedimiento entity) {
        int index = ProcedimientoList.indexOf(entity);
        ProcedimientoList.set(index, entity);
    }

    @Override
    public Procedimiento finById(Long id) {
        return ProcedimientoList.get(id.intValue());
    }

    @Override
    public List<Procedimiento> findAll() {
        return ProcedimientoList;
    }

    
}
