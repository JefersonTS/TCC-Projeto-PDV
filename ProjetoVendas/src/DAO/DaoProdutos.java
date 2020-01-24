package DAO;

import conexoes.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.ModelProdutos;

public class DaoProdutos extends ConexaoMySql {

    //função para Inserir Produto no DB
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO `tb_produto`(`prod_nome`, `prod_valor`, `prod_estoque`) VALUES ('" + pModelProdutos.getProdNome() + "'," + pModelProdutos.getProdValor() + "," + pModelProdutos.getProdEstoque() + ")");
            //INSERT INTO `tb_produto`(`prod_nome`, `prod_valor`, `prod_estoque`) VALUES ('Abacate', 20.3, 20)
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    //Função para Excluir um Produto no DB
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_produto WHERE pk_id_produto = '" + pIdProduto + "';"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    //Função para alterar um produto do DB
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE `tb_produto` SET "
                    + "`prod_nome` ='" + pModelProdutos.getProdNome()
                    + "',`prod_valor`=" + pModelProdutos.getProdValor()
                    + ",`prod_estoque`=" + pModelProdutos.getProdEstoque()
                    + " WHERE `pk_id_produto`=" + pModelProdutos.getIdProduto());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    //Retorna um produto pelo código do produto
    public ModelProdutos retornarProdutoDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT `pk_id_produto`, `prod_nome`, `prod_valor`, `prod_estoque` FROM `tb_produto` WHERE `pk_id_produto` = '" + pIdProduto + "';");

            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdValor(this.getResultSet().getDouble(3));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    //Retorna um produto pelo Nome do produto
    public ModelProdutos retornarProdutoDAO(String pNomeProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT `pk_id_produto`, `prod_nome`, `prod_valor`, `prod_estoque` FROM `tb_produto` WHERE `prod_nome` = '" + pNomeProduto + "';");

            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdValor(this.getResultSet().getDouble(3));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    //Retorna uma lista completa de produtos do BD
    public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT `pk_id_produto`, `prod_nome`, `prod_valor`, `prod_estoque` FROM `tb_produto`");

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdValor(this.getResultSet().getDouble(3));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(4));
                listaModelProdutos.add(modelProdutos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutos;
    }

    
    //Alterar a qtd no estoque de todos os produtos da venda
    public boolean alterarEstoqueProdutoDAO(ArrayList<ModelProdutos> plistaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < plistaModelProdutos.size(); i++) {
                this.executarUpdateDeleteSQL("UPDATE `tb_produto` SET "
                        + "`prod_estoque`=" + plistaModelProdutos.get(i).getProdEstoque()
                        + " WHERE `pk_id_produto`=" + plistaModelProdutos.get(i).getIdProduto());
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
