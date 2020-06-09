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
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author jefer
 */
public class DAORelatorioOrcamento extends ConexaoMySql {

    /**
     * Retorna UM Orçamento e seus produtos
     * 
     * @param pFKOrcamento
     * @return 
     */
    public boolean gerarRelatorioOrcamentoDAO(int pFKOrcamento) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT"
                    + " tb_produto.`pk_id_produto` AS tb_produto_pk_id_produto,"
                    + " tb_produto.`prod_nome` AS tb_produto_prod_nome,"
                    + " tb_produto.`prod_valor` AS tb_produto_prod_valor,"
                    + " tb_orcamento_produtos.`pk_id_orcamento_produto` AS tb_orcamento_produtos_pk_id_orcamento_produto,"
                    + " tb_orcamento_produtos.`fk_produto` AS tb_orcamento_produtos_fk_produto,"
                    + " tb_orcamento_produtos.`fk_orcamento` AS tb_orcamento_produtos_fk_orcamento,"
                    + " tb_orcamento_produtos.`orc_pro_valor` AS tb_orcamento_produtos_orc_pro_valor,"
                    + " tb_orcamento_produtos.`orc_pro_qtd` AS tb_orcamento_produtos_orc_pro_qtd,"
                    + " tb_orcamento.`pk_id_orcamento` AS tb_orcamento_pk_id_orcamento,"
                    + " tb_orcamento.`fk_cliente` AS tb_orcamento_fk_cliente,"
                    + " tb_orcamento.`data_orcamento` AS tb_orcamento_data_orcamento,"
                    + " tb_orcamento.`valor_liquido_orcamento` AS tb_orcamento_valor_liquido_orcamento,"
                    + " tb_orcamento.`valor_bruto_orcamento` AS tb_orcamento_valor_bruto_orcamento,"
                    + " tb_orcamento.`desconto_orcamento` AS tb_orcamento_desconto_orcamento,"
                    + " tb_cliente.`pk_id_cliente` AS tb_cliente_pk_id_cliente,"
                    + " tb_cliente.`cli_nome` AS tb_cliente_cli_nome,"
                    + " tb_cliente.`cli_telefone` AS tb_cliente_cli_telefone"
                    + " FROM"
                    + " `tb_produto` tb_produto INNER JOIN `tb_orcamento_produtos` tb_orcamento_produtos ON tb_produto.`pk_id_produto` = tb_orcamento_produtos.`fk_produto`"
                    + " INNER JOIN `tb_orcamento` tb_orcamento ON tb_orcamento_produtos.`fk_orcamento` = tb_orcamento.`pk_id_orcamento`"
                    + " INNER JOIN `tb_cliente` tb_cliente ON tb_orcamento.`fk_cliente` = tb_cliente.`pk_id_cliente`"
                    + " WHERE pk_id_orcamento = '"+ pFKOrcamento +"'"
                    + ";"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioOrcamento.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/Public/RelatorioOrcamento.pdf");
            File file = new File("C:/Users/Public/RelatorioOrcamento.pdf");
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

}
