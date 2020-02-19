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
 * @author Jeferso Tomas
 */
public class DAORelatorioCliente extends ConexaoMySql {

    /**
     * recupera TodosClientes para gerar o relatorio
     *
     * @return
     */
    public boolean gerarRelatorioTodosClientes() {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + " FROM"
                    + " tb_cliente;"
            );
            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioTodosClientes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioTodosClientes.pdf");
            File file = new File("C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioTodosClientes.pdf");
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
     * recupera Um Cliente
     *
     * @param pIdCliente return codigo do cliente
     */
    public boolean gerarRelatorioUmClientes(int pIdCliente) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + " FROM"
                    + " tb_cliente"
                    + " WHERE"
                    + " pk_id_cliente = '" + pIdCliente + "'"
                    + ";"
            );

            HashMap hashMap = new HashMap();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/RelatorioUmCliente.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, hashMap, jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioUmCliente.pdf");
            File file = new File("C:/Users/jefer/Desktop/Jefin/Projetos-Java/TCC-Projeto-PDV/ProjetoVendas/src/relatorios/RelatorioUmCliente.pdf");
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
