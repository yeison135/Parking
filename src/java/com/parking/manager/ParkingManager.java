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
import com.parking.pesistence.Vehiculo;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.util.Date;
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
    /**
     * Lo consulta con el Id de usuario y cambia la contraseña
     * el Json seria de esta manera
     * {
     * "usuario":"",
     * "contrasena":""
     * }
     * para el android debe armar el Json con estos dos atributos
     * si el usuario existe cambia la contraseña si no retorna una 
     * false 
     * @param usuario
     * @param em
     * @return
     * @throws Exception 
     */
    public boolean cambiarContrasena(Usuario usuario, EntityManager em) throws Exception {

            StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario");
        
        
         Query usuarioU = em.createQuery(queryString.toString());
         usuarioU.setParameter("idUsuario", usuario.getIdUsuario());
         Usuario usuarios =  (Usuario) usuarioU.getSingleResult();
        if (usuarios != null) {
         usuarios.setContrasena(usuario.getContrasena());
         em.merge(usuarios);
        }else {
        return false;
        }
         
   //merge update       
        return true;
    }
    public boolean registrarVehiculo (Vehiculo vihiculo,EntityManager em)
            throws Exception{
        Date Fecha = new Date();
        vihiculo.setFechaRegistro(Fecha);
    em.persist(vihiculo);
    
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
    public boolean usuarioRegistrado(EntityManager em, Filtro Filtro){    
        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT u FROM Usuario u WHERE u.usuario = :usuario"
                + " AND u.contrasena = :contrasena");
        
        
         Query query = em.createQuery(queryString.toString());
        if (Filtro.getFiltroTres()!= null && Filtro.getFiltroUno()!= null) {
             query.setParameter("usuario", Filtro.getFiltroTres());
             query.setParameter("contrasena", Filtro.getFiltroUno());
        }     
        
            List<Usuario> usuarios =  query.getResultList();
        if (usuarios != null && !usuarios.isEmpty()) {
            return true;
        }
        
            
       return false;
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


