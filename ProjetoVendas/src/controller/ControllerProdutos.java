package controller;

import model.ModelProdutos;
import DAO.DAOProdutos;
import java.util.ArrayList;

/**
*
* @author Jeferson
*/
public class ControllerProdutos {

    private DAOProdutos daoProdutos = new DAOProdutos();

    /**
    * grava Produtos
    * @param pModelProdutos
    * @return int
    */
    public int salvarProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    /**
    * recupera Produtos pelo pIdProduto
    * @param pIdProduto
    * @return ModelProdutos
    */
    public ModelProdutos getProdutosController(int pIdProduto){
        return this.daoProdutos.getProdutosDAO(pIdProduto);
    }
    
    /**
    * recupera Produtos pelo pCodigoBarras
    * @param pCodigoBarras
    * @return ModelProdutos
    */
    public ModelProdutos getProdutosController(String pCodigoBarras){
        return this.daoProdutos.getProdutosCodigoBarrasDAO(pCodigoBarras);
    }

    /**
    * recupera uma lista deProdutos
    * @param pIdProduto
    * @return ArrayList
    */
    public ArrayList<ModelProdutos> getListaProdutosController(){
        return this.daoProdutos.getListaProdutosDAO();
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * @return boolean
    */
    public boolean atualizarProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.atualizarProdutosDAO(pModelProdutos);
    }

    /**
    * exclui Produtos
    * @param pIdProduto
    * @return boolean
    */
    public boolean excluirProdutosController(int pIdProduto){
        return this.daoProdutos.excluirProdutosDAO(pIdProduto);
    }

    public ModelProdutos getProdutoController(String pNomeProduto) {
        return this.daoProdutos.getProdutoProdutosDAO(pNomeProduto);
    }

    public boolean alterarEstoqueProdutosController(ArrayList<ModelProdutos> plistaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(plistaModelProdutos);
    }
}