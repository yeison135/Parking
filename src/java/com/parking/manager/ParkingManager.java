/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.manager;

import com.parking.Filtros.Filtro;
import com.parking.pesistence.Costo;
import com.parking.pesistence.Cupo;
import com.parking.pesistence.Horario;
import com.parking.pesistence.Parqueadero;
import com.parking.pesistence.Sitio;
import com.parking.pesistence.Usuario;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

/**
 *
 * @author EASYPARKING
 */

public class ParkingManager {
    
   
    public boolean registrarUsusario(Usuario usuario, EntityManager em) throws Exception {

         em.persist(usuario);
   //merge update       
        return true;
    }
    
    public boolean cambiarContrasena(Usuario usuario, EntityManager em) throws Exception {

            StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario");
        
        
         Query usuarioU = em.createQuery(queryString.toString());
         usuarioU.setParameter("idUsuario", usuario.getIdUsuario());
         Usuario usuarios =  (Usuario) usuarioU.getSingleResult();
        
         usuarios.setContrasena(usuario.getContrasena());
         em.merge(usuarios);
   //merge update       
        return true;
    }
    
    
    /*
 * consulta un ususario registrado 
 * @param foltro idUsuario
 * me trae un ususrio 
 */
    public List<Usuario> consultarusuarios(EntityManager em, Filtro Filtro){    
        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario");
        
        
         Query query = em.createQuery(queryString.toString());
        if (Filtro.getFiltroId()!= null) {
             query.setParameter("idUsuario", Filtro.getFiltroId());
             
        }     
        
            List<Usuario> usuarios =  query.getResultList();
        if (usuarios != null && !usuarios.isEmpty()) {
            return usuarios;
        }
        
            
       return null;
    }
      /*
 * consulta un ususario registrado 
 * @param foltro idUsuario
 * me trae un ususrio 
 */
    public List<Usuario> usuarioRegistrado(EntityManager em, Filtro Filtro){    
        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT u FROM Usuario u WHERE u.usuario = :usuario"
                + " AND u.contraseña = :contraseña");
        
        
         Query query = em.createQuery(queryString.toString());
        if (Filtro.getFiltroTres()!= null && Filtro.getFiltroUno()!= null) {
             query.setParameter("usuario", Filtro.getFiltroTres());
             query.setParameter("contraseña", Filtro.getFiltroUno());
        }     
        
            List<Usuario> usuarios =  query.getResultList();
        if (usuarios != null && !usuarios.isEmpty()) {
            return usuarios;
        }
        
            
       return null;
    }
    
     
    public List<Parqueadero> consultarparquederos(EntityManager em){    
        Query consulta= em.createNamedQuery("Parqueadero.findAll");
        List<Parqueadero> parqueaderos = consulta.getResultList();        
    if (parqueaderos != null && !parqueaderos.isEmpty()) {
            for (int i = 0; i < 10; i++) {
                parqueaderos.get(i).getIdUsuario();
            }
    
    }
    return  parqueaderos;
    }
    
    public List<Costo> consultarcostos (EntityManager em){    
        Query consulta= em.createNamedQuery("Costo.findAll");
        List<Costo> costos = consulta.getResultList();        
    return costos;
    }
    
    public List<Horario> consultarhorarios(EntityManager em){    
        Query consulta= em.createNamedQuery("Horario.findAll");
        List<Horario> horarios = consulta.getResultList();        
    return horarios;
    }
    public List<Sitio> consultarsitios(EntityManager em){    
        Query consulta= em.createNamedQuery("Sitio.findAll");
        List<Sitio> horarios = consulta.getResultList();        
    return horarios;
    }
    
    public List<Cupo> consultarcupos(EntityManager em){    
        Query consulta= em.createNamedQuery("Cupo.findAll");
        List<Cupo> cupos = consulta.getResultList();        
    return cupos;
    }
//    EJBQLquery query = new EJBQLquery("SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario");

}


