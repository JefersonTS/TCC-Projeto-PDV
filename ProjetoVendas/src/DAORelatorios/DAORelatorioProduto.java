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
public class DAORelatorioProduto extends ConexaoMySql{

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
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/teste/RelatorioTodosProdutos.pdf");
            File file = new File("C:/Users/jefer/Desktop/teste/RelatorioTodosProdutos.pdf");
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
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/teste/RelatorioTodosCliente.pdf");
            File file = new File("C:/Users/jefer/Desktop/teste/RelatorioTodosCliente.pdf");
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
