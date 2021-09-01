/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author INDRA
 */
@Entity
@Table(name = "materias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materias.findAll", query = "SELECT m FROM Materias m")
    , @NamedQuery(name = "Materias.findByIdMateria", query = "SELECT m FROM Materias m WHERE m.idMateria = :idMateria")
    , @NamedQuery(name = "Materias.findByNombreMateria", query = "SELECT m FROM Materias m WHERE m.nombreMateria = :nombreMateria")
    , @NamedQuery(name = "Materias.findByTurnoMateria", query = "SELECT m FROM Materias m WHERE m.turnoMateria = :turnoMateria")})
public class Materias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materia")
    private Integer idMateria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre_materia")
    private String nombreMateria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "turno_materia")
    private String turnoMateria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private List<Profesores> profesoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private List<Estudiantes> estudiantesList;

    public Materias() {
    }

    public Materias(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Materias(Integer idMateria, String nombreMateria, String turnoMateria) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.turnoMateria = turnoMateria;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getTurnoMateria() {
        return turnoMateria;
    }

    public void setTurnoMateria(String turnoMateria) {
        this.turnoMateria = turnoMateria;
    }

    @XmlTransient
    public List<Profesores> getProfesoresList() {
        return profesoresList;
    }

    public void setProfesoresList(List<Profesores> profesoresList) {
        this.profesoresList = profesoresList;
    }

    @XmlTransient
    public List<Estudiantes> getEstudiantesList() {
        return estudiantesList;
    }

    public void setEstudiantesList(List<Estudiantes> estudiantesList) {
        this.estudiantesList = estudiantesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateria != null ? idMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materias)) {
            return false;
        }
        Materias other = (Materias) object;
        if ((this.idMateria == null && other.idMateria != null) || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Materias[ idMateria=" + idMateria + " ]";
    }
    
}
