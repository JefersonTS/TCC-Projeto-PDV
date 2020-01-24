/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasProdutos;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelProdutos;
import model.ModelVendas;
import model.ModelVendasProdutos;
import util.BLDatas;

/**
 *
 * @author jefer
 */
public class PDV extends javax.swing.JFrame {

    BLDatas bLDatas = new BLDatas();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ModelVendas modelVendas = new ModelVendas();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutoses = new ArrayList<>();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    int qtd;

    /**
     * Creates new form PDV
     */
    public PDV() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jTextFieldDescontoVendaPDV.setText("0");
        jTextFieldCodigoProdutoPDV.requestFocus();//inicia com o foco no jTextFieldCodigoProdutoPDV
        qtd = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaProdutosPDV = new javax.swing.JTable();
        jTextFieldCodigoProdutoPDV = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTotalLiquidoVendaPDV = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDescontoVendaPDV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldValorBrutoVendaPDV = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAlterarQuantidadePDV = new javax.swing.JMenuItem();
        jMenuItemFinalizarVendaPDV = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jTableListaProdutosPDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Codigo", "Nome", "Quantidade", "Valor Unit.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaProdutosPDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaProdutosPDVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListaProdutosPDV);
        if (jTableListaProdutosPDV.getColumnModel().getColumnCount() > 0) {
            jTableListaProdutosPDV.getColumnModel().getColumn(0).setMinWidth(80);
            jTableListaProdutosPDV.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableListaProdutosPDV.getColumnModel().getColumn(0).setMaxWidth(80);
            jTableListaProdutosPDV.getColumnModel().getColumn(1).setMinWidth(100);
            jTableListaProdutosPDV.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableListaProdutosPDV.getColumnModel().getColumn(1).setMaxWidth(100);
            jTableListaProdutosPDV.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jTextFieldCodigoProdutoPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoProdutoPDVActionPerformed(evt);
            }
        });
        jTextFieldCodigoProdutoPDV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoProdutoPDVKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodigoProdutoPDV, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(19, 19, 19)
                .addComponent(jTextFieldCodigoProdutoPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("OPERADOR: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("STATUS: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CAIXA: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CAIXA: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CAIXA: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("CAIXA: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("COMANDOS");

        jTextFieldTotalLiquidoVendaPDV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("TOTAL A PAGAR");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("F4 - Finalizar Venda");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("F3 - Alterar Quantidade");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("F5 - Pesquisar Produto");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("F9 - Sair");

        jTextFieldDescontoVendaPDV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextFieldDescontoVendaPDV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDescontoVendaPDVFocusLost(evt);
            }
        });
        jTextFieldDescontoVendaPDV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescontoVendaPDVKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("DESCONTO (em %)");

        jTextFieldValorBrutoVendaPDV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("VALOR TOTAL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDescontoVendaPDV)
                    .addComponent(jTextFieldValorBrutoVendaPDV)
                    .addComponent(jTextFieldTotalLiquidoVendaPDV)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel15))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel9))
                            .addComponent(jLabel11)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel8))
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescontoVendaPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorBrutoVendaPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTotalLiquidoVendaPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Comandos");

        jMenuItemAlterarQuantidadePDV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemAlterarQuantidadePDV.setText("Alterar Quantidade");
        jMenuItemAlterarQuantidadePDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlterarQuantidadePDVActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAlterarQuantidadePDV);

        jMenuItemFinalizarVendaPDV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemFinalizarVendaPDV.setText("Finalizar Venda");
        jMenuItemFinalizarVendaPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinalizarVendaPDVActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemFinalizarVendaPDV);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setText("Pesquisar Produtos");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void somaValorTotal() {
        double soma = 0, valor;
        int cont = jTableListaProdutosPDV.getRowCount();

        for (int i = 0; i < cont; i++) {
            valor = (double) jTableListaProdutosPDV.getValueAt(i, 5);
            soma += valor;
        }
        jTextFieldValorBrutoVendaPDV.setText(String.valueOf(soma));
        aplicarDesconto();
        //return soma;
    }

    private void aplicarDesconto() {
        //DecimalFormat df = new DecimalFormat("#,###.00");//formata as casas decimais de um Double
        double desconto = Double.parseDouble(jTextFieldDescontoVendaPDV.getText());
        double valorBruto = Double.parseDouble(jTextFieldValorBrutoVendaPDV.getText());
        double valorLiquido = valorBruto - ((desconto / 100) * valorBruto);
        //jTextFieldTotalPagarVenda.setText("R$: " + String.valueOf(df.format(totalDesconto)));
        jTextFieldTotalLiquidoVendaPDV.setText(String.valueOf(valorLiquido));
    }

    private void pegarCodigo(java.awt.event.KeyEvent e) {
        DefaultTableModel modelo = (DefaultTableModel) jTableListaProdutosPDV.getModel();
        modelProdutos = new ModelProdutos();
        //modelo.setNumRows(0);
        try {
            if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jTextFieldCodigoProdutoPDV.getText()));
                System.err.println("Pressionando ENTER: " + qtd);
                modelo.addRow(new Object[]{
                    modelo.getRowCount() + 1,
                    modelProdutos.getIdProduto(),
                    modelProdutos.getProdNome(),
                    qtd,
                    modelProdutos.getProdValor(),
                    modelProdutos.getProdValor() * qtd
                });
                jTextFieldCodigoProdutoPDV.setText("");
                somaValorTotal();
                qtd = 1;
            }
        } catch (Exception f) {
            JOptionPane.showMessageDialog(this, "Codigo do Produto INESISTENTE ou VAZIO", "ERRO", JOptionPane.ERROR_MESSAGE);
            jTextFieldCodigoProdutoPDV.setText("");
        }
        //qtd = 1;
    }

    private void limparVendas() {
        jTextFieldCodigoProdutoPDV.setText("");
        jTextFieldDescontoVendaPDV.setText("0");
        jTextFieldTotalLiquidoVendaPDV.setText("");
        jTextFieldValorBrutoVendaPDV.setText("");
        DefaultTableModel modelo = (DefaultTableModel) jTableListaProdutosPDV.getModel();
        modelo.setNumRows(0);
    }


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextFieldCodigoProdutoPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProdutoPDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoProdutoPDVActionPerformed

    private void jTextFieldCodigoProdutoPDVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProdutoPDVKeyReleased
        // TODO add your handling code here:
        pegarCodigo(evt);
    }//GEN-LAST:event_jTextFieldCodigoProdutoPDVKeyReleased

    @SuppressWarnings("empty-statement")
    private void jMenuItemFinalizarVendaPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinalizarVendaPDVActionPerformed
        // TODO add your handling code here:
        int codigoProduto, qtdVenda, codigoVenda;
        modelVendas = new ModelVendas();
        modelVendas.setCliente(1);
        try {
            modelVendas.setVenDataVenda(bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            Logger.getLogger(PDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelVendas.setVenDesconto(Double.parseDouble(jTextFieldDescontoVendaPDV.getText()));
        modelVendas.setVenValorBruto(Double.parseDouble(jTextFieldValorBrutoVendaPDV.getText()));
        modelVendas.setVenValorLiquido(Double.parseDouble(jTextFieldTotalLiquidoVendaPDV.getText()));

        //salva a venda
        codigoVenda = controllerVendas.salvarVendasController(modelVendas);
        for (int i = 0; i < jTableListaProdutosPDV.getRowCount(); i++) {
            codigoProduto = (int) jTableListaProdutosPDV.getValueAt(i, 1);
            qtdVenda = Integer.parseInt(jTableListaProdutosPDV.getValueAt(i, 3).toString());
            modelVendasProdutos = new ModelVendasProdutos();
            modelProdutos = new ModelProdutos();
            modelVendasProdutos.setProduto(codigoProduto);
            modelVendasProdutos.setVendas(codigoVenda);
            modelVendasProdutos.setVenProValor((double) jTableListaProdutosPDV.getValueAt(i, 4));
            modelVendasProdutos.setVenProQuantidade(qtdVenda);
            listaModelVendasProdutoses.add(modelVendasProdutos);
            //subtrai a quantidade vendida no estoque
            modelProdutos.setIdProduto(codigoProduto);
            modelProdutos.setProdEstoque(controllerProdutos.retornarProdutoController(codigoProduto).getProdEstoque()
                    - qtdVenda);
            listaModelProdutos.add(modelProdutos);
        }

        //salvar os produtos da venda e alterar o estoque
        if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutoses)) {
            //JOptionPane.showMessageDialog(this, "Venda Concluida com SUCESSO", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            controllerProdutos.alterarEstoqueProdutoControler(listaModelProdutos);//Alterar o estoque no banco;
            limparVendas();
        } else {
            //JOptionPane.showMessageDialog(this, "Erro ao Concluir a Venda", "ERRO", JOptionPane.ERROR_MESSAGE);
        };

    }//GEN-LAST:event_jMenuItemFinalizarVendaPDVActionPerformed

    private void jTextFieldDescontoVendaPDVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescontoVendaPDVFocusLost
        // TODO add your handling code here:
        somaValorTotal();
    }//GEN-LAST:event_jTextFieldDescontoVendaPDVFocusLost

    private void jTextFieldDescontoVendaPDVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescontoVendaPDVKeyReleased
        // TODO add your handling code here:
        somaValorTotal();
    }//GEN-LAST:event_jTextFieldDescontoVendaPDVKeyReleased

    private void jMenuItemAlterarQuantidadePDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlterarQuantidadePDVActionPerformed
        // TODO add your handling code here:
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade desejada: "));
        System.err.println("Pressionando F3: " + qtd);
    }//GEN-LAST:event_jMenuItemAlterarQuantidadePDVActionPerformed

    private void jTableListaProdutosPDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaProdutosPDVMouseClicked
        int linha = jTableListaProdutosPDV.getSelectedRow();
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade desejada: "));
        Double valor = (double) jTableListaProdutosPDV.getValueAt(linha, 4);
        Double total = quantidade * valor;
        jTableListaProdutosPDV.setValueAt(quantidade, linha, 3);//setando a nova quantidade do item
        jTableListaProdutosPDV.setValueAt(total, linha, 5);//setando o novo valor total
        somaValorTotal();
        jTextFieldCodigoProdutoPDV.requestFocus();
    }//GEN-LAST:event_jTableListaProdutosPDVMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemAlterarQuantidadePDV;
    private javax.swing.JMenuItem jMenuItemFinalizarVendaPDV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaProdutosPDV;
    private javax.swing.JTextField jTextFieldCodigoProdutoPDV;
    private javax.swing.JTextField jTextFieldDescontoVendaPDV;
    private javax.swing.JTextField jTextFieldTotalLiquidoVendaPDV;
    private javax.swing.JTextField jTextFieldValorBrutoVendaPDV;
    // End of variables declaration//GEN-END:variables
}