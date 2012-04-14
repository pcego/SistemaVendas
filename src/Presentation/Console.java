/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import javax.persistence.*;
import br.edu.fasa.vendas.domainModel.Cliente;
import java.util.List;

/**
 *
 * @author pcego
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("vendasPU");
        EntityManager manager = factory.createEntityManager();
       
        Cliente c= new Cliente();
        c.setNome("Petronio3");
        
        EntityTransaction tran = manager.getTransaction();
        
        tran.begin();
        
        try {
        
            manager.persist(c);
        
            tran.commit();
        }
        catch(Exception e){
            tran.rollback();
        }
       
        System.out.println(c.getId());
        
        Cliente c2 = manager.find(Cliente.class, 2);
        
        System.out.println(c2.getNome());
        
        Query consulta = manager.createQuery("select c from Cliente c");
        
        List<Cliente> resultado = consulta.getResultList();
        
        for(Cliente o : resultado ){
            System.out.println("Código: " + Integer.toString(o.getId()) 
                    + " Nome: " + o.getNome());
         }
        
    }
}
