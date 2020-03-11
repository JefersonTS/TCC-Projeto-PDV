package model;
/**
*
* @author Jeferson
*/
public class ModelFornecedor {

    private int id_fornecedor;
    private String razao_social;
    private String nome_fantasia;
    private String cnpj;
    private String inscricao_estadual;
    private String for_endereco;
    private String for_bairro;
    private String for_cidade;
    private String for_uf;
    private String for_cep;
    private String for_telefone;
    private String for_email;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de id_fornecedor
    * @param pId_fornecedor
    */
    public void setId_fornecedor(int pId_fornecedor){
        this.id_fornecedor = pId_fornecedor;
    }
    /**
    * @return pk_id_fornecedor
    */
    public int getId_fornecedor(){
        return this.id_fornecedor;
    }

    /**
    * seta o valor de razao_social
    * @param pRazao_social
    */
    public void setRazao_social(String pRazao_social){
        this.razao_social = pRazao_social;
    }
    /**
    * @return razao_social
    */
    public String getRazao_social(){
        return this.razao_social;
    }

    /**
    * seta o valor de nome_fantasia
    * @param pNome_fantasia
    */
    public void setNome_fantasia(String pNome_fantasia){
        this.nome_fantasia = pNome_fantasia;
    }
    /**
    * @return nome_fantasia
    */
    public String getNome_fantasia(){
        return this.nome_fantasia;
    }

    /**
    * seta o valor de cnpj
    * @param pCnpj
    */
    public void setCnpj(String pCnpj){
        this.cnpj = pCnpj;
    }
    /**
    * @return cnpj
    */
    public String getCnpj(){
        return this.cnpj;
    }

    /**
    * seta o valor de inscricao_estadual
    * @param pInscricao_estadual
    */
    public void setInscricao_estadual(String pInscricao_estadual){
        this.inscricao_estadual = pInscricao_estadual;
    }
    /**
    * @return inscricao_estadual
    */
    public String getInscricao_estadual(){
        return this.inscricao_estadual;
    }

    /**
    * seta o valor de for_endereco
    * @param pFor_endereco
    */
    public void setFor_endereco(String pFor_endereco){
        this.for_endereco = pFor_endereco;
    }
    /**
    * @return for_endereco
    */
    public String getFor_endereco(){
        return this.for_endereco;
    }

    /**
    * seta o valor de for_bairro
    * @param pFor_bairro
    */
    public void setFor_bairro(String pFor_bairro){
        this.for_bairro = pFor_bairro;
    }
    /**
    * @return for_bairro
    */
    public String getFor_bairro(){
        return this.for_bairro;
    }

    /**
    * seta o valor de for_cidade
    * @param pFor_cidade
    */
    public void setFor_cidade(String pFor_cidade){
        this.for_cidade = pFor_cidade;
    }
    /**
    * @return for_cidade
    */
    public String getFor_cidade(){
        return this.for_cidade;
    }

    /**
    * seta o valor de for_uf
    * @param pFor_uf
    */
    public void setFor_uf(String pFor_uf){
        this.for_uf = pFor_uf;
    }
    /**
    * @return for_uf
    */
    public String getFor_uf(){
        return this.for_uf;
    }

    /**
    * seta o valor de for_cep
    * @param pFor_cep
    */
    public void setFor_cep(String pFor_cep){
        this.for_cep = pFor_cep;
    }
    /**
    * @return for_cep
    */
    public String getFor_cep(){
        return this.for_cep;
    }

    /**
    * seta o valor de for_telefone
    * @param pFor_telefone
    */
    public void setFor_telefone(String pFor_telefone){
        this.for_telefone = pFor_telefone;
    }
    /**
    * @return for_telefone
    */
    public String getFor_telefone(){
        return this.for_telefone;
    }

    /**
    * seta o valor de for_email
    * @param pFor_email
    */
    public void setFor_email(String pFor_email){
        this.for_email = pFor_email;
    }
    /**
    * @return for_email
    */
    public String getFor_email(){
        return this.for_email;
    }

    @Override
    public String toString(){
        return "ModelFornecedor {" + "::id_fornecedor = " + this.id_fornecedor + "::razao_social = " + this.razao_social + "::nome_fantasia = " + this.nome_fantasia + "::cnpj = " + this.cnpj + "::inscricao_estadual = " + this.inscricao_estadual + "::for_endereco = " + this.for_endereco + "::for_bairro = " + this.for_bairro + "::for_cidade = " + this.for_cidade + "::for_uf = " + this.for_uf + "::for_cep = " + this.for_cep + "::for_telefone = " + this.for_telefone + "::for_email = " + this.for_email +  "}";
    }
}