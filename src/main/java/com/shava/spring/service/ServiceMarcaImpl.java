/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shava.spring.service;

import com.shava.spring.beans.Marca;
import com.shava.spring.dao.DAOMarca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salvadorguerrerolorenzo
 */
@Service
public class ServiceMarcaImpl implements ServiceMarca{
    
    @Autowired
    private DAOMarca daoMarca;

    @Override
    public void registrar(Marca marca) throws Exception {
        try {
            daoMarca.registrar(marca);

        } catch (Exception e) {
            throw e;
        }

    }

}
