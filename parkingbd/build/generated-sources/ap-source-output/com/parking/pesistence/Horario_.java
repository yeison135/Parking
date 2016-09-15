package com.parking.pesistence;

import com.parking.pesistence.Parqueadero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-09-15T14:57:19")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Short> idHorario;
    public static volatile SingularAttribute<Horario, String> domingoFestivo;
    public static volatile ListAttribute<Horario, Parqueadero> parqueaderoList;
    public static volatile SingularAttribute<Horario, String> sabado;
    public static volatile SingularAttribute<Horario, String> lunesViernes;

}