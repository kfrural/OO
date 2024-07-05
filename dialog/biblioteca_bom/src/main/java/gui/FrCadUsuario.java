package gui;

import classes.Usuario;
import gerenciador.GerenciadorUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author joserui
 */
public class FrCadUsuario extends javax.swing.JFrame {

    private boolean editando;
    private String cpfEscolhido;
    private Usuario pessoaEditando;
    private GerenciadorUsuario gerenciadorUsuarios;

    public FrCadUsuario() {
        this.gerenciadorUsuarios = new GerenciadorUsuario();
        this.pessoaEditando = new Usuario();
        this.editando = false;
        this.cpfEscolhido = "";

        initComponents();
        this.habilitarCampos(false);
        this.limparCampos();

        this.gerenciadorUsuarios.carregarNoArquivo("ListagemUsuarios.csv");
        String listagem = this.gerenciadorUsuarios.toString();
        edtListagem.setText(listagem);
    }

    public void habilitarCampos(boolean flag) {
        edtNome.setEnabled(flag);
        edtCpf.setEnabled(flag);
    }

    public void limparCampos() {
        edtNome.setText("");
        edtCpf.setText("");
    }

    public void objetoParaCampos(Usuario u) {
        edtNome.setText(u.getNome());
        edtCpf.setText(u.getId());

    }

    public Usuario camposParaObjeto() {
        Usuario u = new Usuario();

        u.setNome(edtNome.getText());

        u.setId(edtCpf.getText());


        return u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();
        panFields = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        panBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Pessoa");

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane1.setViewportView(edtListagem);

        panFields.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setText("Nome:");

        lblCpf.setText("CPF:");

        javax.swing.GroupLayout panFieldsLayout = new javax.swing.GroupLayout(panFields);
        panFields.setLayout(panFieldsLayout);
        panFieldsLayout.setHorizontalGroup(
            panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFieldsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        panFieldsLayout.setVerticalGroup(
            panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFieldsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panBotoes.add(btnSalvar);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del_32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panBotoes.add(btnExcluir);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panBotoes.add(btnNovo);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit3_32x32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panBotoes.add(btnEditar);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panBotoes.add(btnCancelar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(panFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Usuario novaUsuario = this.camposParaObjeto();

        if (this.editando == true) {
            this.gerenciadorUsuarios.atualizarUsuario(cpfEscolhido, novaUsuario);
        } else { //Estou inserindo
            this.gerenciadorUsuarios.addUsuario(novaUsuario);
        }

        this.limparCampos();
        this.habilitarCampos(false);

        String listagem = gerenciadorUsuarios.toString();
        edtListagem.setText(listagem);

        this.gerenciadorUsuarios.salvarNoArquivo("ListagemUsuarios.csv");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String cpfEscolhido = JOptionPane.showInputDialog("Informe o CPF que deseja excluir:", "");

        Usuario p = this.gerenciadorUsuarios.buscarUsuario(cpfEscolhido);

        if (p == null) {
            JOptionPane.showMessageDialog(this, "Não existe este cpf.");
        } else {
            this.gerenciadorUsuarios.removerUsuario(cpfEscolhido);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        }

        edtListagem.setText(this.gerenciadorUsuarios.toString());

        //Salvando no arquivo
        this.gerenciadorUsuarios.salvarNoArquivo("ListagemUsuarios.csv");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String cpfEscolhido = JOptionPane.showInputDialog("Informe o CPF que deseja EDITAR:", "");

        this.pessoaEditando = this.gerenciadorUsuarios.buscarUsuario(cpfEscolhido);

        if (pessoaEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe este CPF.");
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.objetoParaCampos(pessoaEditando);
            this.editando = true;
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panFields;
    // End of variables declaration//GEN-END:variables
}
