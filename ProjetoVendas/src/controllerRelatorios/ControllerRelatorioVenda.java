/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerRelatorios;

import DAORelatorios.DAORelatorioVenda;

/**
 *
 * @author jefer
 */
public class ControllerRelatorioVenda {
    
    private DAORelatorioVenda daoRelatorioVenda = new DAORelatorioVenda();
    
    public boolean gerarRelatorioTodasVendasController() {
        return this.daoRelatorioVenda.gerarRelatorioTodosVendas();
    }
    
    public boolean gerarRelatorioVendasPorClienteController(int pFKCliente) {
        return this.daoRelatorioVenda.gerarRelatorioVendasPorCliente(pFKCliente);
    }
}
