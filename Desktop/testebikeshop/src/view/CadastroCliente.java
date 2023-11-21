package view;

import DAO.ClienteDAO;
import controller.ClienteTableController;
import model.Cliente;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.Color;

/*
 * Janela de cadastro de cliente
 *

 */
public class CadastroCliente extends javax.swing.JInternalFrame {

    private Cliente cliente = null;
    private ClienteDAO clienteDAO = new ClienteDAO();

    public CadastroCliente() {
        initComponents();
        habilitarFormulario(false);
        carregarGrade();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnBarraFerramentas = new javax.swing.JPanel();
        pnBarraFerramentas.setBackground(new Color(0, 51, 102));
        barraFerramentas = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btNovo.setForeground(new Color(255, 255, 255));
        btNovo.setBackground(new Color(0, 51, 102));
        btSalvar = new javax.swing.JButton();
        btSalvar.setForeground(new Color(255, 255, 255));
        btSalvar.setBackground(new Color(0, 51, 102));
        btExcluir = new javax.swing.JButton();
        btExcluir.setForeground(new Color(255, 255, 255));
        btExcluir.setBackground(new Color(0, 51, 102));
        btCancelar = new javax.swing.JButton();
        btCancelar.setForeground(new Color(255, 255, 255));
        btCancelar.setBackground(new Color(0, 51, 102));
        pnConteudo = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        pnForm.setBounds(10, 0, 369, 104);
        lbNome = new javax.swing.JLabel();
        lbNome.setBounds(10, 26, 47, 14);
        lbCpf = new javax.swing.JLabel();
        lbCpf.setBounds(10, 51, 47, 14);
        lbDataNascimento = new javax.swing.JLabel();
        lbDataNascimento.setBounds(10, 74, 85, 14);
        ftfNome = new javax.swing.JFormattedTextField();
        ftfNome.setBounds(126, 23, 206, 20);
        ftfCpf = new javax.swing.JFormattedTextField();
        ftfCpf.setBounds(126, 47, 119, 20);
        ftfDataNascimento = new javax.swing.JFormattedTextField();
        ftfDataNascimento.setBounds(126, 71, 119, 20);
        spGrade = new javax.swing.JScrollPane();
        spGrade.setBounds(10, 104, 369, 251);
        tbGrade = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de clientes");

        pnBarraFerramentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnBarraFerramentas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        barraFerramentas.setFloatable(false);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/novo.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/novo-foco.png"))); // NOI18N
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btNovo);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setFocusable(false);
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/salvar-foco.png"))); // NOI18N
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btSalvar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setFocusable(false);
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/excluir-foco.png"))); // NOI18N
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        barraFerramentas.add(btExcluir);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/cancelar-foco.png"))); // NOI18N
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btCancelar);

        pnBarraFerramentas.add(barraFerramentas);

        getContentPane().add(pnBarraFerramentas, java.awt.BorderLayout.PAGE_START);

        pnConteudo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);
        pnForm.setLayout(null);

        lbNome.setText("Nome:");
        pnForm.add(lbNome);

        lbCpf.setText("CPF:");
        pnForm.add(lbCpf);

        lbDataNascimento.setText("Data Nascimento:");
        pnForm.add(lbDataNascimento);

        ftfNome.setColumns(25);
        pnForm.add(ftfNome);

        ftfCpf.setColumns(10);
        try {
            ftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnConteudo.setLayout(null);
        ftfCpf.setValue(new String());
        pnForm.add(ftfCpf);

        ftfDataNascimento.setColumns(10);
        ftfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftfDataNascimento.setValue(new Date());
        pnForm.add(ftfDataNascimento);

        pnConteudo.add(pnForm);

        tbGrade.setAutoCreateRowSorter(true);
        tbGrade.setModel(new ClienteTableController());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        pnConteudo.add(spGrade);

        getContentPane().add(pnConteudo, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 405, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        cliente = new Cliente();
        habilitarFormulario(true);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validarFormulario()) {
            cliente.setNome(ftfNome.getText().trim());
            cliente.setCpf((String) ftfCpf.getValue());
            cliente.setDataNascimento((Date) ftfDataNascimento.getValue());

            if (cliente.getCodigo() == 0) {
                try {
                    clienteDAO.inserir(cliente);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir o cliente.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    clienteDAO.alterar(cliente);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o cliente.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o cliente " + cliente + "?");
        if (opcao == 0) {
            try {
                clienteDAO.excluir(cliente);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o cliente.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {
            ClienteTableController tm = (ClienteTableController) tbGrade.getModel();
            cliente = tm.getRowValue(tbGrade.getRowSorter().convertRowIndexToModel(tbGrade.getSelectedRow()));

            ftfNome.setValue(cliente.getNome());
            ftfCpf.setValue(cliente.getCpf());
            ftfDataNascimento.setValue(cliente.getDataNascimento());

            habilitarFormulario(true);
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void habilitarFormulario(boolean ativo) {
        btNovo.setEnabled(!ativo);
        btSalvar.setEnabled(ativo);
        btExcluir.setEnabled(ativo);
        btCancelar.setEnabled(ativo);
        ftfNome.setEnabled(ativo);
        ftfCpf.setEnabled(ativo);
        ftfDataNascimento.setEnabled(ativo);
        tbGrade.setEnabled(!ativo);

        if (!ativo) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        cliente = null;
        ftfNome.setValue("");
        ftfCpf.setValue("");
        ftfDataNascimento.setValue(new Date());
    }

    private boolean validarFormulario() {
        if (ftfNome.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNome.requestFocus();
            return false;
        }
        if (ftfCpf.getText().trim().length() != 14) {
            JOptionPane.showMessageDialog(this, "CPF inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfCpf.requestFocus();
            return false;
        }
        if (((Date) ftfDataNascimento.getValue()).after(new Date())) {
            JOptionPane.showMessageDialog(this, "Data de nascimento inválida.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfDataNascimento.requestFocus();
            return false;
        }
        return true;
    }

    private void carregarGrade() {
        ClienteTableController tm = (ClienteTableController) tbGrade.getModel();
        try {
            tm.setDados(clienteDAO.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JFormattedTextField ftfDataNascimento;
    private javax.swing.JFormattedTextField ftfNome;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel pnBarraFerramentas;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnForm;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    // End of variables declaration//GEN-END:variables
}
