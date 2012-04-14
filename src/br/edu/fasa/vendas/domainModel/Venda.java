/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author pcego
 * @since 1.0
 * @version 1.01
 */

@Entity
@Table(name="vendas")
public class Venda {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="codigo")
    private int id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date datas;
    
    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(name="cliente")
    private Cliente cliente;
    
    @OneToMany(cascade= CascadeType.ALL,mappedBy= "venda",targetEntity=ItemVenda.class)    
    private List<ItemVenda> itens;

    public Venda() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the datas
     */
    public Date getDatas() {
        return datas;
    }

    /**
     * @param datas the datas to set
     */
    public void setDatas(Date datas) {
        this.datas = datas;
    }

    /*
     * @param ItemVenda adiciona ao vetor
     */
    public void addIten(ItemVenda iv) {
        itens.add(iv);
    }

    /**
     * @return the itens
     */
    public List<ItemVenda> getItens() {

        return itens;

    }

    public void removeItens(ItemVenda iv) {
        itens.remove(iv);

    }

    public ItemVenda getItemVenda(int a) {
        return itens.get(a);
    }
}
