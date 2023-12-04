package vendas.view;

import vendas.view.cadastros.TelaClientes;
import vendas.view.cadastros.TelaFornecedores;
import vendas.view.cadastros.TelaFuncionarios;
import vendas.view.cadastros.TelaProdutos;
import vendas.view.vendas.TelaNovaVenda;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastros = new javax.swing.JMenu();
        mnuCadastrosClientes = new javax.swing.JMenuItem();
        mnuCadastrosFornecedores = new javax.swing.JMenuItem();
        mnuCadastrosFuncionarios = new javax.swing.JMenuItem();
        mnuCadastrosProdutos = new javax.swing.JMenuItem();
        mnuVendas = new javax.swing.JMenu();
        mnuVendasNovaVenda = new javax.swing.JMenuItem();
        mnuVendasConsultarVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        mnuCadastros.setText("Cadastros");

        mnuCadastrosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendas/images/cliente_20.png"))); // NOI18N
        mnuCadastrosClientes.setText("Clientes");
        mnuCadastrosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosClientesActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosClientes);

        mnuCadastrosFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendas/images/fornecedor_20.png"))); // NOI18N
        mnuCadastrosFornecedores.setText("Fornecedores");
        mnuCadastrosFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosFornecedoresActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosFornecedores);

        mnuCadastrosFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendas/images/funcionario_20.png"))); // NOI18N
        mnuCadastrosFuncionarios.setText("Funcionarios");
        mnuCadastrosFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosFuncionariosActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosFuncionarios);

        mnuCadastrosProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendas/images/produto_20.png"))); // NOI18N
        mnuCadastrosProdutos.setText("Produtos");
        mnuCadastrosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosProdutosActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosProdutos);

        jMenuBar1.add(mnuCadastros);

        mnuVendas.setText("Vendas");

        mnuVendasNovaVenda.setText("Nova Venda");
        mnuVendasNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVendasNovaVendaActionPerformed(evt);
            }
        });
        mnuVendas.add(mnuVendasNovaVenda);

        mnuVendasConsultarVendas.setText("Consultar Vendas");
        mnuVendas.add(mnuVendasConsultarVendas);

        jMenuBar1.add(mnuVendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setBounds(0, 0, 422, 324);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastrosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosClientesActionPerformed
        TelaClientes telaClientes = new TelaClientes();
        telaClientes.setVisible(true);
    }//GEN-LAST:event_mnuCadastrosClientesActionPerformed

    private void mnuCadastrosFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosFornecedoresActionPerformed
        TelaFornecedores telaFornecedores = new TelaFornecedores();
        telaFornecedores.setVisible(true);
    }//GEN-LAST:event_mnuCadastrosFornecedoresActionPerformed

    private void mnuCadastrosFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosFuncionariosActionPerformed
        TelaFuncionarios telaFuncionarios = new TelaFuncionarios();
        telaFuncionarios.setVisible(true);
    }//GEN-LAST:event_mnuCadastrosFuncionariosActionPerformed

    private void mnuCadastrosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosProdutosActionPerformed
        TelaProdutos telaProdutos = new TelaProdutos();
        telaProdutos.setVisible(true);
    }//GEN-LAST:event_mnuCadastrosProdutosActionPerformed

    private void mnuVendasNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendasNovaVendaActionPerformed
       TelaNovaVenda telaNovaVenda = new TelaNovaVenda();
       telaNovaVenda.setVisible(true);
    }//GEN-LAST:event_mnuVendasNovaVendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenuItem mnuCadastrosClientes;
    private javax.swing.JMenuItem mnuCadastrosFornecedores;
    private javax.swing.JMenuItem mnuCadastrosFuncionarios;
    private javax.swing.JMenuItem mnuCadastrosProdutos;
    private javax.swing.JMenu mnuVendas;
    private javax.swing.JMenuItem mnuVendasConsultarVendas;
    private javax.swing.JMenuItem mnuVendasNovaVenda;
    // End of variables declaration//GEN-END:variables
}
