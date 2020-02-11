package controllerRelatorios;

import DAORelatorios.DAORelatorioCliente;

/**
 *
 * @author Jeferso Tomas
 */
public class ControllerRelatorioCliente {

    private DAORelatorioCliente daoRelatorioCliente = new DAORelatorioCliente();

    public boolean gerarRelatorioTodosClientesController() {
        return this.daoRelatorioCliente.gerarRelatorioTodosClientes();
    }

    /**
     * recupera Um Cliente
     *
     * @param pIdCliente return boolean
     */
    public boolean gerarRelatorioUmClientesController(int pIdCliente) {
        return this.daoRelatorioCliente.gerarRelatorioUmClientes(pIdCliente);
    }

}
