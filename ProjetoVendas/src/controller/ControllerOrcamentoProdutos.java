package controller;

import model.ModelOrcamentoProdutos;
import DAO.DAOOrcamentoProdutos;
import java.util.ArrayList;

/**
*
* @author Jeferson 
*/
public class ControllerOrcamentoProdutos {

    private DAOOrcamentoProdutos daoOrcamentoProdutos = new DAOOrcamentoProdutos();

    /**
    * grava OrcamentoProdutos
    * @param pModelOrcamentoProdutos
    * @return int
    */
    public int salvarOrcamentoProdutosController(ModelOrcamentoProdutos pModelOrcamentoProdutos){
        return this.daoOrcamentoProdutos.salvarOrcamentoProdutosDAO(pModelOrcamentoProdutos);
    }

    /**
    * recupera OrcamentoProdutos
    * @param pIdOrcamentoProduto
    * @return ModelOrcamentoProdutos
    */
    public ModelOrcamentoProdutos getOrcamentoProdutosController(int pIdOrcamentoProduto){
        return this.daoOrcamentoProdutos.getOrcamentoProdutosDAO(pIdOrcamentoProduto);
    }

    /**
    * recupera uma lista deOrcamentoProdutos
    * @param pIdOrcamentoProduto
    * @return ArrayList
    */
    public ArrayList<ModelOrcamentoProdutos> getListaOrcamentoProdutosController(){
        return this.daoOrcamentoProdutos.getListaOrcamentoProdutosDAO();
    }

    /**
    * atualiza OrcamentoProdutos
    * @param pModelOrcamentoProdutos
    * @return boolean
    */
    public boolean atualizarOrcamentoProdutosController(ModelOrcamentoProdutos pModelOrcamentoProdutos){
        return this.daoOrcamentoProdutos.atualizarOrcamentoProdutosDAO(pModelOrcamentoProdutos);
    }

    /**
    * exclui OrcamentoProdutos
    * @param pIdOrcamentoProduto
    * @return boolean
    */
    public boolean excluirOrcamentoProdutosController(int pIdOrcamentoProduto){
        return this.daoOrcamentoProdutos.excluirOrcamentoProdutosDAO(pIdOrcamentoProduto);
    }
    
        public boolean salvarOrcamentoProdutosController(ArrayList<ModelOrcamentoProdutos> plistaModelOrcamentoProdutoses) {
        return this.daoOrcamentoProdutos.salvarOrcamentoProdutosDAO(plistaModelOrcamentoProdutoses);
    }
}