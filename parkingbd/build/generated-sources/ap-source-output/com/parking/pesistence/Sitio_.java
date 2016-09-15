package com.parking.pesistence;

import com.parking.pesistence.Parqueadero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-09-14T20:47:02")
@StaticMetamodel(Sitio.class)
public class Sitio_ { 

    public static volatile SingularAttribute<Sitio, String> latitud;
    public static volatile SingularAttribute<Sitio, String> longitud;
    public static volatile ListAttribute<Sitio, Parqueadero> parqueaderoList;
    public static volatile SingularAttribute<Sitio, String> direccion;
    public static volatile SingularAttribute<Sitio, Short> idSitio;

}