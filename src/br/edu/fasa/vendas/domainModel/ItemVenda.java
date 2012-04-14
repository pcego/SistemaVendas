/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author pcego
 * @since 1.0
 * @version 1.01
 */

@Entity
@Table(name="itensVendas") 
public class ItemVenda implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="codigo")
    private int id;
    
    
    @ManyToOne(cascade= CascadeType.ALL,targetEntity=Venda.class)
    @JoinColumn(name="venda")
    private Venda venda;
    
    @ManyToOne(cascade= CascadeType.ALL,targetEntity=Produto.class)
    @JoinColumn(name="produto")
    private Produto produto;
    
    @Column(name="quant")
    private int quantidade;
    
    @Column(name="valorUnit")
    private double valorUnitario;
    
    public ItemVenda(){
        
    }

    /**
     * @return the codigo
     */
    public int getId() {
        return id;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int id) {
        this.id = id;
    }

    /**
     * @return the venda
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
}
