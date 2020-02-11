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
public class DAORelatorioVenda extends ConexaoMySql {

    //Retorna todos as Vendas
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
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/teste/RelatorioTodasVendas.pdf");
            File file = new File("C:/Users/jefer/Desktop/teste/RelatorioTodasVendas.pdf");
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

    //Retorna todos as Vendas por Cliente

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
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/jefer/Desktop/teste/RelatorioVendaPorCliente.pdf");
            File file = new File("C:/Users/jefer/Desktop/teste/RelatorioVendaPorCliente.pdf");
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
