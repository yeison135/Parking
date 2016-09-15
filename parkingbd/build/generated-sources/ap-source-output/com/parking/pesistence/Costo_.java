package com.parking.pesistence;

import com.parking.pesistence.Parqueadero;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-09-15T14:57:19")
@StaticMetamodel(Costo.class)
public class Costo_ { 

    public static volatile SingularAttribute<Costo, Short> idCosto;
    public static volatile SingularAttribute<Costo, BigInteger> minutoMotoCosto;
    public static volatile ListAttribute<Costo, Parqueadero> parqueaderoList;
    public static volatile SingularAttribute<Costo, BigInteger> horaCarroCosto;
    public static volatile SingularAttribute<Costo, BigInteger> horaMotoCosto;
    public static volatile SingularAttribute<Costo, BigInteger> minutoCarroCosto;
    public static volatile SingularAttribute<Costo, BigInteger> tplenaCarroCosto;
    public static volatile SingularAttribute<Costo, BigInteger> tplenaMotoCosto;

}