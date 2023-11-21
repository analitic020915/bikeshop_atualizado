package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;

    public TelaLogin() {
    	getContentPane().setBackground(new Color(0, 51, 102));
        // Configurações básicas da janela
        setTitle("BikeShop Login");
        setSize(419, 295);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Componentes
        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setForeground(new Color(255, 255, 255));
        labelUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        labelUsuario.setBounds(0, 20, 156, 44);
        campoUsuario = new JTextField();
        campoUsuario.setBounds(166, 23, 201, 38);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(new Color(255, 255, 255));
        labelSenha.setHorizontalAlignment(SwingConstants.CENTER);
        labelSenha.setBounds(0, 84, 156, 44);
        campoSenha = new JPasswordField();
        campoSenha.setBounds(166, 90, 201, 38);

        JButton botaoLogin = new JButton("Login");
        botaoLogin.setBackground(new Color(255, 255, 255));
        botaoLogin.setIcon(new ImageIcon(TelaLogin.class.getResource("/icones/img/salvar.png")));
        botaoLogin.setBounds(25, 170, 127, 44);
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });

        JButton botaoCadastro = new JButton("Cadastrar");
        botaoCadastro.setIcon(new ImageIcon(TelaLogin.class.getResource("/icones/img/novo.png")));
        botaoCadastro.setBounds(212, 170, 137, 44);
        botaoCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarCadastro();
            }
        });
        getContentPane().setLayout(null);

        // Adiciona os componentes à janela
        getContentPane().add(labelUsuario);
        getContentPane().add(campoUsuario);
        getContentPane().add(labelSenha);
        getContentPane().add(campoSenha);
        getContentPane().add(botaoLogin);
        getContentPane().add(botaoCadastro);

        // Exibe a janela
        setVisible(true);
    }

    private void realizarLogin() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());
					Menu menu = new Menu();
					dispose();
					menu.setVisible(true);
					
        // Aqui você pode adicionar a lógica de validação de login
        // (por exemplo, comparando com um banco de dados).

        // Para este exemplo, vou apenas exibir uma mensagem
        JOptionPane.showMessageDialog(this, "Login realizado para o usuário: " + usuario);

        // Após o login, você pode fechar a janela ou realizar outras ações
        dispose();
    }

    private void realizarCadastro() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());

        // Aqui você pode adicionar a lógica de cadastro de usuário
        // (por exemplo, adicionando o usuário a um banco de dados).

        // Para este exemplo, vou apenas exibir uma mensagem
        JOptionPane.showMessageDialog(this, "Usuário cadastrado: " + usuario);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin();
            }
        });
    }
}
