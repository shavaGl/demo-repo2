/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shava.spring.dao;

import com.shava.spring.beans.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author salvadorguerrerolorenzo
 */
@Repository
public class DAOMarcaImpl implements DAOMarca{

    @Autowired
    private DataSource dataSource;
    
    @Override
    public void registrar(Marca marca) throws Exception {
        
        String sql = "INSERT INTO marca(id,nombre) values(?,?)";
        Connection con = null;
        
        try{
            con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, marca.getId());
            ps.setString(2, marca.getNombre());
            ps.executeUpdate();
            ps.close();
            
            
        }catch(Exception e){
            throw e;
        }finally{
            
            if(con != null){
                con.close();
            }
            
        }
    }
    
}
