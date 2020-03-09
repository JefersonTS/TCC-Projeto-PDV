/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerRelatorios;

import DAORelatorios.DAORelatorioVenda;
import java.util.ArrayList;
import model.ModelVendas;

/**
 *
 * @author jefer
 */
public class ControllerRelatorioVenda {

    private DAORelatorioVenda daoRelatorioVenda = new DAORelatorioVenda();

    /**
     * retorna todas as vendas de todos os clientes
     * e chama a função de imprimir
     * @return
     */
    public boolean gerarRelatorioTodasVendasController() {
        return this.daoRelatorioVenda.gerarRelatorioTodosVendas();
    }

    
    /**
     * Retorna todas as vendas de UM Cliente
     * e chama a função de imprimir
     * @param pFKCliente
     * @return
     */
    public boolean gerarRelatorioVendasPorClienteController(int pFKCliente) {
        return this.daoRelatorioVenda.gerarRelatorioVendasPorCliente(pFKCliente);
    }
    /**
     * Retorna UMA venda de UM Cliente
     * e chama a função de imprimir
     * @param pFKCliente
     * @param pDataVenda
     * @param pIDVenda
     * @return
     */
    public boolean gerarRelatorioUmaVendaPorClienteController(int pFKCliente, String pDataVenda, int pIDVenda) {
        return this.daoRelatorioVenda.gerarRelatorioUmaVendaPorClienteDAO(pFKCliente, pDataVenda, pIDVenda);
    }

    /**
     * Retorna todas as vendas de UM Cliente
     * em um ArrayList<>
     * @param pFKCliente
     * @return
     */
    public ArrayList<ModelVendas> getVendasPorClienteController(int pFKCliente) {
        return this.daoRelatorioVenda.getVendasPorClienteDAO(pFKCliente);
    }
}
