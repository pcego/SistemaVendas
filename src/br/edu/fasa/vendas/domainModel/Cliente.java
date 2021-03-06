/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author pcego
 * @since 1.0
 * @version 1.01
 */

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

    public Cliente() {
    }
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="codigo")
    private int id;
    
    @Column(name="nomeCliente",length=255)
    private String nome;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAniversario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dtAniversario
     */
    public Date getDtAniversario() {
        return dtAniversario;
    }

    /**
     * @param dtAniversario the dtAniversario to set
     */
    public void setDtAniversario(Date dtAniversario) {
        this.dtAniversario = dtAniversario;
    }
}
