package controller;

import model.ModelFornecedor;
import DAO.DAOFornecedor;
import java.util.ArrayList;

/**
*
* @author Jeferson
*/
public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pId_fornecedor
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(int pId_fornecedor){
        return this.daoFornecedor.getFornecedorDAO(pId_fornecedor);
    }
    
    /**
    * recupera Fornecedor
    * @param pNome_fornecedor
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(String pNome_fornecedor){
        return this.daoFornecedor.getFornecedorDAO(pNome_fornecedor);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pId_fornecedor
    * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pId_fornecedor
    * @return boolean
    */
    public boolean excluirFornecedorController(int pId_fornecedor){
        return this.daoFornecedor.excluirFornecedorDAO(pId_fornecedor);
    }
}