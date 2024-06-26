package com.oo.projpedidoprodutos.gui.dialogs;
import com.oo.projpedidoprodutos.classes.Quarto;
import com.oo.projpedidoprodutos.gerenciador.GerenciadorQuarto;
import javax.swing.JOptionPane;

/**
 *
 * @author kfrural
 */
public class DlgCadQuarto extends javax.swing.JDialog {
 private boolean editando;
    private String cpfEscolhido;
    private Quarto pessoaEditando;
    private GerenciadorQuarto gerenciadorQuartos;
    
     public DlgCadQuarto() {
        this.gerenciadorQuartos = new GerenciadorQuarto();
        this.pessoaEditando = new Quarto();
        this.editando = false;
        this.cpfEscolhido = "";

        initComponents();
        this.habilitarCampos(false);
        this.limparCampos();

        this.gerenciadorQuartos.carregarDoArquivo("ListagemQuartos.csv");
        String listagem = this.gerenciadorQuartos.toString();
        edtListagem.setText(listagem);
    }
     
     public void habilitarCampos(boolean flag) {
        edtId.setEnabled(flag);
        edtPreco.setEnabled(flag);
        edtTipo.setEnabled(flag);
        edtNumQuarto.setEnabled(flag);
    }

    public void limparCampos() {
        edtId.setText("");
        edtPreco.setText("");
        edtTipo.setText("");
        edtNumQuarto.setText("");
    }

    public void objetoParaCampos(Quarto p) {
        edtId.setText(p.getNome());
        edtNumQuarto.setText(p.getCpf());
        edtPreco.setText(p.getSexo() + "");
        edtTipo.setText(p.getIdade() + "");

    }

    public Quarto camposParaObjeto() {
        Quarto p = new Quarto();

        //copia o conteudo da caixaDeTexto edtNome para o atributo nome
        p.setNome(edtId.getText());

        //copia o conteudo da caixaDeTexto edtCpf para o atributo cpf
        p.setCpf(edtNumQuarto.getText());

        //copia o conteudo da caixaDeTexto edtSexo para o atributo sexo
        String sexo = edtPreco.getText();
        if (!sexo.isEmpty()) {
            p.setSexo(sexo.charAt(0));
        }

        //copia o conteudo da caixaDeTexto edtIdade para o atributo idade
        String idadeTexto = edtTipo.getText();
        int a = 0;
        if (!idadeTexto.isEmpty()) {
            a = Integer.parseInt(idadeTexto);
        }

        p.setIdade(a);

        return p;
    }

    /**
     * Creates new form DlgQuarto
     */
    public DlgCadQuarto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        panButton = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panFields = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        edtId = new javax.swing.JTextField();
        lblNumQuartos = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        edtNumQuarto = new javax.swing.JTextField();
        edtTipo = new javax.swing.JTextField();
        edtPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cadastro de Quartos");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del_32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit3_32x32.png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panButtonLayout = new javax.swing.GroupLayout(panButton);
        panButton.setLayout(panButtonLayout);
        panButtonLayout.setHorizontalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        panButtonLayout.setVerticalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo)
                    .addComponent(btnEdit)
                    .addComponent(btnCancelar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblId.setText("Id");

        lblNumQuartos.setText("N quartos");

        lblTipo.setText("Tipo");

        lblPreco.setText("Preco");

        edtNumQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNumQuartoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFieldsLayout = new javax.swing.GroupLayout(panFields);
        panFields.setLayout(panFieldsLayout);
        panFieldsLayout.setHorizontalGroup(
            panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFieldsLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(18, 18, 18)
                        .addComponent(edtTipo)))
                .addGap(41, 41, 41)
                .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addComponent(lblPreco)
                        .addGap(18, 18, 18)
                        .addComponent(edtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addComponent(lblNumQuartos)
                        .addGap(18, 18, 18)
                        .addComponent(edtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        panFieldsLayout.setVerticalGroup(
            panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFieldsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumQuartos)
                            .addComponent(edtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTipo)
                                .addComponent(lblPreco))
                            .addComponent(edtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane1.setViewportView(edtListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addComponent(panButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(panFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Quarto novaQuarto = this.camposParaObjeto();

        if (this.editando == true) {
            this.gerenciadorQuartos.atualizarQuarto(cpfEscolhido, novaQuarto);
        } else { //Estou inserindo
            this.gerenciadorQuartos.adicionarQuarto(novaQuarto);
        }

        this.limparCampos();
        this.habilitarCampos(false);

        String listagem = gerenciadorQuartos.toString();
        edtListagem.setText(listagem);

        this.gerenciadorQuartos.salvarNoArquivo("ListagemQuartos.csv");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String cpfEscolhido = JOptionPane.showInputDialog("Informe o CPF que deseja excluir:", "");

        Quarto p = this.gerenciadorQuartos.buscarQuarto(cpfEscolhido);

        if (p == null) {
            JOptionPane.showMessageDialog(this, "Não existe este cpf.");
        } else {
            this.gerenciadorQuartos.removerQuarto(cpfEscolhido);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        }

        edtListagem.setText(this.gerenciadorQuartos.toString());

        //Salvando no arquivo
        this.gerenciadorQuartos.salvarNoArquivo("ListagemQuartos.csv");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String cpfEscolhido = JOptionPane.showInputDialog("Informe o CPF que deseja EDITAR:", "");

        this.pessoaEditando = this.gerenciadorQuartos.buscarQuarto(cpfEscolhido);

        if (pessoaEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe este CPF.");
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.objetoParaCampos(pessoaEditando);
            this.editando = true;
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void edtNumQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNumQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNumQuartoActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DlgCadQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DlgCadQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DlgCadQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DlgCadQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DlgCadQuarto dialog = new DlgCadQuarto(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtId;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtNumQuarto;
    private javax.swing.JTextField edtPreco;
    private javax.swing.JTextField edtTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNumQuartos;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panButton;
    private javax.swing.JPanel panFields;
    // End of variables declaration//GEN-END:variables
}
