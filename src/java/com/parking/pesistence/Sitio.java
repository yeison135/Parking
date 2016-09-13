/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.pesistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yeison
 */
@Entity
@Table(name = "sitio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sitio.findAll", query = "SELECT s FROM Sitio s"),
    @NamedQuery(name = "Sitio.findByIdSitio", query = "SELECT s FROM Sitio s WHERE s.idSitio = :idSitio"),
    @NamedQuery(name = "Sitio.findByDireccion", query = "SELECT s FROM Sitio s WHERE s.direccion = :direccion"),
    @NamedQuery(name = "Sitio.findByLatitud", query = "SELECT s FROM Sitio s WHERE s.latitud = :latitud"),
    @NamedQuery(name = "Sitio.findByLongitud", query = "SELECT s FROM Sitio s WHERE s.longitud = :longitud")})
public class Sitio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sitio")
    private Short idSitio;
    @Size(max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 50)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 50)
    @Column(name = "longitud")
    private String longitud;
    @OneToMany(mappedBy = "idSitio")
    private List<Parqueadero> parqueaderoList;

    public Sitio() {
    }

    public Sitio(Short idSitio) {
        this.idSitio = idSitio;
    }

    public Short getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(Short idSitio) {
        this.idSitio = idSitio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @XmlTransient
    public List<Parqueadero> getParqueaderoList() {
        return parqueaderoList;
    }

    public void setParqueaderoList(List<Parqueadero> parqueaderoList) {
        this.parqueaderoList = parqueaderoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSitio != null ? idSitio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sitio)) {
            return false;
        }
        Sitio other = (Sitio) object;
        if ((this.idSitio == null && other.idSitio != null) || (this.idSitio != null && !this.idSitio.equals(other.idSitio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parking.pesistence.Sitio[ idSitio=" + idSitio + " ]";
    }
    
}
