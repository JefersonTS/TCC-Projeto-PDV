package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

public class ControllerProdutos {
    private DaoProdutos daoProdutos = new DaoProdutos();
    
    //Salvar Produtos Controller
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    //Excluir produto Controller
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    //Alterar Produto Controller 
    public boolean alterarProdutoControler(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    //Retornar Produto controller (Pelo Código)
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }

    //Retornar Produto controller (Pelo Nome)
    public ModelProdutos retornarProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    //retornar uma lista de produtos
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }

    //Alterar o estoque do procuto no banco
    public boolean alterarEstoqueProdutoControler(ArrayList<ModelProdutos> plistaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutoDAO(plistaModelProdutos);
    }
}
