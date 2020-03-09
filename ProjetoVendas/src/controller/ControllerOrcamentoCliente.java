/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOOrcamentoCliente;
import java.util.ArrayList;
import model.ModelOrcamentoCliente;

/**
 *
 * @author jefer
 */
public class ControllerOrcamentoCliente {
    
    private DAOOrcamentoCliente dAOOrcamentoCliente = new DAOOrcamentoCliente();

    public ArrayList<ModelOrcamentoCliente> getListaOrcamentoClienteController() {
        return this.dAOOrcamentoCliente.getListaOrcamentoClienteDAO();
    }
    
}
