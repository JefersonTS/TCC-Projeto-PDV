package DAO;

import model.ModelOrcamento;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Jeferson 
*/
public class DAOOrcamento extends ConexaoMySql {

    /**
    * grava Orcamento
    * @param pModelOrcamento
    * @return int
    */
    public int salvarOrcamentoDAO(ModelOrcamento pModelOrcamento){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_orcamento ("
                    + "pk_id_orcamento,"
                    + "fk_cliente,"
                    + "data_orcamento,"
                    + "valor_liquido_orcamento,"
                    + "valor_bruto_orcamento,"
                    + "desconto_orcamento"
                + ") VALUES ("
                    + "'" + pModelOrcamento.getIdOrcamento() + "',"
                    + "'" + pModelOrcamento.getIdCliente() + "',"
                    + "'" + pModelOrcamento.getDataOrcamento() + "',"
                    + "'" + pModelOrcamento.getValorLiquidoOrcamento() + "',"
                    + "'" + pModelOrcamento.getValorBrutoOrcamento() + "',"
                    + "'" + pModelOrcamento.getDescontoOrcamento() + "'"
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
    * recupera Orcamento
    * @param pIdOrcamento
    * @return ModelOrcamento
    */
    public ModelOrcamento getOrcamentoDAO(int pIdOrcamento){
        ModelOrcamento modelOrcamento = new ModelOrcamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_orcamento,"
                    + "fk_cliente,"
                    + "data_orcamento,"
                    + "valor_liquido_orcamento,"
                    + "valor_bruto_orcamento,"
                    + "desconto_orcamento"
                 + " FROM"
                     + " tb_orcamento"
                 + " WHERE"
                     + " pk_id_orcamento = '" + pIdOrcamento + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelOrcamento.setIdOrcamento(this.getResultSet().getInt(1));
                modelOrcamento.setIdCliente(this.getResultSet().getInt(2));
                modelOrcamento.setDataOrcamento(this.getResultSet().getDate(3));
                modelOrcamento.setValorLiquidoOrcamento(this.getResultSet().getDouble(4));
                modelOrcamento.setValorBrutoOrcamento(this.getResultSet().getDouble(5));
                modelOrcamento.setDescontoOrcamento(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelOrcamento;
    }

    /**
    * recupera uma lista de Orcamento
        * @return ArrayList
    */
    public ArrayList<ModelOrcamento> getListaOrcamentoDAO(){
        ArrayList<ModelOrcamento> listamodelOrcamento = new ArrayList();
        ModelOrcamento modelOrcamento = new ModelOrcamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_orcamento,"
                    + "fk_cliente,"
                    + "data_orcamento,"
                    + "valor_liquido_orcamento,"
                    + "valor_bruto_orcamento,"
                    + "desconto_orcamento"
                 + " FROM"
                     + " tb_orcamento"
                + ";"
            );

            while(this.getResultSet().next()){
                modelOrcamento = new ModelOrcamento();
                modelOrcamento.setIdOrcamento(this.getResultSet().getInt(1));
                modelOrcamento.setIdCliente(this.getResultSet().getInt(2));
                modelOrcamento.setDataOrcamento(this.getResultSet().getDate(3));
                modelOrcamento.setValorLiquidoOrcamento(this.getResultSet().getDouble(4));
                modelOrcamento.setValorBrutoOrcamento(this.getResultSet().getDouble(5));
                modelOrcamento.setDescontoOrcamento(this.getResultSet().getInt(6));
                listamodelOrcamento.add(modelOrcamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelOrcamento;
    }

    /**
    * atualiza Orcamento
    * @param pModelOrcamento
    * @return boolean
    */
    public boolean atualizarOrcamentoDAO(ModelOrcamento pModelOrcamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_orcamento SET "
                    + "pk_id_orcamento = '" + pModelOrcamento.getIdOrcamento() + "',"
                    + "fk_cliente = '" + pModelOrcamento.getIdCliente() + "',"
                    + "data_orcamento = '" + pModelOrcamento.getDataOrcamento() + "',"
                    + "valor_liquido_orcamento = '" + pModelOrcamento.getValorLiquidoOrcamento() + "',"
                    + "valor_bruto_orcamento = '" + pModelOrcamento.getValorBrutoOrcamento() + "',"
                    + "desconto_orcamento = '" + pModelOrcamento.getDescontoOrcamento() + "'"
                + " WHERE "
                    + "pk_id_orcamento = '" + pModelOrcamento.getIdOrcamento() + "'"
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
    * exclui Orcamento
    * @param pIdOrcamento
    * @return boolean
    */
    public boolean excluirOrcamentoDAO(int pIdOrcamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_orcamento "
                + " WHERE "
                    + "pk_id_orcamento = '" + pIdOrcamento + "'"
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