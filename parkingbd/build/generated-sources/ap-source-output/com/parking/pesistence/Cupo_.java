package com.parking.pesistence;

import com.parking.pesistence.Parqueadero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-09-14T20:47:02")
@StaticMetamodel(Cupo.class)
public class Cupo_ { 

    public static volatile SingularAttribute<Cupo, Short> idCupo;
    public static volatile SingularAttribute<Cupo, Integer> carroCupo;
    public static volatile ListAttribute<Cupo, Parqueadero> parqueaderoList;
    public static volatile SingularAttribute<Cupo, Integer> motoCupo;

}