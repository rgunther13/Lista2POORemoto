

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Günther
 */
public class tabelaArquivo extends javax.swing.JFrame {

    /**
     * Creates new form tabelaArquivo
     */
    public tabelaArquivo() {
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

        jBtnAdicionar = new javax.swing.JButton();
        jBtnApagar = new javax.swing.JButton();
        jBtnRecuperar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnLimparTabela = new javax.swing.JButton();
        jBtnGravarArquivo = new javax.swing.JButton();
        jBtnLerArquivo = new javax.swing.JButton();
        jBtnCaminho = new javax.swing.JButton();
        jTxtfCodigo = new javax.swing.JTextField();
        jTxtfNome = new javax.swing.JTextField();
        jTxtfQuantidade = new javax.swing.JTextField();
        jTxtfPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnAdicionar.setText("Adicionar");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jBtnApagar.setText("Apagar");
        jBtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnApagarActionPerformed(evt);
            }
        });

        jBtnRecuperar.setText("Recuperar");
        jBtnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRecuperarActionPerformed(evt);
            }
        });

        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnLimparTabela.setText("Limpar Tabela");
        jBtnLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparTabelaActionPerformed(evt);
            }
        });

        jBtnGravarArquivo.setText("Gravar Arquivo");
        jBtnGravarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGravarArquivoActionPerformed(evt);
            }
        });

        jBtnLerArquivo.setText("Ler Arquivo");
        jBtnLerArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLerArquivoActionPerformed(evt);
            }
        });

        jBtnCaminho.setText("Caminho");
        jBtnCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCaminhoActionPerformed(evt);
            }
        });

        jTxtfCodigo.setText("Cod");

        jTxtfNome.setText("Nome");

        jTxtfQuantidade.setText("Quantidade");

        jTxtfPreco.setText("Preço");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Trabalho Final POO2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnGravarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jBtnLerArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(195, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnRecuperar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnLimparTabela)
                            .addGap(26, 26, 26)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTxtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTxtfNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTxtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTxtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBtnAdicionar)
                    .addComponent(jBtnApagar)
                    .addComponent(jBtnRecuperar)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnLimparTabela))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLerArquivo)
                    .addComponent(jBtnCaminho)
                    .addComponent(jBtnGravarArquivo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jBtnLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparTabelaActionPerformed
        DefaultTableModel conteudo = (DefaultTableModel) jTable1.getModel();
        conteudo.setRowCount(0);
        
    }//GEN-LAST:event_jBtnLimparTabelaActionPerformed

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        DefaultTableModel conteudo = (DefaultTableModel) jTable1.getModel();
        conteudo.addRow(new Object[]{jTxtfCodigo.getText(), jTxtfNome.getText(), jTxtfPreco.getText(), jTxtfQuantidade.getText()});
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jBtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnApagarActionPerformed
        DefaultTableModel conteudo = (DefaultTableModel) jTable1.getModel();
        
        conteudo.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jBtnApagarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        DefaultTableModel conteudo = (DefaultTableModel) jTable1.getModel();
        
        conteudo.setValueAt(JOptionPane.showInputDialog("Novo valor"), 
                jTable1.getSelectedRow(), jTable1.getSelectedColumn());
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCaminhoActionPerformed
        caminho = JOptionPane.showInputDialog("Defina o caminho do arquivo:");
    }//GEN-LAST:event_jBtnCaminhoActionPerformed

    private void jBtnGravarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGravarArquivoActionPerformed
        DefaultTableModel conteudo = (DefaultTableModel) jTable1.getModel();
        int linhas;
        try {
            saida = new Formatter(caminho);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(tabelaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        linhas = jTable1.getRowCount();
        for (int i=0; i < linhas; i++){
          saida.format("%s;%s;%s;%s%n",conteudo.getValueAt(i,0),
                  conteudo.getValueAt(i,1),
                  conteudo.getValueAt(i,2),
                  conteudo.getValueAt(i,3));
        
        }
        saida.close();
    }//GEN-LAST:event_jBtnGravarArquivoActionPerformed

    private void jBtnLerArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLerArquivoActionPerformed
        DefaultTableModel conteudo = (DefaultTableModel) jTable1.getModel();
        try {
            leitura = new Scanner(Paths.get(caminho));
        } catch (IOException ex) {
            Logger.getLogger(tabelaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conteudo.getRowCount() > 0){
            conteudo.setRowCount(0);
        }
        while(leitura.hasNext()){
                
            //recebe cada linha do arquivo
            linhasDoArquivo = leitura.nextLine();   
            //separa os campos entre as virgulas de cada linha
            String[] coluna = linhasDoArquivo.split(";");
            conteudo.addRow(new Object[]{coluna[0], coluna[1], coluna[2], coluna[3]});
        }
        
    }//GEN-LAST:event_jBtnLerArquivoActionPerformed

    private void jBtnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRecuperarActionPerformed
        DefaultTableModel conteudo = (DefaultTableModel) jTable1.getModel();
        
        Object valor = conteudo.getValueAt(jTable1.getSelectedRow(), 0);
        jTxtfCodigo.setText(String.valueOf(valor));
        valor = conteudo.getValueAt(jTable1.getSelectedRow(), 1);
        jTxtfNome.setText(String.valueOf(valor));
        valor = conteudo.getValueAt(jTable1.getSelectedRow(), 2);
        jTxtfPreco.setText(String.valueOf(valor));
        valor = conteudo.getValueAt(jTable1.getSelectedRow(), 3);
        jTxtfQuantidade.setText(String.valueOf(valor));
    }//GEN-LAST:event_jBtnRecuperarActionPerformed

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
            java.util.logging.Logger.getLogger(tabelaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabelaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabelaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabelaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabelaArquivo().setVisible(true);
            }
        });
    }
    
    private Formatter saida = null;
    private Scanner leitura = null;
    private String caminho = "texto.txt";
    private String linhasDoArquivo = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnApagar;
    private javax.swing.JButton jBtnCaminho;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnGravarArquivo;
    private javax.swing.JButton jBtnLerArquivo;
    private javax.swing.JButton jBtnLimparTabela;
    private javax.swing.JButton jBtnRecuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtfCodigo;
    private javax.swing.JTextField jTxtfNome;
    private javax.swing.JTextField jTxtfPreco;
    private javax.swing.JTextField jTxtfQuantidade;
    // End of variables declaration//GEN-END:variables
}