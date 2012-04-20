/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.dataAccess;

import br.edu.fasa.vendas.domainModel.Cliente;
import br.edu.fasa.vendas.domainModel.ClienteRepository;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author pcego
 */
public class ClienteDAO 
    extends DAO<Cliente>
    implements ClienteRepository
{

    public ClienteDAO(){
        super(Cliente.class);
    }
    
    @Override
    public List<Cliente> getAniversariantesMes() {
        Query consulta = getEntityManager()
                .createQuery("select c from Cliente c where dtAniversario = :p1");
        consulta.setParameter("p1", new Date());
        return consulta.getResultList();
    }
    
}
