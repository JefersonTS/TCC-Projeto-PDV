/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerUsuario;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;
import model.ModelSessaoUsuario;
import model.ModelUsuario;

/**
 *
 * @author jefer
 */
public class Login extends javax.swing.JFrame {

    ControllerUsuario controllerUsuario = new ControllerUsuario();
    ModelUsuario modelUsuario = new ModelUsuario();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        jPanel2.setBackground(new Color(255, 255, 255, 50));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../imagens/carrinho-de-compras.png")));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Maiandra GD",Font.PLAIN,35)));
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
        uJPanelImagem2 = new componentes.UJPanelImagem();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldLoginUsuario = new javax.swing.JTextField();
        jPasswordFieldLoginSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uJPanelImagem1 = new componentes.UJPanelImagem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas com Controle de Estoque e PDV");

        uJPanelImagem2.setImagem(new java.io.File("C:\\Users\\jefer\\Desktop\\Jefin\\Projetos-Java\\TCC-Projeto-PDV\\ProjetoVendas\\src\\imagens\\background-login.jpg"));
        uJPanelImagem2.setPreferredSize(new java.awt.Dimension(1000, 600));

        jTextFieldLoginUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jPasswordFieldLoginSenha.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPasswordFieldLoginSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldLoginSenhaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha-login.png"))); // NOI18N
        jLabel2.setText("Senha: ");

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user-login.png"))); // NOI18N
        jLabel1.setText("Usuario: ");
        jLabel1.setIconTextGap(5);

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN NO SISTEMA");

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ENTRAR");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldLoginUsuario)
                    .addComponent(jPasswordFieldLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-login.png"))); // NOI18N

        jLabel6.setDisplayedMnemonic('S');
        jLabel6.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sistema de Vendas com Controle de Estoque e PDV");

        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\jefer\\Desktop\\Jefin\\Projetos-Java\\TCC-Projeto-PDV\\ProjetoVendas\\src\\imagens\\Panfleto PC TRANSP.png"));

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout uJPanelImagem2Layout = new javax.swing.GroupLayout(uJPanelImagem2);
        uJPanelImagem2.setLayout(uJPanelImagem2Layout);
        uJPanelImagem2Layout.setHorizontalGroup(
            uJPanelImagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem2Layout.createSequentialGroup()
                .addGroup(uJPanelImagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(uJPanelImagem2Layout.createSequentialGroup()
                        .addComponent(uJPanelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(uJPanelImagem2Layout.createSequentialGroup()
                        .addContainerGap(139, Short.MAX_VALUE)
                        .addGroup(uJPanelImagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(133, 133, 133))
        );
        uJPanelImagem2Layout.setVerticalGroup(
            uJPanelImagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(uJPanelImagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uJPanelImagem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fazerLogin() {
        modelUsuario.setUsLogin(jTextFieldLoginUsuario.getText().toUpperCase());
        modelUsuario.setUsSenha(String.valueOf(jPasswordFieldLoginSenha.getPassword()));
        if (controllerUsuario.getValidarUsuarioController(modelUsuario)) {
            modelUsuario = controllerUsuario.getUsuarioController(jTextFieldLoginUsuario.getText().toUpperCase());
            modelSessaoUsuario.codigo = modelUsuario.getIdUsuario();
            modelSessaoUsuario.nome = modelUsuario.getUsNome();
            modelSessaoUsuario.login = modelUsuario.getUsLogin();
            new Principal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario e/ou Senha INCORRETO!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void jPasswordFieldLoginSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldLoginSenhaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            fazerLogin();
        }
    }//GEN-LAST:event_jPasswordFieldLoginSenhaKeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        fazerLogin();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                //Aplicando LookAndFell
                try {
                    //Configurar se deve aplicar o look a borda do JFrame  
                    // No caso esta programado para não aplicar (Boolean.FALSE)  
                    UIManager.put("Synthetica.window.decoration", Boolean.TRUE);
                    //Configura qual Look você quer usar no projeto  
                    UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
                } catch (Exception erro) {
                    erro.printStackTrace();
                }
                //Termina o LookAndFeel

                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldLoginSenha;
    private javax.swing.JTextField jTextFieldLoginUsuario;
    private componentes.UJPanelImagem uJPanelImagem1;
    private componentes.UJPanelImagem uJPanelImagem2;
    // End of variables declaration//GEN-END:variables
}
