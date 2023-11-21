package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DAO.ProdutoDAO;
import model.Produto;

public class ViewJTable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldnome;
	private JTextField textFieldprecoC;
	private JTextField textFieldprecoV;
	private JTextField textFieldQTD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewJTable frame = new ViewJTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewJTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldnome = new JTextField();
		textFieldnome.setBounds(148, 50, 155, 31);
		contentPane.add(textFieldnome);
		textFieldnome.setColumns(10);
		
		textFieldprecoC = new JTextField();
		textFieldprecoC.setColumns(10);
		textFieldprecoC.setBounds(148, 107, 155, 31);
		contentPane.add(textFieldprecoC);
		
		textFieldprecoV = new JTextField();
		textFieldprecoV.setColumns(10);
		textFieldprecoV.setBounds(148, 160, 155, 31);
		contentPane.add(textFieldprecoV);
		
		textFieldQTD = new JTextField();
		textFieldQTD.setColumns(10);
		textFieldQTD.setBounds(148, 212, 155, 31);
		contentPane.add(textFieldQTD);
		
		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setBounds(36, 50, 81, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblPreoCompra = new JLabel("preço compra");
		lblPreoCompra.setBounds(36, 107, 81, 31);
		contentPane.add(lblPreoCompra);
		
		JLabel lblPreoVenda = new JLabel("preço venda");
		lblPreoVenda.setBounds(36, 160, 81, 31);
		contentPane.add(lblPreoVenda);
		
		JLabel lblQuantidade = new JLabel("quantidade");
		lblQuantidade.setBounds(36, 220, 81, 31);
		contentPane.add(lblQuantidade);
		
		JButton btnsalvar = new JButton("salvar");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto();
				ProdutoDAO p = new ProdutoDAO();
				try {
				produto.setNome(textFieldnome.getText());
				produto.setPrecoCompra(Double.parseDouble(textFieldprecoC.getText()));
				produto.setPrecoVenda(Double.parseDouble(textFieldprecoV.getText()));
				produto.setQuantidade(Integer.parseInt(textFieldQTD.getText()));
				
					p.inserir(produto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnsalvar.setBounds(202, 267, 101, 31);
		contentPane.add(btnsalvar);
	}
}
