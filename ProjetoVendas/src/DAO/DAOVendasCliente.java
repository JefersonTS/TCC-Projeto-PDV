/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVendas;
import model.ModelVendasCliente;

/**
 *
 * @author jefer
 */
public class DAOVendasCliente extends ConexaoMySql{
        public ArrayList<ModelVendasCliente> getListaVendasClienteDAO(){
        ArrayList<ModelVendasCliente> listamodelVendasCliente = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "tb_vendas.pk_id_vendas,"
                    + "tb_vendas.fk_cliente,"
                    + "tb_vendas.ven_data_venda,"
                    + "tb_vendas.ven_valor_liquido,"
                    + "tb_vendas.ven_valor_bruto,"
                    + "tb_vendas.ven_desconto,"
                    + "tb_cliente.pk_id_cliente,"
                    + "tb_cliente.cli_nome,"
                    + "tb_cliente.cli_endereco,"
                    + "tb_cliente.cli_bairro,"
                    + "tb_cliente.cli_cidade,"
                    + "tb_cliente.cli_uf,"
                    + "tb_cliente.cli_cep,"
                    + "tb_cliente.cli_telefone"
                 + " FROM"
                     + " tb_vendas INNER JOIN tb_cliente "
                        +"ON tb_vendas.fk_cliente = tb_cliente.pk_id_cliente; "
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();
                //Vendas
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                //Cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setCliNome(this.getResultSet().getString(8));
                modelCliente.setCliEndereco(this.getResultSet().getString(9));
                modelCliente.setCliBairro(this.getResultSet().getString(10));
                modelCliente.setCliCidade(this.getResultSet().getString(11));
                modelCliente.setCliUf(this.getResultSet().getString(12));
                modelCliente.setCliCep(this.getResultSet().getString(13));
                modelCliente.setCliTelefone(this.getResultSet().getString(14));
                
                modelVendasCliente.setModelCliente(modelCliente);
                modelVendasCliente.setModelVendas(modelVendas);
                listamodelVendasCliente.add(modelVendasCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasCliente;
    }

}
