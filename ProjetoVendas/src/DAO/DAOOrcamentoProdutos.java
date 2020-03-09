package DAO;

import model.ModelOrcamentoProdutos;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Jeferson 
*/
public class DAOOrcamentoProdutos extends ConexaoMySql {

    /**
    * grava OrcamentoProdutos
    * @param pModelOrcamentoProdutos
    * @return int
    */
    public int salvarOrcamentoProdutosDAO(ModelOrcamentoProdutos pModelOrcamentoProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_orcamento_produtos ("
                    + "pk_id_orcamento_produto,"
                    + "fk_produto,"
                    + "fk_orcamento,"
                    + "orc_pro_valor,"
                    + "orc_pro_qtd"
                + ") VALUES ("
                    + "'" + pModelOrcamentoProdutos.getIdOrcamentoProduto() + "',"
                    + "'" + pModelOrcamentoProdutos.getIdProduto() + "',"
                    + "'" + pModelOrcamentoProdutos.getIdOrcamento() + "',"
                    + "'" + pModelOrcamentoProdutos.getValorProduto() + "',"
                    + "'" + pModelOrcamentoProdutos.getQtdProduto() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    
    /**
    * grava OrcamentoProdutos
    * @param pModelOrcamentoProdutos
    * @return int
    */
    public boolean salvarOrcamentoProdutosDAO(ArrayList<ModelOrcamentoProdutos> plistaModelOrcamentoProdutos){
        try {
            this.conectar();
            int cont = plistaModelOrcamentoProdutos.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "INSERT INTO tb_orcamento_produtos ("
                        + "fk_produto,"
                        + "fk_orcamento,"
                        + "orc_pro_valor,"
                        + "orc_pro_qtd"
                        + ") VALUES ("
                        + "'" + plistaModelOrcamentoProdutos.get(i).getIdProduto() + "',"
                        + "'" + plistaModelOrcamentoProdutos.get(i).getIdOrcamento() + "',"
                        + "'" + plistaModelOrcamentoProdutos.get(i).getValorProduto() + "',"
                        + "'" + plistaModelOrcamentoProdutos.get(i).getQtdProduto() + "'"
                        + ");"
                );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera OrcamentoProdutos
    * @param pIdOrcamentoProduto
    * @return ModelOrcamentoProdutos
    */
    public ModelOrcamentoProdutos getOrcamentoProdutosDAO(int pIdOrcamentoProduto){
        ModelOrcamentoProdutos modelOrcamentoProdutos = new ModelOrcamentoProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_orcamento_produto,"
                    + "fk_produto,"
                    + "fk_orcamento,"
                    + "orc_pro_valor,"
                    + "orc_pro_qtd"
                 + " FROM"
                     + " tb_orcamento_produtos"
                 + " WHERE"
                     + " pk_id_orcamento_produto = '" + pIdOrcamentoProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelOrcamentoProdutos.setIdOrcamentoProduto(this.getResultSet().getInt(1));
                modelOrcamentoProdutos.setIdProduto(this.getResultSet().getInt(2));
                modelOrcamentoProdutos.setIdOrcamento(this.getResultSet().getInt(3));
                modelOrcamentoProdutos.setValorProduto(this.getResultSet().getDouble(4));
                modelOrcamentoProdutos.setQtdProduto(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelOrcamentoProdutos;
    }

    /**
    * recupera uma lista de OrcamentoProdutos
        * @return ArrayList
    */
    public ArrayList<ModelOrcamentoProdutos> getListaOrcamentoProdutosDAO(){
        ArrayList<ModelOrcamentoProdutos> listamodelOrcamentoProdutos = new ArrayList();
        ModelOrcamentoProdutos modelOrcamentoProdutos = new ModelOrcamentoProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_orcamento_produto,"
                    + "fk_produto,"
                    + "fk_orcamento,"
                    + "orc_pro_valor,"
                    + "orc_pro_qtd"
                 + " FROM"
                     + " tb_orcamento_produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelOrcamentoProdutos = new ModelOrcamentoProdutos();
                modelOrcamentoProdutos.setIdOrcamentoProduto(this.getResultSet().getInt(1));
                modelOrcamentoProdutos.setIdProduto(this.getResultSet().getInt(2));
                modelOrcamentoProdutos.setIdOrcamento(this.getResultSet().getInt(3));
                modelOrcamentoProdutos.setValorProduto(this.getResultSet().getDouble(4));
                modelOrcamentoProdutos.setQtdProduto(this.getResultSet().getInt(5));
                listamodelOrcamentoProdutos.add(modelOrcamentoProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelOrcamentoProdutos;
    }

    /**
    * atualiza OrcamentoProdutos
    * @param pModelOrcamentoProdutos
    * @return boolean
    */
    public boolean atualizarOrcamentoProdutosDAO(ModelOrcamentoProdutos pModelOrcamentoProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_orcamento_produtos SET "
                    + "pk_id_orcamento_produto = '" + pModelOrcamentoProdutos.getIdOrcamentoProduto() + "',"
                    + "fk_produto = '" + pModelOrcamentoProdutos.getIdProduto() + "',"
                    + "fk_orcamento = '" + pModelOrcamentoProdutos.getIdOrcamento() + "',"
                    + "orc_pro_valor = '" + pModelOrcamentoProdutos.getValorProduto() + "',"
                    + "orc_pro_qtd = '" + pModelOrcamentoProdutos.getQtdProduto() + "'"
                + " WHERE "
                    + "pk_id_orcamento_produto = '" + pModelOrcamentoProdutos.getIdOrcamentoProduto() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui OrcamentoProdutos
    * @param pIdOrcamentoProduto
    * @return boolean
    */
    public boolean excluirOrcamentoProdutosDAO(int pIdOrcamentoProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_orcamento_produtos "
                + " WHERE "
                    + "pk_id_orcamento_produto = '" + pIdOrcamentoProduto + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}