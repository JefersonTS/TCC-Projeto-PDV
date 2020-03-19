/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerRelatorios;

import DAORelatorios.DAORelatorioFornecedores;

/**
 *
 * @author jefer
 */
public class ControllerRelatorioFornecedor {
    
    private DAORelatorioFornecedores DAORelatorioFornecedores = new DAORelatorioFornecedores();
    
    /**
     * Retorna TODOS os dados do Fornecedor
     * e chama a função de imprimir
     * @param pIDFornecedor
     * @return 
     */
    
    public boolean gerarRelatorioFornecedorController(int pIDFornecedor) {
        return this.DAORelatorioFornecedores.gerarRelatorioFornecedorDAO(pIDFornecedor);
    }
}
