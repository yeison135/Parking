/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.pesistence;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yeison
 */
@Entity
@Table(name = "cupo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cupo.findAll", query = "SELECT c FROM Cupo c"),
    @NamedQuery(name = "Cupo.findByIdCupo", query = "SELECT c FROM Cupo c WHERE c.idCupo = :idCupo"),
    @NamedQuery(name = "Cupo.findByCarroCupo", query = "SELECT c FROM Cupo c WHERE c.carroCupo = :carroCupo"),
    @NamedQuery(name = "Cupo.findByMotoCupo", query = "SELECT c FROM Cupo c WHERE c.motoCupo = :motoCupo")})
public class Cupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cupo")
    private Short idCupo;
    @Column(name = "carro_cupo")
    private Integer carroCupo;
    @Column(name = "moto_cupo")
    private Integer motoCupo;
    @OneToMany(mappedBy = "idCupo")
    @JsonBackReference
    private List<Parqueadero> parqueaderoList;

    public Cupo() {
    }

    public Cupo(Short idCupo) {
        this.idCupo = idCupo;
    }

    public Short getIdCupo() {
        return idCupo;
    }

    public void setIdCupo(Short idCupo) {
        this.idCupo = idCupo;
    }

    public Integer getCarroCupo() {
        return carroCupo;
    }

    public void setCarroCupo(Integer carroCupo) {
        this.carroCupo = carroCupo;
    }

    public Integer getMotoCupo() {
        return motoCupo;
    }

    public void setMotoCupo(Integer motoCupo) {
        this.motoCupo = motoCupo;
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
        hash += (idCupo != null ? idCupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cupo)) {
            return false;
        }
        Cupo other = (Cupo) object;
        if ((this.idCupo == null && other.idCupo != null) || (this.idCupo != null && !this.idCupo.equals(other.idCupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parking.pesistence.Cupo[ idCupo=" + idCupo + " ]";
    }
    
}
