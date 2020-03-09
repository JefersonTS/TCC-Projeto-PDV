/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jefer
 */
public class ModelOrcamentoCliente {
    
    private ModelOrcamento modelOrcamento;
    private ModelCliente modelCliente;
    private ArrayList<ModelOrcamentoCliente> listaModelOrcamentoCliente;

    /**
     * @return the modelOrcamento
     */
    public ModelOrcamento getModelOrcamento() {
        return modelOrcamento;
    }

    /**
     * @param modelOrcamento the modelOrcamento to set
     */
    public void setModelOrcamento(ModelOrcamento modelOrcamento) {
        this.modelOrcamento = modelOrcamento;
    }

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the listaModelOrcamentoCliente
     */
    public ArrayList<ModelOrcamentoCliente> getListaModelOrcamentoCliente() {
        return listaModelOrcamentoCliente;
    }

    /**
     * @param listaModelOrcamentoCliente the listaModelOrcamentoCliente to set
     */
    public void setListaModelOrcamentoCliente(ArrayList<ModelOrcamentoCliente> listaModelOrcamentoCliente) {
        this.listaModelOrcamentoCliente = listaModelOrcamentoCliente;
    }
}
