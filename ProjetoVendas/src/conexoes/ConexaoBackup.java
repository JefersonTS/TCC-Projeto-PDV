/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author michel
 */
public class ConexaoBackup {

    static Connection con = null;

    public static Connection conectar() {
        String url = "jdbc:mysql://localhost:3306/dbprojetovendas"; //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = ""; //senha do MySQL
        try {

            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

}
