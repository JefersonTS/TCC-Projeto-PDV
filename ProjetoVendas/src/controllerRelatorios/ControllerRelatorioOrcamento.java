/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerRelatorios;

import DAORelatorios.DAORelatorioOrcamento;

/**
 *
 * @author jefer
 */
public class ControllerRelatorioOrcamento {
    
    private DAORelatorioOrcamento daoRelatorioOrcamento = new DAORelatorioOrcamento();
    
    /**
     * Retorna TODOS os produtos do Orçamento
     * e chama a função de imprimir
     * @param pFKOrcamento
     * @return 
     */
    
    public boolean gerarRelatorioOrcamentoController(int pFKOrcamento) {
        return this.daoRelatorioOrcamento.gerarRelatorioOrcamentoDAO(pFKOrcamento);
    }
}
