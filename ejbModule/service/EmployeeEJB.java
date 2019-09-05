package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.EmployeeEntity;

@Stateless
@LocalBean
public class EmployeeEJB {

     
    	@PersistenceContext
    	private EntityManager em;
    	
        
        public void addNew(EmployeeEntity employeeEntity)
        {
        	System.out.println("============================");
        	System.out.println(employeeEntity.getName());
        	em.persist(employeeEntity);
        	System.out.println("============================");
  

    }

}
