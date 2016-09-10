/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.pesistence;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.math.BigInteger;
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
 * @author EASYPARKING
 */
@Entity
@Table(name = "costo", catalog = "easyparking2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Costo.findAll", query = "SELECT c FROM Costo c"),
    @NamedQuery(name = "Costo.findByIdCosto", query = "SELECT c FROM Costo c WHERE c.idCosto = :idCosto"),
    @NamedQuery(name = "Costo.findByMinutoCarroCosto", query = "SELECT c FROM Costo c WHERE c.minutoCarroCosto = :minutoCarroCosto"),
    @NamedQuery(name = "Costo.findByMinutoMotoCosto", query = "SELECT c FROM Costo c WHERE c.minutoMotoCosto = :minutoMotoCosto"),
    @NamedQuery(name = "Costo.findByHoraCarroCosto", query = "SELECT c FROM Costo c WHERE c.horaCarroCosto = :horaCarroCosto"),
    @NamedQuery(name = "Costo.findByHoraMotoCosto", query = "SELECT c FROM Costo c WHERE c.horaMotoCosto = :horaMotoCosto"),
    @NamedQuery(name = "Costo.findByTplenaCarroCosto", query = "SELECT c FROM Costo c WHERE c.tplenaCarroCosto = :tplenaCarroCosto"),
    @NamedQuery(name = "Costo.findByTplenaMotoCosto", query = "SELECT c FROM Costo c WHERE c.tplenaMotoCosto = :tplenaMotoCosto")})
public class Costo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_costo")
    private Short idCosto;
    @Column(name = "minuto_carro_costo")
    private BigInteger minutoCarroCosto;
    @Column(name = "minuto_moto_costo")
    private BigInteger minutoMotoCosto;
    @Column(name = "hora_carro_costo")
    private BigInteger horaCarroCosto;
    @Column(name = "hora_moto_costo")
    private BigInteger horaMotoCosto;
    @Column(name = "tplena_carro_costo")
    private BigInteger tplenaCarroCosto;
    @Column(name = "tplena_moto_costo")
    private BigInteger tplenaMotoCosto;
    @OneToMany(mappedBy = "idCosto")
    @JsonBackReference 
    private List<Parqueadero> parqueaderoList;

    public Costo() {
    }

    public Costo(Short idCosto) {
        this.idCosto = idCosto;
    }

    public Short getIdCosto() {
        return idCosto;
    }

    public void setIdCosto(Short idCosto) {
        this.idCosto = idCosto;
    }

    public BigInteger getMinutoCarroCosto() {
        return minutoCarroCosto;
    }

    public void setMinutoCarroCosto(BigInteger minutoCarroCosto) {
        this.minutoCarroCosto = minutoCarroCosto;
    }

    public BigInteger getMinutoMotoCosto() {
        return minutoMotoCosto;
    }

    public void setMinutoMotoCosto(BigInteger minutoMotoCosto) {
        this.minutoMotoCosto = minutoMotoCosto;
    }

    public BigInteger getHoraCarroCosto() {
        return horaCarroCosto;
    }

    public void setHoraCarroCosto(BigInteger horaCarroCosto) {
        this.horaCarroCosto = horaCarroCosto;
    }

    public BigInteger getHoraMotoCosto() {
        return horaMotoCosto;
    }

    public void setHoraMotoCosto(BigInteger horaMotoCosto) {
        this.horaMotoCosto = horaMotoCosto;
    }

    public BigInteger getTplenaCarroCosto() {
        return tplenaCarroCosto;
    }

    public void setTplenaCarroCosto(BigInteger tplenaCarroCosto) {
        this.tplenaCarroCosto = tplenaCarroCosto;
    }

    public BigInteger getTplenaMotoCosto() {
        return tplenaMotoCosto;
    }

    public void setTplenaMotoCosto(BigInteger tplenaMotoCosto) {
        this.tplenaMotoCosto = tplenaMotoCosto;
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
        hash += (idCosto != null ? idCosto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Costo)) {
            return false;
        }
        Costo other = (Costo) object;
        if ((this.idCosto == null && other.idCosto != null) || (this.idCosto != null && !this.idCosto.equals(other.idCosto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parking.pesistence.Costo[ idCosto=" + idCosto + " ]";
    }
    
}
