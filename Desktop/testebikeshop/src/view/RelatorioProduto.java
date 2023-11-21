package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import DAO.ProdutoDAO;
import model.Produto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RelatorioProduto extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;

    public RelatorioProduto() {
        // Configurações básicas da janela
        setTitle("Relatório de Produtos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Configuração da tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Código");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Preço de Compra");
        tableModel.addColumn("Preço de Venda");
        tableModel.addColumn("Quantidade em Estoque");

        table = new JTable(tableModel);

        // Adiciona a tabela a um JScrollPane para rolar, se necessário
        JScrollPane scrollPane = new JScrollPane(table);

        // Adiciona o JScrollPane ao conteúdo da janela
        getContentPane().add(scrollPane);

        // Botão para Salvar/Imprimir
        JButton btnSalvarImprimir = new JButton("Salvar/Imprimir");
        btnSalvarImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarOuImprimir();
            }
        });

        // Adiciona o botão ao conteúdo da janela
        getContentPane().add(btnSalvarImprimir, BorderLayout.SOUTH);

        // Obtém os dados do banco de dados e preenche a tabela
        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            ArrayList<Produto> listaProdutos = produtoDAO.listarTodos();
            preencherTabela(listaProdutos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void preencherTabela(ArrayList<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            Object[] rowData = {
                    produto.getCodigo(),
                    produto.getNome(),
                    produto.getPrecoCompra(),
                    produto.getPrecoVenda(),
                    produto.getQuantidade()
            };
            tableModel.addRow(rowData);
        }
    }

    private void salvarOuImprimir() {
        // Código para salvar ou imprimir a tabela
        // Você pode implementar as lógicas específicas aqui

        // Exemplo: salvar em um arquivo CSV
        try (FileWriter writer = new FileWriter("relatorio_produtos.csv")) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                for (int j = 0; j < tableModel.getColumnCount(); j++) {
                    writer.append(tableModel.getValueAt(i, j).toString());
                    writer.append(",");
                }
                writer.append("\n");
            }
            writer.flush();
            System.out.println("Relatório salvo com sucesso em: relatorio_produtos.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Exemplo: exibir em uma janela de impressão
       // PrintUtilities.printComponent(table);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RelatorioProduto gui = new RelatorioProduto();
            gui.setVisible(true);
        });
    }
}
