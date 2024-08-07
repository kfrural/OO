/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Gui;

import Classes.Hospede;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class CadHospede extends javax.swing.JDialog {

    /**
     * Creates new form CadHospede
     */
    private List<Hospede> hospedes = new ArrayList<>();
    
    public CadHospede(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeNovoHospede = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CPFnovoHospede = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        exibirHospedes = new javax.swing.JTextArea();
        btnCadastrarHospede = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        contatoNovoHospede = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        enderecoNovoHospede = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jPanel1.add(nomeNovoHospede);

        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3);
        jPanel1.add(CPFnovoHospede);

        exibirHospedes.setColumns(20);
        exibirHospedes.setRows(5);
        jScrollPane1.setViewportView(exibirHospedes);

        btnCadastrarHospede.setText("Cadastrar");
        btnCadastrarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarHospedeActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setText("Contato");
        jPanel3.add(jLabel5);
        jPanel3.add(contatoNovoHospede);

        jLabel6.setText("Endereço");
        jPanel3.add(jLabel6);
        jPanel3.add(enderecoNovoHospede);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrarHospede))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarHospede)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarHospedeActionPerformed
        Hospede novoHospede = new Hospede();
        novoHospede = camposParaObjeto();
        hospedes.add(novoHospede);
        
        
    }//GEN-LAST:event_btnCadastrarHospedeActionPerformed
    public void exibirHospedes(){
        
    }
    /**
     * @param args the command line arguments
     */
    public Hospede camposParaObjeto(){
        Hospede novoHospede = new Hospede();
        novoHospede.setNome(nomeNovoHospede.getText());
        novoHospede.setCPF(CPFnovoHospede.getText());
        novoHospede.setEndereço(enderecoNovoHospede.getText());
        novoHospede.setNumero(contatoNovoHospede.getText());
        return novoHospede;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPFnovoHospede;
    private javax.swing.JButton btnCadastrarHospede;
    private javax.swing.JTextField contatoNovoHospede;
    private javax.swing.JTextField enderecoNovoHospede;
    private javax.swing.JTextArea exibirHospedes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeNovoHospede;
    // End of variables declaration//GEN-END:variables
}
