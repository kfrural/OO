package com.oo.projpedidoprodutos.gui;

import com.oo.projpedidoprodutos.gui.dialogs.DlgCadReserva;
import com.oo.projpedidoprodutos.gui.dialogs.DlgCadQuarto;
import com.oo.projpedidoprodutos.gui.dialogs.DlgCadHospede;
import java.util.ArrayList;
import java.util.List;

public class FrHome extends javax.swing.JFrame {

           
    public FrHome() {
        initComponents();
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panBotoes = new javax.swing.JPanel();
        btnCadHospedes = new javax.swing.JButton();
        btnCadQuartos = new javax.swing.JButton();
        btnCadReservas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();
        mnCadastros = new javax.swing.JMenu();
        mnPedidos = new javax.swing.JMenuItem();
        mnCadProdutos = new javax.swing.JMenuItem();
        mnCadClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Reservas Hoteis");

        btnCadHospedes.setText("Cad Hospedes");
        btnCadHospedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadHospedesActionPerformed(evt);
            }
        });

        btnCadQuartos.setText("Cad Quartos");
        btnCadQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadQuartosActionPerformed(evt);
            }
        });

        btnCadReservas.setText("Cad Reservas");
        btnCadReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadReservasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotoesLayout = new javax.swing.GroupLayout(panBotoes);
        panBotoes.setLayout(panBotoesLayout);
        panBotoesLayout.setHorizontalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnCadQuartos)
                .addGap(31, 31, 31)
                .addComponent(btnCadReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadQuartos)
                    .addComponent(btnCadReservas)
                    .addComponent(btnCadHospedes))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnSair);

        jMenuBar1.add(jMenu1);

        mnCadastros.setText("Cadastros");

        mnPedidos.setText("Novo Hospede");
        mnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPedidosActionPerformed(evt);
            }
        });
        mnCadastros.add(mnPedidos);

        mnCadProdutos.setText("Cad Quartos");
        mnCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadProdutosActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCadProdutos);

        mnCadClientes.setText("Cad Reservas");
        mnCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadClientesActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCadClientes);

        jMenuBar1.add(mnCadastros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 232, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadHospedesActionPerformed
        DlgCadHospede cadHospede = new DlgCadHospede();
        cadHospede.setVisible(true);
    }//GEN-LAST:event_btnCadHospedesActionPerformed

    private void btnCadReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadReservasActionPerformed
        DlgCadReserva cadReserva = new DlgCadReserva();
        cadReserva.setVisible(true);
    }//GEN-LAST:event_btnCadReservasActionPerformed

    private void btnCadQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadQuartosActionPerformed
        DlgCadQuarto cadQuarto = new DlgCadQuarto();
        cadQuarto.setVisible(true);
        
    }//GEN-LAST:event_btnCadQuartosActionPerformed

    private void mnCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadProdutosActionPerformed
        btnCadQuartosActionPerformed(evt);
    }//GEN-LAST:event_mnCadProdutosActionPerformed

    private void mnCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadClientesActionPerformed
        btnCadReservasActionPerformed(evt);
    }//GEN-LAST:event_mnCadClientesActionPerformed

    private void mnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPedidosActionPerformed
        btnCadHospedesActionPerformed(evt);
    }//GEN-LAST:event_mnPedidosActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadHospedes;
    private javax.swing.JButton btnCadQuartos;
    private javax.swing.JButton btnCadReservas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnCadClientes;
    private javax.swing.JMenuItem mnCadProdutos;
    private javax.swing.JMenu mnCadastros;
    private javax.swing.JMenuItem mnPedidos;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JPanel panBotoes;
    // End of variables declaration//GEN-END:variables
}
