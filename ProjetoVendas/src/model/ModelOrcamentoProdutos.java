package model;
/**
*
* @author Jeferson 
*/
public class ModelOrcamentoProdutos {

    private int idOrcamentoProduto;
    private int idProduto;
    private int idOrcamento;
    private double valorProduto;
    private int qtdProduto;

    /**
    * Construtor
    */
    public ModelOrcamentoProdutos(){}

    /**
    * seta o valor de idOrcamentoProduto
    * @param pIdOrcamentoProduto
    */
    public void setIdOrcamentoProduto(int pIdOrcamentoProduto){
        this.idOrcamentoProduto = pIdOrcamentoProduto;
    }
    /**
    * @return pk_idOrcamentoProduto
    */
    public int getIdOrcamentoProduto(){
        return this.idOrcamentoProduto;
    }

    /**
    * seta o valor de idProduto
    * @param pIdProduto
    */
    public void setIdProduto(int pIdProduto){
        this.idProduto = pIdProduto;
    }
    /**
    * @return fk_idProduto
    */
    public int getIdProduto(){
        return this.idProduto;
    }

    /**
    * seta o valor de idOrcamento
    * @param pIdOrcamento
    */
    public void setIdOrcamento(int pIdOrcamento){
        this.idOrcamento = pIdOrcamento;
    }
    /**
    * @return fk_idOrcamento
    */
    public int getIdOrcamento(){
        return this.idOrcamento;
    }

    /**
    * seta o valor de valorProduto
    * @param pValorProduto
    */
    public void setValorProduto(double pValorProduto){
        this.valorProduto = pValorProduto;
    }
    /**
    * @return valorProduto
    */
    public double getValorProduto(){
        return this.valorProduto;
    }

    /**
    * seta o valor de qtdProduto
    * @param pQtdProduto
    */
    public void setQtdProduto(int pQtdProduto){
        this.qtdProduto = pQtdProduto;
    }
    /**
    * @return qtdProduto
    */
    public int getQtdProduto(){
        return this.qtdProduto;
    }

    @Override
    public String toString(){
        return "ModelOrcamentoProdutos {" + "::idOrcamentoProduto = " + this.idOrcamentoProduto + "::idProduto = " + this.idProduto + "::idOrcamento = " + this.idOrcamento + "::valorProduto = " + this.valorProduto + "::qtdProduto = " + this.qtdProduto +  "}";
    }
}