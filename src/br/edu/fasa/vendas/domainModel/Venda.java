/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.util.Date;

/**
 *
 * @author pcego
 */
public class Venda {
    
    //Algumas modificações que petronio me aconselhou a fazer para melhorar o Código.
    private int id; //Usar ID ao invés de código, apesar de não mudar muito hehe
    private Cliente cliente; //Criar um objeto cliente ao invéz de uma váriavel int para o codigo do mesmo.
    private Date data;
    private List<ItemVenda> itens; //Usar uma lista aki para armazenar os itens das vendas.
    //Fazer os metodos para controle da lista. ADD, Remove, retorna um item, retorna a lista toda.
    
    //Corrigir os Getters e Setters.
    
    public Venda(){
        
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cliente
     */
    public int getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(int cliente) {
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
        
}
