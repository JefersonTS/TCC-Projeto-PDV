package model;
/**
*
* @author Jeferson 
*/
public class ModelFormaPagamento {

    private int idFormaPagamento;
    private String descricaoFormaPagamento;
    private float descontoFormaPagamento;
    private int parcelasFormaPagamento;
    private int situacaoFormaPagamento;

    /**
    * Construtor
    */
    public ModelFormaPagamento(){}

    /**
    * seta o valor de idFormaPagamento
    * @param pIdFormaPagamento
    */
    public void setIdFormaPagamento(int pIdFormaPagamento){
        this.idFormaPagamento = pIdFormaPagamento;
    }
    /**
    * return idFormaPagamento
    */
    public int getIdFormaPagamento(){
        return this.idFormaPagamento;
    }

    /**
    * seta o valor de descricaoFormaPagamento
    * @param pDescricaoFormaPagamento
    */
    public void setDescricaoFormaPagamento(String pDescricaoFormaPagamento){
        this.descricaoFormaPagamento = pDescricaoFormaPagamento;
    }
    /**
    * return descricaoFormaPagamento
    */
    public String getDescricaoFormaPagamento(){
        return this.descricaoFormaPagamento;
    }

    /**
    * seta o valor de descontoFormaPagamento
    * @param pDescontoFormaPagamento
    */
    public void setDescontoFormaPagamento(float pDescontoFormaPagamento){
        this.descontoFormaPagamento = pDescontoFormaPagamento;
    }
    /**
    * return descontoFormaPagamento
    */
    public float getDescontoFormaPagamento(){
        return this.descontoFormaPagamento;
    }

    /**
    * seta o valor de parcelasFormaPagamento
    * @param pParcelasFormaPagamento
    */
    public void setParcelasFormaPagamento(int pParcelasFormaPagamento){
        this.parcelasFormaPagamento = pParcelasFormaPagamento;
    }
    /**
    * return parcelasFormaPagamento
    */
    public int getParcelasFormaPagamento(){
        return this.parcelasFormaPagamento;
    }

    /**
    * seta o valor de situacaoFormaPagamento
    * @param pSituacaoFormaPagamento
    */
    public void setSituacaoFormaPagamento(int pSituacaoFormaPagamento){
        this.situacaoFormaPagamento = pSituacaoFormaPagamento;
    }
    /**
    * return situacaoFormaPagamento
    */
    public int getSituacaoFormaPagamento(){
        return this.situacaoFormaPagamento;
    }

    @Override
    public String toString(){
        return "ModelFormaPagamento {" + "::idFormaPagamento = " + this.idFormaPagamento + "::descricaoFormaPagamento = " + this.descricaoFormaPagamento + "::descontoFormaPagamento = " + this.descontoFormaPagamento + "::parcelasFormaPagamento = " + this.parcelasFormaPagamento + "::situacaoFormaPagamento = " + this.situacaoFormaPagamento +  "}";
    }
}