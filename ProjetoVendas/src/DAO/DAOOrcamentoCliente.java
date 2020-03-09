/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelOrcamento;
import model.ModelOrcamentoCliente;

/**
 *
 * @author jefer
 */
public class DAOOrcamentoCliente extends ConexaoMySql{
        public ArrayList<ModelOrcamentoCliente> getListaOrcamentoClienteDAO(){
        ArrayList<ModelOrcamentoCliente> listamodelOrcamentoCliente = new ArrayList();
        ModelOrcamento modelOrcamento = new ModelOrcamento();
        ModelCliente modelCliente = new ModelCliente();
        ModelOrcamentoCliente modelOrcamentoCliente = new ModelOrcamentoCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "tb_orcamento.pk_id_orcamento,"
                    + "tb_orcamento.fk_cliente,"
                    + "tb_orcamento.data_orcamento,"
                    + "tb_orcamento.valor_liquido_orcamento,"
                    + "tb_orcamento.valor_bruto_orcamento,"
                    + "tb_orcamento.desconto_orcamento,"
                    + "tb_cliente.pk_id_cliente,"
                    + "tb_cliente.cli_nome,"
                    + "tb_cliente.cli_endereco,"
                    + "tb_cliente.cli_bairro,"
                    + "tb_cliente.cli_cidade,"
                    + "tb_cliente.cli_uf,"
                    + "tb_cliente.cli_cep,"
                    + "tb_cliente.cli_telefone"
                 + " FROM"
                     + " tb_orcamento INNER JOIN tb_cliente "
                        +"ON tb_orcamento.fk_cliente = tb_cliente.pk_id_cliente; "
                + ";"
            );

            while(this.getResultSet().next()){
                modelOrcamento = new ModelOrcamento();
                modelCliente = new ModelCliente();
                modelOrcamentoCliente = new ModelOrcamentoCliente();
                //Vendas
                modelOrcamento.setIdOrcamento(this.getResultSet().getInt(1));
                modelOrcamento.setIdCliente(this.getResultSet().getInt(2));
                modelOrcamento.setDataOrcamento(this.getResultSet().getDate(3));
                modelOrcamento.setValorLiquidoOrcamento(this.getResultSet().getDouble(4));
                modelOrcamento.setValorBrutoOrcamento(this.getResultSet().getDouble(5));
                modelOrcamento.setDescontoOrcamento(this.getResultSet().getInt(6));
                //Cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setCliNome(this.getResultSet().getString(8));
                modelCliente.setCliEndereco(this.getResultSet().getString(9));
                modelCliente.setCliBairro(this.getResultSet().getString(10));
                modelCliente.setCliCidade(this.getResultSet().getString(11));
                modelCliente.setCliUf(this.getResultSet().getString(12));
                modelCliente.setCliCep(this.getResultSet().getString(13));
                modelCliente.setCliTelefone(this.getResultSet().getString(14));
                
                modelOrcamentoCliente.setModelCliente(modelCliente);
                modelOrcamentoCliente.setModelOrcamento(modelOrcamento);
                listamodelOrcamentoCliente.add(modelOrcamentoCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelOrcamentoCliente;
    }

}
