 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shava.spring.springbd;

import com.shava.spring.beans.Camiseta;
import com.shava.spring.beans.Equipo;
import com.shava.spring.beans.Jugador;
import com.shava.spring.beans.Marca;
import com.shava.spring.service.ServiceJugador;
import com.shava.spring.service.ServiceMarca;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author salvadorguerrerolorenzo
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Marca mar = new Marca();
        mar.setId(2);
        mar.setNombre("Marca 2");


        Equipo equipo = new Equipo();
        equipo.setId(1);
        equipo.setNombre("Barcelona");
        
        Camiseta camiseta = new Camiseta();
        camiseta.setId(1);
        camiseta.setNumero("10");
        camiseta.setMarca(mar);
        
        Jugador jugador = new Jugador();
        jugador.setId(3);
        jugador.setNombre("Valeria!");
        jugador.setEquipo(equipo);
        jugador.setCamiseta(camiseta);
        
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/shava/spring/xml/beans.xml");
        
        ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
        ServiceJugador sj = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
        
        try{
            sm.registrar(mar);
            sj.registrar(jugador);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
