package com.parking.pesistence;

import com.parking.pesistence.Costo;
import com.parking.pesistence.Cupo;
import com.parking.pesistence.Horario;
import com.parking.pesistence.Sitio;
import com.parking.pesistence.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-09-15T14:57:19")
@StaticMetamodel(Parqueadero.class)
public class Parqueadero_ { 

    public static volatile SingularAttribute<Parqueadero, Integer> idParqueadero;
    public static volatile SingularAttribute<Parqueadero, Costo> idCosto;
    public static volatile SingularAttribute<Parqueadero, Cupo> idCupo;
    public static volatile SingularAttribute<Parqueadero, Horario> idHorario;
    public static volatile SingularAttribute<Parqueadero, String> nombreParqueadero;
    public static volatile SingularAttribute<Parqueadero, Usuario> idUsuario;
    public static volatile SingularAttribute<Parqueadero, Sitio> idSitio;

}