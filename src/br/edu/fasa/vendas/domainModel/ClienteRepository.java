/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.util.List;

/**
 *
 * @author pcego
 */
public interface ClienteRepository extends Repository<Cliente> {
    
    List<Cliente> getAniversariantesMes();
    
    
}
