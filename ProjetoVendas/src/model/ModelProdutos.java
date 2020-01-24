
package model;

public class ModelProdutos {
    
    private int idProduto;
    private String prodNome;
    private Double prodValor;
    private int prodEstoque;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the prodNome
     */
    public String getProdNome() {
        return prodNome;
    }

    /**
     * @param prodNome the prodNome to set
     */
    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    /**
     * @return the prodValor
     */
    public Double getProdValor() {
        return prodValor;
    }

    /**
     * @param prodValor the prodValor to set
     */
    public void setProdValor(Double prodValor) {
        this.prodValor = prodValor;
    }

    /**
     * @return the prodEstoque
     */
    public int getProdEstoque() {
        return prodEstoque;
    }

    /**
     * @param prodEstoque the prodEstoque to set
     */
    public void setProdEstoque(int prodEstoque) {
        this.prodEstoque = prodEstoque;
    }
    
    
}