package Entities;

import Entities.Materias;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-08-31T23:44:41")
@StaticMetamodel(Profesores.class)
public class Profesores_ { 

    public static volatile SingularAttribute<Profesores, Integer> idProfesor;
    public static volatile SingularAttribute<Profesores, Materias> idMateria;
    public static volatile SingularAttribute<Profesores, String> nombreProfesor;
    public static volatile SingularAttribute<Profesores, String> documentoProfesor;

}