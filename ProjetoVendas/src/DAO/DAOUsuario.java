package DAO;

import model.ModelUsuario;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Jeferson
 */
public class DAOUsuario extends ConexaoMySql {

    /**
     * grava Usuario
     *
     * @param pModelUsuario return int
     */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tb_usuario ("
                    + "us_nome,"
                    + "us_login,"
                    + "us_senha"
                    + ") VALUES ("
                    + "'" + pModelUsuario.getUsNome() + "',"
                    + "'" + pModelUsuario.getUsLogin() + "',"
                    + "'" + pModelUsuario.getUsSenha() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Usuario
     *
     * @param pIdUsuario return ModelUsuario
     */
    public ModelUsuario getUsuarioDAO(int pIdUsuario) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario,"
                    + "us_nome,"
                    + "us_login,"
                    + "us_senha"
                    + " FROM"
                    + " tb_usuario"
                    + " WHERE"
                    + " pk_id_usuario = '" + pIdUsuario + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsNome(this.getResultSet().getString(2));
                modelUsuario.setUsLogin(this.getResultSet().getString(3));
                modelUsuario.setUsSenha(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
     * recupera uma lista de Usuario return ArrayList
     */
    public ArrayList<ModelUsuario> getListaUsuarioDAO() {
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario,"
                    + "us_nome,"
                    + "us_login,"
                    + "us_senha"
                    + " FROM"
                    + " tb_usuario"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsNome(this.getResultSet().getString(2));
                modelUsuario.setUsLogin(this.getResultSet().getString(3));
                modelUsuario.setUsSenha(this.getResultSet().getString(4));
                listamodelUsuario.add(modelUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
     * atualiza Usuario
     *
     * @param pModelUsuario return boolean
     */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_usuario SET "
                    + "pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "',"
                    + "us_nome = '" + pModelUsuario.getUsNome() + "',"
                    + "us_login = '" + pModelUsuario.getUsLogin() + "',"
                    + "us_senha = '" + pModelUsuario.getUsSenha() + "'"
                    + " WHERE "
                    + "pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Usuario
     *
     * @param pIdUsuario return boolean
     */
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_usuario "
                    + " WHERE "
                    + "pk_id_usuario = '" + pIdUsuario + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    //Validar login e senha de Usuario
    public boolean getValidarUuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario,"
                    + "us_nome,"
                    + "us_login,"
                    + "us_senha"
                    + " FROM"
                    + " tb_usuario"
                    + " WHERE"
                    + " us_login = '" + pModelUsuario.getUsLogin() + "' AND us_senha = '" + pModelUsuario.getUsSenha() + "'"
                    + ";"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
