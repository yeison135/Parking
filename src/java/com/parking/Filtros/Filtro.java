package com.parking.Filtros;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;

/**
 *
 * @author yalvarez
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Filtro{
    
    /**
     * Fecha Inicial para filtrado
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone="EST")
    private Date fechaInicial;
    /**
     * Fecha final para filtrado
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone="EST")
    private Date fechaFinal;

    /**
     * Identificador para filtrar
     */
    private Integer filtroId;
    
    /**
     * Filtro uno
     */
    private String filtroUno;
    
    /**
     * Filtro dis
     */
    private String filtroDos;
    
    /**
     * Filtro tres
     */
    private String filtroTres;
    
    /**
     * Filtro cuatro
     */
    private String filtroCuatro;
    
     /**
     * Filtro cinco
     */
    private boolean filtroCinco;
    
     /**
     * Filtro seis
     */
    private int filtroSeis;
    
    /**
     * Filtro por identificador
     */
    private Integer filtroDosId;
    /**
     * Filtro por tipo de documento
     */
    private String tipoDoc;
    
    /**
     * Filtro por numero de documento
     */
    private String numeroDoc;
    
    /**
     * Filtro por registro
     */
    private String regis;
    
    /**
     * Filtro por clasificacion
     */
    private String clasif;
    
    /**
     * Filtro de estados
     */
    private String [] estados;
    
    public String[] getEstados() {
        return estados;
    }

    public void setEstados(String[] estados) {
        this.estados = estados;
    }    
    
    /**
     * @return the fechaInicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * @param fechaInicial the fechaInicial to set
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * @return the fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the filtroId
     */
    public Integer getFiltroId() {
        return filtroId;
    }

    /**
     * @param filtroId the filtroId to set
     */
    public void setFiltroId(Integer filtroId) {
        this.filtroId = filtroId;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroUno() {
        return filtroUno;
    }

    /**
     * 
     * @param filtroUno 
     */
    public void setFiltroUno(String filtroUno) {
        this.filtroUno = filtroUno;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroDos() {
        return filtroDos;
    }

    /**
     * 
     * @param filtroDos 
     */
    public void setFiltroDos(String filtroDos) {
        this.filtroDos = filtroDos;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroTres() {
        return filtroTres;
    }

    /**
     * 
     * @param filtroTres 
     */
    public void setFiltroTres(String filtroTres) {
        this.filtroTres = filtroTres;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroCuatro() {
        return filtroCuatro;
    }

    /**
     * 
     * @param filtroCuatro 
     */
    public void setFiltroCuatro(String filtroCuatro) {
        this.filtroCuatro = filtroCuatro;
    }
    
    /*
     * @return the filtroDosId
     */
    public Integer getFiltroDosId() {
        return filtroDosId;
    }

    /**
     * @param filtroDosId the filtroDosId to set
     */
    public void setFiltroDosId(Integer filtroDosId) {
        this.filtroDosId = filtroDosId;
    }

    /**
     * @return the tipoDoc
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * @param tipoDoc the tipoDoc to set
     */
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    /**
     * @return the numeroDoc
     */
    public String getNumeroDoc() {
        return numeroDoc;
    }

    /**
     * @param numeroDoc the numeroDoc to set
     */
    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }
    
    /**
     * @return el registro
     */
    public String getRegistro() {
        return regis;
    }

    /**
     * @param regis the regis to set
     */
    public void setRegistro(String regis) {
        this.regis = regis;
    }

    /**
     * @return the clasificacion
     */
    public String getClasificacion() {
        return clasif;
    }

    /**
     * @param clasif the numeroDoc to set
     */
    public void setClasificacion(String clasif) {
        this.clasif = clasif;
    }
    /**
     * @return the filtroCinco
     */
    public boolean  getFiltroCinco() {
        return filtroCinco;
    }

    /**
     * @param filtroCinco the filtroCinco to set
     */
    public void setFiltroCinco(boolean filtroCinco) {
        this.filtroCinco = filtroCinco;
    }
    /**
     * @return the filtroSeis
     */
    public int  getFiltroSeis() {
        return filtroSeis;
    }

    /**
     * @param filtroSeis the filtroCinco to set
     */
    public void setFiltroSeis(int filtroSeis) {
        this.filtroSeis = filtroSeis;
    }
}