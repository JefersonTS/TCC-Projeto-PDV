/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAORelatorios;

import conexoes.ConexaoMySql;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.ModelVendas;
import model.ModelVendasCliente;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author jefer
 */
public class DAORelatorioVenda extends ConexaoMySql {

    /**
     * Retorna todos as Vendas de todos os clientes
     *
     * @return
     */
    public boolean gerarRelatorioTodosVendas() {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                    + " FROM"
                    + " tb_vendas"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioTodasVendas.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioTodasVendas.pdf");
            File file = new File("C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioTodasVendas.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Retorna todos as Vendas por Cliente
     *
     * @param pFKCliente
     * @return
     */
    public boolean gerarRelatorioVendasPorCliente(int pFKCliente) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                    + " FROM"
                    + " tb_vendas"
                    + " WHERE"
                    + " fk_cliente = '" + pFKCliente + "'"
                    + ";"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioVendaPorCliente.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioVendaPorCliente.pdf");
            File file = new File("C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioVendaPorCliente.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Retorna todos as Vendas por Cliente
     *
     * @param pFKCliente
     * @param pDataVenda
     * @param pIDVenda
     * @return
     */
    public boolean gerarRelatorioUmaVendaPorClienteDAO(int pFKCliente, String pDataVenda, int pIDVenda) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT"
                    + " tb_vendas.`pk_id_vendas`,"
                    + " tb_vendas.`fk_cliente`,"
                    + " tb_vendas.`ven_data_venda`,"
                    + " tb_vendas.`ven_valor_liquido`,"
                    + " tb_vendas.`ven_valor_bruto`,"
                    + " tb_vendas.`ven_desconto`,"
                    + " tb_vendas_produtos.`pk_id_venda_produto` AS tb_vendas_produtos_pk_id_venda_produto,"
                    + " tb_vendas_produtos.`fk_produto` AS tb_vendas_produtos_fk_produto,"
                    + " tb_vendas_produtos.`fk_vendas` AS tb_vendas_produtos_fk_vendas,"
                    + " tb_vendas_produtos.`ven_pro_valor` AS tb_vendas_produtos_ven_pro_valor,"
                    + " tb_vendas_produtos.`ven_pro_qtd` AS tb_vendas_produtos_ven_pro_qtd,"
                    + " tb_produto.`pk_id_produto` AS tb_produto_pk_id_produto,"
                    + " tb_produto.`prod_nome` AS tb_produto_prod_nome,"
                    + " tb_produto.`prod_valor` AS tb_produto_prod_valor,"
                    + " tb_produto.`prod_estoque` AS tb_produto_prod_estoque,"
                    + " tb_cliente.`pk_id_cliente` AS tb_cliente_pk_id_cliente,"
                    + " tb_cliente.`cli_nome` AS tb_cliente_cli_nome,"
                    + " tb_cliente.`cli_endereco` AS tb_cliente_cli_endereco,"
                    + " tb_cliente.`cli_bairro` AS tb_cliente_cli_bairro,"
                    + " tb_cliente.`cli_cidade` AS tb_cliente_cli_cidade,"
                    + " tb_cliente.`cli_uf` AS tb_cliente_cli_uf,"
                    + " tb_cliente.`cli_cep` AS tb_cliente_cli_cep,"
                    + " tb_cliente.`cli_telefone` AS tb_cliente_cli_telefone"
                    + " FROM"
                    + " `tb_vendas` tb_vendas INNER JOIN `tb_vendas_produtos` tb_vendas_produtos ON tb_vendas.`pk_id_vendas` = tb_vendas_produtos.`fk_vendas`"
                    + " INNER JOIN `tb_produto` tb_produto ON tb_vendas_produtos.`fk_produto` = tb_produto.`pk_id_produto`"
                    + " INNER JOIN `tb_cliente` tb_cliente ON tb_vendas.`fk_cliente` = tb_cliente.`pk_id_cliente`"
                    + " WHERE"
                    + " fk_cliente = '" + pFKCliente + "' AND ven_data_venda = '" + pDataVenda + "' AND pk_id_vendas = '" + pIDVenda + "'"
                    + ";"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioUmaVendaPorCliente.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioUmaVendaPorCliente.pdf");
            File file = new File("C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioUmaVendaPorCliente.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Retorna todos as Vendas por Cliente
     *
     * @param pFKCliente
     * @return
     */
    public ArrayList<ModelVendas> getVendasPorClienteDAO(int pFKCliente) {
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                    + " FROM"
                    + " tb_vendas"
                    + " WHERE"
                    + " fk_cliente = '" + pFKCliente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                //Vendas
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));

                listamodelVendas.add(modelVendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendas;
    }
}
