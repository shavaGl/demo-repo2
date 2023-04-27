/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shava.spring.service;

import com.shava.spring.beans.Jugador;
import com.shava.spring.dao.DAOJugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salvadorguerrerolorenzo
 */
@Service
public class ServiceJugadorImpl implements ServiceJugador{

    @Autowired
    private DAOJugador daoJugador;
    
    
    @Override
    public void registrar(Jugador jugador) throws Exception {
        try {
            daoJugador.registrar(jugador);

        } catch (Exception e) {
            throw e;
        }
    }
    
}
