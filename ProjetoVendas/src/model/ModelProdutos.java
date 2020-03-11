package model;
/**
*
* @author Jeferson
*/
public class ModelProdutos {

    private int IdProduto;
    private int Fornecedor;
    private String ProdNome;
    private Double ProdValor;
    private int ProdEstoque;

    /**
    * Construtor
    */
    public ModelProdutos(){}

    /**
    * seta o valor de IdProduto
    * @param pIdProduto
    */
    public void setIdProduto(int pIdProduto){
        this.IdProduto = pIdProduto;
    }
    /**
    * @return pk_IdProduto
    */
    public int getIdProduto(){
        return this.IdProduto;
    }

    /**
    * seta o valor de Fornecedor
    * @param pFornecedor
    */
    public void setFornecedor(int pFornecedor){
        this.Fornecedor = pFornecedor;
    }
    /**
    * @return Fornecedor
    */
    public int getFornecedor(){
        return this.Fornecedor;
    }

    /**
    * seta o valor de ProdNome
    * @param pProdNome
    */
    public void setProdNome(String pProdNome){
        this.ProdNome = pProdNome;
    }
    /**
    * @return ProdNome
    */
    public String getProdNome(){
        return this.ProdNome;
    }

    /**
    * seta o valor de ProdValor
    * @param pProdValor
    */
    public void setProdValor(Double pProdValor){
        this.ProdValor = pProdValor;
    }
    /**
    * @return ProdValor
    */
    public Double getProdValor(){
        return this.ProdValor;
    }

    /**
    * seta o valor de ProdEstoque
    * @param pProdEstoque
    */
    public void setProdEstoque(int pProdEstoque){
        this.ProdEstoque = pProdEstoque;
    }
    /**
    * @return ProdEstoque
    */
    public int getProdEstoque(){
        return this.ProdEstoque;
    }

    @Override
    public String toString(){
        return "ModelProdutos {" + "::IdProduto = " + this.IdProduto + "::Fornecedor = " + this.Fornecedor + "::ProdNome = " + this.ProdNome + "::ProdValor = " + this.ProdValor + "::ProdEstoque = " + this.ProdEstoque +  "}";
    }
}