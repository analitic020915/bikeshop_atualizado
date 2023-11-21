
package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

/**
 * Janela menu da aplicação

 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sharles\\Downloads\\images.jpg"));
    	setBackground(SystemColor.inactiveCaptionBorder);
        initComponents();
    }

  
    private void initComponents() {
    	setExtendedState(JFrame.MAXIMIZED_BOTH);
        toolBar = new javax.swing.JToolBar();
        toolBar.setBackground(new Color(0, 51, 102));
        btVenda = new javax.swing.JButton();
        btVenda.setFont(new Font("Tahoma", Font.BOLD, 11));
        btVenda.setForeground(SystemColor.inactiveCaptionBorder);
        btVenda.setBackground(new Color(0, 51, 102));
        btCompra = new javax.swing.JButton();
        btCompra.setFont(new Font("Tahoma", Font.BOLD, 11));
        btCompra.setForeground(SystemColor.inactiveCaptionBorder);
        btCompra.setBackground(new Color(0, 51, 102));
        btProduto = new javax.swing.JButton();
        btProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
        btProduto.setForeground(SystemColor.inactiveCaptionBorder);
        btProduto.setBackground(new Color(0, 51, 102));
        btCliente = new javax.swing.JButton();
        btCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
        btCliente.setForeground(SystemColor.inactiveCaptionBorder);
        btCliente.setBackground(new Color(0, 51, 102));
        btFornecedor = new javax.swing.JButton();
        btFornecedor.setFont(new Font("Tahoma", Font.BOLD, 11));
        btFornecedor.setForeground(SystemColor.inactiveCaptionBorder);
        btFornecedor.setBackground(new Color(0, 51, 102));
        btSair = new javax.swing.JButton();
        btSair.setFont(new Font("Tahoma", Font.BOLD, 11));
        btSair.setForeground(SystemColor.inactiveCaptionBorder);
        btSair.setBackground(new Color(0, 51, 102));
        desktopPane = new javax.swing.JDesktopPane();
        desktopPane.setForeground(SystemColor.activeCaption);
        desktopPane.setBackground(new Color(60, 179, 113));
       
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);
        
       
        menuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        miProduto = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        menuMovimentos = new javax.swing.JMenu();
        miVenda = new javax.swing.JMenuItem();
        miCompra = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("BikeShop");

        toolBar.setFloatable(false);

        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/venda.png"))); // NOI18N
        btVenda.setText("Venda");
        btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVenda.setFocusable(false);
        btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/venda-foco.png"))); // NOI18N
        btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        toolBar.add(btVenda);

        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/compra.png"))); // NOI18N
        btCompra.setText("Compra");
        btCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCompra.setFocusable(false);
        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompra.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/compra-foco.png"))); // NOI18N
        btCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        toolBar.add(btCompra);

        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/produto.png"))); // NOI18N
        btProduto.setText("Produto");
        btProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProduto.setFocusable(false);
        btProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProduto.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/produto-foco.png"))); // NOI18N
        btProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btProduto);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/cliente.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/cliente-foco.png"))); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCliente);

        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/fornecedor.png"))); // NOI18N
        btFornecedor.setText("Fornecedor");
        btFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFornecedor.setFocusable(false);
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/fornecedor-foco.png"))); // NOI18N
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        toolBar.add(btFornecedor);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/img/sair-foco.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        
       

        JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.SOUTH);
        toolBar.add(btSair);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);
        ImageIcon imagem = new ImageIcon("C:/Users/sharles/Downloads/images.jpg");

        menuCadastros.setText("Cadastros");

        miProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));// função para iniciar o serviço com a tecla F2
        miProduto.setText("Cadastrar Produto");
        miProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        menuCadastros.add(miProduto);

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));// função para iniciar o serviço com a tecla f3
        miCliente.setText("Cadastrar Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(miCliente);

        miFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));// função para iniciar o serviço com a tecla f4 
        miFornecedor.setText("Cadastrar Fornecedor");
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        menuCadastros.add(miFornecedor);

        menuBar.add(menuCadastros);

        menuMovimentos.setText("Movimentos");

        miVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));// função para iniciar o serviço com a tecla f5
        miVenda.setText("Registrar Venda");
        miVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        menuMovimentos.add(miVenda);

        miCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));// função para iniciar o serviço com a tecla  f6
        miCompra.setText("Registrar Compra");
        miCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        menuMovimentos.add(miCompra);

        menuBar.add(menuMovimentos);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Estoque");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		RelatorioProduto relProd = new RelatorioProduto();
        		relProd.setVisible(true);
        	}
        });
        menuMovimentos.add(mntmNewMenuItem);

        menuSistema.setText("Sistema");

        miSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0)); // função para iniciar o serviço com a tecla f1
        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuSistema.add(miSobre);

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        menuSistema.add(miSair);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(900, 700));
        setLocationRelativeTo(null); // centraliza meu JFrame centralizado
    }

    private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//adicionando ao menu Cadastro produto
        CadastroProduto c = new CadastroProduto();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miProdutoActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//Adicionando ao menu Cadastro CLiente 
        CadastroCliente c = new CadastroCliente();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//Adicionando ao Menu cadastro Fornecedor 
        CadastroFornecedor c = new CadastroFornecedor();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miFornecedorActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//Adicionando ao menu Lançamento de vendas
        LancamentoVenda v = new LancamentoVenda();
        desktopPane.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_miVendaActionPerformed

    private void miCompraActionPerformed(java.awt.event.ActionEvent evt) {//Adicionando ao menu lancamento de compras 
        LancamentoCompra c = new LancamentoCompra();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miCompraActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//Adicionando a tela sobre
        Sobre s = new Sobre(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//adicionando a função sair do sistema 
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed
    
	

    // variaveis declaradas 
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btCompra;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVenda;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuMovimentos;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miCompra;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miProduto;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miVenda;
    private javax.swing.JToolBar toolBar;
}
