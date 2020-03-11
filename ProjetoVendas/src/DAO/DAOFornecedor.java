package DAO;

import model.ModelFornecedor;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Jeferson
*/
public class DAOFornecedor extends ConexaoMySql {

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_fornecedor ("
                    + "pk_id_fornecedor,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "cnpj,"
                    + "inscricao_estadual,"
                    + "for_endereco,"
                    + "for_bairro,"
                    + "for_cidade,"
                    + "for_uf,"
                    + "for_cep,"
                    + "for_telefone,"
                    + "for_email"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getId_fornecedor() + "',"
                    + "'" + pModelFornecedor.getRazao_social() + "',"
                    + "'" + pModelFornecedor.getNome_fantasia() + "',"
                    + "'" + pModelFornecedor.getCnpj() + "',"
                    + "'" + pModelFornecedor.getInscricao_estadual() + "',"
                    + "'" + pModelFornecedor.getFor_endereco() + "',"
                    + "'" + pModelFornecedor.getFor_bairro() + "',"
                    + "'" + pModelFornecedor.getFor_cidade() + "',"
                    + "'" + pModelFornecedor.getFor_uf() + "',"
                    + "'" + pModelFornecedor.getFor_cep() + "',"
                    + "'" + pModelFornecedor.getFor_telefone() + "',"
                    + "'" + pModelFornecedor.getFor_email() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Fornecedor
    * @param pId_fornecedor
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorDAO(int pId_fornecedor){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_fornecedor,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "cnpj,"
                    + "inscricao_estadual,"
                    + "for_endereco,"
                    + "for_bairro,"
                    + "for_cidade,"
                    + "for_uf,"
                    + "for_cep,"
                    + "for_telefone,"
                    + "for_email"
                 + " FROM"
                     + " tb_fornecedor"
                 + " WHERE"
                     + " pk_id_fornecedor = '" + pId_fornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setId_fornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setRazao_social(this.getResultSet().getString(2));
                modelFornecedor.setNome_fantasia(this.getResultSet().getString(3));
                modelFornecedor.setCnpj(this.getResultSet().getString(4));
                modelFornecedor.setInscricao_estadual(this.getResultSet().getString(5));
                modelFornecedor.setFor_endereco(this.getResultSet().getString(6));
                modelFornecedor.setFor_bairro(this.getResultSet().getString(7));
                modelFornecedor.setFor_cidade(this.getResultSet().getString(8));
                modelFornecedor.setFor_uf(this.getResultSet().getString(9));
                modelFornecedor.setFor_cep(this.getResultSet().getString(10));
                modelFornecedor.setFor_telefone(this.getResultSet().getString(11));
                modelFornecedor.setFor_email(this.getResultSet().getString(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO(){
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_fornecedor,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "cnpj,"
                    + "inscricao_estadual,"
                    + "for_endereco,"
                    + "for_bairro,"
                    + "for_cidade,"
                    + "for_uf,"
                    + "for_cep,"
                    + "for_telefone,"
                    + "for_email"
                 + " FROM"
                     + " tb_fornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setId_fornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setRazao_social(this.getResultSet().getString(2));
                modelFornecedor.setNome_fantasia(this.getResultSet().getString(3));
                modelFornecedor.setCnpj(this.getResultSet().getString(4));
                modelFornecedor.setInscricao_estadual(this.getResultSet().getString(5));
                modelFornecedor.setFor_endereco(this.getResultSet().getString(6));
                modelFornecedor.setFor_bairro(this.getResultSet().getString(7));
                modelFornecedor.setFor_cidade(this.getResultSet().getString(8));
                modelFornecedor.setFor_uf(this.getResultSet().getString(9));
                modelFornecedor.setFor_cep(this.getResultSet().getString(10));
                modelFornecedor.setFor_telefone(this.getResultSet().getString(11));
                modelFornecedor.setFor_email(this.getResultSet().getString(12));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_fornecedor SET "
                    + "pk_id_fornecedor = '" + pModelFornecedor.getId_fornecedor() + "',"
                    + "razao_social = '" + pModelFornecedor.getRazao_social() + "',"
                    + "nome_fantasia = '" + pModelFornecedor.getNome_fantasia() + "',"
                    + "cnpj = '" + pModelFornecedor.getCnpj() + "',"
                    + "inscricao_estadual = '" + pModelFornecedor.getInscricao_estadual() + "',"
                    + "for_endereco = '" + pModelFornecedor.getFor_endereco() + "',"
                    + "for_bairro = '" + pModelFornecedor.getFor_bairro() + "',"
                    + "for_cidade = '" + pModelFornecedor.getFor_cidade() + "',"
                    + "for_uf = '" + pModelFornecedor.getFor_uf() + "',"
                    + "for_cep = '" + pModelFornecedor.getFor_cep() + "',"
                    + "for_telefone = '" + pModelFornecedor.getFor_telefone() + "',"
                    + "for_email = '" + pModelFornecedor.getFor_email() + "'"
                + " WHERE "
                    + "pk_id_fornecedor = '" + pModelFornecedor.getId_fornecedor() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Fornecedor
    * @param pId_fornecedor
    * @return boolean
    */
    public boolean excluirFornecedorDAO(int pId_fornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_fornecedor "
                + " WHERE "
                    + "pk_id_fornecedor = '" + pId_fornecedor + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

 public ModelFornecedor getFornecedorDAO(String pNome_fornecedor){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_fornecedor,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "cnpj,"
                    + "inscricao_estadual,"
                    + "for_endereco,"
                    + "for_bairro,"
                    + "for_cidade,"
                    + "for_uf,"
                    + "for_cep,"
                    + "for_telefone,"
                    + "for_email"
                 + " FROM"
                     + " tb_fornecedor"
                 + " WHERE"
                     + " nome_fantasia = '" + pNome_fornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setId_fornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setRazao_social(this.getResultSet().getString(2));
                modelFornecedor.setNome_fantasia(this.getResultSet().getString(3));
                modelFornecedor.setCnpj(this.getResultSet().getString(4));
                modelFornecedor.setInscricao_estadual(this.getResultSet().getString(5));
                modelFornecedor.setFor_endereco(this.getResultSet().getString(6));
                modelFornecedor.setFor_bairro(this.getResultSet().getString(7));
                modelFornecedor.setFor_cidade(this.getResultSet().getString(8));
                modelFornecedor.setFor_uf(this.getResultSet().getString(9));
                modelFornecedor.setFor_cep(this.getResultSet().getString(10));
                modelFornecedor.setFor_telefone(this.getResultSet().getString(11));
                modelFornecedor.setFor_email(this.getResultSet().getString(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }
}