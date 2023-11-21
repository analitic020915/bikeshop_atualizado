package view;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;

/*
 * Janela sobre a aplicação
 *

 */
public class Sobre extends javax.swing.JDialog {

    public Sobre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        getContentPane().setBackground(Color.WHITE);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbIcone = new javax.swing.JLabel();
        taTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/sobre.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        getContentPane().add(lbIcone, gridBagConstraints);

        taTexto.setEditable(false);
        taTexto.setColumns(20);
        taTexto.setFont(new Font("SansSerif", Font.ITALIC, 16)); // NOI18N
        taTexto.setRows(5);
        taTexto.setText("Sistema de Vendas BikeShop\nAutor: Sharles Roberto, Pablo Araujo , Arthur Brainner e Thiago Henrique .");
        taTexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        taTexto.setOpaque(false);
        gridBagConstraints_1 = new java.awt.GridBagConstraints();
        gridBagConstraints_1.gridy = 0;
        gridBagConstraints_1.weightx = 1.0;
        gridBagConstraints_1.weighty = 1.0;
        getContentPane().add(taTexto, gridBagConstraints_1);

        setSize(new Dimension(654, 246));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcone;
    private javax.swing.JTextArea taTexto;
    private GridBagConstraints gridBagConstraints_1;
    // End of variables declaration//GEN-END:variables
}
