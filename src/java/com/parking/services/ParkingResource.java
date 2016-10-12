/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.services;

import com.parking.Filtros.Filtro;
import com.parking.manager.ParkingManager;
import com.parking.pesistence.Costo;
import com.parking.pesistence.Cupo;
import com.parking.pesistence.Horario;
import com.parking.pesistence.Parqueadero;
import com.parking.pesistence.Sitio;
import com.parking.pesistence.Usuario;
import com.sun.javafx.collections.MappingChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.enterprise.inject.Stereotype;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author EASYPARKING
 */
@Path("parking")
@Stateless 

public class ParkingResource {

    @PersistenceContext(unitName = "parkingbdPU")
    private EntityManager em;
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ParkingResource
     */
    public ParkingResource() {
    }

    /**
     * Retrieves representation of an instance of com.parking.pesistence.ParkingResource
     * @param Filtro
     * @param idusuario
     * @return an instance of java.lang.String
     */
    @POST   
    @Path("agregarusuario")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Integer agregarusuario(Usuario usuario) {
            
               
        ParkingManager manager = new ParkingManager(); 
        try{
            boolean resultado = manager.registrarUsusario(usuario,em);  
            if(resultado){        
                return 1;
            }
        }catch(Exception ex){
            ex.printStackTrace();
            return 0;
        }
        
        return 0;
    }
    
    @POST   
    @Path("cambiarContrasena")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Integer cambiarContrasena(Usuario usuario) {
            
               
        ParkingManager manager = new ParkingManager(); 
        try{
            boolean resultado = manager.cambiarContrasena(usuario,em);  
            
            if(resultado){        
                return 1;
            }
        }catch(Exception ex){
            ex.printStackTrace();
            return 0;
        }
        
        return 0;
    }
    
    
    
    
    @POST
    @Path("consultausuarios")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Usuario> getJson(Filtro Filtro) {
       
               ParkingManager manager = new ParkingManager();     
               List<Usuario> user = manager.consultarusuarios(em,Filtro);     
               List<String> nombresCampos = new ArrayList<>();
              
               
              return user;
    }
    
    @POST
    @Path("usuarioRegistrado")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Usuario> getUsuarios(Filtro Filtro) {
       
               ParkingManager consulta = new ParkingManager();     
               List<Usuario> user = consulta.usuarioRegistrado(em,Filtro);     
              
              
               
              return user;
    }
    @GET
    @Path("consultarParqueaderos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Parqueadero> getList() {
        
       ParkingManager consulta = new ParkingManager();     
       List<Parqueadero> parquederos = consulta.consultarparquederos(em);
                
        return parquederos;
    }
    
    @GET
    @Path("consultaCostos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Costo> getjCostos() {
        
       ParkingManager consulta = new ParkingManager();     
       List<Costo> costos = consulta.consultarcostos(em);       
        
        return costos;
    }
    
    @GET
    @Path("consultarhorarios")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Horario> getHorarios() {
        
       ParkingManager consulta = new ParkingManager();     
       List<Horario> horarios = consulta.consultarhorarios(em);       
        
        return horarios;
    }
    
    @GET
    @Path("consultarcupos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cupo> getCupo() {
        
       ParkingManager consulta = new ParkingManager();   
       List<Cupo> cupos = consulta.consultarcupos(em); 
        return cupos;
    }
    
    @GET
    @Path("consultarsitio")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sitio> getSitios() {
        
       ParkingManager consulta = new ParkingManager();     
       List<Sitio> sitios = consulta.consultarsitios(em);       
        
        return sitios;
    }
    /**
     * PUT method for updating or creating an instance of ParkingResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
