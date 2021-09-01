/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Entities.Materias;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author INDRA
 */
@Stateless
public class MateriasFacade extends AbstractFacade<Materias> {

    @PersistenceContext(unitName = "Escuela_HPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MateriasFacade() {
        super(Materias.class);
    }
    
    public List<Materias> obtenerMateriasEstudiante(int id){
        EntityManager em = getEntityManager();
        Query q = em.createNamedQuery("Materias.findByIdMateria").setParameter("idMateria", id);
        return q.getResultList();
    }
    
}
