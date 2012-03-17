/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

/**
 *
 * @author pcego
 */
public class ItensVenda {
    
    private int codigo;
    private int venda;
    private int produto;
    private int quantidade;
    private double valorUnitario;
    
    public ItensVenda(){
        
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
     * @return the venda
     */
    public int getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(int venda) {
        this.venda = venda;
    }

    /**
     * @return the produto
     */
    public int getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(int produto) {
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
