package model;
/**
*
* @author Jeferson 
*/
public class ModelUsuario {

    private int idUsuario;
    private String usNome;
    private String usLogin;
    private String usSenha;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de idUsuario
    * @param pIdUsuario
    */
    public void setIdUsuario(int pIdUsuario){
        this.idUsuario = pIdUsuario;
    }
    /**
    * return pk_idUsuario
    */
    public int getIdUsuario(){
        return this.idUsuario;
    }

    /**
    * seta o valor de usNome
    * @param pUsNome
    */
    public void setUsNome(String pUsNome){
        this.usNome = pUsNome;
    }
    /**
    * return usNome
    */
    public String getUsNome(){
        return this.usNome;
    }

    /**
    * seta o valor de usLogin
    * @param pUsLogin
    */
    public void setUsLogin(String pUsLogin){
        this.usLogin = pUsLogin;
    }
    /**
    * return usLogin
    */
    public String getUsLogin(){
        return this.usLogin;
    }

    /**
    * seta o valor de usSenha
    * @param pUsSenha
    */
    public void setUsSenha(String pUsSenha){
        this.usSenha = pUsSenha;
    }
    /**
    * return usSenha
    */
    public String getUsSenha(){
        return this.usSenha;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::idUsuario = " + this.idUsuario + "::usNome = " + this.usNome + "::usLogin = " + this.usLogin + "::usSenha = " + this.usSenha +  "}";
    }
}