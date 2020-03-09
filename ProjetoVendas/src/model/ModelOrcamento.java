package model;

import java.sql.Date;

/**
*
* @author Jeferson 
*/
public class ModelOrcamento {

    private int idOrcamento;
    private int idCliente;
    private Date dataOrcamento;
    private double valorLiquidoOrcamento;
    private double valorBrutoOrcamento;
    private int descontoOrcamento;

    /**
    * Construtor
    */
    public ModelOrcamento(){}

    /**
    * seta o valor de idOrcamento
    * @param pIdOrcamento
    */
    public void setIdOrcamento(int pIdOrcamento){
        this.idOrcamento = pIdOrcamento;
    }
    /**
    * @return pk_idOrcamento
    */
    public int getIdOrcamento(){
        return this.idOrcamento;
    }

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * @return fk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    /**
    * seta o valor de dataOrcamento
    * @param pDataOrcamento
    */
    public void setDataOrcamento(Date pDataOrcamento){
        this.dataOrcamento = pDataOrcamento;
    }
    /**
    * @return dataOrcamento
    */
    public Date getDataOrcamento(){
        return this.dataOrcamento;
    }

    /**
    * seta o valor de valorLiquidoOrcamento
    * @param pValorLiquidoOrcamento
    */
    public void setValorLiquidoOrcamento(double pValorLiquidoOrcamento){
        this.valorLiquidoOrcamento = pValorLiquidoOrcamento;
    }
    /**
    * @return valorLiquidoOrcamento
    */
    public double getValorLiquidoOrcamento(){
        return this.valorLiquidoOrcamento;
    }

    /**
    * seta o valor de valorBrutoOrcamento
    * @param pValorBrutoOrcamento
    */
    public void setValorBrutoOrcamento(double pValorBrutoOrcamento){
        this.valorBrutoOrcamento = pValorBrutoOrcamento;
    }
    /**
    * @return valorBrutoOrcamento
    */
    public double getValorBrutoOrcamento(){
        return this.valorBrutoOrcamento;
    }

    /**
    * seta o valor de descontoOrcamento
    * @param pDescontoOrcamento
    */
    public void setDescontoOrcamento(int pDescontoOrcamento){
        this.descontoOrcamento = pDescontoOrcamento;
    }
    /**
    * @return descontoOrcamento
    */
    public int getDescontoOrcamento(){
        return this.descontoOrcamento;
    }

    @Override
    public String toString(){
        return "ModelOrcamento {" + "::idOrcamento = " + this.idOrcamento + "::idCliente = " + this.idCliente + "::dataOrcamento = " + this.dataOrcamento + "::valorLiquidoOrcamento = " + this.valorLiquidoOrcamento + "::valorBrutoOrcamento = " + this.valorBrutoOrcamento + "::descontoOrcamento = " + this.descontoOrcamento +  "}";
    }
}