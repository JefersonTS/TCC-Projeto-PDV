package controllerRelatorios;

import DAORelatorios.DAORelatorioProduto;

/**
 *
 * @author jefer
 */
public class ControllerRelatorioProduto {

    private DAORelatorioProduto daoRelatorioProduto = new DAORelatorioProduto();

    public boolean gerarRelatorioTodosProdutosController() {
        return this.daoRelatorioProduto.gerarRelatorioTodosProdutos();
    }
    
    public boolean gerarRelatorioUmProdutoController(int pIdProduto) {
        return this.daoRelatorioProduto.gerarRelatorioUmProduto(pIdProduto);
    }

    public boolean gerarRelatorioProdutosPorFornecedorController(int pIdFornecedor) {
        return this.daoRelatorioProduto.gerarRelatorioProdutosPorFornecedorDAO(pIdFornecedor);
    }

}
