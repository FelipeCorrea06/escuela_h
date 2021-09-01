package Entities;

import Entities.Estudiantes;
import Entities.Profesores;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-08-31T23:44:41")
@StaticMetamodel(Materias.class)
public class Materias_ { 

    public static volatile ListAttribute<Materias, Estudiantes> estudiantesList;
    public static volatile SingularAttribute<Materias, Integer> idMateria;
    public static volatile SingularAttribute<Materias, String> nombreMateria;
    public static volatile SingularAttribute<Materias, String> turnoMateria;
    public static volatile ListAttribute<Materias, Profesores> profesoresList;

}