package Entities;

import Entities.Materias;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-08-31T23:44:41")
@StaticMetamodel(Estudiantes.class)
public class Estudiantes_ { 

    public static volatile SingularAttribute<Estudiantes, Materias> idMateria;
    public static volatile SingularAttribute<Estudiantes, String> documentoEstudiante;
    public static volatile SingularAttribute<Estudiantes, String> nombreEstudiante;
    public static volatile SingularAttribute<Estudiantes, Date> natalicio;
    public static volatile SingularAttribute<Estudiantes, Integer> idEstudiante;
    public static volatile SingularAttribute<Estudiantes, String> email;

}