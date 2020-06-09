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
public class DAORelatorioProduto extends ConexaoMySql {

    //Retorna todos os produto
    public boolean gerarRelatorioTodosProdutos() {
        try {
            this.conectar();
            this.executarSQL("SELECT"
                    + " pk_id_produto,"
                    + " prod_nome,"
                    + " prod_valor,"
                    + " prod_estoque"
                    + " FROM tb_produto;"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioTodosProdutos.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/Public/RelatorioTodosProdutos.pdf");
            File file = new File("C:/Users/Public/RelatorioTodosProdutos.pdf");
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

    //Retorna um produto pelo código do produto
    public boolean gerarRelatorioUmProduto(int pIdProduto) {
        try {
            this.conectar();
            this.executarSQL("SELECT"
                    + " pk_id_produto,"
                    + " prod_nome,"
                    + " prod_valor,"
                    + " prod_estoque"
                    + " FROM tb_produto"
                    + " WHERE pk_id_produto = '" + pIdProduto + "';"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioUmProduto.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/Public/RelatorioUmProduto.pdf");
            File file = new File("C:/Users/Public/RelatorioUmProduto.pdf");
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

    public boolean gerarRelatorioProdutosPorFornecedorDAO(int pIdFornecedor) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT"
                    + " tb_fornecedor.`pk_id_fornecedor` AS tb_fornecedor_pk_id_fornecedor,"
                    + " tb_fornecedor.`nome_fantasia` AS tb_fornecedor_nome_fantasia,"
                    + " tb_fornecedor.`cnpj` AS tb_fornecedor_cnpj,"
                    + " tb_fornecedor.`for_telefone` AS tb_fornecedor_for_telefone,"
                    + " tb_fornecedor.`for_email` AS tb_fornecedor_for_email,"
                    + " tb_produto.`pk_id_produto` AS tb_produto_pk_id_produto,"
                    + " tb_produto.`prod_nome` AS tb_produto_prod_nome,"
                    + " tb_produto.`prod_valor` AS tb_produto_prod_valor,"
                    + " tb_produto.`prod_estoque` AS tb_produto_prod_estoque,"
                    + " tb_produto.`fk_fornecedor` AS tb_produto_fk_fornecedor"
                    + " FROM"
                    + " `tb_fornecedor` tb_fornecedor,"
                    + " `tb_produto` tb_produto"
                    + " WHERE"
                    + " fk_fornecedor = '"+ pIdFornecedor +"' AND pk_id_fornecedor = '"+ pIdFornecedor +"';"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioProdutosPorFornecedor.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/Public/RelatorioProdutosPorFornecedor.pdf");
            File file = new File("C:/Users/Public/RelatorioProdutosPorFornecedor.pdf");
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
