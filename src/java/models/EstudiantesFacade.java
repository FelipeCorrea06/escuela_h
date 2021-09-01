/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Entities.Estudiantes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author INDRA
 */
@Stateless
public class EstudiantesFacade extends AbstractFacade<Estudiantes> {

    @PersistenceContext(unitName = "Escuela_HPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudiantesFacade() {
        super(Estudiantes.class);
    }
    
}
