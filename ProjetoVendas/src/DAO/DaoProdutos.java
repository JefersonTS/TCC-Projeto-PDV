package DAO;

import model.ModelProdutos;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Jeferson
 */
public class DAOProdutos extends ConexaoMySql {

    /**
     * grava Produtos
     *
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tb_produto ("
                    + "fk_fornecedor,"
                    + "codigo_barras,"
                    + "prod_nome,"
                    + "prod_valor,"
                    + "prod_estoque"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getFornecedor() + "',"
                    + "'" + pModelProdutos.getCodigoBarras() + "',"
                    + "'" + pModelProdutos.getProdNome() + "',"
                    + "'" + pModelProdutos.getProdValor() + "',"
                    + "'" + pModelProdutos.getProdEstoque() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Produtos
     *
     * @param pIdProduto
     * @return ModelProdutos
     */
    public ModelProdutos getProdutosDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "fk_fornecedor,"
                    + "codigo_barras,"
                    + "prod_nome,"
                    + "prod_valor,"
                    + "prod_estoque"
                    + " FROM"
                    + " tb_produto"
                    + " WHERE"
                    + " pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setFornecedor(this.getResultSet().getInt(2));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(3));
                modelProdutos.setProdNome(this.getResultSet().getString(4));
                modelProdutos.setProdValor(this.getResultSet().getDouble(5));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * recupera uma lista de Produtos
     *
     * @return ArrayList
     */
    public ArrayList<ModelProdutos> getListaProdutosDAO() {
        ArrayList<ModelProdutos> listamodelProdutos = new ArrayList();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "fk_fornecedor,"
                    + "codigo_barras,"
                    + "prod_nome,"
                    + "prod_valor,"
                    + "prod_estoque"
                    + " FROM"
                    + " tb_produto"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setFornecedor(this.getResultSet().getInt(2));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(3));
                modelProdutos.setProdNome(this.getResultSet().getString(4));
                modelProdutos.setProdValor(this.getResultSet().getDouble(5));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(6));
                listamodelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean atualizarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_produto SET "
                    + "fk_fornecedor = '" + pModelProdutos.getFornecedor() + "',"
                    + "codigo_barras = '" + pModelProdutos.getCodigoBarras() + "',"
                    + "prod_nome = '" + pModelProdutos.getProdNome() + "',"
                    + "prod_valor = '" + pModelProdutos.getProdValor() + "',"
                    + "prod_estoque = '" + pModelProdutos.getProdEstoque() + "'"
                    + " WHERE "
                    + "pk_id_produto = '" + pModelProdutos.getIdProduto() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Produtos
     *
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutosDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_produto "
                    + " WHERE "
                    + "pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Retorna os produtos pelo nome
     * @param pNomeProduto
     * @return 
     */

    public ModelProdutos getProdutoProdutosDAO(String pNomeProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "fk_fornecedor,"
                    + "codigo_barras,"
                    + "prod_nome,"
                    + "prod_valor,"
                    + "prod_estoque"
                    + " FROM"
                    + " tb_produto"
                    + " WHERE"
                    + " prod_nome = '" + pNomeProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setFornecedor(this.getResultSet().getInt(2));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(3));
                modelProdutos.setProdNome(this.getResultSet().getString(4));
                modelProdutos.setProdValor(this.getResultSet().getDouble(5));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    public boolean alterarEstoqueProdutosDAO(ArrayList<ModelProdutos> plistaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < plistaModelProdutos.size(); i++) {
                this.executarSQL(
                        "UPDATE tb_produto SET "
                        + "prod_estoque = '" + plistaModelProdutos.get(i).getProdEstoque() + "'"
                        + " WHERE pk_id_produto = '" + plistaModelProdutos.get(i).getIdProduto() + "';"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelProdutos getProdutosCodigoBarrasDAO(String pCodigoBarras) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "fk_fornecedor,"
                    + "codigo_barras,"
                    + "prod_nome,"
                    + "prod_valor,"
                    + "prod_estoque"
                    + " FROM"
                    + " tb_produto"
                    + " WHERE"
                    + " codigo_barras = '" + pCodigoBarras + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setFornecedor(this.getResultSet().getInt(2));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(3));
                modelProdutos.setProdNome(this.getResultSet().getString(4));
                modelProdutos.setProdValor(this.getResultSet().getDouble(5));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }
}

