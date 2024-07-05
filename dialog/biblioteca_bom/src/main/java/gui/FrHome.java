package gui;

import classes.Avaliacao;
import gui.dialog.DlgCadAvaliacao;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class FrHome extends javax.swing.JFrame {

    List<Avaliacao> listaAvaliacao;
           
    public FrHome() {
        initComponents();
        listaAvaliacao = new ArrayList<>();
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panBotoes = new javax.swing.JPanel();
        btnAvaliar = new javax.swing.JButton();
        btnLivro = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();
        mnCadastros = new javax.swing.JMenu();
        mnAvaliar = new javax.swing.JMenuItem();
        mnCadLivros = new javax.swing.JMenuItem();
        mnCadUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Biblioteca");

        btnAvaliar.setText("Avaliar Livro");
        btnAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarActionPerformed(evt);
            }
        });

        btnLivro.setText("Cad Livro");
        btnLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroActionPerformed(evt);
            }
        });

        btnUsuario.setText("Cad Usuario");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotoesLayout = new javax.swing.GroupLayout(panBotoes);
        panBotoes.setLayout(panBotoesLayout);
        panBotoesLayout.setHorizontalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAvaliar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLivro)
                    .addComponent(btnUsuario)
                    .addComponent(btnAvaliar))
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

        mnAvaliar.setText("Nova Avaliacao");
        mnAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAvaliarActionPerformed(evt);
            }
        });
        mnCadastros.add(mnAvaliar);

        mnCadLivros.setText("Cad Livros");
        mnCadLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadLivrosActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCadLivros);

        mnCadUsuarios.setText("Cad Usuarios");
        mnCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadUsuariosActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCadUsuarios);

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

    private void btnAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaliarActionPerformed
        Avaliacao novoAvaliacao = new Avaliacao();
        DlgCadAvaliacao telaAvaliacao = new DlgCadAvaliacao(this, true, novoAvaliacao);
        telaAvaliacao.setVisible(true);       
        
        System.out.println("Passei por aqui. Avaliacao.");
        
        if(novoAvaliacao != null){
            listaAvaliacao.add(novoAvaliacao);        
        }
    }//GEN-LAST:event_btnAvaliarActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        FrCadUsuario tela = new FrCadUsuario();
        tela.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroActionPerformed
        FrCadLivro tela = new FrCadLivro();
        tela.setVisible(true);
        
    }//GEN-LAST:event_btnLivroActionPerformed

    private void mnCadLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadLivrosActionPerformed
        btnLivrosActionPerformed(evt);
    }//GEN-LAST:event_mnCadLivrosActionPerformed

    private void mnCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadUsuariosActionPerformed
        btnUsuariosActionPerformed(evt);
    }//GEN-LAST:event_mnCadUsuariosActionPerformed

    private void mnAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAvaliarActionPerformed
        btnAvaliacaoActionPerformed(evt);
    }//GEN-LAST:event_mnAvaliarActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvaliar;
    private javax.swing.JButton btnLivro;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnAvaliar;
    private javax.swing.JMenuItem mnCadLivros;
    private javax.swing.JMenuItem mnCadUsuarios;
    private javax.swing.JMenu mnCadastros;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JPanel panBotoes;
    // End of variables declaration//GEN-END:variables

    private void btnUsuariosActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void btnLivrosActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void btnAvaliacaoActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
