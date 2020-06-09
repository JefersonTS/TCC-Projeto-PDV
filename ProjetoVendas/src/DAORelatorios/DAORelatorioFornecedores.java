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
public class DAORelatorioFornecedores extends ConexaoMySql {

    /**
     * Retorna Todos os dados do Fornecedor
     * 
     * @param pIDFornecedor
     * @return 
     */
    public boolean gerarRelatorioFornecedorDAO(int pIDFornecedor) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tb_fornecedor"
                            + " WHERE pk_id_fornecedor = '"+ pIDFornecedor +"';"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioUmFornecedor.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/Public/RelatorioUmFornecedor.pdf");
            File file = new File("C:/Users/Public/RelatorioUmFornecedor.pdf");
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
