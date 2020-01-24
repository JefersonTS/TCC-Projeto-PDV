/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author jefer
 */
public class DAOProdutosVendasProdutos extends ConexaoMySql {

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAO(int pCodigoVenda) {

        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "tb_produto.pk_id_produto,"
                    + "tb_produto.prod_nome,"
                    + "tb_produto.prod_valor,"
                    + "tb_produto.prod_estoque,"
                    + "tb_vendas_produtos.pk_id_venda_produto,"
                    + "tb_vendas_produtos.fk_produto,"
                    + "tb_vendas_produtos.fk_vendas,"
                    + "tb_vendas_produtos.ven_pro_valor,"
                    + "tb_vendas_produtos.ven_pro_qtd "
                    + "FROM "
                    + "tb_vendas_produtos INNER JOIN tb_produto "
                    + "ON tb_produto.pk_id_produto = tb_vendas_produtos.fk_produto "
                    + "WHERE tb_vendas_produtos.fk_vendas = '" + pCodigoVenda + "';" );

            while (getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos = new ModelVendasProdutos();

                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdValor(this.getResultSet().getDouble(3));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(4));
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(5));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(6));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(7));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(8));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(9));

                modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);

                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;
    }
}
