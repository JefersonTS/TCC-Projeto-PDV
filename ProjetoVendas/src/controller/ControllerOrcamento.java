package controller;

import model.ModelOrcamento;
import DAO.DAOOrcamento;
import java.util.ArrayList;

/**
*
* @author Jeferson 
*/
public class ControllerOrcamento {

    private DAOOrcamento daoOrcamento = new DAOOrcamento();

    /**
    * grava Orcamento
    * @param pModelOrcamento
    * @return int
    */
    public int salvarOrcamentoController(ModelOrcamento pModelOrcamento){
        return this.daoOrcamento.salvarOrcamentoDAO(pModelOrcamento);
    }

    /**
    * recupera Orcamento
    * @param pIdOrcamento
    * @return ModelOrcamento
    */
    public ModelOrcamento getOrcamentoController(int pIdOrcamento){
        return this.daoOrcamento.getOrcamentoDAO(pIdOrcamento);
    }

    /**
    * recupera uma lista deOrcamento
    * @param pIdOrcamento
    * @return ArrayList
    */
    public ArrayList<ModelOrcamento> getListaOrcamentoController(){
        return this.daoOrcamento.getListaOrcamentoDAO();
    }

    /**
    * atualiza Orcamento
    * @param pModelOrcamento
    * @return boolean
    */
    public boolean atualizarOrcamentoController(ModelOrcamento pModelOrcamento){
        return this.daoOrcamento.atualizarOrcamentoDAO(pModelOrcamento);
    }

    /**
    * exclui Orcamento
    * @param pIdOrcamento
    * @return boolean
    */
    public boolean excluirOrcamentoController(int pIdOrcamento){
        return this.daoOrcamento.excluirOrcamentoDAO(pIdOrcamento);
    }
}