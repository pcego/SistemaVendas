/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.util.Date;
import java.util.List;

/**
 *
 * @author pcego
 * @since 1.0
 * @version 1.01
 */
public class Venda {

    private int id;
    private Cliente cliente;
    private Date data;
    private List<ItensVenda> itens;

    public Venda() {
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
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /*
     * @param ItensVenda adiciona ao vetor
     */
    public void addIten(ItensVenda iv) {
        itens.add(iv);
    }

    /**
     * @return the itens
     */
    public List<ItensVenda> getItens() {

        return itens;

    }

    public void removeItens(ItensVenda iv) {
        itens.remove(iv);

    }

    public ItensVenda getItenVenda(int a) {
        return itens.get(a);
    }
}
